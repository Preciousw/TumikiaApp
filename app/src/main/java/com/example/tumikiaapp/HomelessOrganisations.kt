package com.example.tumikiaapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import android.view.MenuItem
import android.widget.Toast

import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView

class HomelessOrganisations : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var cardselah: CardView
    private lateinit var cardnphy: CardView
    private lateinit var cardalliance: CardView
    private lateinit var cardstreetwise: CardView
    private lateinit var cardwin: CardView
    private lateinit var cardcoalition: CardView
    private lateinit var cardpicture: CardView
    private lateinit var cardnairobi: CardView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homeless_organisations)
        drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
       cardselah = findViewById(R.id.selah)
        cardnphy = findViewById(R.id.nphy)
        cardalliance = findViewById(R.id.alliance)
        cardstreetwise = findViewById(R.id.streetwise)
        cardwin = findViewById(R.id.win)
        cardcoalition = findViewById(R.id.coalition)
        cardpicture = findViewById(R.id.picture)
        cardnairobi = findViewById(R.id.nairobi)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)

        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_nav, R.string.close_nav)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()


        cardselah.setOnClickListener {
            var gotoselah = Intent(this, Selah::class.java)
            startActivity(gotoselah)
        }
        cardnphy.setOnClickListener {
            var gotonphy = Intent(this, Selah::class.java)
            startActivity(gotonphy)
        }
        cardalliance.setOnClickListener {
            var gotoalliance = Intent(this, Selah::class.java)
            startActivity(gotoalliance)
        }
        cardstreetwise.setOnClickListener {
            var gotostreetwise = Intent(this, Selah::class.java)
            startActivity(gotostreetwise)
        }
        cardwin.setOnClickListener {
            var gotowin = Intent(this, Selah::class.java)
            startActivity(gotowin)
        }
        cardcoalition.setOnClickListener {
            var gotocoalition = Intent(this, Selah::class.java)
            startActivity(gotocoalition)
        }
        cardpicture.setOnClickListener {
            var gotopicture = Intent(this, Selah::class.java)
            startActivity(gotopicture)
        }
        cardnairobi.setOnClickListener {
            var gotonairobi = Intent(this, Selah::class.java)
            startActivity(gotonairobi)
        }




    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_home ->{
                var gotohome = Intent(this, Home::class.java)
                startActivity(gotohome)

            }
            R.id.nav_contact -> {
                var gotocontact = Intent(this, ContactUs::class.java)
                startActivity(gotocontact)

            }
            R.id.nav_about -> {
                var gotoabout = Intent(this, About::class.java)
                startActivity(gotoabout)
            }
            R.id.nav_logout -> {
                var gotologin = Intent(this, Login::class.java)
                startActivity(gotologin)
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START)
        } else{
            onBackPressedDispatcher.onBackPressed()

        }

    }
}