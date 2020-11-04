package Logica2020;

import java.util.Scanner;

public class testeParaForTabuada {
    public static void main(String[] args) {
        int soma=0,numero,x,i;
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();
        System.out.println("digite um numero = ");
        for (i =1; i >= numero; i++);
        {
            System.out.println("digite um numero  : ");
            x = entrada.nextInt();
            soma = soma + x;

        }
        System.out.println("valor de = "+soma);
    }
}
