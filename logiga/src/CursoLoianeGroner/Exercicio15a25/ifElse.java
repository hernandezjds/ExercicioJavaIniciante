package CursoLoianeGroner.Exercicio15a25;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("entre com o valor so item ");
        double valor = entrada.nextDouble();
        if (valor <=10){
            System.out.println("esta barato, poder comprar ");
        }else if (valor > 10 && valor < 15){
            System.out.println("voce pode pedir um desconto ");
        }else if (valor >= 15 && valor < 17) {
            System.out.println("pode pesquisa mais ");
        }else{// valor >=17
            System.out.println("miuto caro ");

        }
    }
}
