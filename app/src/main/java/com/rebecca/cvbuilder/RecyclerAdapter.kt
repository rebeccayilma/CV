package com.rebecca.cvbuilder

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private val title = arrayOf("Software Engineer",
        "Software Engineer", "FullStack Developer", "Web Developer")

    private val company = arrayOf("Masimo", "MNET Technology",
        "Ethio-Gambia", "University of Oslo")

    private val duration = arrayOf("March 2022- Present",
        "April 2019 - Jan 2021 ", "Sep 2018 - Dec 2020", "Jul 2019 - Jun 2020")
    private val location = arrayOf("Panama City, Fl", "Addis Ababa, ET",
        "Addis Ababa, ET", "Addis Ababa, ET")

    private val description = arrayOf("Full Stack Java Development",
        "Android and Web Development", "Web Application Development", "Web Development and Design")
    private val image = arrayOf(R.drawable.maslogo,
        R.drawable.mnlogo, R.drawable.etga, R.drawable.oslogo)

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemImage: ImageView
        var company: TextView
        var title: TextView
        var duration: TextView
        var location: TextView
        var description: TextView

        init {
            itemImage = itemView.findViewById(R.id.joblogo)
            company = itemView.findViewById(R.id.company)
            title = itemView.findViewById(R.id.title)
            duration = itemView.findViewById(R.id.duration)
            location = itemView.findViewById(R.id.location)
            description = itemView.findViewById(R.id.description)


        }
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.work_card, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        val imgResId = image[i]
        var resId = imgResId
        viewHolder.itemImage.setImageResource(resId)
        viewHolder.company.text = company[i]
        viewHolder.title.text = title[i]
        viewHolder.duration.text = duration[i]
        viewHolder.location.text = location[i]
        viewHolder.description.text = description[i]

    }

    override fun getItemCount(): Int {
        return title.size
    }
}