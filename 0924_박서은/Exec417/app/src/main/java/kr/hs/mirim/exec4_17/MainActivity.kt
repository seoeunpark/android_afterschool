package kr.hs.mirim.exec4_17

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView1.setText("안녕하세요")
        textView1.setTextColor(Color.RED)

        textView2.setTextSize(30.0f)
        textView2.setTypeface(Typeface.SERIF , Typeface.BOLD_ITALIC)

        textView3.setText("가나다라마바사아자차카타파하가나다라마바사아자차카타파하")
        textView3.setSingleLine()


    }
}