//package com.ivanojok.todoapp
package ug.ac.myrecyleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ug.ac.myrecyleview.data.ActivityAdapter
import ug.ac.myrecyleview.data.ActivityModel
import ug.ac.myrecyleview.data.ActivityStatus

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<ActivityModel>()
        list.add(ActivityModel(R.drawable.aapple, "Check Mails", "5:05 am", "Check and reply to important emails concerning sales, meetings and many more", ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.chicken_leg, "Check Mails", "5:05 am", "Check and reply to important emails concerning sales, meetings and many more", ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.rice, "Check Mails", "5:05 am", "Check and reply to important emails concerning sales, meetings and many more", ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.sideplayr_menu, "Check Mails", "5:05 am", "Check and reply to important emails concerning sales, meetings and many more", ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.aapple, "Check Mails", "5:05 am", "Check and reply to important emails concerning sales, meetings and many more", ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.rice, "Check Mails", "5:05 am", "Check and reply to important emails concerning sales, meetings and many more", ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.aapple, "Check Mails", "5:05 am", "Check and reply to important emails concerning sales, meetings and many more", ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.rice, "Check Mails", "5:05 am", "Check and reply to important emails concerning sales, meetings and many more", ActivityStatus.Pending))

        val activityAdapter = ActivityAdapter(this, list)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = activityAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}