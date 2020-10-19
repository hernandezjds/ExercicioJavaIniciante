package Logica2020;

import java.util.Scanner;

public class estruturaEnquanto03 {
    public static void main(String[] args) {
        int senha;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite sua senha..:");
        senha = entrada.nextInt();
        while (senha != 2002){
                System.out.println("acesso negado tente novamente ");
                senha = entrada.nextInt();
        }
        System.out.println("acesso permitido ");
    }
}
