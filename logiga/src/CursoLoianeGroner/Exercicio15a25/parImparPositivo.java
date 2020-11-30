package CursoLoianeGroner.Exercicio15a25;

import java.util.Scanner;

public class parImparPositivo {
    public static void main(String[] args) {
        int num1, num2, opcao=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o primeiro numero : ");
        num1 = entrada.nextInt();
        System.out.println("digite o segundo numero : ");
        num2 = entrada.nextInt();
        System.out.println("digite a opcao 1 - 2");
        opcao = entrada.nextInt();
        if (opcao == 1){
            if (num1 % 2 == 0)
                System.out.println(" primeiro numero e par ");
            else
                System.out.println(" primeiro numero impar ");
            if (num2 % 2 == 0)
                System.out.println(" segundo numero e par ");
            else
                System.out.println(" segundo numero impar ");

        }
        if (opcao == 2){
            if (num1 > 0)
                System.out.println("  primeiro numero e positivo ");
            else if (num1 <0)
                System.out.println(" segundo numero negativo ");
            if (num2 > 0)
                System.out.println("  primeiro numero e positivo ");
            else if (num2 < 0)
                System.out.println(" segundo numero negativo ");

        }

    }
}
