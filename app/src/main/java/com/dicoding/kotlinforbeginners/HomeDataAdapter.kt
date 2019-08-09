package com.dicoding.kotlinforbeginners

import android.content.Context
import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class HomeDataAdapter(private val listData : ArrayList<HomeData>, private val context: Context) : RecyclerView.Adapter<HomeDataAdapter.ListViewHolder>() {

    private lateinit var onItemListener: OnItemListener

    fun setOnItemListener(onItemListener: OnItemListener){
        this.onItemListener = onItemListener
    }

    override fun onCreateViewHolder(viewGroup : ViewGroup, i : Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_kotlin, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, image) = listData[position]

        val drawableId: Int = context.resources.getIdentifier(image, "drawable", context.packageName)
        Glide.with(holder.itemView.context)
            .load(drawableId)
            .apply(RequestOptions().override(55))
            .into(holder.ivImage)

        holder.tvName.text = name

        holder.itemView.setOnClickListener {onItemListener.onItemClicked(position)}
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName : TextView = itemView.findViewById(R.id.item_name)
        var ivImage : ImageView = itemView.findViewById(R.id.item_img)
    }

    interface OnItemListener {
        fun onItemClicked(position: Int)
    }
}

