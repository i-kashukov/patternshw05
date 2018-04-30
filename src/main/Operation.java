package main;

public enum Operation {
    ADD("сложение"), SUBSTRACT("вычитание"), MULTIPLY("умножение"), DIVIDE("деление"),
    SET_OPERANDS("изменение значения операндов"), EXIT("выход");
    private String description;

    Operation(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
