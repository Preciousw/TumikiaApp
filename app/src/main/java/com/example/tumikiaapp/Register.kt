package com.example.tumikiaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class Register : AppCompatActivity() {
    private lateinit var name:EditText
    private lateinit var email:EditText
    private lateinit var password:EditText
    private lateinit var createAccount:Button
    private lateinit var auth: FirebaseAuth



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

         name = findViewById(R.id.nameRegister)
         email = findViewById(R.id.emailRegister)
         password = findViewById(R.id.passwordRegister)
         createAccount = findViewById(R.id.btnRegister_register)
        auth = FirebaseAuth.getInstance()




        val items = listOf("Nairobi", "Mombasa", "Embu", "Kitui", "Machakos", "Makueni", "Nyeri", "Murang'a", "Kajiado", "Nyamira" )

        val autoComplete : AutoCompleteTextView = findViewById(R.id.auto_complete)

        val adapter = ArrayAdapter(this,R.layout.list_item,items)

        autoComplete.setAdapter(adapter)

        autoComplete.onItemClickListener = AdapterView.OnItemClickListener {
                adapterView, view, i, l  ->

            val itemSelected = adapterView.getItemAtPosition(i)
            Toast.makeText(this, "Item: $itemSelected", Toast.LENGTH_SHORT).show()
        }
        createAccount.setOnClickListener {
            var name = name.text.toString().trim()
            var email = email.text.toString().trim()
            var password = password.text.toString().trim()


            if(name.isEmpty() || email.isEmpty() || password.isEmpty()){
                Toast.makeText(this, "Cannnot submit empty field", Toast.LENGTH_SHORT).show()

            }
            else{
                auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(this){
                    if(it.isSuccessful){
                        Toast.makeText(this, "User created successfully", Toast.LENGTH_SHORT).show()
                        //navigate to login
                        var gotologin = Intent(this, Login::class.java)
                        startActivity(gotologin)

                    }
                    else{
                        Toast.makeText(this, "Failed to create the account", Toast.LENGTH_SHORT).show()
                    }



                }



            }




        }








    }


}