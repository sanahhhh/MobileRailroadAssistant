package com.example.mobilerailroadassistant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.Window
import androidx.fragment.app.Fragment
import com.example.mobilerailroadassistant.databinding.ActivityMainBinding
import com.example.mobilerailroadassistant.loggin.LogginFragment

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)



    }

    fun navTo(fragment : Fragment) {
        this.supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, fragment)
            .commit()
    }

}