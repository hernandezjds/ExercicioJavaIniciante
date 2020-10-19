package Logica2020;

import java.util.Scanner;

public class estruturaEnquanto {
    public static void main(String[] args) {
        int x, y;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite dois numero ");
        x = entrada.nextInt();
        y = entrada.nextInt();
        while (x != y) {
            if (x < y)
                System.out.println("CRESCENTE");
            else System.out.println("DESCRESCENTE");
            System.out.println("digite dois numeros");
            x = entrada.nextInt();
            y = entrada.nextInt();
        }


    }
}
