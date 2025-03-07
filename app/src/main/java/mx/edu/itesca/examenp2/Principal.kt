package mx.edu.itesca.examenp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val btn_detalles:Button = findViewById(R.id.btn_detalles)
        val btn_globos:Button = findViewById(R.id.btn_globos)
        val btn_peluches:Button = findViewById(R.id.btn_peluches)
        val btn_regalos:Button = findViewById(R.id.btn_regalos)
        val btn_tazas:Button = findViewById(R.id.btn_tazas)

        btn_detalles.setOnClickListener{
            val intent = Intent(this,Productos::class.java)
            intent.putExtra("title","Detalles")
            startActivity(intent)
        }

        btn_globos.setOnClickListener{
            val intent = Intent(this,Productos::class.java)
            intent.putExtra("title",btn_globos.text)
            startActivity(intent)
        }

        btn_peluches.setOnClickListener{
            val intent = Intent(this,Productos::class.java)
            intent.putExtra("title",btn_peluches.text)
            startActivity(intent)
        }

        btn_regalos.setOnClickListener{
            val intent = Intent(this,Productos::class.java)
            intent.putExtra("title",btn_regalos.text)
            startActivity(intent)
        }

        btn_tazas.setOnClickListener{
            val intent = Intent(this,Productos::class.java)
            intent.putExtra("title",btn_tazas.text)
            startActivity(intent)
        }
    }
}