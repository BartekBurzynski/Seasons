import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        input.toLowerCase();

        for (Season season : Season.values()) {
            if (season.getPolishName().equals(input)) {
                for (int i = 0; i < season.getMonths().length; i++) {
                    System.out.println(season.getMonths()[i]);

                }
            }
        }
    }
}
