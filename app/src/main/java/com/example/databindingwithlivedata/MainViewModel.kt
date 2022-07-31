package com.example.databindingwithlivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val quotesLiveData = MutableLiveData<String>("No one can stop me!")



    fun updateQuote(){
        quotesLiveData.value = "I never give up..!"
    }
}