package com.jamesnyakush.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var students = listOf(
            Student("James Nyakundi","ADM-001","7North"),
            Student("James Nyakundi","ADM-001","7North"),
            Student("James Nyakundi","ADM-001","7North"),
            Student("James Nyakundi","ADM-001","7North"),
            Student("James Nyakundi","ADM-001","7North"),
            Student("James Nyakundi","ADM-001","7North"),
            Student("James Nyakundi","ADM-001","7North"),
            Student("James Nyakundi","ADM-001","7North"),
            Student("James Nyakundi","ADM-001","7North"),
            Student("James Nyakundi","ADM-001","7North"),
            Student("James Nyakundi","ADM-001","7North"),
            Student("James Nyakundi","ADM-001","7North"),
            Student("James Nyakundi","ADM-001","7North")
        )

        recyclerview.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            hasFixedSize()
            adapter= StudentAdapter(students)
        }
    }
}