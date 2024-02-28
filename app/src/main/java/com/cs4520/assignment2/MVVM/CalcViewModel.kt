package com.cs4520.assignment2.MVVM

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cs4520.assignment2.Model
import com.cs4520.assignment2.OperationResult

class CalcViewModel: ViewModel() {
    private val model: Model = Model()

    private val _result = MutableLiveData<OperationResult>()
    val result: LiveData<OperationResult> = _result


    fun executeCommand(command: String, val1: String, val2: String){
        when(command){
            "add"-> _result.value = model.add(val1, val2)
            "subtract"-> _result.value = model.subtract(val1, val2)
            "multiply"-> _result.value = model.multiply(val1, val2)
            "divide"-> _result.value = model.divide(val1, val2)
        }
    }


}