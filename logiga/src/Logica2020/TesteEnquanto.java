package Logica2020;

import java.util.Scanner;

public class TesteEnquanto {
    public static void main(String[] args) {
        int x, soma=0;
        Scanner dados = new Scanner(System.in);
        System.out.println("digite um numero");
        x = dados.nextInt();
        while (x != 0){
            soma = soma + x;
            System.out.println("digite um numero");
            x = dados.nextInt();

        }
        System.out.println("a soma do  numero é..: "+soma);

    }
}
