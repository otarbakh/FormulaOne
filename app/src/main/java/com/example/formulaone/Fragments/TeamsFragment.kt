package com.example.formulaone.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.formulaone.Adapters.TeamAdapter
import com.example.formulaone.Cards.TeamCard
import com.example.formulaone.Datas.TeamData
import com.example.formulaone.databinding.TeamslayoutBinding

class TeamsFragment :Fragment() {

    private  val teamAdapter: TeamAdapter by lazy {
        TeamAdapter()
    }


    private val teamLists = mutableListOf<TeamData>()
    private val teamList = TeamCard()


    private var _binding: TeamslayoutBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = TeamslayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            rvTeams.layoutManager =
                GridLayoutManager(requireContext(),2, GridLayoutManager.VERTICAL, false)
            rvTeams.adapter = teamAdapter

            teamAdapter.apply {
                teamList.teamList(teamLists)
                updateTeams(teamLists)
            }
        }


    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()

    }

}

