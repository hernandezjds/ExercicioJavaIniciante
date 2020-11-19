package CursoLoianeGroner;

import java.util.Scanner;

public class velocidadeDownload {
    public static void main(String[] args) {
        double tamanhoA, velocidaD,download;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite o tamanho do arquivo - ");
        tamanhoA = entrada.nextDouble();
        System.out.println("digite sua velocidade - ");
        velocidaD = entrada.nextDouble();
        download = tamanhoA / velocidaD;
        System.out.println("o arquivo sera baixa em ate " +download+ " minutos");

    }
}
