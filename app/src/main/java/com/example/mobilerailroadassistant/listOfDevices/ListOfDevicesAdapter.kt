package com.example.mobilerailroadassistant.listOfDevices

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mobilerailroadassistant.R
import com.example.mobilerailroadassistant.databinding.ItemListOfDevicesBinding

class ListOfDevicesAdapter: RecyclerView.Adapter<ListOfDevicesAdapter.MyViewHolder>() {

    private var devices: List<ListOfDevicesViewModel.Devices> = emptyList()


    private var onClickListener: ((ListOfDevicesViewModel.Devices) -> Unit)? = null

    fun setClickListener(action: ((ListOfDevicesViewModel.Devices) -> Unit)) {
        onClickListener = action
    }

    fun setDevices(devices: List<ListOfDevicesViewModel.Devices>) {
        this.devices = devices
    }

    class MyViewHolder(val binding: ItemListOfDevicesBinding, val onClickListener: ((ListOfDevicesViewModel.Devices) -> Unit)?) : RecyclerView.ViewHolder(binding.root) {
        fun bind(device:ListOfDevicesViewModel.Devices) {
            binding.itemDevice.text = device.device1
            binding.root.setOnClickListener {
                Log.d("kkk","kkkk")
                onClickListener?.invoke(device)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = ItemListOfDevicesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(itemView,onClickListener)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(devices[position])
    }

    override fun getItemCount() = devices.size
}