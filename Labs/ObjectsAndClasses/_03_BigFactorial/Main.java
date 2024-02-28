package Labs.ObjectsAndClasses._03_BigFactorial;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger number = new BigInteger(scanner.nextLine());
        BigInteger factorial = getFactorial(number);
        System.out.println(factorial);
    }

    public static BigInteger getFactorial(BigInteger number) {
        if (number.compareTo(new BigInteger("1")) == 0)
            return new BigInteger("1");
        return number.multiply(getFactorial(number.subtract(new BigInteger("1"))));
    }
}
