package com.santisusanti.a10117098_santisusanti_sansapp
/* Tanggal Pengerjaan : 10-11 Mei 2020
    Nama              : Santi Susanti
    NIM               : 10117098
    Kelas             : IF-3
 */

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_pager.*

class ViewPager : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)

        viewpager.adapter = MyPagerAdapter(supportFragmentManager)

        end_pager.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
