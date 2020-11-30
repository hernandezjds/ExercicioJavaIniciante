package CursoLoianeGroner.Exercicio15a25;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero ..: ");
        numero = entrada.nextInt();
        if (numero % 2 == 0)
            System.out.println(" numero e par ");
        else
            System.out.println(" numero impar ");

    }

}
