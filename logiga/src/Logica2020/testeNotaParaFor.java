package Logica2020;

import java.util.Scanner;

public class testeNotaParaFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota, media,x, soma=0, i;
        System.out.println("digite quantidade de notas..: ");
        nota = entrada.nextInt();
        for (i = 1;i <= nota;i++){
            System.out.println("digite as notas..: ");
            x = entrada.nextInt();
            soma = soma + x;

        }
        media = soma /3;
        if (media >= 30)
            System.out.println("aluno aprovado");
        else
            System.out.println("aluno reprovado");
            System.out.println("sua nota final é..: " + media);
    }
}
