package com.example.activitylifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        Log.d("MyLocation","I'm in onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.d("MyLocation","I'm in onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.d("MyLocation","I'm in onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.d("MyLocation","I'm in onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("MyLocation","I'm in onDestroy")
    }
}
