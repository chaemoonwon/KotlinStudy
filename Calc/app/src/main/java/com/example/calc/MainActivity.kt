package com.example.calc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.VisibleForTesting
import java.lang.Double

class MainActivity : AppCompatActivity() {

    lateinit var edit1 : EditText; lateinit var edit2 : EditText
    lateinit var btnPlus : Button; lateinit var btnMinus : Button
    lateinit var btnMul : Button; lateinit var btnDiv : Button

    lateinit var textResult : TextView;

    lateinit var num1 : String; lateinit var num2 : String;

    var result : kotlin.Double? = null




    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edit1 = findViewById<EditText>(R.id.Edit1)
        edit2 = findViewById<EditText>(R.id.Edit2)


        btnPlus = findViewById<Button>(R.id.plus)
        btnMinus = findViewById<Button>(R.id.minus)
        btnMul = findViewById<Button>(R.id.multiply)
        btnDiv = findViewById<Button>(R.id.divide)

        textResult = findViewById<EditText>(R.id.TextResult)

        btnPlus.setOnClickListener{
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()

            //num1 이나 num2가 비어 있다면
            if(num1.trim() == "" || num2.trim() =="") {
                Toast.makeText(applicationContext, "입력 값이 없습니다", Toast.LENGTH_SHORT).show()
            }
            else {
                try {
                result = num1.toDouble() + num2.toDouble()
                textResult.text = "계산 결과 : " + result.toString()
                } catch (e: NumberFormatException) {
                    Toast.makeText(applicationContext, "숫자로 변환할 수 없는 값이 입력되었습니다.", Toast.LENGTH_SHORT).show()
                }
            }
        }

        btnMinus.setOnClickListener{
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()

            //num1 이나 num2가 비어 있다면
            if(num1.trim() == "" || num2.trim() =="") {
                Toast.makeText(applicationContext, "입력 값이 없습니다", Toast.LENGTH_SHORT).show()
            }else {
                try {
                    result = num1.toDouble() - num2.toDouble()
                    textResult.text = "계산 결과 : " + result.toString()
                } catch (e: NumberFormatException) {
                    Toast.makeText(applicationContext, "숫자로 변환할 수 없는 값이 입력되었습니다.", Toast.LENGTH_SHORT).show()
                }
            }
        }

        btnMul.setOnClickListener{
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()

            //num1 이나 num2가 비어 있다면
            if(num1.trim() == "" || num2.trim() =="") {
                Toast.makeText(applicationContext, "입력 값이 없습니다", Toast.LENGTH_SHORT).show()
            } else {
                try {
                    result = num1.toDouble() * num2.toDouble()
                    textResult.text = "계산 결과 : " + result.toString()
                } catch (e: NumberFormatException) {
                    Toast.makeText(applicationContext, "숫자로 변환할 수 없는 값이 입력되었습니다.", Toast.LENGTH_SHORT).show()
                }
            }
        }

        btnDiv.setOnClickListener{
            num1 = edit1.text.toString()
            num2 = edit2.text.toString()

            //num1 이나 num2가 비어 있다면
            if(num1.trim() == "" || num2.trim() =="") {
                Toast.makeText(applicationContext, "입력 값이 없습니다", Toast.LENGTH_SHORT).show()
            } else {
                try {
                    result = num1.toDouble() / num2.toDouble()
                    result = (result!! * 10).toInt() / 10.0
                    textResult.text = "계산 결과 : " + result.toString()
                } catch (e: NumberFormatException) {
                    Toast.makeText(applicationContext, "숫자로 변환할 수 없는 값이 입력되었습니다.", Toast.LENGTH_SHORT).show()
                }
            }
        }




    }
}