package CursoLoianeGroner.Exercicio15a25;

import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        int num1, num2, soma;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite dois numero..: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        soma = num1+num2;
        System.out.println("a soma de dois numero e ..: "+soma);

    }
}
