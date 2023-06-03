package com.example.mobilerailroadassistant.arrows

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mobilerailroadassistant.R
import com.example.mobilerailroadassistant.databinding.FragmentArrowsStepThreeBinding
import com.example.mobilerailroadassistant.databinding.FragmentArrowsStepTwoBinding

class ArrowsStepThreeFragment : Fragment() {

    private var _binding: FragmentArrowsStepThreeBinding? = null
    private val binding: FragmentArrowsStepThreeBinding
        get() = _binding ?: throw RuntimeException("FragmentRailChainStepOne == null")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentArrowsStepThreeBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.noArrows3.setOnClickListener {
            moveToStepFour()
        }
    }

    private fun moveToStepFour() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, ArrowsStepFourFragment())
            .commit()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}