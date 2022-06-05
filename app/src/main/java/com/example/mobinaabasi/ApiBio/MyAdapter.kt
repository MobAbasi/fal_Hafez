package com.example.mobinaabasi.ApiBio

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mobinaabasi.R

class MyAdapter(val context: Context, val userList: List<MyDataItem>): RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        var poetName: TextView
        var birthYear: TextView
        var deathYear: TextView
        var birthPlace: TextView

        init {
            poetName= itemView.poet_name
            birthYear= itemView.birthYear
            deathYear= itemView.deathYear
            birthPlace=itemView.birthPlace



        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = LayoutInflater.from(context).inflate(R.layout.row_item , parent , false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.poetName.text=userList[position].name.toString()
        holder.birthYear.text=userList[position].birthYearInLHijri.toString()
        holder.deathYear.text=userList[position].deathYearInLHijri.toString()
        holder.birthPlace.text=userList[position].birthPlace.toString()
    }

    override fun getItemCount(): Int {
        return userList.size
    }
}