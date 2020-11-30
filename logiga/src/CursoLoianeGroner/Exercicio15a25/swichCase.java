package CursoLoianeGroner.Exercicio15a25;

import java.util.Scanner;

public class swichCase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

    System.out.println("digite o dia da semana de 1 - 7");
        int diaSemana = entrada.nextInt();
        switch (diaSemana){
            case 1: System.out.println("domingo"); break;
            case 2: System.out.println("segunda"); break;
            case 3: System.out.println("terça"); break;
            case 4: System.out.println("quarta"); break;
            case 5: System.out.println("quinta"); break;
            case 6: System.out.println("sexta"); break;
            case 7: System.out.println("sabado"); break;
            default:
                System.out.println("nao e um dia da semana valido");





        }
    }
}
