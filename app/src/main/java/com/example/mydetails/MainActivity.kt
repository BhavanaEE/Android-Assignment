package com.example.mydetails

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name=intent.getStringExtra(NAME)
        val age=intent.getStringExtra(AGE)
        val email=intent.getStringExtra(EMAIL)
        val mobileNumber=intent.getStringExtra(MOBILE)
        val viewName=findViewById<TextView>(R.id.nameTv)
        val viewAge=findViewById<TextView>(R.id.ageTv)
        val viewEmail=findViewById<TextView>(R.id.emailTv)
        val viewMobile=findViewById<TextView>(R.id.mobileNumberTv)
        viewName.setText(name)
        viewAge.setText(age)
        viewEmail.setText(email)
        viewMobile.setText(mobileNumber)

    }
}