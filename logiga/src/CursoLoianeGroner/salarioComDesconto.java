package CursoLoianeGroner;

import java.util.Scanner;

public class salarioComDesconto {
    public static void main(String[] args) {
        double valorHoras, horasTrabalhadas, salarioFinal,inns,sindi,impostoRenda,salarioBruto;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite valor da hora..: ");
        valorHoras = entrada.nextDouble();
        System.out.println("digite o quantidade de horas trabalhadas");
        horasTrabalhadas = entrada.nextDouble();
        salarioFinal = horasTrabalhadas * valorHoras;
        inns = salarioFinal * 8/100;
        sindi = salarioFinal * 5/100;
        impostoRenda = salarioFinal * 11 /100;
        salarioFinal = salarioFinal - inns - impostoRenda - sindi;
        salarioBruto = salarioFinal + inns + impostoRenda + sindi;

        System.out.println("valor imposto de renda  "+impostoRenda);
        System.out.println("valor inss  "+inns);
        System.out.println("valor sindicato  "+sindi);
        System.out.println("valor do salario bruto ..:  "+salarioBruto);
        System.out.println("valor do salario liquido ..:  "+salarioFinal);

    }
}
