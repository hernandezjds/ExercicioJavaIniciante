package CursoLoianeGroner.Exercicio15a25;

import java.util.Scanner;

public class ladosTriangulo {
    public static void main(String[] args) {
        double lado1, lado2, lado3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o primeiro lado do triangulo ");
        lado1 = entrada.nextDouble();
        System.out.println("digite o segundo lado do triangulo ");
        lado2 = entrada.nextDouble();
        System.out.println("digite o terceiro lado do triangulo ");
        lado3 = entrada.nextDouble();
        if (lado1 == lado2 && lado3 == lado1 && lado3 == lado2 && lado2 == lado1 ){
            System.out.println("triangulo equilatero : tres lados iguais ");

        }
        else if (lado1 == lado2 && lado3 == lado2  ){
            System.out.println("triangulo isosceles : dois lados iguais ");

        }
        else if (lado1 != lado2 && lado3 != lado1 && lado3 != lado2 && lado2 != lado1 ){
            System.out.println("triangulo escaleno : tres lados diferente ");

        }
    }
}
