package com.santisusanti.a10117098_santisusanti_sansapp

/* Tanggal Pengerjaan : 12 Mei 2020
    Nama              : Santi Susanti
    NIM               : 10117098
    Kelas             : IF-3
 */
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_contact.*

class Contact : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        back_menu.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        ig2.setOnClickListener(){
            var i = Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/saantisusanti/"))
            startActivity(i)
        }
    }
}
