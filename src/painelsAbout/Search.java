package painelsAbout;

import javax.swing.*;
import java.awt.*;

public class Search extends JPanel {

    private JTextField jtfPesquisar;
    private JButton jbPesquisar;
    private JLabel jlFundoPesquisar;

    public Search() {
        super();
        setSize(815, 538);
        setLayout(null);
        iniciarComponentes();
        criarEventos();
    }

    private void iniciarComponentes() {
        jlFundoPesquisar = new JLabel();
        jlFundoPesquisar.setIcon(new ImageIcon(getClass().getResource("/imagens/backgroundSearch.png")));

        Font fonte = new Font("Arial", Font.PLAIN, 18);

        jtfPesquisar = new JTextField();
        add(jtfPesquisar);
        jtfPesquisar.setFont(fonte);
        jtfPesquisar.setBounds(80, 85, 600, 38);
        jtfPesquisar.setOpaque(false);
        jtfPesquisar.setBorder(null);

        jbPesquisar = new JButton();
        add(jbPesquisar);
        jbPesquisar.setBounds(680, 85, 38, 38);
        jbPesquisar.setOpaque(false);
        jbPesquisar.setBorder(null);
        jbPesquisar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jbPesquisar.setBackground(new Color(0,0,0,0));
        jbPesquisar.setContentAreaFilled(false);

        add(jlFundoPesquisar);
        jlFundoPesquisar.setBounds(0,0,800,500);


    }

    private void criarEventos() {

    }


}
