package CursoLoianeGroner;

import java.util.Scanner;

public class duasNotas {
    public static void main(String[] args) {
        double nota1, nota2, media;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite a primeira nota :");
        nota1 = entrada.nextDouble();
        System.out.println("digite a segunda nota :");
        nota2 = entrada.nextDouble();
        media = nota1 * nota2 / 2;
        if (media > 7){
            System.out.println("aluno aprovado");
        }
        if (media < 7){
            System.out.println("aluno aprovado");
        }
        else if (media >= 10){
            System.out.println("aluno aprovado com disticao ");
        }
    }
}
