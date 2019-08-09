package com.dicoding.kotlinforbeginners

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeActivity : AppCompatActivity() {


    private lateinit var rvHome: RecyclerView
    private var list: ArrayList<HomeData> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvHome = findViewById(R.id.rv_home_item)
        rvHome.setHasFixedSize(true)

        list.addAll(HomeObjectData.listData)
        showRecyclerList(list)
    }

    private fun showRecyclerList(list: ArrayList<HomeData>) {
        rvHome.layoutManager = LinearLayoutManager(this)
        val listHomeAdapter = HomeDataAdapter(list, this)
        rvHome.adapter = listHomeAdapter

        listHomeAdapter.setOnItemListener(object : HomeDataAdapter.OnItemListener {
            override fun onItemClicked(position: Int) {
                when (position) {
                    0 -> { startActivity(Intent(this@HomeActivity, DefinitionActivity::class.java)) }
                    1 -> { startActivity(Intent(this@HomeActivity, InstallationActivity::class.java)) }
                    2 -> { startActivity(Intent(this@HomeActivity, DataTypeActivity::class.java)) }
                    3 -> { startActivity(Intent(this@HomeActivity, NumberActivity::class.java)) }
                    4 -> { startActivity(Intent(this@HomeActivity, StringActivity::class.java)) }
                    5 -> { startActivity(Intent(this@HomeActivity, ArrayActivity::class.java)) }
                    6 -> { startActivity(Intent(this@HomeActivity, NullableActivity::class.java)) }
                    7 -> { startActivity(Intent(this@HomeActivity, CollectionActivity::class.java)) }
                    8 -> { startActivity(Intent(this@HomeActivity, InstallationActivity::class.java)) }
                    9 -> { startActivity(Intent(this@HomeActivity, InstallationActivity::class.java)) }
                }
            }
        })
    }
}