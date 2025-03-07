package mx.edu.itesca.examenp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Productos : AppCompatActivity() {
    val productos=ArrayList<Producto>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)

        val tv_title :TextView = findViewById(R.id.tv_title)
        val title: String? = intent.getStringExtra("title")

        tv_title.setText(title)

        cargarProductos(title)


    }

    fun cargarProductos(tipo:String?){
        when(tipo){
            "Detalles" -> {
                productos.add(Producto(R.drawable.cumplebotanas,"$280"))
                productos.add(Producto(R.drawable.cumplecheve,"$320"))
                productos.add(Producto(R.drawable.cumpleescolar,"$330"))
                productos.add(Producto(R.drawable.cumplepaletas,"$190"))
                productos.add(Producto(R.drawable.cumplevinos,"$370"))
            }
            "Globos" ->{
                productos.add(Producto(R.drawable.globoamor,"$240"))
                productos.add(Producto(R.drawable.globocumple,"$820"))
                productos.add(Producto(R.drawable.globofestejo,"$260"))
                productos.add(Producto(R.drawable.globonum,"$760"))
                productos.add(Producto(R.drawable.globoregalo,"$450"))
                productos.add(Producto(R.drawable.globos,"$240"))
            }
            "Peluches" ->{
                productos.add(Producto(R.drawable.peluchemario,"$320"))
                productos.add(Producto(R.drawable.pelucheminecraft,"$320"))
                productos.add(Producto(R.drawable.peluchepeppa,"$290"))
                productos.add(Producto(R.drawable.peluches,"$420"))
                productos.add(Producto(R.drawable.peluchesony,"$330"))
                productos.add(Producto(R.drawable.peluchestich,"$280"))
                productos.add(Producto(R.drawable.peluchevarios,"$195"))
            }
            "Regalos" ->{
                productos.add(Producto(R.drawable.regaloazul,"$80"))
                productos.add(Producto(R.drawable.regalobebe,"$290"))
                productos.add(Producto(R.drawable.regalocajas,"$140"))
                productos.add(Producto(R.drawable.regalocolores,"$85"))
                productos.add(Producto(R.drawable.regalos,"$100"))
                productos.add(Producto(R.drawable.regalovarios,"$75"))
            }
            "Tazas" ->{
                productos.add(Producto(R.drawable.tazaabuela,"$120"))
                productos.add(Producto(R.drawable.tazalove,"$120"))
                productos.add(Producto(R.drawable.tazaquiero,"$260"))
                productos.add(Producto(R.drawable.tazas,"$280"))
            }
        }
    }
}