package CursoLoianeGroner.Exercicio15a25;

import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String letra;
        System.out.println("entre com uma letra ");
        letra = entrada.next();
        if (letra.equalsIgnoreCase("a") ||
                letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") ||
                letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("o") ){
            System.out.println("vogal ");

        } else{
            System.out.println("consoante ");
        }



        switch (letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("vogal ");break;
            default:
                System.out.println("consoante ");




        }
    }
}
