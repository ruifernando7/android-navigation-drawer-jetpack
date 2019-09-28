package com.example.navigation_drawer_jetpack

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel(){
    var status = MutableLiveData<String>()

    fun setStatus(data: String){
        status.postValue(data)
    }
}