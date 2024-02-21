package mx.edu.potro.practica5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnAntojitos: Button = findViewById(R.id.menu_button_antojitos)
        var btnEspecialidades: Button = findViewById(R.id.menu_button_especialidades)
        var btnCombinations: Button = findViewById(R.id.menu_button_combinations)
        var btnTortas: Button = findViewById(R.id.menu_buttons_tortas)
        var btnSopas: Button = findViewById(R.id.menu_buttons_sopas)
        var btnDrinks: Button = findViewById(R.id.menu_buttons_drinks)

        btnAntojitos.setOnClickListener {
            var intent : Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Antojitos")
            startActivity(intent)
        }
        btnEspecialidades.setOnClickListener {
            var intent : Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Especialidades")
            startActivity(intent)
        }
        btnCombinations.setOnClickListener {
            var intent : Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Combinations")
            startActivity(intent)
        }
        btnTortas.setOnClickListener {
            var intent : Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Tortas")
            startActivity(intent)
        }
        btnSopas.setOnClickListener {
            var intent : Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Sopas")
            startActivity(intent)
        }
        btnDrinks.setOnClickListener {
            var intent : Intent = Intent(this,ProductosActivity::class.java)
            intent.putExtra("menuType","Drinks")
            startActivity(intent)
        }
    }
}