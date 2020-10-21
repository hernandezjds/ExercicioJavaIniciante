package Logica2020;

import java.util.Scanner;

public class estruturaEnquanto06 {
    public static void main(String[] args) {
        int x,soma;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero  = ");
        x = entrada.nextInt();
        while (x != 0){
            if (x % 2 != 0) {
                x++;
            }

            soma = 5 * x + 20;
            System.out.printf("SOMA = %d\n", soma);

            System.out.print("Digite um numero inteiro: ");
            x = entrada.nextInt();
        }

        }
    }

