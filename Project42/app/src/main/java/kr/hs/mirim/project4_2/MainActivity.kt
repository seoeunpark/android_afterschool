package kr.hs.mirim.project4_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title="애완동물 사진 보기"

        chkAgree.setOnCheckedChangeListener { compoundButton, b ->
            if(chkAgree.isChecked == true){
                text2.visibility= View.VISIBLE
                rgroup1.visibility=View.VISIBLE
                btnOK.visibility=View.VISIBLE
                imgPet.visibility= View.VISIBLE
            }else {
                text2.visibility = View.INVISIBLE
                rgroup1.visibility = View.INVISIBLE
                btnOK.visibility = View.INVISIBLE
                imgPet.visibility = View.INVISIBLE
            }
        }
        btnOK.setOnClickListener {
            when(rgroup1.checkedRadioButtonId){
                R.id.rdoDog-> imgPet.setImageResource(R.drawable.dog)
                R.id.rdoCat-> imgPet.setImageResource(R.drawable.cat)
                R.id.rdoRabbit-> imgPet.setImageResource(R.drawable.rabbit)
                else-> Toast.makeText(applicationContext,"동물을 선택하세요",Toast.LENGTH_SHORT)
            }
        }
    }
}