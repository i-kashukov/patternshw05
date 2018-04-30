package main;

import main.command.Command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ConsoleHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printOperationsList() {
        for(Operation o: Operation.values())
            printMessage(o.ordinal() + ": " + o.getDescription());
    }

    public static void printOperands() {
        System.out.println(String.format("Текущие операнды: %d и %d",Calculator.getA(),Calculator.getB()));
    }

    public static int getNumber() {
        do {
            try {
                String s = reader.readLine();
                return Integer.parseInt(s);
            } catch (IOException ignored) {
                printMessage("Необходимо ввести целое число.");
            }
        } while(true);
    }


    public static Operation getOperation() {
        int i = 0;
        do {
            printMessage("Введите номер операции: ");
            i = getNumber();
        } while (i < 0 || i >= Operation.values().length);
        return Operation.values()[i];
    }
}
