package com.cs4520.assignment2.MVP

class Model: Contract.Model {
    override fun add(val1: String?, val2: String?): Double? {
        if (valueCheck(val1, val2)){
            return  val1!!.toDouble() + val2!!.toDouble()
        }
        return null
    }

    override fun subtract(val1: String?, val2: String?): Double? {
        if (valueCheck(val1, val2)){
            return  val1!!.toDouble() - val2!!.toDouble()
        }
        return null
    }

    override fun multiply(val1: String?, val2: String?): Double? {
        if (valueCheck(val1, val2)){
            return  val1!!.toDouble() * val2!!.toDouble()
        }
        return null
    }

    override fun divide(val1: String?, val2: String?): Double? {
        if (valueCheck(val1, val2)){
            return  val1!!.toDouble() / val2!!.toDouble()
        }
        return null
    }

    private fun valueCheck(val1: String?, val2: String?): Boolean{
        return (val1 != null && val1 != "") && (val2 != null && val2 != "")
    }
}