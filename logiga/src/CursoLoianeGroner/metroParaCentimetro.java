package CursoLoianeGroner;

import java.util.Scanner;

public class metroParaCentimetro {
    public static void main(String[] args) {
        double metro, centimetro=100;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite em metro..:");
        metro = entrada.nextDouble();
        centimetro = metro * centimetro;
        System.out.println("a conversao para centimetros é ..:"+centimetro);
    }
}
