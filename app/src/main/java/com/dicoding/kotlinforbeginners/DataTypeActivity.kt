package com.dicoding.kotlinforbeginners

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_data_type.*

class DataTypeActivity : AppCompatActivity() {
    private val textVariable1 = """
        Variable merupakan suatu wadah yang digunakan untuk menyimpan informasi atau nilai yang akan dikelola di dalam sebuah program.
        Struktur penulisan variable:
    """.trimIndent()

    private val textVarSyntax = """
        var identifier: Type = initialization"
        var valueA: Int = 3
        var valueB = 5
        var valueC: Int
        valueC = 7
    """.trimIndent()

    private val textVariable2 = """
        - var atau val digunakan untuk mengkontrol nilai dari variabel. var untuk nilai yang bisa diubah-ubah setelah dibuat dan val untuk nilai variabel yang tidak bisa diubah.
        - identifier merupakan nama dari sebuah variabel.
        - Type merupakan tipe data dari variabel yang dibuat. Type sendiri bersifat opsional untuk dituliskan, karena Kotlin dapat memperkirakan tipe data dari variabel yang dibuat berdasarkan initializationnya.
        - initialization merupakan nilai awal dari variabel yang dibuat.
    """.trimIndent()

    private val textDataType = """
        - Number adalah sebuah tipe data yang dikhususkan untuk menyimpan nilai dalam bentuk numerik. Terdapat beberapa tipe data Numbers yang memiliki ukuran berbeda-beda, tergantung besar nilai yang kita simpan ke dalam variabel.
        - Char adalah tipe data yang dikhususkan untuk menyimpan karakter huruf. Dalam pendeklarasiannya, karakter huruf akan diapit oleh tanda petik satu(').
        - String adalah tipe data yang dapat menyimpan sebuah text. Dalam pendeklarasiannya, karakter huruf akan diapit oleh tanda petik dua(").
        - Array adalah tipe data yang memungkinkan kita untuk menyimpan beberapa objek dalam satu variabel.
    """.trimIndent()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_type)

        tvVariable1.text = textVariable1
        tvVariable2.text = textVariable2
        tvVarSyntax.text = textVarSyntax
        tvDataType.text = textDataType

    }
}