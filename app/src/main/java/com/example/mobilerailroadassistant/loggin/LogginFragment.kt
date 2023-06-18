package com.example.mobilerailroadassistant.loggin

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mobilerailroadassistant.R
import com.example.mobilerailroadassistant.databinding.FragmentLogginBinding
import com.example.mobilerailroadassistant.mapKit.MapKitFragment

class LogginFragment : Fragment() {

    private var _binding: FragmentLogginBinding? = null
    private val binding: FragmentLogginBinding
        get() = _binding ?: throw RuntimeException("FragmentLogginBinding == null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLogginBinding.inflate(inflater, container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnOne.setOnClickListener {
            Log.d("xxx","xxxx")
            moveToMap()
        }
    }

    private fun moveToMap() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, MapKitFragment())
            .commit()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }



}