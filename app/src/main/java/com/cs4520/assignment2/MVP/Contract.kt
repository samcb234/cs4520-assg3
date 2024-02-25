package com.cs4520.assignment2.MVP

public interface Contract {
    interface View {
        fun setInputOne(string: String)
        fun setInputTwo(string: String)
        fun setResult(string: Double)
        fun displayErrorMessage()
    }

    interface Model{
        fun add(val1: Double?, val2: Double?) : Double?
        fun subtract(val1: Double?, val2: Double?) : Double?
        fun multiply(val1: Double?, val2: Double?) : Double?
        fun divide(val1: Double?, val2: Double?) : Double?
    }

    interface Presenter {
        fun onButtonClick(operation: String, val1: Double?, val2: Double?)
        fun onDestroy()
    }
}