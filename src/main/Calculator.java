package main;

import main.command.CommandExecutor;

public class Calculator {
    private static int a, b;


    public static void main(String[] args) {
        Operation operation = null;
        do {
            ConsoleHelper.printOperationsList();
            ConsoleHelper.printOperands();
            operation = ConsoleHelper.getOperation();
            CommandExecutor.execute(operation);
        } while (operation != Operation.EXIT);
    }


    public static void setA(int a) {
        Calculator.a = a;
    }

    public static void setB(int b) {
        Calculator.b = b;
    }

    public static int getA() {
        return a;
    }

    public static int getB() {
        return b;
    }

}
