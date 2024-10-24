package com.example.uts_pmobile.model

import com.example.uts_pmobile.R

data class ModelFavorites(
    val gambarMakanan : Int,
    val namaMakanan : String,
    val detailMakanan : String
)

object FavoritesList {
    fun getModel() : List<ModelFavorites> {
        val item1 = ModelFavorites(
            R.drawable.makanan,
            "Mexican Appetizer Cups",
            "Lorem ipsum dolor sit amet, consectetur."
        )

        val item2 = ModelFavorites(
            R.drawable.img1,
            "Pai",
            "Lorem ipsum dolor sit amet, consectetur."
        )

        val item3 = ModelFavorites(
            R.drawable.makanan6,
            "Dadar Gulung",
            "Lorem ipsum dolor sit amet, consectetur."
        )

        val item4 = ModelFavorites(
            R.drawable.makanan,
            "Bibimpap",
            "Lorem ipsum dolor sit amet, consectetur."
        )

        val item5 = ModelFavorites(
            R.drawable.makanan5,
            "Martabak",
            "Lorem ipsum dolor sit amet, consectetur."
        )
        val item6 = ModelFavorites(
            R.drawable.bakso,
            "Bakso",
            "Lorem ipsum dolor sit amet, consectetur."
        )

        val itemList : ArrayList<ModelFavorites> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        itemList.add(item5)
        itemList.add(item6)

        return itemList
    }
}

