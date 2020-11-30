package CursoLoianeGroner.Exercicio15a25;

import java.util.Scanner;

public class salarioTabajara {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double porg=0,aumento=0,novosalario=0;
        System.out.println("digite o salario do colaborador .: ");
        double salario = entrada.nextDouble();

        if (salario <= 280){
            aumento = salario * 0.2;
            porg = 20;

        }
        else if (salario >= 280 && salario <= 700){
             aumento = salario * 0.15;
             porg = 15;

        }
        else if (salario >= 700 && salario <= 1500){
             aumento = salario * 0.1;
             porg = 10;

        }
        else if (salario >= 1500){
             aumento = salario * 0.05;
             porg=  5;

        }

        novosalario = salario + aumento;
        aumento =  novosalario - salario ;
        System.out.println("salario ante do aumento "+salario);
        System.out.println("percentual aplicado " +porg+"%");
        System.out.println("aumento  aplicado " +aumento);
        System.out.println("novo salario aplicado " +novosalario);
    }

}
