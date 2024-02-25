package com.cs4520.assignment2.MVP

class Model: Contract.Model {
    override fun add(val1: Double?, val2: Double?): Double? {
        if (valueCheck(val1, val2)){
            return  val1 as Double + val2 as Double
        }
        return null
    }

    override fun subtract(val1: Double?, val2: Double?): Double? {
        if (valueCheck(val1, val2)){
            return  val1 as Double - val2 as Double
        }
        return null
    }

    override fun multiply(val1: Double?, val2: Double?): Double? {
        if (valueCheck(val1, val2)){
            return  val1 as Double * val2 as Double
        }
        return null
    }

    override fun divide(val1: Double?, val2: Double?): Double? {
        if (valueCheck(val1, val2)){
            return  val1 as Double/ val2 as Double
        }
        return null
    }

    private fun valueCheck(val1: Double?, val2: Double?): Boolean{
        return (val1 != null) && (val2 != null)
    }
}