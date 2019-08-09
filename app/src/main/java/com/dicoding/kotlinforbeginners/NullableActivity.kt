package com.dicoding.kotlinforbeginners

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_nullable.*

class NullableActivity : AppCompatActivity() {

    private val textNullable = """
        Saat kita mengembangkan sebuah program, ada kalanya aplikasi kita mengalami error saat ingin mengakses atau mengelola nilai dari sebuah variabel yang belum diinisialisasi atau variabel yang bernilai null.
        Kesalahan NullPointerException (NPE) sangat sering terjadi dan terkenal dengan istilah "The Billion Dollar Mistake" di kalangan para developer.
        Pada Kotlin kita dimudahkan untuk mengelola variable nullable dengan cara memberikan tanda ? setelah menentukan tipe data dari objek variabel:
    """.trimIndent()

    private val textNullSyntax = "val text: String? = null"

    private val textOperator1 = "Save Calls akan menjamin kode yang kita tulis aman dari NullPointerException. Dalam menggunakan safe call, kita akan mengganti tanda titik (.) dengan tanda (?.) saat mengakses atau mengelola nilai dari objek nullable. Seperti ini:"

    private val textOprSyntax1 = """
        val text: String? = null
        println(text?.length)
        // output: null
    """.trimIndent()

    private val textOperator2 = "Elvis operator (?:) memungkinkan kita untuk menetapkan default value atau nilai dasar jika objek bernilai null."

    private val textOprSyntax2 = """
        val text: String? = null
        val length = text?.length ?: 7
        // length akan bernilai 7 jika text null
    """.trimIndent()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nullable)

        tvNullable.text = textNullable
        tvNullSyntax.text = textNullSyntax
        tvOperator1.text = textOperator1
        tvOperator2.text = textOperator2
        tvOprSyntax1.text = textOprSyntax1
        tvOprSyntax2.text = textOprSyntax2
    }
}