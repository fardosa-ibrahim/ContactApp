package com.example.mycontacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.mycontacts.databinding.ActivityViewContactBinding
import com.example.mycontacts.databinding.ContactListTemBinding
import com.squareup.picasso.Picasso

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding:ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()

    }
    fun getExtras(){
        var name=intent.extras?.getString("NAME")
        var phoneNumber=intent.extras?.getString("PHONENUMBER")
        var image=binding.imgContact2

        binding.tvName.text=name
        binding.tvPhone.text=phoneNumber
        Picasso.get().load(intent.getStringExtra("IMAGE"))
            .into(image)


    }

}




