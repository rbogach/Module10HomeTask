package com.example.module10hometask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.module10hometask.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), ListAdapter.ListAdapterListener {

    private lateinit var binding: ActivityMainBinding
    private val phoneBook: MutableList<ContactInfo> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listView = binding.contactList

        addContact()
        listView.layoutManager = LinearLayoutManager(this)
        listView.adapter = ListAdapter(phoneBook, this)
    }

    override fun onItemClicked(content: String, contentTwo: String) {
        Snackbar.make(binding.root, "$content and his/her phone is $contentTwo", Snackbar.LENGTH_LONG).show()
    }

    fun addContact(){
        phoneBook.add(ContactInfo("Jessica","+55112332463"))
        phoneBook.add(ContactInfo("Petrus","+55112332461"))
        phoneBook.add(ContactInfo("Lys","+55112332462"))
        phoneBook.add(ContactInfo("Fernando","+55112352463"))
        phoneBook.add(ContactInfo("Maria","+55112332473"))
        phoneBook.add(ContactInfo("Fabiana","+55112336463"))
        phoneBook.add(ContactInfo("Lidia","+55112332963"))
        phoneBook.add(ContactInfo("Waleska","+55112392463"))
        phoneBook.add(ContactInfo("Danilo","+55112331463"))
        phoneBook.add(ContactInfo("Johm","+55112332423"))
        phoneBook.add(ContactInfo("Lenon","+55112332363"))
        phoneBook.add(ContactInfo("Pedro","+55112332563"))
        phoneBook.add(ContactInfo("Mario","+55112332663"))
        phoneBook.add(ContactInfo("Flavio","+55112334463"))
        phoneBook.add(ContactInfo("Iban","+55112332463"))
        phoneBook.add(ContactInfo("Lin","+55112332467"))
        phoneBook.add(ContactInfo("Iago","+55112332463"))
        phoneBook.add(ContactInfo("Lukas","+55112332763"))
        phoneBook.add(ContactInfo("Ray","+55112332468"))
        phoneBook.add(ContactInfo("Amanda","+55112339463"))
        phoneBook.add(ContactInfo("Johm","+55112332423"))
        phoneBook.add(ContactInfo("Lenon","+55112332363"))
        phoneBook.add(ContactInfo("Pedro","+55112332563"))
        phoneBook.add(ContactInfo("Mario","+55112332663"))
        phoneBook.add(ContactInfo("Flavio","+55112334463"))
        phoneBook.add(ContactInfo("Iban","+55112332463"))
        phoneBook.add(ContactInfo("Lin","+55112332467"))
        phoneBook.add(ContactInfo("Johm","+55112332423"))
        phoneBook.add(ContactInfo("Lenon","+55112332363"))
        phoneBook.add(ContactInfo("Pedro","+55112332563"))
        phoneBook.add(ContactInfo("Mario","+55112332663"))
        phoneBook.add(ContactInfo("Flavio","+55112334463"))
        phoneBook.add(ContactInfo("Iban","+55112332463"))
        phoneBook.add(ContactInfo("Lin","+55112332467"))
        phoneBook.add(ContactInfo("Iban","+55112332463"))
        phoneBook.add(ContactInfo("Lin","+55112332467"))
        phoneBook.add(ContactInfo("Iago","+55112332463"))
        phoneBook.add(ContactInfo("Lukas","+55112332763"))
        phoneBook.add(ContactInfo("Ray","+55112332468"))
        phoneBook.add(ContactInfo("Amanda","+55112339463"))
        phoneBook.add(ContactInfo("Johm","+55112332423"))
        phoneBook.add(ContactInfo("Lenon","+55112332363"))
        phoneBook.add(ContactInfo("Iban","+55112332463"))
        phoneBook.add(ContactInfo("Lin","+55112332467"))
        phoneBook.add(ContactInfo("Iago","+55112332463"))
        phoneBook.add(ContactInfo("Lukas","+55112332763"))
        phoneBook.add(ContactInfo("Ray","+55112332468"))
        phoneBook.add(ContactInfo("Amanda","+55112339463"))
        phoneBook.add(ContactInfo("Johm","+55112332423"))
        phoneBook.add(ContactInfo("Lenon","+55112332363"))

    }
}