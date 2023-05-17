package com.example.tumikiaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class Login : AppCompatActivity() {
    private lateinit var email_Login:EditText
    private lateinit var password_Login:EditText
    private lateinit var login:Button
    private lateinit var registerBtn:Button
    private lateinit var auth:FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        email_Login = findViewById(R.id.emailLogin)
        password_Login = findViewById(R.id.passwordLogin)


        login = findViewById(R.id.LoginButton)
         registerBtn = findViewById(R.id.btnRegister_login)
        auth = FirebaseAuth.getInstance()


        registerBtn.setOnClickListener {
            var gotoregister = Intent(this, Register::class.java)
            startActivity(gotoregister)
        }
        login.setOnClickListener {

            var edt_email = email_Login.text.toString().trim()
            var edt_password = password_Login.text.toString().trim()

            if(edt_email.isEmpty() || edt_password.isEmpty()){
                Toast.makeText(this, "Cannot submit an empty field", Toast.LENGTH_SHORT).show()
            } else{

                Toast.makeText(this, edt_email, Toast.LENGTH_SHORT).show()

                auth.signInWithEmailAndPassword(edt_email,edt_password).addOnCompleteListener(this){
                    if(it.isSuccessful){
                        Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
                        var gotodash = Intent(this, Home::class.java)
                        startActivity(gotodash)
                        finish()
                    } else{
                        Toast.makeText(this, "Failed to Login", Toast.LENGTH_SHORT).show()
                        //Log.d("TAG", "Error---->is", it.exception)


                        var errorlog = it.exception



                        val exceptionMessage = "$errorlog"
                        val delimiter = ":"
                        val index = exceptionMessage.indexOf(delimiter)
                        val trimmedMessage = if (index != -1) exceptionMessage.substring(index + delimiter.length).trim() else exceptionMessage



                        Toast.makeText(this, "Error is $trimmedMessage", Toast.LENGTH_SHORT).show()
                        Log.d("error_is_one", trimmedMessage)
                        Log.d("error_is_two", errorlog!!.message.toString())
                    }


                }
            }






        }




    }
}