package com.example.recyclerview

import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listOfAndroidVersion : MutableList<String> = mutableListOf();
        listOfAndroidVersion.add("Android 4 Ice Cream Sandwich")
        listOfAndroidVersion.add("Android 4.1 Jelly Bean")
        listOfAndroidVersion.add("Android 4.4 KitKat")
        listOfAndroidVersion.add("Android 5 Lollipop")
        listOfAndroidVersion.add("Android 6 Marshmallow")
        listOfAndroidVersion.add("Android 7 Nougat")
        listOfAndroidVersion.add("Android 8 Oreo")
        listOfAndroidVersion.add("Android 9.0 Pie")
        listOfAndroidVersion.add("Android 10 Q")

        val listOfColors = resources.getStringArray(R.array.colors)

        val rvList = findViewById<RecyclerView>(R.id.rvList)

        rvList.adapter = CustomItemAdapter(listOfAndroidVersion, listOfColors)
    }
}