import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] color = new int[3];
        String hexColor = "#";
        for (int i = 0; i < 3; i++) {
            hexColor = hexColor + Integer.toHexString(sc.nextInt());
        }
        System.out.println(hexColor);
    }
}