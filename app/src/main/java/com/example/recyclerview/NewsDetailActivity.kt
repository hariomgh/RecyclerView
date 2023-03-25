 package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

 class NewsDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_detail)
        supportActionBar?.hide()


        val heading = intent.getStringExtra("heading")
        val newsContent = intent.getStringExtra("newscontent")
        val imageId = intent.getIntExtra("imageId", R.drawable.img)

        val headingTV = findViewById<TextView>(R.id.newsHeading)
        val headingIV = findViewById<ImageView>(R.id.newsImage)
        val newsContentTV = findViewById<TextView>(R.id.newsContent)

        headingTV.text = heading
        newsContentTV.text = newsContent
        headingIV.setImageResource(imageId)
    }
}