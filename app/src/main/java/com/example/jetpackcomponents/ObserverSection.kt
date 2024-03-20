package com.example.jetpackcomponents

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner


class ObserverSection : DefaultLifecycleObserver {

// It observer the LifeCycle of Activity
// It is called lifecycle observer
    @Override
    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)

        Log.d("MAINDATA", "Observer OnCreate")
    }

    @Override
    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)

        Log.d("MAINDATA", "Observer OnResume")
    }


    @Override
    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)

        Log.d("MAINDATA", "Observer OnPause")
    }

    @Override
    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)

        Log.d("MAINDATA", "Observer OnStop")
    }

}