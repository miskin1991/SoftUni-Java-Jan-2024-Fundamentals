package Labs.ObjectsAndClasses._02_SumBigNumbers;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger firstNumber = scanner.nextBigInteger();
        BigInteger secondNumber = scanner.nextBigInteger();
        BigInteger sum = firstNumber.add(secondNumber);
        System.out.println(sum);
    }
}
