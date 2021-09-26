package com.company;

public interface Parser {
    Result parse(String i);

    class Result {

        Result(int number) {
            this.number = number;
            this.operator = null;
        }

        Result(Op operator) {
            this.number = null;
            this.operator = operator;
        }

        private final Integer number;
        private final Op operator;

        public Integer getNumber() {
            return number;
        }

        public Op getOperator() {
            return operator;
        }
    }
}
