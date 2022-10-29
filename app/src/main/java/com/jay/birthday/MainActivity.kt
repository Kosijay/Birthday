package com.jay.birthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var mAddFab : FloatingActionButton
    private lateinit var mAddText : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAddText = findViewById(com.jay.birthday.R.id.birthdayMessage)
        mAddFab = findViewById(com.jay.birthday.R.id.fab_next)
        mAddText.setOnClickListener{ it ->
            Snackbar.make(it, "Please click on the button", Snackbar.LENGTH_LONG )
                .setAction("Action", null).show()
        }
        mAddFab.setOnClickListener{ it ->
            val nextPictureActivity1intent = Intent(this, PictureActivity_1::class.java)
            startActivity(nextPictureActivity1intent)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }


    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        return true
    }
}