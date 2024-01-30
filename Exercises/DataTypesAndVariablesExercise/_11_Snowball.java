import java.util.Scanner;

public class _11_Snowball {
    public static void main(String args[]) {
      
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());        
        long maxSnowballValue = Long.MIN_VALUE;
        int maxSnowballSnow = Integer.MIN_VALUE;
        int maxSnowballTime = Integer.MIN_VALUE;
        int maxSnowballQuality = Integer.MIN_VALUE;
        
      
        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            long snowballValue = (long)Math.pow((snowballSnow / snowballTime), snowballQuality);
            
            if (maxSnowballValue < snowballValue) {
                maxSnowballValue = snowballValue;
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
                maxSnowballQuality = snowballQuality;
            }
        }
        
        System.out.printf("%d : %d = %d (%d)",
                        maxSnowballSnow, maxSnowballTime, maxSnowballValue, maxSnowballQuality);
    }
}
