package com.example.app5_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.Arrays

class MainActivity : AppCompatActivity() {

    lateinit internal var edit1 : EditText
    lateinit internal var edit2 : EditText
    lateinit internal var btnAdd : Button
    lateinit internal var btnMinus : Button
    lateinit internal var btnMul : Button
    lateinit internal var btnDiv : Button
    lateinit internal var textResult : TextView
    lateinit internal var num1 : String
    lateinit internal var num2 : String
    internal var result : Int? = null


    //10개 숫자 버튼 배열
    internal var numButtons = ArrayList<Button>(10)


    //10개 숫자 버튼의 id 값 배열
    internal var numBtnIDs = arrayOf(R.id.BtnNum0, R.id.BtnNum1, R.id.BtnNum2
    , R.id.BtnNum3, R.id.BtnNum4, R.id.BtnNum5, R.id.BtnNum6, R.id.BtnNum7
    , R.id.BtnNum8, R.id.BtnNum9)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edit1 = findViewById<EditText>(R.id.Edit1)
        edit2 = findViewById<EditText>(R.id.Edit2)
        btnAdd = findViewById<Button>(R.id.BtnAdd)
        btnMinus = findViewById<Button>(R.id.BtnMinus)
        btnMul = findViewById<Button>(R.id.BtnMul)
        btnDiv = findViewById<Button>(R.id.BtnDiv)

        textResult = findViewById<Button>(R.id.TextResult)

        btnAdd.setOnTouchListener { view, motionEvent ->

            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            result = Integer.parseInt(num1) + Integer.parseInt(num2)
            textResult.text = "계산 결과 : " + result.toString()
            false
        }

        btnMinus.setOnTouchListener { view, motionEvent ->

            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            result = Integer.parseInt(num1) - Integer.parseInt(num2)
            textResult.text = "계산 결과 : " + result.toString()
            false
        }

        btnMul.setOnTouchListener { view, motionEvent ->

            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            result = Integer.parseInt(num1) * Integer.parseInt(num2)
            textResult.text = "계산 결과 : " + result.toString()
            false
        }

        btnDiv.setOnTouchListener { view, motionEvent ->

            num1 = edit1.text.toString()
            num2 = edit2.text.toString()
            result = Integer.parseInt(num1) / Integer.parseInt(num2)
            textResult.text = "계산 결과 : " + result.toString()
            false
        }

        // 숫자 버튼 10개를 대입
        for (i in 0..9 step 1) {
            numButtons.add(findViewById(numBtnIDs[i]))
        }

        // 숫자 버튼 10개에 대해서 클릭이벤트 처리
        for (i in 0..numBtnIDs.size-1 step 1) {
            numButtons[i].setOnClickListener {
                if (edit1.isFocused == true) {
                    num1 = edit1.text.toString() + numButtons[i].getText().toString()
                    edit1.setText(num1)
                } else if (edit2.isFocused == true) {
                    num2 = edit2.text.toString() + numButtons[i].getText().toString()
                    edit2.setText(num2)
                } else {
                    Toast.makeText(applicationContext,
                        "숫자를 입력해 주세요", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }
}