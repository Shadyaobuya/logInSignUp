package com.example.signup_loginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var Login: Button
    lateinit var signup:Button
    lateinit var passShow:ImageView
    lateinit var passw:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
        onClick()
    }
    fun castViews(){
        Login=findViewById(R.id.btnlogin)
        signup=findViewById(R.id.btnsignup)
        passShow=findViewById(R.id.passShow)
        passw=findViewById(R.id.etpassword)
    }
    fun onClick(){
        passShow.setOnClickListener {
            passw.transformationMethod=HideReturnsTransformationMethod.getInstance()
        }


        signup.setOnClickListener {
            var intent=Intent(baseContext,SignUp::class.java)
            startActivity(intent)
        }
        Login.setOnClickListener {
            Toast.makeText(baseContext,"Hello,Welcome back ",Toast.LENGTH_SHORT).show()
        }


    }

}