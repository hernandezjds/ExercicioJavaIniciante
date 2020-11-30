package CursoLoianeGroner.Exercicio15a25;

import java.util.Scanner;

public class precoBarato {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite primeiro preço");
        double preco1 = entrada.nextDouble();
        System.out.println("digite segundo preço");
        double preco2 = entrada.nextDouble();
        System.out.println("digite terceiro preço");
        double preco3 = entrada.nextDouble();
        if (preco1 <= preco2 && preco1 <= preco3){
            System.out.println(" primeiro numero e menor " +preco1);
        }
        else if (preco2 <= preco1 && preco2 <= preco3){
            System.out.println(" o sengudo  numero e menor " +preco2);
        }
        else if (preco3 <= preco2 && preco3 <= preco2){
            System.out.println(" o terceiro numero e menor " +preco3);
        }

    }
}
