package com.example.tumikiaapp

import android.annotation.SuppressLint
import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.google.firebase.database.FirebaseDatabase

class Join : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var name: EditText
    private lateinit var  email: EditText
    private lateinit var info: EditText
    private lateinit var  submit: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)
        drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        name = findViewById(R.id.nameJoin)
        email = findViewById(R.id.emailJoin)
        info = findViewById(R.id.infoJoin)
        submit = findViewById(R.id.btnsubmitJoin)

        submit.setOnClickListener {
            var name = name.text.toString().trim()
            var email = email.text.toString().trim()
            var info = info.text.toString().trim()
            var time_id = System.currentTimeMillis().toString()

            var progress = ProgressDialog(this)
            progress.setTitle("Saving Data")
            progress.setMessage("Please Wait")

            if (name.isEmpty() || email.isEmpty() || info.isEmpty()) {
                Toast.makeText(this, "Cannot submit an empty field", Toast.LENGTH_SHORT).show()
            } else {

                var my_child = FirebaseDatabase.getInstance().reference.child("Names/" + time_id)
                var user_data = User(name, email, info, time_id)

                //show progress
                progress.show()

                my_child.setValue(user_data).addOnCompleteListener {
                    if (it.isSuccessful){
                        Toast.makeText(this, "Data Uploaded", Toast.LENGTH_SHORT).show()

                        //navigate to ViewUsersActivity
                        var gotokaribu = Intent(this, Karibu::class.java)
                        startActivity(gotokaribu)


                    }else{
                        Toast.makeText(this, "Failed to upload data", Toast.LENGTH_SHORT).show()
                    }

                }

            }


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

