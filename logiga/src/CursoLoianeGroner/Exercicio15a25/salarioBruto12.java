package CursoLoianeGroner.Exercicio15a25;

import java.util.Scanner;

public class salarioBruto12 {
    public static void main(String[] args) {
        double imposto, sindicato, desconto, salario=0, salarioLiquido, valorHoras, qutDeHoras;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite valor de horas trabalhadas..: ");
        valorHoras = entrada.nextDouble();
        System.out.println("digite quantidade  de horas trabalhadas..: ");
        qutDeHoras = entrada.nextDouble();
        salario = valorHoras * qutDeHoras;
        if (salario <= 900) {
            System.out.println("funcionario isento de pagamento de imposto :");

        } else if (salario <= 1500) {
            imposto = salario * 3 / 100;
            sindicato = salario * 11 / 100;
            desconto = salario * 5 / 100;

        } else if (salario <= 2500) {
            imposto = salario * 3 / 100;
            sindicato = salario * 11 / 100;
            desconto = salario * 10 / 100;

        } else if (salario > 2500) {
            imposto = salario * 3 / 100;
            sindicato = salario * 11 / 100;
            desconto = salario * 20 / 100;

            salarioLiquido = salario - imposto - sindicato - desconto;
            System.out.println("Salario Bruto :" + "(" + valorHoras + " * " + qutDeHoras + ")");
            System.out.println("imposto .: " + imposto);
            System.out.println("sindicato " + sindicato);
            System.out.println("desconto " + desconto);
            System.out.println("novo salario aplicado " + salarioLiquido);

        }
    }
}
