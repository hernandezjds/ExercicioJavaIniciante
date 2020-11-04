package Logica2020;

import java.util.Scanner;

public class testeParaFor02 {
    public static void main(String[] args) {
        int x = 3, y = 0, i;
        Scanner entrada = new Scanner(System.in);
        for (i=0;i<=x; i--){
            System.out.printf("= "+x);
            x = entrada.nextInt();
            y = y +5;
            System.out.printf("= "+y);
            y = entrada.nextInt();

        }
    }
}
