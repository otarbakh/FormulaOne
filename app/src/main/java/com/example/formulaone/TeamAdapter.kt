package com.example.formulaone



import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.formulaone.databinding.SingleteamlayoutBinding

 class TeamAdapter : RecyclerView.Adapter<TeamAdapter.TeamViewHolder>() {

    private val teamList = mutableListOf<TeamData>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TeamAdapter.TeamViewHolder {
        val binding =
            SingleteamlayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TeamViewHolder(binding)
    }


    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        holder.bindData(teamList[position])
    }

    override fun getItemCount(): Int {
        return teamList.size
    }

    inner class TeamViewHolder(private val binding: SingleteamlayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindData(data: TeamData) {
            binding.tvTeamLogo.setImageResource(data.image)
            binding.tvTeamName.text = data.name


        }
    }

    fun updateTeams(list: List<TeamData>) {
        teamList.clear()
        teamList.addAll(list)
        notifyDataSetChanged()
    }
}