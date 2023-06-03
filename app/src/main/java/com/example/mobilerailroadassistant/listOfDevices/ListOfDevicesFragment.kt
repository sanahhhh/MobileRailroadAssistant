package com.example.mobilerailroadassistant.listOfDevices

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.viewModels
import com.example.mobilerailroadassistant.MainActivity
import com.example.mobilerailroadassistant.R
import com.example.mobilerailroadassistant.databinding.FragmentListOfDevicesBinding
import com.example.mobilerailroadassistant.databinding.FragmentRailChainStepOneBinding
import com.example.mobilerailroadassistant.loggin.LogginFragment
import com.example.mobilerailroadassistant.railChain.RailChainStepOneFragment

class ListOfDevicesFragment: Fragment() {

    private var _binding: FragmentListOfDevicesBinding? = null
    private  val binding: FragmentListOfDevicesBinding
        get() = _binding ?: throw RuntimeException("FragmentListOfDevicesBinding == null")
    private val viewModel by viewModels<ListOfDevicesViewModel>()
    private val adapterListOfDevices = ListOfDevicesAdapter()

    companion object {
        val device = "DEVICE"
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentListOfDevicesBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvOne.adapter = adapterListOfDevices
        adapterListOfDevices.setDevices(viewModel.listDeviceData.value!!)



        adapterListOfDevices.setClickListener { device ->
            parentFragmentManager.commit{
                //val args = bundleOf(device to device)
                val fragment = device.nextFragment
                val activity = requireActivity() as MainActivity
                activity.navTo(device.nextFragment)

//                replace(R.id.flContainer, fragment)
            }
        }

//        viewModel.listDeviceData.observe(viewLifecycleOwner) {
//            it?.let { listDevice ->
//                adapterListOfDevices.setDevices(listDevice)
//            }
//        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}