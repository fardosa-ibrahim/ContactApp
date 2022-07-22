package com.example.mycontacts

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.mycontacts.databinding.ContactListTemBinding
import com.squareup.picasso.Picasso

class contactRvAdaptor(var contactList:List<Contacts>):
   RecyclerView.Adapter<ContactViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding=ContactListTemBinding
            .inflate(LayoutInflater.from(parent.context),parent,false)
        return  ContactViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=contactList.get(position)
        holder.binding.tvname.text=currentContact.name
        holder.binding.tvphone.text=currentContact.phoneNumber
        holder.binding.tvemail.text=currentContact.email
        holder.binding.tvaddress.text=currentContact.address
        Picasso.get().load(currentContact.image)
            .resize(300,300)
            .centerCrop()
            .placeholder(R.drawable.ic_baseline_person_24)
            .into(holder.binding.imgcontact)
        val context=holder.itemView.context
        holder.binding.imgcontact.setOnClickListener{
            Toast.makeText(context,"You have clicked on the image",Toast.LENGTH_SHORT).show()

        }
        holder.binding.cvContact.setOnClickListener{
            val intent=Intent(context,ViewContactActivity::class.java)
            intent.putExtra("NAME",currentContact.name)
            intent.putExtra("ADDRESS",currentContact.address)
            context.startActivity(intent)
        }
    }
    override fun getItemCount(): Int {
     return contactList.size
    }
}
class ContactViewHolder(val binding:ContactListTemBinding):
        RecyclerView.ViewHolder(binding.root){

        }
