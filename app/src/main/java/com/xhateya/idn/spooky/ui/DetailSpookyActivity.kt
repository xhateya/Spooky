package com.xhateya.idn.spooky.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.xhateya.idn.spooky.R


class DetailSpookyActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_PICTURE = "extra_picture"
        const val EXTRA_TITLE= "extra_title"
        const val EXTRA_REVIEW= "extra_review"
        const val EXTRA_STORIES= "extra_stories"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_spooky)

        var actionBar = getSupportActionBar()
        actionBar?.setDisplayHomeAsUpEnabled(true)

        showSpookyStories()

    }

    private fun showSpookyStories() {
        val tvPictureReceived: ImageView = findViewById(R.id.img_item_picture)
        val tvTitleReceived: TextView = findViewById(R.id.tv_item_title)
        val tvReviewReceived:TextView= findViewById(R.id.tv_item_review)
        val tvStoriesReceived:TextView= findViewById(R.id.tv_item_stories)


        val picture= intent.getIntExtra(EXTRA_PICTURE,0)
        val title = intent.getStringExtra(EXTRA_TITLE)
        val review = intent.getStringExtra(EXTRA_REVIEW)
        val stories= intent.getStringExtra(EXTRA_STORIES)

        tvPictureReceived.setImageResource(picture)
        tvTitleReceived.setText("$title")
        tvReviewReceived.setText("$review")
        tvStoriesReceived.setText("$stories")
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}