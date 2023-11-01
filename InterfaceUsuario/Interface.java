package InterfaceUsuario;
import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Interface {
    public static void main(String[] args){
        JFrame frame = new JFrame("Botão Legal!"); // Jframe é uma janela
        //Janela = apresenta a interface da aplicação

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
         contentPane.setLayout(new FlowLayout());//
         //Container serve para agrupar e exibir componentes
        
        JLabel label = new JLabel("Olha só esse botão: ");
        contentPane.add(label);
        //Painel = intermediário que possui um layout para os seus componentes.

        JButton button = new JButton("Não clica");
        //Cria um botão

        contentPane.add(button);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}