package mx.edu.itesca.examenp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn_main:Button = findViewById(R.id.btn_main)

        btn_main.setOnClickListener {
            val intent = Intent(this,Principal::class.java)
            startActivity(intent)
        }
    }


}