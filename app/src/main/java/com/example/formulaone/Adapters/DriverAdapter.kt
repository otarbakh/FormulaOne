package com.example.formulaone.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.formulaone.Datas.DriversData
import com.example.formulaone.databinding.SingledriverlayoutBinding

class DriverAdapter : ListAdapter<DriversData, DriverAdapter.DriverViewHolder>(DiffCallBack()) {
    private lateinit var deleteCLickListener: (DriversData, Int) -> Unit

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DriverViewHolder {
        val binding =
            SingledriverlayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DriverViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DriverViewHolder, position: Int) {
        val currentDriver = getItem(position)
        holder.bindData(currentDriver)
    }

    inner class DriverViewHolder(private val binding: SingledriverlayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindData(data: DriversData) {
            binding.driverroot.setOnClickListener {
                deleteCLickListener.invoke(data, adapterPosition)
            }
            binding.tvDriverName.text = data.name
            binding.tvDriverAge.text = data.age.toString()

        }
    }

    class DiffCallBack : DiffUtil.ItemCallback<DriversData>() {
        override fun areItemsTheSame(oldItem: DriversData, newItem: DriversData): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: DriversData, newItem: DriversData): Boolean {
            return oldItem == newItem
        }
    }

    fun setOnDeleteClickListener(clickListener: (DriversData, Int) -> Unit) {
        this.deleteCLickListener = clickListener
    }

}