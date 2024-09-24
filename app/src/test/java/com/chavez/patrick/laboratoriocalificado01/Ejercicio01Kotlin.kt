package com.chavez.patrick.laboratoriocalificado01
import org.junit.Test

class Ejercicio01Kotlin {
    @Test
//Aqui se encuentra la funcion principal que se debe ejecutar al iniciar el test del programa
    fun main() {
        // Palabra de entrada para contar la frecuencia de caracteres, es decir definimos la palabra
        val palabra = "hello"
        // Llamamos a la función para contar la frecuencia y almacenamos el resultado
        val frecuencia = contarFrecuencia(palabra)
        // Imprimimos el resultado para asi observar el resultado en la consola
        println(frecuencia)
    }
    //Esta funcion es la  que cuenta la frecuencia de cada carácter en una palabra
    fun contarFrecuencia(palabra: String): Map<Char, Int> {
        //Aqui creamos  un mapa mutable para almacenar la frecuencia de cada carácter
        val frecuenciaMap = mutableMapOf<Char, Int>()
        // Recorremos cada carácter en la palabra, utilizando un bucle for
        for (caracter in palabra) {
            // Si el carácter ya está en el mapa, incrementamos su conteo
            if (frecuenciaMap.containsKey(caracter)) {
                //Si el caracter existe, solo aumentamos su valor a 1
                frecuenciaMap[caracter] = frecuenciaMap[caracter]!! + 1
            } else {
                // Si no está, lo añadimos con un conteo inicial de 1
                frecuenciaMap[caracter] = 1
            }
        }
        // Devolvemos el mapa con la frecuencia de caracteres encontrados en la palabra , en este caso hello
        return frecuenciaMap
    }
}