package com.example.hilt_example.data.repository

import android.app.Application
import com.example.hilt_example.R
import com.example.hilt_example.data.remote.MyApi
import com.example.hilt_example.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
): MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("Hello from the repository. The app name is $appName")
    }
    override suspend fun doNetworkCall() {

    }
}