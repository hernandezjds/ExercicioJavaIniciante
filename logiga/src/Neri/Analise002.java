package Neri;

import javax.swing.*;

public class Analise002 {
    public static void main(String[] args) {
        int n1, n2, n3;
        String mensagem = "";
        n1 = Integer.parseInt(JOptionPane.showInputDialog("digite N1..:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("digite N2..:"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("digite N3..:"));
        if ((n1 >= n2) && (n1 >= n3)) {
            mensagem = mensagem + "o N1 e maior...: " + n1;

        } else if ((n2 >= n1) && (n2 >= n3))

            mensagem = mensagem + "\n o N2 e maior...: " + n2;


        else
            mensagem = mensagem + "\n o N3 e maior...: " + n3;
        {


            {
                if ((n1 <= n2) && (n1 <= n3))
                    mensagem = mensagem + "o N1 e menor...: "+n1;


                else if ((n2 <= n1) && (n2 <= n3))
                    mensagem = mensagem + "\n o N2 e menor...: "+n2;

                else
                    mensagem = mensagem + "\n o N3 e menor...: "+n3;
            }
                JOptionPane.showMessageDialog(null,mensagem);
        }
    }
}


