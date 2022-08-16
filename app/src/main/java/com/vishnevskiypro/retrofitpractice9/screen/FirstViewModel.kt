package com.vishnevskiypro.retrofitpractice9.screen

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vishnevskiypro.retrofitpractice9.api.Repository
import com.vishnevskiypro.retrofitpractice9.models.DataFromGiphy
import kotlinx.coroutines.launch
import retrofit2.Response

class FirstViewModel : ViewModel() {

    val gifListLiveData: MutableLiveData<Response<DataFromGiphy>> = MutableLiveData()
    val repo = Repository()

    fun getGifsVM(){
        viewModelScope.launch {
            gifListLiveData.value = repo.getPicFromRepo()
        }
    }

}