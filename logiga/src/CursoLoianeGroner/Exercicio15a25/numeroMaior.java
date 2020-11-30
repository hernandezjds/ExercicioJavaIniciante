package CursoLoianeGroner.Exercicio15a25;

import java.util.Scanner;

public class numeroMaior {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("digite o primeiro numero..: ");
        double num1 = entrada.nextDouble();

        System.out.println("digite o segundo numero..: ");
        double num2 = entrada.nextDouble();

        if (num1 == num2){
            System.out.println("os numeros sao iguais ");
        }
        if (num1 > num2){
            System.out.println("primeiro numero e maior que o segundo "+num1);
        }
        else {
            System.out.println(" segundo numero e maior que o primeiro "+num2);
        }

    }
}
