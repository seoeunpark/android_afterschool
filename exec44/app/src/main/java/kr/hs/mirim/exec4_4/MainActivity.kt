package kr.hs.mirim.project4_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kr.hs.mirim.exec4_4.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title="안드로이드 사진 보기"

        chkAgree.setOnCheckedChangeListener { compoundButton, b ->
            if(chkAgree.isChecked == true){
                text2.visibility= View.VISIBLE
                rgroup1.visibility=View.VISIBLE
                btnexit.visibility=View.VISIBLE
                btnmain.visibility=View.VISIBLE
                imgAnd.visibility= View.VISIBLE
            }else {
                text2.visibility = View.INVISIBLE
                rgroup1.visibility = View.INVISIBLE
                btnexit.visibility=View.VISIBLE
                btnmain.visibility=View.VISIBLE
                imgAnd.visibility = View.INVISIBLE
            }
        }
        btnmain.setOnClickListener {
            when(rgroup1.checkedRadioButtonId){
                R.id.rdoOre-> imgAnd.setImageResource(R.drawable.oreo)
                R.id.rdoPi-> imgAnd.setImageResource(R.drawable.pi)
                R.id.rdoQ-> imgAnd.setImageResource(R.drawable.q)
                else-> Toast.makeText(applicationContext,"좋아하는 안드로이드를 선택하세요",Toast.LENGTH_SHORT)
            }
        }
        btnexit.setOnClickListener {
            this.finish();
        }
    }
}