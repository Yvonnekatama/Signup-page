package com.example.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class signup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        var etName=findViewById<EditText>(R.id.etname)
        var etspgender= findViewById<Spinner>(R.id.spgender)
        var etemail= findViewById<EditText>(R.id.etmail)
        var etphonenumber =findViewById<EditText>(R.id.etphonenumber)
        var etpassword=  findViewById<EditText>(R.id.etpass)
        var btnsignup= findViewById<Button>(R.id.btnsignup)
        var btnlog=findViewById<Button>(R.id.btnlog)

        val gender= arrayOf("Male","Female","Other")
        val adapter=
            ArrayAdapter<String>(baseContext,android.R.layout.simple_spinner_item,gender)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        etspgender.adapter=adapter





        btnsignup.setOnClickListener {
            etName.text.toString()
            etemail.text.toString()
            etphonenumber.text.toString()
            etpassword.text.toString()


                Toast.makeText(baseContext,"You are now Signed in",Toast.LENGTH_LONG).show()


            }
        btnlog.setOnClickListener {
            var intent4=Intent(baseContext,MainActivity::class.java)
            startActivity(intent4)
        }

        }



    }



