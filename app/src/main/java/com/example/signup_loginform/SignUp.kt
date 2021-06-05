package com.example.signup_loginform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class SignUp : AppCompatActivity() {
    lateinit var logIn: Button
    lateinit var Signup: Button
    lateinit var name:EditText
    lateinit var email:EditText
    lateinit var password:EditText
    lateinit var phone:EditText
    lateinit var gender:Spinner
    lateinit var display:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        castViews()
        onclick()
    }
    fun castViews(){
        logIn=findViewById(R.id.btnlog)
        Signup=findViewById(R.id.btnsign)
        name=findViewById(R.id.etusrname)
        email=findViewById(R.id.etmail)
        password=findViewById(R.id.etpass)
         phone=findViewById(R.id.etphone)
       gender=findViewById(R.id.spngender)
        display=findViewById(R.id.tvDisplay)

        var allgenders=arrayOf("Male","Female","Binary","Id rather Not say")
        var genderadapter=ArrayAdapter<String>(baseContext,android.R.layout.simple_spinner_item,allgenders)
        genderadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        gender.adapter=genderadapter
    }
    fun onclick(){
        var gen = gender.selectedItem.toString()

        Signup.setOnClickListener {
            if (name.text.toString().isEmpty() || email.text.toString().isEmpty() || password.text.toString().isEmpty() || phone.text.toString().isEmpty() ){
                name.setError("Can't be blank")
                email.setError("Field Can't be blank")
                password.setError("Field Can't be blank")
                phone.setError("Field can't be Empty")
             }
            else{
                var newUser=name.text.toString()
                display.text="Hello ${newUser}. Welcome"

            }

        }
        logIn.setOnClickListener {
            var intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }


    }
}