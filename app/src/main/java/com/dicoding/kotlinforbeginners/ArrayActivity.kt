package com.dicoding.kotlinforbeginners

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_array.*

class ArrayActivity : AppCompatActivity() {

    private val textArray1 = """
        Dalam Kotlin kita bisa membuat Array yang bisa menyimpan nilai dengan berbagai jenis tipe data, atau kita juga bisa membuat Array yang hanya memiliki satu tipe data didalamnya.
        Untuk membuat sebuah Array kita bisa memanfaatkan sebuah library function arrayOf() atau Array() seperti berikut:
    """.trimIndent()

    private val textArrSyntax1 = """
        val arr1 = arrayOf(12, "Coding", 6.5)
        val arr2 = intArrayOf(1, 2, 3, 4)
        val arr3 = Array(5){i -> i * 2}
    """.trimIndent()

    private val textArray2 = """
        Variabel arr3 memiliki 5 objek yaitu [0, 2, 4, 6, 8]
        Jika kita ingin memanggil nilai dalam Array, kita dapat memanfaatkan indexing sebagai berikut:
    """.trimIndent()

    private val textArrSyntax2 = """
        val arr = arrayOf(1, 2, 3, 4)
        println(arr[0] + " " + arr[1])
        //output: 1 2
    """.trimIndent()

    private val textArray3 = "Perlu diingat bahwa index array dimulai dari 0."

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_array)

        tvArray1.text = textArray1
        tvArray2.text = textArray2
        tvArray3.text = textArray3
        tvArrSyntax1.text = textArrSyntax1
        tvArrSyntax2.text = textArrSyntax2
    }
}