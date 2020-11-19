package CursoLoianeGroner;

import java.util.Scanner;

public class grausFarenheit {
    public static void main(String[] args) {
        double fare,celsi;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite a temperatura em Celsius..: ");
        celsi = entrada.nextDouble();
        fare = celsi * 9.0 / 5.0 + 32.0;
        System.out.println("a temperatura em Celsius..: "+fare);
    }
}



