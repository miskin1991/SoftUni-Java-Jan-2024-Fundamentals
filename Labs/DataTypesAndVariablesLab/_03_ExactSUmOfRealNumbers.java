package Labs.DataTypesAndVariablesLab;

import java.math.BigDecimal;
import java.util.Scanner;

public class _03_ExactSUmOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < n; i++) {
            sum = sum.add(scanner.nextBigDecimal());
        }

        System.out.println(sum);
    }
}
