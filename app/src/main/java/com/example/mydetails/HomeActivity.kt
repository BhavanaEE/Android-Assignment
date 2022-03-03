package com.example.mydetails

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val submit=findViewById<Button>(R.id.submit)
        val name=findViewById<EditText>(R.id.name)
        val age=findViewById<EditText>(R.id.age)
        val email=findViewById<EditText>(R.id.email)
        val mobile_number=findViewById<EditText>(R.id.mobile_number)

        submit.setOnClickListener(){
            val intent= Intent(this,MainActivity::class.java)
            intent.putExtra(NAME,name.text.toString())
            intent.putExtra(AGE,age.text.toString())
            intent.putExtra(EMAIL,email.text.toString())
            intent.putExtra(MOBILE,mobile_number.text.toString())
            startActivity(intent)
        }
    }
}