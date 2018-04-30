package main.command;

import main.Calculator;
import main.ConsoleHelper;

public class SetOperandsCommand implements Command {
    @Override
    public void execute() {
        ConsoleHelper.printMessage("Введите два целых числа через Enter");
        int a = ConsoleHelper.getNumber();
        int b = ConsoleHelper.getNumber();
        Calculator.setA(a);
        Calculator.setB(b);
    }
}
