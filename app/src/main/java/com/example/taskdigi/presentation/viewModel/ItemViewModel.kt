package com.example.taskdigi.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.taskdigi.data.model.Item
import com.example.taskdigi.domain.usecase.getItemUsecase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ItemViewModel @Inject constructor(
    private val getItems: getItemUsecase
) : ViewModel() {

    private val _items = MutableStateFlow<List<Item>>(emptyList())
    val items = _items

    init {
        viewModelScope.launch {
            getItems().collect {
                println("Debug: Received ${it.size} items")
                _items.value = it
            }
        }
    }
}