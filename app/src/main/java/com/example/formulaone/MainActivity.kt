package com.example.formulaone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.formulaone.Fragments.DashboardFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.tetriekrani, DashboardFragment())
            addToBackStack(DashboardFragment::javaClass.name)
            commit()
        }
    }
}