package main.command;

import main.Calculator;
import main.ConsoleHelper;

public class SubstractCommand implements Command {
    @Override
    public void execute() {
            int a = Calculator.getA();
            int b = Calculator.getB();
            ConsoleHelper.printMessage(String.format("%d - %d = %d",a,b,a-b));
        }
    }

