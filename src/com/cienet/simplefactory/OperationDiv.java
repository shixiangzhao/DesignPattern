package com.cienet.simplefactory;

public class OperationDiv extends Operation {

    public double getResult() {
        double result = 0;
        if (getNumberB() == 0) {
            try {
                throw new Exception("除数不能为0!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        result = getNumberA() / getNumberB();
        return result;
    }
}
