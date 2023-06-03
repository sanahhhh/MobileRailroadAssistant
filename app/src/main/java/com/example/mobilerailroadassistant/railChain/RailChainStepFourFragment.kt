package com.example.mobilerailroadassistant.railChain

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mobilerailroadassistant.R
import com.example.mobilerailroadassistant.databinding.FragmentRailChainStepFourBinding
import com.example.mobilerailroadassistant.databinding.FragmentRailChainStepThreeBinding


class RailChainStepFourFragment : Fragment() {

    private var _binding: FragmentRailChainStepFourBinding? = null
    private val binding: FragmentRailChainStepFourBinding
        get() = _binding ?: throw RuntimeException("FragmentRailChainStepOne == null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRailChainStepFourBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.belowOrAbsent4.setOnClickListener {
            moveToStepFive()
        }
    }

    private fun moveToStepFive() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, RailChainStepFiveFragment())
            .commit()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}