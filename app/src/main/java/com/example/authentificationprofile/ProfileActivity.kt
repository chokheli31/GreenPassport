package com.example.authentificationprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val bottomNavigationView = findViewById<bottomNavigationView>(R.id.bottomNavigationView)
        val navController = findNavController(R.id.fragmentContainerView)
        val appBarConfiguration = appBarConfiguration(setOf(R.id.homeFragment, R.id.statisticFragment))
        setupActionBarWithNavController(navController, appBarConfiguration)



        bottomNavigationView.setupWithNavController(navController)

    }
}