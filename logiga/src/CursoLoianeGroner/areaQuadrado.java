package CursoLoianeGroner;

import java.util.Scanner;

public class areaQuadrado {
    public static void main(String[] args) {
        double base, altura, area;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite base do quadrado..: ");
        base = entrada.nextDouble();
        System.out.println("digite base do altura..: ");
        altura = entrada.nextDouble();
        area = base * altura;
        System.out.println("area do quadrado e de ..:"+area);
        area = area * 2;
        System.out.println("o doblo da area e ..: "+area);
    }
}
