package com.spiridonova.kotlin105.forecast

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.spiridonova.kotlin105.NewActivity
import com.spiridonova.kotlin105.R
import com.spiridonova.kotlin105.network.ForecastAPI
import com.spiridonova.kotlin105.network.NetworkRequests


class ForecastListFragment : Fragment() {
    private var data: ArrayList<ForecastAPI.Forecast>? = null
    private var networkRequests = NetworkRequests()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        if (savedInstanceState != null) {
            data = savedInstanceState.getSerializable("data") as ArrayList<ForecastAPI.Forecast>?
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val mainView: View = inflater.inflate(R.layout.start_fragment, container, false)
        val recyclerView: RecyclerView = mainView.findViewById(R.id.list)
        var adapter: ForecastDataAdapter
        if (data == null) {
            networkRequests.currenciesMutableLiveData
                .observe(viewLifecycleOwner) { results ->
                    data = results as ArrayList<ForecastAPI.Forecast>?
                    Log.d("results", data.toString())
                    adapter = ForecastDataAdapter(this, data!!)
                    recyclerView.adapter = adapter
                }

        } else {
            adapter = ForecastDataAdapter(this, (data)!!)
            recyclerView.adapter = adapter
        }
        networkRequests.getForecast()

        mainView.findViewById<Button>(R.id.new_activity).setOnClickListener {
            run {
                val intent = Intent(activity, NewActivity::class.java).apply {
                }
                intent.putExtra("moonText", data?.get(0)?.date);
                Log.d("extra", data?.get(0)?.date.toString())

                startActivity(intent)
            }
        }

        val spanCount = resources.getInteger(R.integer.spanCount)
        val layoutManager = GridLayoutManager(activity, spanCount)
        recyclerView.layoutManager = layoutManager
        return mainView
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putSerializable("data", data)
    }

}
