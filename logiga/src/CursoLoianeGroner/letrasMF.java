package CursoLoianeGroner;

import java.util.Scanner;

public class letrasMF {
    public static void main(String[] args) {
        char F=0,M=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite uma letra F - M ");
        char f = entrada.next().charAt(0);

        char m = entrada.next().charAt(0);

        if (F == 'f'){
            System.out.println("F - Feminino ");
        }
        if (M == 'm'){
            System.out.println("M - Masculino ");
        }
        else {
            System.out.println("sexo invalidos ");
        }

    }
}
