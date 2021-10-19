package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 21
     * -2,147,483,648 -> exception and error message
     * If result (number in reversed order) is out of int range [-2,147,483,648,  2,147,483,647] throw custom
     * unchecked exception. In main method (Main class) if exception happened output message with problem to user.
     */
    public int reverse(int inputNumber) {
        //Task implementation
        long result = 0;
        while (inputNumber != 0) {
            result = result * 10 + inputNumber % 10;
            inputNumber = inputNumber / 10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
            throw new IntOverflowException("Введено число, которое не может быть конвертировано");
        return (int) result;
    }
}
