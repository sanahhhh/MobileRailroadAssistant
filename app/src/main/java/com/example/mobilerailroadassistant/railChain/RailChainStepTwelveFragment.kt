package com.example.mobilerailroadassistant.railChain

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mobilerailroadassistant.R
import com.example.mobilerailroadassistant.databinding.FragmentRailChainStepTwelveBinding
import com.example.mobilerailroadassistant.listOfDevices.ListOfDevicesFragment

class RailChainStepTwelveFragment : Fragment() {

    private var _binding: FragmentRailChainStepTwelveBinding? = null
    private val binding: FragmentRailChainStepTwelveBinding
        get() = _binding ?: throw RuntimeException("FragmentRailChainStepOne == null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRailChainStepTwelveBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.backToListOfDevicesRailChain.setOnClickListener {
            moveToListOfDevices()
        }
    }

    private fun moveToListOfDevices() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, ListOfDevicesFragment())
            .commit()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}