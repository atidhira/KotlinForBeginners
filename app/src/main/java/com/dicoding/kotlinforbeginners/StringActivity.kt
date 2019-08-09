package com.dicoding.kotlinforbeginners

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_string.*

class StringActivity : AppCompatActivity() {

    private val textString1 = """
        String merupakan tipe data yang mirip dengan Char. Ia dapat digunakan untuk menyimpan nilai berupa teks. Perbedaannya, String bisa menampung beberapa karakter di dalamnya.
        Kita bisa mendefinisikan variabel String dengan tanda petik ganda (" ") seperti berikut:
    """.trimIndent()

    private val textStrSyntax1 = "val textString = \"Kotlin\" "

    private val textString2 = """
        Kotlin sendiri memiliki dua tipe Literal String, yang pertama adalah Escaped String yang biasa digunakan untuk membuat karakter tertentu didalam String
        Contoh sederhananya adalah saat kita ingin menambahkan tanda petik ganda didalam string
    """.trimIndent()

    private val textStrSyntax2 = """
        val text = "\"Kotlin\""
        output: "Kotlin"
    """.trimIndent()

    private val textString3 = """
        Selain \" diatas, terdapat beberapa karakter lain yang dapat digunakan, yaitu:
        \' Menambahkan single quote
        \\ Menambahkan backslash
        \n Membuat baris baru
        \t Menambahkan tab ke dalam text
        dan lain sebagainya...
        
        Kedua, adalah Raw String yang memungkinkan kita untuk menuliskan multiline text dengan mudah tanpa menggunakan \n
        Penggunaan Raw String dalam Kotlin:
    """.trimIndent()

    private val textStrSyntax3 = "val textLine = \"\"\"\n\tLine1\n\tLine2\n\tLine3\n\"\"\".trimIndent()"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_string)

        tvString1.text = textString1
        tvString2.text = textString2
        tvString3.text = textString3
        tvStrSyntax1.text = textStrSyntax1
        tvStrSyntax2.text = textStrSyntax2
        tvStrSyntax3.text = textStrSyntax3
    }
}