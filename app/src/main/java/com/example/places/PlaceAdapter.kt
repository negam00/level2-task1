package com.example.places

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_place.view.*

class PlaceAdapter(val places: List<Place>): RecyclerView.Adapter<PlaceAdapter.ViewHolder>() {

    inner class ViewHolder(val placeView: View):RecyclerView.ViewHolder(placeView) {
        fun bind(place: Place){
            placeView.placeName.text = place.name
            placeView.placeImage.setImageResource(place.imageResId)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_place, parent, false)
        )
    }

    override fun getItemCount() =  places.size

    override fun onBindViewHolder(holder: PlaceAdapter.ViewHolder, position: Int) {
        holder.bind(places[position])
    }


}