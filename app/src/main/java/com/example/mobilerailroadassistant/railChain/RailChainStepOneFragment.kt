package com.example.mobilerailroadassistant.railChain

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mobilerailroadassistant.R
import com.example.mobilerailroadassistant.databinding.FragmentRailChainStepOneBinding
import com.example.mobilerailroadassistant.listOfDevices.ListOfDevicesFragment

class RailChainStepOneFragment : Fragment() {

    private var _binding: FragmentRailChainStepOneBinding? = null
    private val binding: FragmentRailChainStepOneBinding
        get() = _binding ?: throw RuntimeException("FragmentRailChainStepOne == null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRailChainStepOneBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.oneRailChain1.setOnClickListener {
            oneRailChain()
        }
    }

    private fun oneRailChain() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, ListOfDevicesFragment())
            .commit()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}