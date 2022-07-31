package com.example.ourvillageedu.ui.etc

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EtcViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is etc Fragment"
    }
    val text: LiveData<String> = _text
}