package com.spiridonova.kotlin105.forecast

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.spiridonova.kotlin105.databinding.ForecastViewBinding
import com.spiridonova.kotlin105.network.ForecastAPI

class ForecastDataAdapter(fragment: Fragment?, data: ArrayList<ForecastAPI.Forecast>?) :
    RecyclerView.Adapter<ForecastViewHolder>() {
    private var cards: ArrayList<ForecastAPI.Forecast>? = data
    private val fragment: Fragment = fragment as ForecastListFragment

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForecastViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ForecastViewBinding = ForecastViewBinding.inflate(layoutInflater, parent, false)
        return ForecastViewHolder(binding, fragment)
    }

    override fun onBindViewHolder(holder: ForecastViewHolder, position: Int) = holder.bind(cards?.get(position))

    override fun getItemCount(): Int {
        if (cards == null) {
            return 0
        } else {
            return cards!!.size
        }

    }
}
