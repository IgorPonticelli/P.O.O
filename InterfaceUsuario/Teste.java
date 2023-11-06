package InterfaceUsuario;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.Highlighter.Highlight;


public class Teste {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Teste de mesa");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = janela.getContentPane();
        contentPane.setLayout(new FlowLayout());

        JLabel label = new JLabel("Olha só esse botão: ");
        contentPane.add(label);

        
        JButton button = new JButton("Não");
        JButton button2 = new JButton("clica");
        JButton button3 = new JButton("!");
        contentPane.add(button);
        contentPane.add(button2);
        contentPane.add(button3);

        janela.pack(); // Puxa um tamanho pré pronto
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);

        janela.setIconImage(null);
    }
    
}
