package com.santisusanti.a10117098_santisusanti_sansapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val handle= Handler()
        handle.postDelayed({
            val intent=Intent(this,ViewPager::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}
