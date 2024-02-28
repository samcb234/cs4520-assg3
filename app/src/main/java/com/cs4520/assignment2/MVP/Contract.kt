package com.cs4520.assignment2.MVP

import com.cs4520.assignment2.OperationResult

public interface Contract {
    interface View {
        fun setInputOne(string: String)
        fun setInputTwo(string: String)
        fun setResult(string: Double)
        fun displayErrorMessage(message: String)
    }

    interface Model{
        fun add(val1: String?, val2: String?) : OperationResult
        fun subtract(val1: String?, val2: String?) : OperationResult
        fun multiply(val1: String?, val2: String?) : OperationResult
        fun divide(val1: String?, val2: String?) : OperationResult
    }

    interface Presenter {
        fun onButtonClick(operation: String, val1: String, val2: String)
        fun onDestroy()
    }
}