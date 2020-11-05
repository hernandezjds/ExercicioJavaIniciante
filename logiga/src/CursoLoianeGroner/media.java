package CursoLoianeGroner;

import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        double nota1, nota2,nota3,nota4,media;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite uma nota");
        nota1 = entrada.nextDouble();
        System.out.println("digite uma nota");
        nota2 = entrada.nextDouble();
        System.out.println("digite uma nota");
        nota3 = entrada.nextDouble();
        System.out.println("digite uma nota");
        nota4 = entrada.nextDouble();
        media = nota1 + nota2 + nota3 + nota4 /4;
        System.out.println("sua media é de ..: "+media);
        if (media >= 40)
            System.out.println("aluno aprovado com merito");
        if (media <= 20)
            System.out.println("aluno em recuperação ");
        else
            System.out.println("aluno reprovado por falta de media ");


    }
}
