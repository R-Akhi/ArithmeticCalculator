package javaproject;

import java.util.Scanner;

public class Calculator {
    private double num1, num2;
    private char operator;

    public Calculator() {
        num1 = 0;
        num2 = 0;
        operator = ' ';
    }

    public void readInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        num2 = input.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        operator = input.next().charAt(0);
    }

    public double calculate() {
        double result = 0;
        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.readInput();
        double result = calculator.calculate();
        System.out.println(calculator.getNum1() + " " + calculator.getOperator() + " " + calculator.getNum2() + " = " + result);
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }
}
