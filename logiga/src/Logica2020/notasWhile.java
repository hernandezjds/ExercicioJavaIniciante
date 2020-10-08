package Logica2020;

import java.util.Scanner;

public class notasWhile {
    public static void main(String[] args) {
        double nota, media, soma=0;
        Scanner dados = new Scanner(System.in);
        System.out.println("digite  as notas");
        nota = dados.nextDouble();
        while (nota != 0){
            System.out.println("digite  as notas");
            nota = dados.nextDouble();
            soma = soma + nota;
        }
        media = soma / 3;
        if (media > 6)
            System.out.println("aluno aprovado..:");
        else
            System.out.println("aluno reprovado..:");
            System.out.println("a nota final é " +media);
    }

}
