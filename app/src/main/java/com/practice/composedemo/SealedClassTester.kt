package com.practice.composedemo

import androidx.lifecycle.MutableLiveData
import com.practice.composedemo.SealedTest.NetworkResult

class SealedClassTester {
    val response: MutableLiveData<NetworkResult<Any>> = MutableLiveData()

    private fun fetchResult() {
        response.value = NetworkResult.Loading()
        if(hasInternetConnection()) {
            try {
                val responseCode = Math.random()
                if(responseCode.equals(200)) {
                    response.value = NetworkResult.Success(response)
                } else {
                    response.value = NetworkResult.Error("")
                }
            } catch (e: Exception) {
                response.value = NetworkResult.Error("")
            }
        } else {
            response.value = NetworkResult.Error("")
        }

        /*response.observe() { response ->
            when (response) {
                is NetworkResult.Success -> {
                    response.data?.let {
                        // bind the data to the ui
                    }
                }
                is NetworkResult.Error -> {
                    // show error message
                }
                is NetworkResult.Loading -> {
                    // show loader, shimmer effect etc
                }
            }
        }*/
    }

    private fun hasInternetConnection(): Boolean {
        return true
    }
}
