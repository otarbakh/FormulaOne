package com.example.formulaone.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.formulaone.Adapters.DriverAdapter
import com.example.formulaone.Datas.DriversData
import com.example.formulaone.Cards.DriversList
import com.example.formulaone.databinding.DriverslayoutBinding

class DriverFragment : Fragment() {
    private val driverAdapter: DriverAdapter by lazy {
        DriverAdapter()
    }


    val driversLists = mutableListOf<DriversData>()
    val driverList = DriversList()
    private var _binding: DriverslayoutBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DriverslayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            rvDrivers.layoutManager =
                GridLayoutManager(requireContext(), 2, GridLayoutManager.VERTICAL, false)
            rvDrivers.adapter = driverAdapter

            driverAdapter.apply {
                setOnDeleteClickListener{
                    driversData, i ->
                    driversLists.remove(driversData)
                    notifyItemRemoved(i)
                }
                driverList.driverCard(driversLists)
                driverAdapter.submitList(driversLists)
                binding.btnAdd.setOnClickListener {
                    driversLists.add(
                        DriversData(
                             etFullName.text.toString(),
                            etAge.text.toString().toInt()
                        )
                    )
                    notifyItemInserted(1)
                }
            }
        }
    }
}





