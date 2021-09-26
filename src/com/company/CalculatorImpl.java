package com.company;

public class CalculatorImpl implements Calculator {

    private int result = 0;
    private Op currentOperation = null;

    @Override
    public void handleOp(Op op) {
        this.currentOperation = op;
    }

    @Override
    public void handleNumber(int input) {
        if (currentOperation == null) {
            if (result != 0) {
                throw new IllegalArgumentException("Error");
            }
            result = input;
        } else {
            switch (currentOperation) {
                case PLUS:
                    result += input;
                    break;
                case MINUS:
                    result -= input;
                    break;
                case DIVIDE:
                    result = result / input;
                    break;
                case MULTIPLE:
                    result = result * input;
                    break;
            }
            currentOperation = null;
        }
    }

    @Override
    public int equally() {
        int currentResult = result;
        result = 0;
        return currentResult;
    }

}
