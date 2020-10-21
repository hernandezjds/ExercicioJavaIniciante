package Logica2020;

import java.util.Scanner;

public class testeParaFor01 {
    public static void main(String[] args) {
        int i, num, x, soma=0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero  : ");
        num = entrada.nextInt();
        for (i = 1; i <= num)
        {
            System.out.println("digite um numero  : ");
            x = entrada.nextInt();
            soma = soma + x;

        }
        System.out.println("valor de = "+soma);

    }
}
