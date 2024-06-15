package com.example.new2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.new2.models.calculator

class MainActivity : AppCompatActivity() {


        lateinit var edtNum1:EditText
        lateinit var edtNum2:EditText


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            edtNum1 = findViewById(R.id.edtNum1)
            edtNum2 = findViewById(R.id.edtNum2)



        }



    fun buttonCLick(v:View){

        var ans = 0.0
        val calculator = calculator(

           edtNum1.text.toString().toDouble(),
            edtNum2.text.toString().toDouble(),
        )


        when(v.id){

            R.id.btnadd-> ans=calculator.add()
            R.id.btnsubtract-> ans=calculator.subtract()
            R.id.btndivide->ans=calculator.division()
            R.id.btnmultiply->ans=calculator.multiply()



        }

        Toast.makeText(this,"Answer=$ans",Toast.LENGTH_LONG).show()



    }
}