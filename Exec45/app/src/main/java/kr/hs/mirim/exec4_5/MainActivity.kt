package kr.hs.mirim.exec4_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login.setOnClickListener {
            var userid = edit_id.text.toString()
            var userpass = edit_pass.text.toString()
            Toast.makeText(this, "id"+userid+"pw"+userpass, Toast.LENGTH_SHORT).show()
        }
    }


}