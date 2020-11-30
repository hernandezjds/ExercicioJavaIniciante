package CursoLoianeGroner.Exercicio15a25;

import java.util.Scanner;

public class anoBissexto {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um ano ex: 1979 ..: ");
        numero = entrada.nextInt();
        if (numero % 4 == 0)
            System.out.println(" ano  e bissexto ");
        else
        System.out.println(" ano nao  e bissexto ");

    }
}
