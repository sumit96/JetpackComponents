package com.example.jetpackcomponents

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class BasicViewModelFactory(val context : Context) : ViewModelProvider.Factory {
    // View Factory used to send activity context on live data to capture the value from string xml
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return BasicLiveDataViewModel(context) as T
    }
}