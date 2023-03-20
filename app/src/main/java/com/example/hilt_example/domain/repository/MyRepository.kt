package com.example.hilt_example.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}