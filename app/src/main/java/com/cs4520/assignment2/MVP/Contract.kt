package com.cs4520.assignment2.MVP

public interface Contract {
    interface View {
        fun setInputOne(string: String)
        fun setInputTwo(string: String)
        fun setResult(string: Double)
        fun displayErrorMessage()
    }

    interface Model{
        fun add(val1: String?, val2: String?) : Double?
        fun subtract(val1: String?, val2: String?) : Double?
        fun multiply(val1: String?, val2: String?) : Double?
        fun divide(val1: String?, val2: String?) : Double?
    }

    interface Presenter {
        fun onButtonClick(operation: String, val1: String, val2: String)
        fun onDestroy()
    }
}