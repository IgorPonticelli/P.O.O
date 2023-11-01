package exemplo3;
import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new App());
    }
    public App() {
        JanelaPrincipal janela = new JanelaPrincipal();
        janela.setSize(400, 300);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}
