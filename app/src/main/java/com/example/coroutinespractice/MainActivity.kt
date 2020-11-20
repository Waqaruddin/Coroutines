package com.example.coroutinespractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val model: MyViewMode by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        model.firstUser.observe(this, {

            var user = it.data
            var text = ""
            for (j in user) {
                text += j.name + "\n"
            }

            text_view_name.text = text
        })
    }
}