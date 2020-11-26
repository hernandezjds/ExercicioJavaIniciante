package CursoLoianeGroner;

import java.util.Scanner;

public class lerTresNumero {
    public static void main(String[] args) {
        double num1, num2, num3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite a primeiro numero :");
        num1 = entrada.nextDouble();
        System.out.println("digite a segunda numero :");
        num2 = entrada.nextDouble();
        System.out.println("digite a terceiro numero :");
        num3 = entrada.nextDouble();
        if (num1 < num2 && num1 < num3){
            System.out.println(" primeiro numero e maior "  +num1);
        }
        else if (num3 > num2){
            System.out.println(" o sengudo  numero e maior "+num2);
        }
        else if (num2 > num3){
            System.out.println(" o terceiro numero e maior "+num3);
        }
        else
            System.out.println("os numero sao iguais ");

    }
}
