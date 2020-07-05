package com.example.mvi_example.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvi_example.ui.main.states.MainViewStates

class MainViewModel : ViewModel() {
    private val _viewState : MutableLiveData<MainViewStates> = MutableLiveData()
    val viewStates : LiveData<MainViewStates>
        get() = _viewState
}