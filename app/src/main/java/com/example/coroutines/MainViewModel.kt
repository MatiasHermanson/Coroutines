//package com.example.coroutines
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//
//class MainViewModel(private val namesSleepTimes: MutableList<RecyclerAdapter>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
//
//    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val nameTextView: TextView = itemView.findViewById(R.id.name)
//        val sleepTimeTextView: TextView = itemView.findViewById(R.id.sleepTimeTextView)
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
//        return ViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
//        TODO("Not yet implemented")
//    }
//
//    override fun onBindViewHolder(
//        holder: RecyclerAdapter.ViewHolder,
//        position: Int,
//        payloads: MutableList<Any>
//    ) {
//        val item = namesSleepTimes[position]
//        holder.nameTextView.text = item.name
//        holder.sleepTimeTextView.text = "${item.sleepTime} ms"
//    }
//
//    override fun getItemCount() = namesSleepTimes.size
//}
