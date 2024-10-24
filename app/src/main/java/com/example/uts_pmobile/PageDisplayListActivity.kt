package com.example.uts_pmobile

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uts_pmobile.adapter.FavoritesAdapter
import com.example.uts_pmobile.model.FavoritesList
import com.example.uts_pmobile.model.ModelFavorites

class PageDisplayListActivity : AppCompatActivity() {

    private lateinit var rv_favorites : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_display_list)

        rv_favorites = findViewById(R.id.rv_favorites)

        rv_favorites.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)

        val adapter = FavoritesAdapter(FavoritesList.getModel() as ArrayList<ModelFavorites>, this)

        rv_favorites.adapter = adapter
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}