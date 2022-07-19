package com.example.formulaone.Cards

import com.example.formulaone.Datas.TeamData
import com.example.formulaone.R

class TeamCard{
     fun teamList(list: MutableList<TeamData>){
         list.add(
             TeamData(
                 0,
                 "Alfa Romeo",
                 R.drawable.alfa_romeo_seeklogo_com

             )
         )
         list.add(
             TeamData(
                 1,
                 "Alpine",
                 R.drawable.alpine_seeklogo_com

             )
         )
         list.add(
             TeamData(
                 2,
                 "Aston Martin",
                 R.drawable.aston_martin_seeklogo_com

             )
         )

         list.add(
             TeamData(
                 3,
                 "Ferrari",
                 R.drawable.ferrari_emblem_seeklogo_com

             )
         )
         list.add(
             TeamData(
                 4,
                 "Hass",
                 R.drawable.haas_f1_team_seeklogo_com

             )
         )
         list.add(
             TeamData(
                 5,
                 "Mclaren",
                 R.drawable.mclaren_formula_1_team_seeklogo_com

             )
         )
         list.add(
             TeamData(
                 6,
                 "Red Bull Racing",
                 R.drawable.red_bull_racing_logo___brandlogos_net

             )
         )
         list.add(
             TeamData(
                 7,
                 "Scuderia Alpha Tauri",
                 R.drawable.scuderia_alpha_tauri_1

             )
         )
         list.add(
             TeamData(
                 8,
                 "Williams Racing",
                 R.drawable.williams_racing_seeklogo_com

             )
         )
     }
 }
