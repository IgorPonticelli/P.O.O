package Teste;
import javax.swing.SwingUtilities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main {
    static Teste1 teste = new Teste1();
    public static void main(String[] args) {
        JFrame janela = new JFrame("Teste");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = janela.getContentPane(); 

        JLabel label = new JLabel("Método1()");

        JButton button = new JButton("Clique");

        contentPane.setLayout(new FlowLayout());
        contentPane.add(label);
        contentPane.add(button);


        
        janela.pack();
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        


    }    
}
