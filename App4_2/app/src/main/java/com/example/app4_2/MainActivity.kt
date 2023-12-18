package com.example.app4_2

import android.os.Build.VERSION_CODES.P
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var text1 : TextView
    lateinit var text2 : TextView
    lateinit var chkAgree : CheckBox
    lateinit var rGroup : RadioGroup
    lateinit var btnOk : Button
    lateinit var imgPet : ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text1= findViewById<TextView>(R.id.Text1)
        chkAgree = findViewById<CheckBox>(R.id.ChkAgree)
        text2= findViewById<TextView>(R.id.Text2)
        rGroup = findViewById<RadioGroup>(R.id.Rgroup)
        btnOk = findViewById<Button>(R.id.BtnOk)
        imgPet = findViewById<ImageView>(R.id.ImgPet)


        // 시작함 체크박스의 체크가 변경되면
        chkAgree.setOnCheckedChangeListener { compoundButton, b ->
            // 체크되면 모두 보이도록 설정
            if(chkAgree.isChecked == true) {
                text2.visibility = android.view.View.VISIBLE
                rGroup.visibility = android.view.View.VISIBLE
                btnOk.visibility = android.view.View.VISIBLE
                imgPet.visibility = android.view.View.VISIBLE
            } else {
                text2.visibility = android.view.View.INVISIBLE
                rGroup.visibility = android.view.View.INVISIBLE
                btnOk.visibility = android.view.View.INVISIBLE
                imgPet.visibility = android.view.View.VISIBLE
            }

        }


        // 선택완료 버튼을 클릭하면
        btnOk.setOnClickListener{
            // switch문
            when(rGroup.checkedRadioButtonId){

                R.id.RdoBird -> imgPet.setImageResource(R.drawable.bird)
                R.id.RdoCat -> imgPet.setImageResource(R.drawable.cat)
                R.id.RdoDog -> imgPet.setImageResource(R.drawable.dog)
                else -> Toast.makeText(applicationContext, "동물 먼저 선택하세요" , Toast.LENGTH_SHORT).show()
            }
        }
    }
}