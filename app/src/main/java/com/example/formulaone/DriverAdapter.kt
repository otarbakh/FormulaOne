package com.example.formulaone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.formulaone.databinding.SingledriverlayoutBinding

class DriverAdapter : RecyclerView.Adapter<DriverAdapter.DriverViewHolder>() {

    private val driverList = mutableListOf<DriversData>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DriverAdapter.DriverViewHolder {
        val binding =
            SingledriverlayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DriverViewHolder(binding)
    }


    override fun onBindViewHolder(holder: DriverAdapter.DriverViewHolder, position: Int) {
        holder.bindData(driverList[position])
    }

    override fun getItemCount(): Int {
        return driverList.size
    }

    inner class DriverViewHolder(private val binding: SingledriverlayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindData(data: DriversData) {
            binding.tvDriverName.text = data.name
            binding.tvDriverAge.text = data.age.toString()
            binding.tvDriverPoint.text = data.point.toString()
            binding.tvDriverNationality.text = data.nationality
        }
    }

    fun updateDrivers(list: List<DriversData>) {
        driverList.clear()
        driverList.addAll(list)
        notifyDataSetChanged()
    }
}