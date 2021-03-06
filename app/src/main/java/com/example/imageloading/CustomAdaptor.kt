package com.example.imageloading

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CustomAdapter(val imageList: ArrayList<ModelClass>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.bindItems(imageList[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return imageList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(image: ModelClass) {
            val imageView = itemView.findViewById(R.id.imageView) as ImageView
            Picasso.get().load(image.image).into(imageView)
            val title = itemView.findViewById<TextView>(R.id.title_textView)
            title.text = image.title
            val description = itemView.findViewById<TextView>(R.id.description_textView)
            description.text = image.description
        }
    }
}
