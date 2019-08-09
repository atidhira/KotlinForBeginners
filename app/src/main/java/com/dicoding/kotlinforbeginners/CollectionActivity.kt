package com.dicoding.kotlinforbeginners

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_collection.*

class CollectionActivity : AppCompatActivity() {

    private val textCollection = """
        Bayangkan ketika kita ingin menyimpan dan memanipulasi sebuah objek. Kita perlu sebuah komponen yang mampu menambahkan, menghapus, mencari, bahkan mengurutkan sebuah data. Semua tugas itu bisa kita lakukan dengan bantuan collection.
        Dengan collection kita bisa menyimpan banyak data sekaligus. Di dalam collections terdapat beberapa objek turunan, di antaranya adalah List, Set, dan Map.
    """.trimIndent()

    private val textList = """
        Dengan List kita dapat menyimpan banyak data menjadi satu objek dan data yang disimpan bisa berisi bermacam - macam tipe data seperti Int, String, Boolean atau yang lainnya.
        Cara penulisannya pun sangat mudah. Perhatikan saja beberapa contoh kode berikut:
    """.trimIndent()

    private val textListSyntax = """
        val numList: List<Int> = listOf(1, 2, 3, 4, 4)
        val charList = listOf('a', 'b', 'c', 'c')
        val anyList = listOf(1, "Kotlin", 5, true, true)
    """.trimIndent()

    private val textSet = """
        Set merupakan sebuah collection yang hanya dapat menyimpan nilai yang unik. Ini akan berguna ketiga Anda menginginkan tidak ada data yang sama atau duplikasi dalam sebuah collection.
        Kita bisa mendeklarasikan sebuah Set dengan fungsi setOf.
    """.trimIndent()

    private val textSetSyntax = "val intSet = setOf(1, 2, 3, 4)"

    private val textMap = "Map adalah sebuah collection yang dapat menyimpan data dengan format key-value."

    private val textMapSyntax = """
        val capital = mapOf(
            "Jakarta" to "Indonesia",
            "London" to "England",
            "New Delhi" to "India"
        )
    """.trimIndent()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collection)

        tvCollection.text = textCollection
        tvList.text = textList
        tvListSyntax.text = textListSyntax
        tvSet.text = textSet
        tvSetSyntax.text = textSetSyntax
        tvMap.text = textMap
        tvMapSyntax.text = textMapSyntax
    }
}