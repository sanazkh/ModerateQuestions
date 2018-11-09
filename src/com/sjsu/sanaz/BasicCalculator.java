package com.sjsu.sanaz;

import java.util.Stack;

/**
 * Created by sanazk on 11/8/18.
 */
public class BasicCalculator {
    public double calculate(String s) {
        double result = 0.0;
        if (s.length() == 0) {
            return result;
        }
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int tempIndex = i + 1;
                double pushedNumber = (double) Character.getNumericValue(c);
                while (tempIndex < s.length() && Character.isDigit(s.charAt(tempIndex))){
                    pushedNumber = pushedNumber * 10 + (double) Character.getNumericValue(s.charAt(tempIndex));
                    tempIndex++;
                    i++;
                }
                numbers.push(pushedNumber);
            }else{
                if(!operators.isEmpty()){
                    char topOperator = operators.peek();
                    double a = 0.0;
                    double b = 0.0;
                    double tempResult = 0.0;
                    if(c == '+' || c == '-' && (topOperator == '*' || topOperator == '/' || topOperator == '-' || topOperator == '+')){
                        a = numbers.pop();
                        b = numbers.pop();
                        tempResult = calc(a, b, topOperator);
                        numbers.push(tempResult);
                        operators.pop();
                        operators.push(c);
                    }else if(c == '*' || c == '/' && (topOperator == '*' || topOperator == '/')){
                        a = numbers.pop();
                        b = numbers.pop();
                        tempResult = calc(a, b, topOperator);
                        numbers.push(tempResult);
                        operators.pop();
                        operators.push(c);
                    }else{
                        operators.push(c);
                    }
                }else{
                    operators.push(c);
                }
            }
        }

        while (!operators.isEmpty()){
            double a = numbers.pop();
            double b = numbers.pop();
            double temp = 0.0;
            temp = calc(a, b, operators.peek());
            operators.pop();
            numbers.push(temp);
        }
        return numbers.pop();
    }

    double calc(double a, double b, char operator){
        double result = 0.0;

        switch (operator){
            case '*':
                result = a * b;
                break;
            case '/':
                result = b / a;
                break;
            case '-':
                result = a - b;
                break;
            case '+':
                result = a + b;
                break;
        }
        return result;
    }
}
