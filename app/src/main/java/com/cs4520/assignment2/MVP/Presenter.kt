package com.cs4520.assignment2.MVP

import com.cs4520.assignment2.Model
import com.cs4520.assignment2.OperationResult

class Presenter(private var view: Contract.View?, private var model: Model): Contract.Presenter{
    override fun onButtonClick(operation: String, val1: String, val2: String) {
        var out: OperationResult? = null

        when(operation){
            "add" -> out = model.add(val1, val2)
            "subtract" -> out = model.subtract(val1, val2)
            "multiply" -> out = model.multiply(val1, val2)
            "divide" -> out = model.divide(val1, val2)
        }

        if(out!!.errorMessage != null){
            view!!.displayErrorMessage(out.errorMessage!!)
        }
        else{
            view!!.setResult(out.result!!)
        }
    }

    override fun onDestroy() {
        view = null;
    }
}