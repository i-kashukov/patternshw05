package main.command;

import main.Operation;

import java.util.HashMap;
import java.util.Map;

public class CommandExecutor {
    private static Map<Operation, Command> allOperationsMap = new HashMap<>();

    static {
        allOperationsMap.put(Operation.ADD,new AddCommand());
        allOperationsMap.put(Operation.SUBSTRACT,new SubstractCommand());
        allOperationsMap.put(Operation.MULTIPLY,new MultiplyCommand());
        allOperationsMap.put(Operation.DIVIDE,new DivideCommand());
        allOperationsMap.put(Operation.SET_OPERANDS,new SetOperandsCommand());
        allOperationsMap.put(Operation.EXIT,new ExitCommand());
    }

    public static void execute(Operation operation) {
        if(allOperationsMap.containsKey(operation))
            allOperationsMap.get(operation).execute();
    }
}
