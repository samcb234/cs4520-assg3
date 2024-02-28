package com.cs4520.assignment2

class Model {

    private val noInputError: String = "Please enter 2 numbers"
     fun add(val1: String?, val2: String?): OperationResult {
        if (valueCheck(val1, val2)){
            return OperationResult(val1!!.toDouble() + val2!!.toDouble(), null)
        }
        return OperationResult(null, noInputError)
    }

     fun subtract(val1: String?, val2: String?): OperationResult {
        if (valueCheck(val1, val2)){
            return OperationResult(val1!!.toDouble() - val2!!.toDouble(), null)
        }
        return OperationResult(null, noInputError)
    }

     fun multiply(val1: String?, val2: String?): OperationResult {
        if (valueCheck(val1, val2)){
            return OperationResult(val1!!.toDouble() * val2!!.toDouble(), null)
        }
        return OperationResult(null, noInputError)
    }

     fun divide(val1: String?, val2: String?): OperationResult {
        if (valueCheck(val1, val2)){
            if(val2!!.toDouble() == 0.0){
                return OperationResult(null, "Cannot divide by 0")
            }
            return OperationResult(val1!!.toDouble() / val2.toDouble(), null)
        }
        return OperationResult(null, noInputError)
    }

    private fun valueCheck(val1: String?, val2: String?): Boolean{
        return (val1 != null && val1 != "") && (val2 != null && val2 != "")
    }
}