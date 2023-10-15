package com.soumya.activitylifecycyle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class NewActivity : AppCompatActivity() , View.OnClickListener {




    lateinit var etMobileNumber:EditText
    lateinit var etPassword : EditText
    lateinit var btnLogin : Button
    lateinit var txtForgotPassword : TextView
    lateinit var txtRegister : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new2)

        title = "Log IN"
        etMobileNumber= findViewById(R.id.etMobileNumber)
        etPassword =  findViewById(R.id.etPassword)
        txtForgotPassword = findViewById(R.id.txtForgotPassword)
        btnLogin = findViewById(R.id.btnLogin)
        txtRegister = findViewById(R.id.txtRegister)

        btnLogin.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        Toast.makeText(
            this@NewActivity,
            "We clicked on the button to see this toast",
            Toast.LENGTH_SHORT
        ).show()
    }


}