package com.example.tumikiaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.cardview.widget.CardView

class Home : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var homeless: CardView
    private lateinit var elderly: CardView
    private lateinit var specialNeeds: CardView
    private lateinit var AIDS: CardView
    private lateinit var alcoholics: CardView
    private lateinit var addicts: CardView
    private lateinit var orphans: CardView
    private lateinit var malnutritionedFam: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        homeless = findViewById(R.id.streetFamilies)
        elderly = findViewById(R.id.elderly)
        specialNeeds = findViewById(R.id.specialNeeds)
        AIDS = findViewById(R.id.HIV)
        alcoholics = findViewById(R.id.alcoholics)
        addicts = findViewById(R.id.addicts)
        orphans = findViewById(R.id.orphans)
        malnutritionedFam = findViewById(R.id.malnutrition)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)

        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_nav, R.string.close_nav)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()


            homeless.setOnClickListener {
                var gotohomeless = Intent(this, HomelessOrganisations::class.java)
                startActivity(gotohomeless)
            }
            elderly.setOnClickListener {
                var gotoelderly = Intent(this, HomelessOrganisations::class.java)
                startActivity(gotoelderly)
            }
            specialNeeds.setOnClickListener {
                var gotospecialNeeds = Intent(this, HomelessOrganisations::class.java)
                startActivity(gotospecialNeeds)
            }
            AIDS.setOnClickListener {
                var gotoAIDS = Intent(this, HomelessOrganisations::class.java)
                startActivity(gotoAIDS)
            }
            alcoholics.setOnClickListener {
                var gotoalcoholics = Intent(this, HomelessOrganisations::class.java)
                startActivity(gotoalcoholics)
            }
            addicts.setOnClickListener {
                var gotoaddicts = Intent(this, HomelessOrganisations::class.java)
                startActivity(gotoaddicts)
            }
            orphans.setOnClickListener {
                var gotoorphans = Intent(this, HomelessOrganisations::class.java)
                startActivity(gotoorphans)
            }
            malnutritionedFam.setOnClickListener {
                var gotomalnutrition = Intent(this, HomelessOrganisations::class.java)
                startActivity(gotomalnutrition)
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