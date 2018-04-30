package main.command;

import main.Calculator;
import main.ConsoleHelper;

public class DivideCommand implements main.command.Command {
    @Override
    public void execute() {
        int a = Calculator.getA();
        int b = Calculator.getB();
        if(b == 0) {
            ConsoleHelper.printMessage("Ошибка: второй операнд равен 0.");
            return;
        }

        ConsoleHelper.printMessage(String.format("%d / %d = %f",a,b,((double)a)/b));
    }
}
