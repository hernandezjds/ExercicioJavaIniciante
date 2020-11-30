package CursoLoianeGroner.Exercicio15a25;

import java.util.Scanner;

public class alturaCalculo {
    public static void main(String[] args) {
        double altura,peso;
        Scanner entrada = new Scanner(System.in);
        System.out.println("difite sua altura");
        altura = entrada.nextDouble();
        peso = (72.7 * altura) - 58;
        System.out.println("peso ideal - "+peso);
    }
}
