package com.example.tumikiaapp

import android.animation.LayoutTransition
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView

class Selah : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var detailsText1:TextView
    private lateinit var detailsText2:TextView
    private lateinit var detailsText3:TextView
    private lateinit var detailsText4:TextView
    private lateinit var detailsText5:TextView
    private lateinit var detailsText6:TextView
    private lateinit var detailsText7:TextView
    private lateinit var layout1:LinearLayout
    private lateinit var layout2:LinearLayout
    private lateinit var layout3:LinearLayout
    private lateinit var layout4:LinearLayout
    private lateinit var layout5:LinearLayout
    private lateinit var layout6:LinearLayout
    private lateinit var layout7:LinearLayout
    private lateinit var expand1 :CardView
    private lateinit var expand2 :CardView
    private lateinit var expand3 :CardView
    private lateinit var expand4 :CardView
    private lateinit var expand5 :CardView
    private lateinit var expand6 :CardView
    private lateinit var expand7 :CardView
    private lateinit var join1:Button
    private lateinit var join2:Button
    private lateinit var join3:Button
    private lateinit var join4:Button
    private lateinit var join5:Button
    private lateinit var join6:Button
    private lateinit var join7:Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selah)
        drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        detailsText1 = findViewById(R.id.detailsText1)
        detailsText2 = findViewById(R.id.detailsText2)
        detailsText3 = findViewById(R.id.detailsText3)
        detailsText4 = findViewById(R.id.detailsText4)
        detailsText5 = findViewById(R.id.detailsText5)
        detailsText6 = findViewById(R.id.detailsText6)
        detailsText7 = findViewById(R.id.detailsText7)
        layout1 = findViewById(R.id.layouts1)
        layout2 = findViewById(R.id.layouts2)
        layout3 = findViewById(R.id.layouts3)
        layout4 = findViewById(R.id.layouts4)
        layout5 = findViewById(R.id.layouts5)
        layout6 = findViewById(R.id.layouts6)
        layout7 = findViewById(R.id.layouts7)
        expand1 = findViewById(R.id.expandable1)
        expand2 = findViewById(R.id.expandable2)
        expand3 = findViewById(R.id.expandable3)
        expand4 = findViewById(R.id.expandable4)
        expand5 = findViewById(R.id.expandable5)
        expand6 = findViewById(R.id.expandable6)
        expand7 = findViewById(R.id.expandable7)
        join1 = findViewById(R.id.btnjoin1)
        join2 = findViewById(R.id.btnjoin2)
        join3 = findViewById(R.id.btnjoin3)
        join4 = findViewById(R.id.btnjoin4)
        join5 = findViewById(R.id.btnjoin5)
        join6 = findViewById(R.id.btnjoin6)
        join7 = findViewById(R.id.btnjoin7)

        layout1.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
        expand1.setOnClickListener{
            val v= if(detailsText1.visibility == View.GONE) View.VISIBLE else View.GONE
            detailsText1.visibility = v
            val b = if(join1.visibility == View.GONE) View.VISIBLE else View.GONE
            join1.visibility = b
        }

        layout2.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
        expand2.setOnClickListener{
            val v= if(detailsText2.visibility == View.GONE) View.VISIBLE else View.GONE
            detailsText2.visibility = v
            val b = if(join2.visibility == View.GONE) View.VISIBLE else View.GONE
            join2.visibility = b
        }

        layout3.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
        expand3.setOnClickListener{
            val v= if(detailsText3.visibility == View.GONE) View.VISIBLE else View.GONE
            detailsText3.visibility = v
            val b = if(join3.visibility == View.GONE) View.VISIBLE else View.GONE
            join3.visibility = b
        }

        layout4.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
        expand4.setOnClickListener{
            val v= if(detailsText4.visibility == View.GONE) View.VISIBLE else View.GONE
            detailsText4.visibility = v
            val b = if(join4.visibility == View.GONE) View.VISIBLE else View.GONE
            join4.visibility = b
        }

        layout5.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
        expand5.setOnClickListener{
            val v= if(detailsText5.visibility == View.GONE) View.VISIBLE else View.GONE
            detailsText5.visibility = v
            val b = if(join5.visibility == View.GONE) View.VISIBLE else View.GONE
            join5.visibility = b
        }

        layout6.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
        expand6.setOnClickListener {
            val v = if (detailsText6.visibility == View.GONE) View.VISIBLE else View.GONE
            detailsText6.visibility = v
            val b = if (join6.visibility == View.GONE) View.VISIBLE else View.GONE
            join6.visibility = b

        }




        layout7.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)
        expand7.setOnClickListener{
            val v= if(detailsText7.visibility == View.GONE) View.VISIBLE else View.GONE
            detailsText7.visibility = v
            val b = if(join7.visibility == View.GONE) View.VISIBLE else View.GONE
            join7.visibility = b
        }


        join1.setOnClickListener {
           var gotojoin = Intent(this, Join::class.java)
            startActivity(gotojoin)
        }

        join2.setOnClickListener {
            var gotojoin = Intent(this, Join::class.java)
            startActivity(gotojoin)
        }

        join3.setOnClickListener {
            var gotojoin = Intent(this, Join::class.java)
            startActivity(gotojoin)
        }

        join4.setOnClickListener {
            var gotojoin = Intent(this, Join::class.java)
            startActivity(gotojoin)
        }

        join5.setOnClickListener {
            var gotojoin = Intent(this, Join::class.java)
            startActivity(gotojoin)
        }

        join6.setOnClickListener {
            var gotojoin = Intent(this, Join::class.java)
            startActivity(gotojoin)
        }

        join7.setOnClickListener {
            var gotojoin = Intent(this, Join::class.java)
            startActivity(gotojoin)
        }




        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)

        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_nav, R.string.close_nav)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()







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