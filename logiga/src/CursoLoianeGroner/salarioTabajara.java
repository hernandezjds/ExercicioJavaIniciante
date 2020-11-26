package CursoLoianeGroner;

import java.util.Scanner;

public class salarioTabajara {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double porg=0,aumento=0,novosalario=0;
        System.out.println("digite o salario do colaborador .: ");
        double salario = entrada.nextDouble();
        System.out.println("salario ante do aumento "+salario);
        if (salario <= 280){
            aumento = (salario * 20)/100;

        }
        else if (salario >= 280 && salario <= 700){
             aumento = (salario * 15)/100;

        }
        else if (salario >= 700 && salario <= 1500){
             aumento = (salario * 10)/100;

        }
        else if (salario >= 1500){
             aumento = (salario * 5)/100;

        }
        aumento = salario - novosalario;
        novosalario = salario + aumento;
        System.out.println("percentual aplicado " +porg+"%");
        System.out.println("aumento  aplicado " +aumento);
        System.out.println("novo salario aplicado " +novosalario);
    }

}
