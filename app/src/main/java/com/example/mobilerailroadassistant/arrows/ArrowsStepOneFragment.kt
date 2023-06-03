package com.example.mobilerailroadassistant.arrows

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mobilerailroadassistant.R
import com.example.mobilerailroadassistant.databinding.FragmentArrowsStepOneBinding
import com.example.mobilerailroadassistant.databinding.FragmentRailChainStepOneBinding
import com.example.mobilerailroadassistant.listOfDevices.ListOfDevicesFragment

class ArrowsStepOneFragment : Fragment() {

    private var _binding: FragmentArrowsStepOneBinding? = null
    private val binding: FragmentArrowsStepOneBinding
        get() = _binding ?: throw RuntimeException("FragmentRailChainStepOne == null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentArrowsStepOneBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.furtherArrows1.setOnClickListener {
            oneArrows()
        }
    }

    private fun oneArrows() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, ListOfDevicesFragment())
            .commit()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}