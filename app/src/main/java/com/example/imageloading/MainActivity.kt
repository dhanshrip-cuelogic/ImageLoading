package com.example.imageloading

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val imageList = ArrayList<ModelClass>()

        //adding some dummy data to the list
        imageList.add(ModelClass("https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__340.jpg","nature","sample description"))
        imageList.add(ModelClass("https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__340.jpg","nature","sample description"))
        imageList.add(ModelClass("https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__340.jpg","nature","sample description"))
        imageList.add(ModelClass("https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__340.jpg","nature","sample description"))
        imageList.add(ModelClass("https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__340.jpg","nature","sample description"))
        imageList.add(ModelClass("https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__340.jpg","nature","sample description"))
        imageList.add(ModelClass("https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__340.jpg","nature","sample description"))
        imageList.add(ModelClass("https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__340.jpg","nature","sample description"))
        imageList.add(ModelClass("https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__340.jpg","nature","sample description"))
        imageList.add(ModelClass("https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__340.jpg","nature","sample description"))
        imageList.add(ModelClass("https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__340.jpg","nature","sample description"))
        imageList.add(ModelClass("https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__340.jpg","nature","sample description"))
        imageList.add(ModelClass("https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__340.jpg","nature","sample description"))
        imageList.add(ModelClass("https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__340.jpg","nature","sample description"))




        val adapter = CustomAdapter(imageList)

        recyclerView.adapter = adapter
    }
}