package com.example.mobilerailroadassistant.arrows

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mobilerailroadassistant.R
import com.example.mobilerailroadassistant.databinding.FragmentArrowsStepOneBinding
import com.example.mobilerailroadassistant.databinding.FragmentArrowsStepTwoBinding
import com.example.mobilerailroadassistant.listOfDevices.ListOfDevicesFragment

class ArrowsStepTwoFragment : Fragment() {

    private var _binding: FragmentArrowsStepTwoBinding? = null
    private val binding: FragmentArrowsStepTwoBinding
        get() = _binding ?: throw RuntimeException("FragmentRailChainStepOne == null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentArrowsStepTwoBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.yesArrows2.setOnClickListener {
            moveToStepThree()
        }
    }

    private fun moveToStepThree() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, ArrowsStepThreeFragment())
            .commit()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}