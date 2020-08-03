package com.example.android03layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_sub.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(R.layout.activity_sub)
        button_left.setOnClickListener {
            tv_title.text = et_name.text
        }
        button.setOnClickListener {
             tv_title.textSize = 100F
         }
        button_right.setOnClickListener {
            tv_title.textSize = 18F
        }
        check_job1.setOnCheckedChangeListener { compoundButton, b ->
            Log.i("testLog",compoundButton.isChecked.toString())
        }
        switch_sw.setOnCheckedChangeListener { compoundButton, b ->
            Log.i("testLog",compoundButton.isChecked.toString())
        }

/*
        Log.i("testLog","onCreate()...${tv01.text}")
        //tv01.text = "android"
        //tv01.text = R.string.app_name2.toString()
        tv01.text = getString(R.string.app_name)

        button1.setOnClickListener {
            tv01.text = getString(R.string.app_name2)
        }

        button2.setOnClickListener {
            tv01.text = getString(R.string.app_name)
        }
*/


    }//end onCreate()


}//end class