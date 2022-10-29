package com.jay.birthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class PictureActivity_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture2)
        var mAddFabPrev : FloatingActionButton = findViewById(com.jay.birthday.R.id.fab_prev)
        mAddFabPrev.setOnClickListener{ it ->
            val prevPictureActivity3Intent = Intent(this, PictureActivity_1::class.java)
            startActivity(prevPictureActivity3Intent)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }
    }
}