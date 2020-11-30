package CursoLoianeGroner.Exercicio15a25;

import java.util.Scanner;

public class doisNumeros {
    public static void main(String[] args) {
        int num1, num2;
        double  numReal;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o primeiro numero");
        num1 = entrada.nextInt();
        System.out.println("digite o segundo numero");
        num2 = entrada.nextInt();
        System.out.println("digite o terceiro numero");
        numReal = entrada.nextDouble();
        num1 = (num1 * 2) * (num2/2);
        double resul = num1 * 3 + numReal;
        numReal = Math.pow(numReal,3);
        System.out.println("o primeiro numero "+num1);
        System.out.println("segundo numero "+num2);
        System.out.println("digite o terceiro numero "+numReal);


    }
}
