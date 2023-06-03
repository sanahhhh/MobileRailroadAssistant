package com.example.mobilerailroadassistant.railChain

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mobilerailroadassistant.R
import com.example.mobilerailroadassistant.databinding.FragmentRailChainStepElevenBinding

class RailChainStepElevenFragment : Fragment() {

    private var _binding: FragmentRailChainStepElevenBinding? = null
    private val binding: FragmentRailChainStepElevenBinding
        get() = _binding ?: throw RuntimeException("FragmentRailChainStepOne == null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRailChainStepElevenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.normalOrAbove11.setOnClickListener {
            moveToStepTwelve()
        }
    }

    private fun moveToStepTwelve() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, RailChainStepTwelveFragment())
            .commit()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}