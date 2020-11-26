package CursoLoianeGroner;

import java.util.Scanner;

public class turnoAulas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String m="", v="", n="";
        System.out.println("digite o seu turno  de m - v - n ");
        String turno = entrada.next();
        if (turno == m) {
            System.out.println("bom dia !!.:"+m);

        }
       else if (turno == v) {
            System.out.println("boa tarde !!.:"+v);

        }
        else if (turno == n) {
            System.out.println("boa noite !!.:"+n);


        }
    }
}