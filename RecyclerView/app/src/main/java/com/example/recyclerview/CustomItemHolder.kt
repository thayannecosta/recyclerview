package com.example.recyclerview

import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class CustomItemHolder(rootView : View) : RecyclerView.ViewHolder(rootView) {

    private val tvVersionName : TextView
    private val clColor : ConstraintLayout

    init {
        tvVersionName = rootView.findViewById(R.id.tvItemText)
        clColor = rootView.findViewById(R.id.clContainer)
    }

    fun configuration(versionName : String, color : String) {
        clColor.setBackgroundColor(Color.parseColor(color))
        tvVersionName.text = versionName
    }

}