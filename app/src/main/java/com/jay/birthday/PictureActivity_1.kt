package com.jay.birthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class PictureActivity_1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture1)
        var mAddFabNext : FloatingActionButton= findViewById(com.jay.birthday.R.id.fab_next)
        var mAddFabPrev : FloatingActionButton= findViewById(com.jay.birthday.R.id.fab_prev)
        mAddFabNext.setOnClickListener{ it ->
            val nextPictureActivity3Intent = Intent(this, PictureActivity_2::class.java)
            startActivity(nextPictureActivity3Intent)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }
        mAddFabPrev.setOnClickListener{ it ->
            val prevPictureActivity2Intent = Intent(this, MainActivity::class.java)
            startActivity(prevPictureActivity2Intent)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()

        }

    }
}