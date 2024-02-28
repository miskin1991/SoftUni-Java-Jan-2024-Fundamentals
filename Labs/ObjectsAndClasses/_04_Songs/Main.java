package Labs.ObjectsAndClasses._04_Songs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Song[] songs = new Song[n];
        for (int i = 0; i < songs.length; i++) {
            String[] song = scanner.nextLine().split("_");
            songs[i] = new Song(song[0], song[1], song[2]);
        }
        String type = scanner.nextLine();
        for (Song song : songs) {
            if (song.getTypeList().equals(type) || type.equals("all")) {
                System.out.println(song.getName());
            }
        }
    }
}
