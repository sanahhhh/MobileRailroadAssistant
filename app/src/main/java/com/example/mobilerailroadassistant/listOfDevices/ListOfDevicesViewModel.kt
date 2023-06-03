package com.example.mobilerailroadassistant.listOfDevices

import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mobilerailroadassistant.LogInAppFragment
import com.example.mobilerailroadassistant.loggin.LogginFragment

class ListOfDevicesViewModel : ViewModel() {

    val listDevice:MutableList<Device> = mutableListOf()

    val listDeviceData:MutableLiveData<List<Device>> by lazy {
        MutableLiveData<List<Device>>(emptyList())
    }

    init {
//        Devices("Рельсовая цепь", "Стрелки","Светофоры",
//            "Аппаратура","Кабель","Пульт-табло","УКСПС")

        listDevice.add(Device("ТСКБМ", LogInAppFragment()))
        listDevice.add(Device("САУТ", LogginFragment()))

        listDeviceData.value = listDevice

    }

    fun add()
    {
    }


    data class Device(val device : String, val nextFragment: Fragment)

    data class Devices(
        val device1: String,
        val device2: String,
        val device3: String,
        val device4: String,
        val device5: String,
        val device6: String,
        val device7: String
    )
}
//
//listDevice.add(Devices("Рельсовая цепь"))
//listDevice.add(Devices("Стрелки"))
//listDevice.add(Devices("Светофоры"))
//listDevice.add(Devices("Аппаратура"))
//listDevice.add(Devices("Кабель"))
//listDevice.add(Devices("Пульт-табло"))
//listDevice.add(Devices("УКСПС"))