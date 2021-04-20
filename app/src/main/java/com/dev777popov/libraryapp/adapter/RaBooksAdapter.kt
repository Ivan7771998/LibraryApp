package com.dev777popov.libraryapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dev777popov.libraryapp.R
import com.dev777popov.libraryapp.db.model.Book
import com.dev777popov.libraryapp.ui.IListBooks
import kotlinx.android.synthetic.main.item_list_book.view.*

class RaBooksAdapter (private val list: List<Book>, val listener: IListBooks)
    : RecyclerView.Adapter<RaBooksAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: Book) = with(itemView) {
            txt_name_book.text = item.name

            img_delete_book.setOnClickListener {
                listener.deleteBooks(book = item)
                notifyDataSetChanged()
            }
            itemView.setOnClickListener {
                listener.editBooks(book = item)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list_book, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(list[position])

    override fun getItemCount(): Int {
        return list.size
    }
}