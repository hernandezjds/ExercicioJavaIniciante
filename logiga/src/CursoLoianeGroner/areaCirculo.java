package CursoLoianeGroner;

import java.util.Scanner;

public class areaCirculo {
    public static void main(String[] args) {
        double raio,area=3.14;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o raio do circulo..:");
        raio = entrada.nextDouble();
        area = area * (raio * raio);
        System.out.println("a area do do raio..:%d "+area);
    }
}
