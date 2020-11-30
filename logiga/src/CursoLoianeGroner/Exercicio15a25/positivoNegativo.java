package CursoLoianeGroner.Exercicio15a25;

import java.util.Scanner;

public class positivoNegativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o primeiro numero..: ");
        double num1 = entrada.nextDouble();

        if (num1 >= 0) {
            System.out.println("os numeros sao positivo");
        }
        else {
            System.out.println(" numero sao negativo  ");
        }

    }
}
