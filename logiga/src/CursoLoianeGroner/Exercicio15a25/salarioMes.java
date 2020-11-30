package CursoLoianeGroner.Exercicio15a25;

import java.util.Scanner;

public class salarioMes {
    public static void main(String[] args) {
        double valorHoras, horasTrabalhadas, salarioFinal;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite valor da hora..: ");
        valorHoras = entrada.nextDouble();
        System.out.println("digite o quantidade de horas trabalhadas");
        horasTrabalhadas = entrada.nextDouble();
        salarioFinal = horasTrabalhadas * valorHoras;
        System.out.println("valor do salario e de ..: "+salarioFinal);

    }
}
