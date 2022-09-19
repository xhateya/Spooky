package com.xhateya.idn.spooky.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.xhateya.idn.spooky.R
import com.xhateya.idn.spooky.data.SpookiesContent

class ListSpookyAdapter (private val listSpooky: ArrayList<SpookiesContent>): RecyclerView.Adapter<ListSpookyAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback= onItemClickCallback
    }
    inner class ListViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvTitle: TextView = itemView.findViewById(R.id.tv_item_title)
        var tvReview: TextView = itemView.findViewById(R.id.tv_item_review)

        var imgPicture: ImageView =itemView.findViewById(R.id.img_item_picture)

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_row_spooky, viewGroup,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val spooky = listSpooky[position]

        spooky.picture?.let{
            Picasso.with(holder.itemView.context)
                .load(it)
                .resize(50,50)
                .into(holder.imgPicture)
        }
        holder.tvTitle.text = spooky.title
        holder.tvReview.text = spooky.review
        holder.itemView.setOnClickListener{onItemClickCallback.onItemClickedData(listSpooky[holder.adapterPosition])}
    }

    override fun getItemCount(): Int {
        return listSpooky.size
    }

    interface OnItemClickCallback {
        fun onItemClickedData(content : SpookiesContent)
}


}
