package CursoLoianeGroner.Exercicio15a25;

import java.util.Scanner;

public class areaQuadrado {
    public static void main(String[] args) {
        double area,lado;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite base do quadrado..: ");
        lado = entrada.nextDouble();

       area= Math.pow(lado,2);
        System.out.println("area do quadrado e de ..:"+area);
        System.out.println("o doblo da area e ..: "+(area * 2));
    }
}
