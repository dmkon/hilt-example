package com.example.hilt_example.data.repository

import com.example.hilt_example.data.remote.MyApi
import com.example.hilt_example.domain.repository.MyRepository

class MyRepositoryImpl(
    private val api: MyApi
): MyRepository {
    override suspend fun doNetworkCall() {

    }
}