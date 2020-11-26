package CursoLoianeGroner;

import java.util.Scanner;

public class areaCirculo {
    public static void main(String[] args) {
        double raio,area;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o raio do circulo..:");
        raio = entrada.nextDouble();
        //area = area * (raio * raio);
        area = Math.PI * Math.pow(raio,2);
        System.out.println("a area do do raio..:%d "+area);
    }
}
