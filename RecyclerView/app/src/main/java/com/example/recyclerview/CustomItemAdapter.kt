package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CustomItemAdapter(var listOfAndroidVersion : MutableList<String>, var listOfColors : Array<String>) : RecyclerView.Adapter<CustomItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomItemHolder {
        var layoutView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)

        return CustomItemHolder(layoutView)
    }

    override fun onBindViewHolder(holder: CustomItemHolder, position: Int) {
        holder.configuration(listOfAndroidVersion[position], listOfColors[position])
    }

    override fun getItemCount(): Int {
        return listOfAndroidVersion.size
    }
}
