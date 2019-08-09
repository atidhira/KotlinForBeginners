package com.dicoding.kotlinforbeginners

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_definition.*

class DefinitionActivity : AppCompatActivity(){
    private val textDef : String = """
        Kotlin merupakan bahasa pemrograman yang mulai dikembangkan oleh JetBrain dan dirilis pada bulan Februari 2016 dengan versi 1.0 sampai saat ini yang sudah mencapai versi 1.3.40 (15 Juni 2019).
        Kotlin dikembangkan oleh lebih dari 50 developer kreatif pimpinan Andrey Breslav. Karena tergolong proyek open-source, Kotlin dapat bebas kita gunakan dengan gratis
    """.trimIndent()
    private val textPros : String = """
        Multiplatform
        Kotlin merupakan bahasa pemrograman yang bisa ditargetkan untuk berbagai macam platform.
        
        Multiparadigm
        Ketika kita ingin mengklasifikasikan bahasa pemrograman berdasarkan cara penulisan sintaksnya, object-oriented programming (OOP) dan functional programming (FP) merupakan 2 (dua) paradigma yang terkenal di kalangan developer.
        Anda bisa menggunakan gaya OOP maupun FP, bahkan mencampurnya saat menuliskan sintaks Kotlin.Dengan dukungan tinggi untuk fitur-fitur seperti higher-order function, function types, dan lambda, Kotlin adalah pilihan yang tepat untuk Anda mengeksplorasi functional programming. 
    """.trimIndent()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_definition)

        tvDefinition.text = textDef
        tvPros.text = textPros
    }
}