package com.dicoding.kotlinforbeginners

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_installation.*

class InstallationActivity : AppCompatActivity() {

    private var textJdk: String = """
        - Windows
        Unduh binary OpenJDK dan ekstrak berkasnya ke forder C:\Program_Files\Java. Kemudian atur lokasi folder OpenJDK pada Environtment Variable dengan cara :
        1. Buka Control panel dan ketikkan system variable pada kolom pencarian.
        2. Pilih Edit the system environment variables pada hasil pencarian.
        3. Klik tombol Environment Variables yang berada di bawah.
        4. Fokus pada bagian User variables, klik tombol New.
        5. Masukkan JAVA_HOME pada kolom variable name dan lokasi folder Java pada variable value dan klik OK.
        6. Masih pada jendela Environment Variables, pilih variable path yang berada pada bagian System Variable kemudian klik Edit.
        7. Klik tombol New dan masukkan %JAVA_HOME%\bin lalu klik OK.
        8. Buka Command Prompt kemudian jalankan perintah echo %JAVA_HOME%. Pastikan yang tampil adalah lokasi folder Java yang sudah kita atur sebelumnya
        
        Untuk memastikan apakah instalasi sudah berhasil, jalankan perintah javac -version pada Command Prompt. Pastikan versi dari Java telah ditampilkan.
    """.trimIndent()

    private var textGradle: String = """
        Instalasi Gradle bisa dilakukan secara manual ataupun menggunakan SDKMAN. Untuk menginstalnya secara manual, Anda bisa mengikuti langkah-langkah berikut:
        1. Unduh berkas distribusi Gradle pada tautan https://gradle.org/releases/. Anda bisa memilih binary-only atau complete yang disertai dengan dokumentasi.
        2. Setelah selesai, ekstrak ke folder yang diinginkan. Sebaiknya tempatkanlah pada folder yang mudah dijangkau. Ini akan mempermudah konfigurasi Environment Variable.
        
        Setelah itu kita harus mengatur Environment Variable secara manual dengan cara yang sama seperti konfigurasi OpenJDK
        Buka kembali pengaturan Environment Variables. Pada kolom System Variables pilih variable path kemudian klik Edit.
        Setelah jendela baru terbuka, Klik tombol New kemudian tambahkan lokasi berkas distribusi Gradle C:\gradle\bin dan klik OK.
    """.trimIndent()

    private var textIntellij: String = """
        Syarat minimum instalasi IntelliJ IDEA pada sistem operasi Windows:
        - Microsoft Windows 10/8/7/Vista/2003/XP (incl.64-bit)
        - 2 GB RAM minimum, 4 GB RAM direkomendasikan
        - 1.5 GB ruang kosong pada penyimpanan
        - 1024x768 minimal resolusi layar
        
        Pastikan komputer Anda memenuhi syarat di atas. Kemudian unduhlah berkas instalasi IntelliJ IDEA berdasarkan sistem operasi yang digunakan pada tautan https://www.jetbrains.com/idea/download/ dan lakukan instalasi sesuai sistem operasi yang digunakan.
    """.trimIndent()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_installation)

        tvJDK.text = textJdk
        tvGradle.text = textGradle
        tvIntelliJ.text = textIntellij
    }
}