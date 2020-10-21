package Logica2020;

import java.util.Scanner;

public class estruturaEnquanto04 {
    public static void main(String[] args) {
        double nota1, nota2=0, media;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite 1 notas..:");
        nota1 = entrada.nextDouble();
        while (nota1 < 0  || nota1 > 10){
            System.out.println("valor invalido tente novamente");
            nota1 = entrada.nextDouble();
        }
        System.out.println("digite 2 notas..:");
        nota1 = entrada.nextDouble();
        while (nota2 < 0  || nota2 > 10){
            System.out.println("valor invalido tente novamente");
            nota2 = entrada.nextDouble();
        }

/*
            if ((nota1 < 0 ) || (nota2 < 0)) {
                System.out.println("valor invalido tente novamente");
            }
            else {
                while ((nota1 >= 10) || (nota2 <= 10))
                    nota1 = entrada.nextDouble();
                nota2 = entrada.nextDouble();
                media = nota1 + nota2 /2;
            }
        System.out.println("media semastral..:"+media);

 */
        media = nota1 + nota2 /2;
        System.out.println("media semastral..:"+media);
    }
}
