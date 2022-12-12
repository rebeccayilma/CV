package com.rebecca.cvbuilder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        supportActionBar?.elevation = 0f
        supportActionBar?.title = " "

        val fn: EditText = findViewById(R.id.edTfn)
        val ln: EditText = findViewById(R.id.edTln)
        val email: EditText = findViewById(R.id.edTem)
        val pass: EditText = findViewById(R.id.edTp)


        val createAccount : Button = findViewById(R.id.createaccbtn)
        createAccount.setOnClickListener {
            val fname = fn.text.toString()
            val lname = ln.text.toString()
            val em = email.text.toString()
            val ps = pass.text.toString()

            Toast.makeText(this, "$fname , $lname ,  $em ,  $ps", Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("fn", fname)
            intent.putExtra("ln", lname)
            intent.putExtra("em", em)
            intent.putExtra("ps", ps)
            startActivity(intent)
        }
    }
}