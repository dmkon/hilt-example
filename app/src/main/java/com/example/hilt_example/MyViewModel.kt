package com.example.hilt_example

import androidx.lifecycle.ViewModel
import com.example.hilt_example.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: MyRepository
): ViewModel() {
}