package com.cs4520.assignment2.MVVM

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalcViewModel: ViewModel() {
    private val model: Model = Model()

    private val _result = MutableLiveData<String>()
    val result: LiveData<String> = _result

    private val _error = MutableLiveData<Boolean>()
    val error: LiveData<Boolean> = _error

    fun executeCommand(command: String, val1: String, val2: String){
        if(val1 == "" || val2 == ""){
            _result.value = ""
            _error.value = false
        } else {
            when(command){
                "add"-> _result.value = model.add(val1.toDouble(), val2.toDouble()).toString()
                "subtract"-> _result.value = model.subtract(val1.toDouble(), val2.toDouble()).toString()
                "multiply"-> _result.value = model.multiply(val1.toDouble(), val2.toDouble()).toString()
                "divide"-> _result.value = model.divide(val1.toDouble(), val2.toDouble()).toString()
            }
        }
        println(result.value)
    }

}