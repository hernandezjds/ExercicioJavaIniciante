package Logica2020;

import java.util.Scanner;

public class estruturaEnquanto02 {
    public static void main(String[] args) {
        int idade, media, calculo=0, pessoas=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite as idade do grupo ");
        idade = entrada.nextInt();
        if (idade < 0) {
            System.out.println("impossivel calcular" + idade);
        }
        else {

            while (idade >= 0) {
                System.out.println("digite uma idade = ");
                idade = entrada.nextInt();
                calculo = calculo + idade;
                pessoas++;
                System.out.println("digite uma idade = ");

            }
        }
         media = calculo / pessoas;
        System.out.println("a media de idade e de = " +media);
    }
}
