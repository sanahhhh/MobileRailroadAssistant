package com.example.mobilerailroadassistant

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mobilerailroadassistant.databinding.ActivityMainBinding
import com.example.mobilerailroadassistant.databinding.FragmentLogInAppBinding
import com.example.mobilerailroadassistant.loggin.LogginFragment

class LogInAppFragment : Fragment() {

    private var _binding: FragmentLogInAppBinding? = null
    private val binding: FragmentLogInAppBinding
        get() = _binding ?: throw RuntimeException("FragmentLogInAppBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLogInAppBinding.inflate(inflater,container,false)
        return binding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnImageLog.setOnClickListener {
            logInApp()
        }

        binding.btnExit.setOnClickListener{
            android.os.Process.killProcess(android.os.Process.myPid())
        }

    }



    private fun logInApp() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, LogginFragment())
            .commit()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}