package com.example.mobilerailroadassistant.railChain

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mobilerailroadassistant.R
import com.example.mobilerailroadassistant.databinding.FragmentRailChainStepNineBinding


class RailChainStepNineFragment : Fragment() {

    private var _binding: FragmentRailChainStepNineBinding? = null
    private val binding: FragmentRailChainStepNineBinding
        get() = _binding ?: throw RuntimeException("FragmentRailChainStepOne == null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRailChainStepNineBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.yes9.setOnClickListener {
            moveToStepTen()
        }
    }

    private fun moveToStepTen() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, RailChainStepTenFragment())
            .commit()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}