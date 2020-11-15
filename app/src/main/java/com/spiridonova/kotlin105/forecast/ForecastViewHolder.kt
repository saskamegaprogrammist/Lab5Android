package com.spiridonova.kotlin105.forecast

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.spiridonova.kotlin105.databinding.ForecastViewBinding
import com.spiridonova.kotlin105.network.ForecastAPI

class ForecastViewHolder(val binding: ForecastViewBinding, val fragment: Fragment) :
    ViewHolder(binding.root) {
    fun bind(forecastData: ForecastAPI.Forecast?) {
        with(binding) {
            if (forecastData != null) {
                cardTitle.text = forecastData.date.toString()
                cardSecondaryText.text = forecastData.parts?.dayShort?.tempMin.toString()
                cardSupportingText.text = forecastData.parts?.dayShort?.condition.toString()
            }
        }
    }
}
