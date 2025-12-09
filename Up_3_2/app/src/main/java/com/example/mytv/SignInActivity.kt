package com.example.mytv

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText

class SignInActivity : Activity() {
    lateinit var email: EditText
    lateinit var password: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
    }

    fun Login(view: View) {
        if(email.text.isNotEmpty() && password.text.isNotEmpty()){
            intent = Intent(this, QuestsActivity::class.java)
            startActivity(intent)
        }
        else{
            val alert = AlertDialog.Builder(this)
                .setTitle("Error")
                .setMessage("У вас есть пустые поля")
                .setPositiveButton("Ok", null)
                .create()
                .show()
        }
    }
}