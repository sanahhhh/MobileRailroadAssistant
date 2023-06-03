package com.example.mobilerailroadassistant.arrows

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mobilerailroadassistant.R
import com.example.mobilerailroadassistant.databinding.FragmentArrowsStepFiveBinding
import com.example.mobilerailroadassistant.databinding.FragmentArrowsStepFourBinding

class ArrowsStepFiveFragment : Fragment() {

    private var _binding: FragmentArrowsStepFiveBinding? = null
    private val binding: FragmentArrowsStepFiveBinding
        get() = _binding ?: throw RuntimeException("FragmentRailChainStepOne == null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentArrowsStepFiveBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.yesArrows5.setOnClickListener {
            moveToStepSix()
        }
    }

    private fun moveToStepSix() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, ArrowsStepSixFragment())
            .commit()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}