package com.example.coroutinespractice

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers

class MyViewMode: ViewModel(){

    @RequiresApi(Build.VERSION_CODES.O)
    val firstUser = liveData(Dispatchers.IO){
        val response = MyRepository().getUsers()
        emit(response)
    }


}