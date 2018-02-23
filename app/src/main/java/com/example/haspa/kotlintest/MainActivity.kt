package com.example.haspa.kotlintest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.textView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Toast!!!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: View) {
        // Get the value of the text view.
        val countString = textView.text.toString()
        // Convert value to a number and increment it
        var count: Int = Integer.parseInt(countString)
        count++
        // Display the new value in the text view.
        textView.text = count.toString()
    }

    fun randomMe(view: View) {

        val randomIntent = Intent(this, SecondActivity::class.java)

        val countString = textView.text.toString();

        val count = Integer.parseInt(countString)

        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        startActivity(randomIntent)
    }
}