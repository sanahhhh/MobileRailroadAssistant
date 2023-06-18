package com.example.mobilerailroadassistant.mapKit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.mobilerailroadassistant.R
import com.example.mobilerailroadassistant.databinding.FragmentMapKitBinding
import com.example.mobilerailroadassistant.listOfDevices.ListOfDevicesFragment
import com.yandex.mapkit.Animation
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.CameraPosition
import com.yandex.mapkit.mapview.MapView

class MapKitFragment : Fragment() {

    private var _binding: FragmentMapKitBinding? = null
    private val binding: FragmentMapKitBinding
        get() = _binding ?: throw RuntimeException("FragmentMapKit == null")
    private lateinit var mapview: MapView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MapKitFactory.setApiKey("3d7e791d-7bdc-4b7d-8f28-606f1d40da81")
        MapKitFactory.initialize(this.context)
    }

    override fun onStop() {
        mapview.onStop()
        MapKitFactory.getInstance().onStop()
        super.onStop()
    }

    override fun onStart() {
        super.onStart()
        MapKitFactory.getInstance().onStart()
        mapview.onStart()

        mapview.map.move(CameraPosition(Point(53.195875, 50.100183), 1000.0f, 0.0f, 0.0f),
            Animation(Animation.Type.SMOOTH, 300f), null)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMapKitBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mapview = view.findViewById(R.id.map_view)
        binding.btnNext.setOnClickListener {
            moveToListOfDevices()
        }
    }

    private fun moveToListOfDevices() {
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, ListOfDevicesFragment())
            .commit()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}