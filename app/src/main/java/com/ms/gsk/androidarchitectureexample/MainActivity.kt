package com.ms.gsk.androidarchitectureexample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ms.gsk.androidarchitectureexample.example1.ActExample1
import com.ms.gsk.androidarchitectureexample.example2.ActExample2
import kotlinx.android.synthetic.main.act_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_main)

        btn_1.setOnClickListener(this@MainActivity)
        btn_2.setOnClickListener(this@MainActivity)
    }

    override fun onClick(view:View?) {
        when(view?.id){
            R.id.btn_1 -> {
                var intent = Intent(this@MainActivity, ActExample1::class.java)
                startActivity(intent)
            }

            R.id.btn_2 -> {
                var intent = Intent(this@MainActivity, ActExample2::class.java)
                startActivity(intent)
            }
        }
    }
}
