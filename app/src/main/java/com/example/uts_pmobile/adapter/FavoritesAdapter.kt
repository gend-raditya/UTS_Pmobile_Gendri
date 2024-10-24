package com.example.uts_pmobile.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.uts_pmobile.DetailOrderPageActivity
import com.example.uts_pmobile.PageDisplayListActivity
import com.example.uts_pmobile.R
import com.example.uts_pmobile.model.ModelFavorites

class FavoritesAdapter(
    val itemList : ArrayList<ModelFavorites>,
    val getActivity : PageDisplayListActivity
) : RecyclerView.Adapter<FavoritesAdapter.MyViewHolder>()
{

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var gambarMakanan : ImageView
        var namaMakanan : TextView
        var detailMakanan : TextView

        init {
            gambarMakanan = itemView.findViewById(R.id.gambarMakanan) as ImageView
            namaMakanan = itemView.findViewById(R.id.namaMakanan) as TextView
            detailMakanan = itemView.findViewById(R.id.detailMakanan) as TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_favorites, parent, false)

        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.gambarMakanan.setImageResource(itemList[position].gambarMakanan)
        holder.namaMakanan.setText(itemList[position].namaMakanan)
        holder.detailMakanan.setText(itemList[position].detailMakanan)

        holder.itemView.setOnClickListener() {
            val intent = Intent(getActivity, DetailOrderPageActivity::class.java)
            intent.putExtra("gambarMakanan", itemList[position].gambarMakanan)
            intent.putExtra("namaMakanan", itemList[position].namaMakanan)

            getActivity.startActivity(intent)
        }
    }

}




