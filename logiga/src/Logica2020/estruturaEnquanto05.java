package Logica2020;

import java.util.Scanner;

public class estruturaEnquanto05 {
    public static void main(String[] args) {
        int codigo, alcool=0, gasolina=0, diesel=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe um codigo (1, 2, 3) ou 4 para parar");
        codigo = entrada.nextInt();
        while (codigo != 4) {
            if (codigo == 1)
                alcool++;
            else if (codigo == 2)
                gasolina++;
            else if (codigo == 3)
                diesel++;


            System.out.println("informe um codigo (1, 2, 3) ou 4 para parar");
            codigo = entrada.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("alcool ..: "+alcool);
        System.out.println("gasolina..: "+gasolina);
        System.out.println("diesel..: "+diesel);




       /* System.out.println("digite a alcool 1 gasolina 2 disiel 3 para sair 4");
        codigo = entrada.nextInt();
        while ( codigo != 4){
            System.out.println("muito obrigado");
            if (codigo <=1 || codigo >= 4){
                System.out.println("informe um codigo (1, 2, 3) ou 4 para parar");
                codigo = entrada.nextInt();
                alcool++;
                gasolina++;
                diesel++;
                System.out.println("alcool ..: "+alcool);
                System.out.println("gasolina..: "+gasolina);
                System.out.println("diesel..: "+diesel);
      */



            }



        }




