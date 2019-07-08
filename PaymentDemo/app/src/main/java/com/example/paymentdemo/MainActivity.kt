package com.example.paymentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

           btn_payu.setOnClickListener {}
            btn_razorpay.setOnClickListener { }
    }


    override fun onClick(v: View?) {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

            when(v!!.id){

                R.id.btn_payu -> {
                    Toast.makeText(this,"payu button",Toast.LENGTH_SHORT).show()
                }

                R.id.btn_razorpay -> {
                    Toast.makeText(this,"razzor Pay",Toast.LENGTH_SHORT).show()
                }

        }

    }
}
