package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new CalculatorImpl();
        Parser parser = new ParserImpl();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.next();
            Parser.Result parseResult;
            try {
                parseResult = parser.parse(input);
            } catch (Exception e) {
                System.out.println("Wrong input: " + input);
                continue;
            }

            if (parseResult.getOperator() != null) {
                if (parseResult.getOperator() == Op.EQUAL) {
                    double result = calc.equally();
                    System.out.println(result);
                } else {
                    calc.handleOp(parseResult.getOperator());
                }
            } else {
                calc.handleNumber(parseResult.getNumber());
            }
        }
    }
}
