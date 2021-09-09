package com.example.testfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.testfragment.fragments.FragmentA
import com.example.testfragment.fragments.FragmentB

class MainActivity : AppCompatActivity(), FragmentClickListener {

    var fragmentA = FragmentA()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.main_container, fragmentA).commit()
    }

    override fun onClick() {

        var text = fragmentA.getText()
        supportFragmentManager.beginTransaction()
            .addToBackStack(null)
            .replace(R.id.main_container, FragmentB.newInstance(text)).commit()
    }
}