package com.example.formulaone.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.formulaone.R
import com.example.formulaone.databinding.DashboardBinding


class DashboardFragment :Fragment() {
    private var _binding: DashboardBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DashboardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnDriver.setOnClickListener{
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.tetriekrani, DriverFragment())
                addToBackStack(DriverFragment::javaClass.name)
                commit()
            }
        }
        binding.btnTeam.setOnClickListener{
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.tetriekrani, TeamsFragment())
                addToBackStack(TeamsFragment::javaClass.name)
                commit()
            }
        }

    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()

    }

}