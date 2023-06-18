package com.example.mobilerailroadassistant.listOfDevices

import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mobilerailroadassistant.arrows.ArrowsStepOneFragment
import com.example.mobilerailroadassistant.railChain.RailChainStepOneFragment

class ListOfDevicesViewModel : ViewModel() {

    val listDevice:MutableList<Device> = mutableListOf()

    val listDeviceData:MutableLiveData<List<Device>> by lazy {
        MutableLiveData<List<Device>>(emptyList())
    }

    init {

        listDevice.add(Device("Рельсовая цепь", RailChainStepOneFragment()))
        listDevice.add(Device("Стрелки", ArrowsStepOneFragment()))
        listDevice.add(Device("Аппаратура", ListOfDevicesFragment()))
        listDevice.add(Device("Кабель", ListOfDevicesFragment()))
        listDevice.add(Device("Пульт-табло", ListOfDevicesFragment()))
        listDevice.add(Device("УКСПС", ListOfDevicesFragment()))
        listDeviceData.value = listDevice

    }



    data class Device(val device : String, val nextFragment: Fragment)

}
