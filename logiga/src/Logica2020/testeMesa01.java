package Logica2020;

import java.util.Scanner;

public class testeMesa01 {
    public static void main(String[] args) {
        int x=0,y=4;
        Scanner dados = new Scanner(System.in);
        while (x<3){
            y=y+2;
            x=x+1;
            System.out.println(+x+" - "+y);
        }

    }
}
