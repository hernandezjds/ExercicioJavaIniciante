package Logica2020;

import java.util.Scanner;

public class testeMesa03 {
    public static void main(String[] args) {
        int x=2, y=0;
        Scanner dados = new Scanner(System.in);
        while (x<60){

            x = x * 2;
            y = y + 10;
            System.out.println(+x + " - " + y);
        }
    }
}
