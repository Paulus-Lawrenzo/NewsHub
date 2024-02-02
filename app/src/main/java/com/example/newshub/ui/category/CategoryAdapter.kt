package com.example.newshub.ui.category

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.newshub.R

class CategoryAdapter(
    private val categoryList: ArrayList<CategoryItem>,
    private val onClick:(category:String)->Unit
) :
    RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//        init {
//            itemView.setOnClickListener {
//                val position = adapterPosition
//                listener.onClick(position)
//            }
//        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int = categoryList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = categoryList[position]
        holder.itemView.apply {
            findViewById<ImageView>(R.id.ivCategory).setImageResource(currentItem.image)
            findViewById<TextView>(R.id.tvCategory).text = currentItem.title
            findViewById<CardView>(R.id.cvCategory).setOnClickListener{
                onClick.invoke(currentItem.title)
            }
        }
    }
}