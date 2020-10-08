package Logica2020;

import java.util.Scanner;

public class testeMesa05 {
    public static void main(String[] args) {
        int x=0, y=0;
        Scanner dados = new Scanner(System.in);
        while (x<5){


            y = x * 3;
            
            x = x + 1;
            System.out.println(+x + " - " + y);
        }
    }
}
