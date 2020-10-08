package Logica2020;

import java.util.Scanner;

public class testeMesa04 {
    public static void main(String[] args) {
        double x=100, y=100;
        Scanner dados = new Scanner(System.in);
        while (x != y){

            x = Math.sqrt(y);

            System.out.println(" - "+x);
        }
    }
}
