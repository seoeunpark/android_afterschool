package kr.hs.mirim.baseapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //1번 변수선언 생략
    lateinit var button1 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //xml id이용해서 view 가져오기 생략
        button1 = findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            Toast.makeText(applicationContext, "버튼을 눌렀어요", Toast.LENGTH_SHORT).show()
            //주로 코틀린에서는 세미콜론을 넣지 않는다.
        }
        //
        button2.setOnClickListener {
            Toast.makeText(applicationContext, "2번째 버튼이 눌렸어요", Toast.LENGTH_SHORT).show()
        }
        button3.setOnClickListener {
        Toast.makeText(applicationContext, "3번째 버튼이 눌렸어요", Toast.LENGTH_SHORT).show()
        }
        button4.setOnClickListener {
            Toast.makeText(applicationContext, "4번째 버튼이 눌렸어요", Toast.LENGTH_SHORT).show()
        }
    }
}