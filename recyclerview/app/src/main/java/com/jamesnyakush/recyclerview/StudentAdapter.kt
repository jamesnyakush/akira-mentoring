package com.jamesnyakush.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_students.view.*

class StudentAdapter(
    val students: List<Student>
) : RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = StudentViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_students, parent, false)
    )

    override fun getItemCount() = students.size

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val student = students[position]
        holder.itemView.name.text = student.name
        holder.itemView.adm.text = student.admission
        holder.itemView.daro.text = student.daro
    }

    inner class StudentViewHolder(view: View) : RecyclerView.ViewHolder(view)
}