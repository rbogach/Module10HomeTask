package com.example.module10hometask

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.module10hometask.databinding.ContactitemBinding

class ListAdapter(
    val contacts:MutableList<ContactInfo>,
    val listener: ListAdapterListener
): RecyclerView.Adapter<ListAdapter.ListItemViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        return ListItemViewHolder(ContactitemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false

        ))

    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        val contact = contacts[position]

        val textUm = "Mister"
        val textDois = "+55119286315"
        holder.posicao.text = position.toString()
        holder.conteudo.text = contact.name
        holder.conteudoDois.text = contact.phone
        holder.root.setOnClickListener{
            listener.onItemClicked(contact.name,contact.phone)
        }
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    class ListItemViewHolder(binding: ContactitemBinding): RecyclerView.ViewHolder(binding.root){
        var root = binding.root
        var posicao = binding.posicao
        var conteudo = binding.conteudo
        var conteudoDois = binding.conteudodois
    }

    interface ListAdapterListener{
        fun onItemClicked(content: String, contentTwo: String);
    }
}