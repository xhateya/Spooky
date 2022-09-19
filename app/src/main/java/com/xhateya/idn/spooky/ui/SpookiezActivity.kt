package com.xhateya.idn.spooky.ui


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.xhateya.idn.spooky.R

class SpookiezActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_PROFILE="extra_profile"
        const val EXTRA_USER="extra_user"
        const val EXTRA_EMAIL="extra_email"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spookiez)

        val ivSpookiezProfile: ImageView= findViewById(R.id.spookiez_profile)
        val tvUser: TextView = findViewById(R.id.user)
        val tvEmail: TextView = findViewById(R.id.email)

        val spookiezProfile = intent.getIntExtra(EXTRA_PROFILE,0)
        val user= intent.getStringExtra(EXTRA_USER)
        val email= intent.getStringExtra(EXTRA_EMAIL)

        ivSpookiezProfile.setImageResource(spookiezProfile)
        tvUser.text= "$user"
        tvEmail.text= "$email"




    }
}