package com.example.mobilerailroadassistant.listOfDevices

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ListOfDevicesViewModel : ViewModel() {

    val listDevice:MutableList<Devices> = mutableListOf()

    val listDeviceData:MutableLiveData<List<Devices>> by lazy {
        MutableLiveData<List<Devices>>(emptyList())
    }

    init {
        listDevice.add(Devices("Рельсовая цепь", "Стрелки","Светофоры",
            "Аппаратура","Кабель","Пульт-табло","УКСПС"))

        listDeviceData.value = listDevice
    }




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