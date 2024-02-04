package com.example.starterone.homeview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.starterone.data.DataSet
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(list: DataSet) : ViewModel() {

    private var _data = MutableLiveData<List<String>>()
    val data: LiveData<List<String>> = _data

    init {
        _data.postValue(list.data)
    }
}
