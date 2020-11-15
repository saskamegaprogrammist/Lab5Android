package com.spiridonova.kotlin105

import android.content.res.Configuration
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.spiridonova.kotlin105.databinding.NewActivityBinding
import com.spiridonova.kotlin105.network.ForecastAPI


class NewActivity : AppCompatActivity() {
    private var data: String? = null
    private lateinit var mainBinding: NewActivityBinding

    companion object {
        private var dataComp: String? = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        if (savedInstanceState != null) {
//            data = savedInstanceState.getSerializable("moonText") as String
//        }
        val moonText = intent.getStringExtra("moonText")
        Log.d("extra", moonText.toString())
        if (moonText != null) {
            data = moonText
        }
        mainBinding = DataBindingUtil.setContentView(this, R.layout.new_activity)
        mainBinding.testText.text = data
        Log.d(getLogTag(), "onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.d(getLogTag(), "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(getLogTag(), "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(getLogTag(), "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(getLogTag(), "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(getLogTag(), "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(getLogTag(), "onDestroy $isChangingConfigurations")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(getLogTag(), "onSaveInstanceState")
//        outState.putSerializable("moonText", data)
//        dataComp = data
    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(getLogTag(), "onRestoreInstanceState")
//        data = savedInstanceState.getSerializable("moonText") as String
//        data = dataComp
    }
    private fun getLogTag(): String? {
        return javaClass.simpleName + " Lifecycle"
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show()
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show()
        }
    }
}