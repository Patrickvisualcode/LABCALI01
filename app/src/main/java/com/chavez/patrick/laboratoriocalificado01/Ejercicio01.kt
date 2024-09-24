package com.chavez.patrick.laboratoriocalificado01
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Ejercicio01 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Establece el layout asociado con esta actividad
        setContentView(R.layout.activity_ejercicio01)

        // Conectar los elementos de la interfaz a sus IDs
        val botonRegistrar = findViewById<Button>(R.id.btnRegistrar)
        val nombre = findViewById<EditText>(R.id.etNombre)
        val apellido = findViewById<EditText>(R.id.etApellido)
        val correo = findViewById<EditText>(R.id.etCorreo)

        // Acción del botón Registrar
        botonRegistrar.setOnClickListener {
            registrarUsuario(nombre.text.toString(), apellido.text.toString(), correo.text.toString())
        }
    }

    // Método que ayuda a validar los campos y muestra un mensaje
    private fun registrarUsuario(nombre: String, apellido: String, correo: String) {
        if (nombre.isNotEmpty() && apellido.isNotEmpty() && correo.isNotEmpty()) {
            // Mostrar mensaje de éxito
            Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show()
        } else {
            // Mostrar mensaje de error
            Toast.makeText(this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show()
        }
    }
}