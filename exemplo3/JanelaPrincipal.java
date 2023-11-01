package exemplo3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JanelaPrincipal extends JFrame {
    private int contador;
    private JButton botao;
    private JButton botao2;
    private JLabel rotulo;

    public JanelaPrincipal() {
        super("Exemplo 2");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        contador = 0;
        botao = new JButton("Clicar");

        botao.addActionListener(evento -> {
            contador++;
            rotulo.setText(Integer.toString(contador));
        });

        rotulo = new JLabel(Integer.toString(contador));
        botao2 = new JButton("Limpar");

        botao2.addActionListener(evento -> {
            contador = 0;
            rotulo.setText(Integer.toString(contador));
        });

        JPanel painel = new JPanel(new GridLayout(3,1));
        painel.add(botao);
        painel.add(rotulo);
        painel.add(botao2);
        add(painel);
    }

}