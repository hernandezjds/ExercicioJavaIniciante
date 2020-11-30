package CursoLoianeGroner.Exercicio15a25;

import java.util.Scanner;

public class notaSemestre {
    public static void main(String[] args) {
        double nota1, nota2, media;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite a primeira notas " );
        nota1 = entrada.nextDouble();
        System.out.println("digite a segunda notas " );
        nota2 = entrada.nextDouble();
        media = (nota1+nota2)/2;

        if (media >= 9 && media <=10){
            System.out.println("media de aproveitamento emtre " +media+ " = A :" );
            System.out.println("aprovado ");
        }
        if (media >= 7.5 && media <= 9){
            System.out.println("media de aproveitamento emtre " +media+ " = B :" );
            System.out.println("aprovado ");
        }
        if (media >= 6 && media <= 7.5){
            System.out.println("media de aproveitamento emtre " +media+ " = C :" );
            System.out.println("aprovado ");
        }
        if (media >= 4 && media <= 6){
            System.out.println("media de aproveitamento emtre " +media+ " = D :" );
            System.out.println("reaprovado ");
        }
        if (media >= 4 && media <= 0){
            System.out.println("media de aproveitamento emtre " +media+ " = E :" );
            System.out.println("reaprovado ");
        }

    }
}
