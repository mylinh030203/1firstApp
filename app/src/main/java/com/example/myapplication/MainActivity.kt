package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Anhxa()
    }
    @SuppressLint("WrongViewCast")
    fun Anhxa(){
        var dollars = findViewById<EditText>(R.id.dollars)

        var textV = findViewById<TextView>(R.id.TWpass)
        var dn = findViewById<Button>(R.id.convert)
//        dn.setOnClickListener{
//            var text = username.text
//            Toast.makeText(this,text , Toast.LENGTH_SHORT).show()
//        }
        dn.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                var text = dollars.text
                if(text.isEmpty()) textV.text = getString(R.string._000000_vnd)

                textV.text = (((text.toString()).toDouble()*24000)).toString()+" VND"
            }

        })

    }

}
