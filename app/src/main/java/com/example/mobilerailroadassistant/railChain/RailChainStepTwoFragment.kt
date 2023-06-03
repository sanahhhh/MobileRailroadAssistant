package com.example.mobilerailroadassistant.railChain

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mobilerailroadassistant.R
import com.example.mobilerailroadassistant.databinding.FragmentRailChainStepTwoBinding

class RailChainStepTwoFragment : Fragment() {

    private var _binding: FragmentRailChainStepTwoBinding? = null
    private val binding: FragmentRailChainStepTwoBinding
        get() = _binding ?: throw RuntimeException("FragmentRailChainStepOne == null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRailChainStepTwoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.lightsUpAllTheTime2.setOnClickListener {
            moveToStepThree()
        }
    }

    private fun moveToStepThree() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, RailChainStepThreeFragment())
            .commit()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}