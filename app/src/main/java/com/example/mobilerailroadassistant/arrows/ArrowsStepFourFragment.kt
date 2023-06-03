package com.example.mobilerailroadassistant.arrows

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mobilerailroadassistant.R
import com.example.mobilerailroadassistant.databinding.FragmentArrowsStepFourBinding
import com.example.mobilerailroadassistant.databinding.FragmentArrowsStepThreeBinding

class ArrowsStepFourFragment : Fragment() {

    private var _binding: FragmentArrowsStepFourBinding? = null
    private val binding: FragmentArrowsStepFourBinding
        get() = _binding ?: throw RuntimeException("FragmentRailChainStepOne == null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentArrowsStepFourBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.noArrows4.setOnClickListener {
            moveToStepFive()
        }
    }

    private fun moveToStepFive() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, ArrowsStepFiveFragment())
            .commit()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}