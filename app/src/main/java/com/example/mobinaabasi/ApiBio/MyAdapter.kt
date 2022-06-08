package com.example.mobinaabasi.ApiBio

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mobinaabasi.R
import retrofit2.Response

class MyAdapter(val context: Context, val userList: List<MyDataItem>): RecyclerView.Adapter<MyAdapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.row_item , parent , false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = userList[position]
        holder.birthYear.text = ItemsViewModel.birthYearInLHijri.toString()
        holder.deathYear.text = ItemsViewModel.deathYearInLHijri.toString()
        holder.birthPlace.text = ItemsViewModel.birthPlace.toString()
        holder.poet_name.text = ItemsViewModel.nickname.toString()
    }

    override fun getItemCount(): Int {
        return userList.size
    }



    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val birthYear: TextView = itemView.findViewById(R.id.birthYear)
        val deathYear: TextView = itemView.findViewById(R.id.deathYear)
        val birthPlace: TextView = itemView.findViewById(R.id.birthPlace)
        val poet_name: TextView = itemView.findViewById(R.id.poet_name)
    }
}