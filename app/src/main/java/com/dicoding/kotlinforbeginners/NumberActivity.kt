package com.dicoding.kotlinforbeginners

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_numbers.*

class NumberActivity : AppCompatActivity() {

    private val textNumber1 = """
        Beberapa tipe data pada Numbers:
        - Int, tipe data untuk bilangan bulat (32 Bit)
        - Long, sama seperti Int tetapi dengan ukuran yang lebih besar (64 Bit)
        - Short, sama seperti Int tetapi dengan ukuran yang lebih kecil (16 Bit)
        - Byte, sama seperti Short tetapi dengan ukuran yang lebih kecil (8 Bit)
        - Float, tipe data untuk bilangan desimal (32 Bit) 
        - Double, tipe data untuk bilangan desimal (64 Bit)
        Untuk mengetahui nilai min atau max dari tipe data diatas, kita bisa menggunakan properti MIN_VALUE dan MAX_VALUE
    """.trimIndent()

    private val textNumSyntax = """
        val minInt: Int = Int.MIN_VALUE
        val maxInt: Int = Int.MAX_VALUE
        println(minInt + " " + maxInt)
        // output: -2147483648 2147483647
    """.trimIndent()

    private val textNumber2 = """
        Jika kita memasukkan nilai melebihi batas dari ukuran tipe data yang dipakai, maka akan terjadi overflow. Nilai yang akan dikembalikan akan berbeda dari nilai awal
    """.trimIndent()

    private val textOperation = """
        Operator matematika yg biasa digunakan:
        (+) Penjumlahan
        (-) Pengurangan
        (*) Perkalian
        (/) Pembagian
        (%) Modulo/Sisa bagi
        
        Dalam kotlin, perkalian dan pembagian akan didahulukan, jika ingin proses penjumlahan atau pengurangan didahulukan maka gunakan tanda kurung '()'
    """.trimIndent()

    private val textOprSyntax = """
        print(5 + 2 * 2)
        print((5 + 2) * 2)
        //output: 9 14
    """.trimIndent()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers)

        tvNumbers1.text = textNumber1
        tvNumbers2.text = textNumber2
        tvNumSyntax.text = textNumSyntax
        tvOperation.text = textOperation
        tvOprSyntax.text = textOprSyntax
    }
}