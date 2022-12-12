package com.example.carbon_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class FacultyAdapter(private val facultyList:ArrayList<Faculty>)
    :RecyclerView.Adapter<FacultyAdapter.FacultyViewHolder>(){

        class FacultyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
            val imageView : ImageView =itemView.findViewById(R.id.imageview)
            val textView : TextView = itemView.findViewById(R.id.textview)

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FacultyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item,   parent , false)
        return FacultyViewHolder(view)
    }

    override fun onBindViewHolder(holder: FacultyViewHolder, position: Int) {
        val faculty = facultyList[position]
        holder.imageView.setImageResource(faculty.image)
        holder.textView.text = faculty.name
    }
    override fun getItemCount(): Int {
        return facultyList.size
    }
}