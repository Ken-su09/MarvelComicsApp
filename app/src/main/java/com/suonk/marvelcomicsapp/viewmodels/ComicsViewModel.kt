package com.suonk.marvelcomicsapp.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.suonk.marvelcomicsapp.models.data.ComicsResponse
import com.suonk.marvelcomicsapp.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ComicsViewModel @Inject constructor(private val repository: MainRepository) : ViewModel() {

    val allComicsLiveData = MutableLiveData<ComicsResponse>()

    var pageNumber = 1
    var comicsResponse: ComicsResponse? = null

    fun getAllComics() = viewModelScope.launch {
        val response = repository.getAllComics("", "")
        if (response.isSuccessful) {
            pageNumber += 1
            if (comicsResponse == null) {
                comicsResponse = response.body()
            } else {
                val oldCharacters = comicsResponse?.data?.results
                val newCharacters = response.body()?.data?.results
                newCharacters?.let { oldCharacters?.addAll(it) }
            }
            allComicsLiveData.postValue(comicsResponse ?: response.body())
        }
    }
}