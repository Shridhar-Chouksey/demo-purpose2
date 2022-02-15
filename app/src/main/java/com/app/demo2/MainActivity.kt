package com.app.demo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a:Int=3
        var b:Int=5
        var c:Int =a+b
        println(c)
        Log.d("main", "onCreate: I am the master of my own world!")
        Log.d("main", "onCreate:abcd")
    }
}