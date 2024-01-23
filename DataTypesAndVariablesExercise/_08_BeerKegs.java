package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class _08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte input = Byte.parseByte(scanner.nextLine());

        String model = "";
        double maxVolume = Double.MIN_VALUE;
        for (int i = 0; i < input; i++) {
            String keg = scanner.nextLine();
            double r = Double.parseDouble(scanner.nextLine());
            int h = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * r * r * h;
            if (volume > maxVolume) {
                model = keg;
                maxVolume = volume;
            }
        }
        System.out.println(model);
    }
}
