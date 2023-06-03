package com.example.mobilerailroadassistant.arrows

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mobilerailroadassistant.R
import com.example.mobilerailroadassistant.databinding.FragmentArrowsStepFiveBinding
import com.example.mobilerailroadassistant.databinding.FragmentArrowsStepSixBinding

class ArrowsStepSixFragment : Fragment() {

    private var _binding: FragmentArrowsStepSixBinding? = null
    private val binding: FragmentArrowsStepSixBinding
        get() = _binding ?: throw RuntimeException("FragmentRailChainStepOne == null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentArrowsStepSixBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.noArrows6.setOnClickListener {
            moveToStepSeven()
        }
    }

    private fun moveToStepSeven() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, ArrowsStepSevenFragment())
            .commit()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}