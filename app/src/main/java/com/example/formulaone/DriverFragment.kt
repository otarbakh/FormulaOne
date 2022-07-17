package com.example.formulaone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.formulaone.databinding.DriverslayoutBinding

class DriverFragment :Fragment() {
    private val driverAdapter:DriverAdapter by lazy{
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
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            rvDrivers.adapter = driverAdapter

            driverAdapter.apply {
                driverList.driverCard(driversLists)
                updateDrivers(driversLists)
            }
        }


    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()

    }

}
