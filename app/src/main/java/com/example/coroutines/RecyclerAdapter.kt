package com.example.coroutines

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private val namesSleepTimes: MutableList<NameSleepTime>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
            val sleepTimeTextView: TextView = itemView.findViewById(R.id.sleepTimeTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_name_sleep_time, parent, false)
            return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = namesSleepTimes[position]
            holder.nameTextView.text = item.name
            holder.sleepTimeTextView.text = "${item.sleepTime} ms"
    }

    override fun getItemCount() = namesSleepTimes.size
}
