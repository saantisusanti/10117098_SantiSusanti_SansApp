package com.santisusanti.a10117098_santisusanti_sansapp
/* Tanggal Pengerjaan : 10-13 Mei 2020
    Nama              : Santi Susanti
    NIM               : 10117098
    Kelas             : IF-3
 */

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var toolbar: Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(tulbars)

        drawerLayout = findViewById(R.id.drawer)
        navView = findViewById(R.id.nav_view)

        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, tulbars,0,0
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        navView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.homee -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent);
                Toast.makeText(this,"Home clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.social -> {
                val intent = Intent(this, Contact::class.java)
                startActivity(intent);
                Toast.makeText(this,"Contacts", Toast.LENGTH_SHORT).show()
            }
            R.id.friend -> {
                val intent = Intent(this, FriendList::class.java)
                startActivity(intent)
                Toast.makeText(this,"Friend Clicked", Toast.LENGTH_SHORT).show()
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
}
