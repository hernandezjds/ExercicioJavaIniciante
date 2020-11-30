package CursoLoianeGroner.Exercicio15a25;

import java.util.Scanner;

public class letrasMF {
    public static void main(String[] args) {
        String letras;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite uma letra F - M ");
         letras = entrada.next();

        if (letras.equalsIgnoreCase("f")){
            System.out.println("F - Feminino ");
        }
       else if (letras.equalsIgnoreCase("m")){
            System.out.println("M - Masculino ");
        }
        else {
            System.out.println("sexo invalidos ");
        }

    }
}
