package Logica2020;

import java.util.Scanner;

public class testeMesa02 {
    public static void main(String[] args) {
        int x = 5, y = 0;
        Scanner dados = new Scanner(System.in);
        while (x >2) {
            y = y + x;
            x = x - 1;
            System.out.println(+x + " - " + y);
        }
    }
}
