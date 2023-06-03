package com.example.mobilerailroadassistant.listOfDevices

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mobilerailroadassistant.databinding.ItemListOfDevicesBinding

class ListOfDevicesAdapter: RecyclerView.Adapter<ListOfDevicesAdapter.MyViewHolder>() {

    private var devices: List<ListOfDevicesViewModel.Device> = emptyList()


    private var onClickListener: ((ListOfDevicesViewModel.Device) -> Unit)? = null

    fun setClickListener(action: ((ListOfDevicesViewModel.Device) -> Unit)) {
        onClickListener = action
    }

    fun setDevices(devices: List<ListOfDevicesViewModel.Device>) {
        this.devices = devices
    }

    class MyViewHolder(val binding: ItemListOfDevicesBinding, val onClickListener: ((ListOfDevicesViewModel.Device) -> Unit)?) : RecyclerView.ViewHolder(binding.root) {
        fun bind(device: ListOfDevicesViewModel.Device) {
            binding.itemDevice.text = device.device
            binding.root.setOnClickListener {
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