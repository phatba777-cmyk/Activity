package com.example.activitynavigation

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val btnGoToMain = findViewById<Button>(R.id.btnGoToMain)

        btnGoToMain.setOnClickListener {
            finish() // Đóng DetailActivity để quay về Main
        }
    }
}