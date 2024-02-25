package com.cs4520.assignment2.MVP

class Presenter(private var view: Contract.View?, private var model: Contract.Model): Contract.Presenter{
    override fun onButtonClick(operation: String, val1: String, val2: String) {
        var out: Double? = null

        when(operation){
            "add" -> out = model.add(val1, val2)
            "subtract" -> out = model.subtract(val1, val2)
            "multiply" -> out = model.multiply(val1, val2)
            "divide" -> out = model.divide(val1, val2)
        }

        if(out == null){
            view!!.displayErrorMessage()
        }
        else{
            view!!.setResult(out)
        }
    }

    override fun onDestroy() {
        view = null;
    }
}