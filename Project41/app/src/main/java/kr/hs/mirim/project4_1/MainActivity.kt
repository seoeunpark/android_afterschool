package kr.hs.mirim.project4_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var num1 : String;
    lateinit var num2 : String;
    var result : Int? = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.title = "초간단 계산기 "

        btnAdd.setOnClickListener {
            num1 = edit1.getText().toString()
            num2 = edit2.getText().toString()
            result = num1.toInt() + num2.toInt()
            TextResult.text = "계산결과 : " + result
        }
        btnSub.setOnClickListener {
            num1 = edit1.getText().toString()
            num2 = edit2.getText().toString()
            result = num1.toInt() - num2.toInt()
            TextResult.text = "계산결과 : " + result
        }
        btnMu1.setOnClickListener {
            num1 = edit1.getText().toString()
            num2 = edit2.getText().toString()
            result = num1.toInt() * num2.toInt()
            TextResult.text = "계산결과 : " + result
        }
        btnDiv.setOnClickListener {
            num1 = edit1.getText().toString()
            num2 = edit2.getText().toString()
            result = num1.toInt() / num2.toInt()
            TextResult.text = "계산결과 : " + result
        }
    }
}