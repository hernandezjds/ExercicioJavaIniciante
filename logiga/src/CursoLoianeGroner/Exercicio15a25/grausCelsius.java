package CursoLoianeGroner.Exercicio15a25;

import java.util.Scanner;

public class grausCelsius {
    public static void main(String[] args) {
        double fare,celsi;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite a temperatura em Farenheit..: ");
        fare = entrada.nextDouble();
        celsi = (5*(fare - 32 )/9);
        System.out.println("a temperatura em Celsius..: "+celsi);
    }
}
