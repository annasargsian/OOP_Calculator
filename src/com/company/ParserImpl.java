package com.company;

public class ParserImpl implements Parser {
    @Override
    public Result parse(String i) {
        String trimmed = i.trim();

        Op operator = null;
        if (trimmed.equals("+")) {
            operator = Op.PLUS;
        } else if (trimmed.equals("-")) {
            operator = Op.MINUS;
        } else if (trimmed.equals("/")) {
            operator = Op.DIVIDE;
        } else if (trimmed.equals("=")) {
            operator = Op.EQUAL;
        } else if (trimmed.equals("*")) {
            operator = Op.MULTIPLE;
        }

        if (operator != null) {
            return new Result(operator);
        }

        int input = Integer.parseInt(trimmed);
        return new Result(input);
    }
}
