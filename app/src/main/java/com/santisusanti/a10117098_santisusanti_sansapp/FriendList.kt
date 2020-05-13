package com.santisusanti.a10117098_santisusanti_sansapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_friend_list.*

class FriendList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friend_list)

        back_menu.setOnClickListener(){
            val intent  = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
