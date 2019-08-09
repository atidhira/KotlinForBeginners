package com.dicoding.kotlinforbeginners

data class HomeData (
    var name: String = "",
    var img: String = "")


object HomeObjectData {
    private var data = arrayOf(
        arrayOf("Apa itu Kotlin", "ic_definition_black_24dp"),
        arrayOf("Menjalankan Program Kotlin", "ic_desktop_windows_black_24dp"),
        arrayOf("Data Type ", "ic_datatype_black_24dp"),
        arrayOf("Number", "ic_number_black_24dp"),
        arrayOf("String", "ic_string_black_24dp"),
        arrayOf("Array", "ic_array_black_24dp"),
        arrayOf("Nullable Types", "ic_array_black_24dp"),
        arrayOf("Collection", "ic_collection_black_24dp"),
        arrayOf("Looping", "ic_looping_black_24dp"),
        arrayOf("About Me", "ic_person_black_24dp")
    )

    val listData: ArrayList<HomeData>
    get() {
        val list = ArrayList<HomeData>()
        for( value in data){
            val homeData = HomeData()
            homeData.name = value[0]
            homeData.img = value[1]
            list.add(homeData)
        }
        return list
    }
}