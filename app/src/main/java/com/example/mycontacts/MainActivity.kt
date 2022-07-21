package com.example.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){
        var contacts=Contacts("aisha","fardosairahim@gmail.com","0722153227","rrwtyq","https://images.unsplash.com/photo-1589156280159-27698a70f29e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contacts2=Contacts("aisha","fardosairahim@gmail.com","0722153227","rrwtyq","https://images.unsplash.com/photo-1570158268183-d296b2892211?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8N3x8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contacts3=Contacts("aisha","fardosairahim@gmail.com","0722153227","rrwtyq","https://images.unsplash.com/photo-1583994009785-37ec30bf9342?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contacts4=Contacts("aisha","fardosairahim@gmail.com","0722153227","rrwtyq","https://images.unsplash.com/photo-1523450001312-faa4e2e37f0f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTZ8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contacts5=Contacts("aisha","fardosairahim@gmail.com","0722153227","rrwtyq","https://media.istockphoto.com/photos/headshot-of-mature-black-woman-walking-on-city-street-picture-id1364683713?b=1&k=20&m=1364683713&s=170667a&w=0&h=rHN6wZG4STOTU3BpbcHyPDELoHFuTS63hbnWt47f7zc=")

        var contactList= listOf(contacts,contacts2,contacts3,contacts4,contacts5)
        var contactsAdaptor=contactRvAdaptor(contactList)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactsAdaptor




    }
}