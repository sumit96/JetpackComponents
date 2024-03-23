package com.example.jetpackcomponents

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BasicLiveDataViewModel(val context: Context) : ViewModel() {

    val liveDataItem = MutableLiveData<String>("Hello User")

    val liveData : LiveData<String>
        get() {
            // Normal live data internally use Mutable live data
           return liveDataItem
        }

    fun updateText()
    {
        // Updating Live data value which will automatically observe by textview 
        liveDataItem.value = context.getString(R.string.update_data_txt)
    }

}