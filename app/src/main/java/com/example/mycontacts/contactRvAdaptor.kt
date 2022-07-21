package com.example.mycontacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mycontacts.databinding.ContactListTemBinding
import com.squareup.picasso.Picasso

class contactRvAdaptor(var contactList:List<Contacts>):
   RecyclerView.Adapter<ContactViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
//        var itemView=LayoutInflater.from(parent.context)
//            .inflate(R.layout.contact_list_tem,parent,false)
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

    }

    override fun getItemCount(): Int {
     return contactList.size
    }

}
class ContactViewHolder(val binding:ContactListTemBinding):
        RecyclerView.ViewHolder(binding.root){

        }
