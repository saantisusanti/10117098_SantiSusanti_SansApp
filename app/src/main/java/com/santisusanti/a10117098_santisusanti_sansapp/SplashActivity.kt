package com.santisusanti.a10117098_santisusanti_sansapp
/* Tanggal Pengerjaan : 10 Mei 2020
    Nama              : Santi Susanti
    NIM               : 10117098
    Kelas             : IF-3
 */
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
