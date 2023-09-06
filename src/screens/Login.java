package screens;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {

    private  JLabel jlFundoLogin;

    private JTextField jtfCPF;
    private JPasswordField jpsSenha;
    private JButton jbLogar;

    public Login(String title) throws HeadlessException {
        super(title);
        setLayout(null);
        //Atributos da tela
        setSize(800,520);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        iniciarComponentes();
        criarEventos();

    }

    private void iniciarComponentes() {

        jtfCPF = new JTextField();
        jtfCPF.setBounds(490, 196, 250, 37);
        jtfCPF.setOpaque(false); //Deixa transparente
        jtfCPF.setBorder(null); //Remove borda

        //Estilizaçao da fonte
        Font font = jtfCPF.getFont();
        jtfCPF.setFont(new Font(font.getName(), Font.PLAIN, 18)); // Tamanho da fonte


        jpsSenha = new JPasswordField();
        jpsSenha.setBounds(490,299,240,37);
        jpsSenha.setOpaque(false); //deixa transparente
        jpsSenha.setBorder(null);//remove borda

        //Estilizaçao da fonte
        jpsSenha.setFont(new Font(font.getName(), Font.PLAIN, 18)); // Tamanho da fonte
        jpsSenha.setForeground(Color.gray); //  Muda a cor da fonte

        jbLogar = new JButton();
        jbLogar.setBounds(545,405,105,35);
        jbLogar.setOpaque(false); // Remove a cor de fundo do botao
        jbLogar.setContentAreaFilled(false); // Remover preenchimento
        jbLogar.setBorderPainted(false); // Remover borda

        //Adicionar na tela

        add(jtfCPF);
        add(jpsSenha);
        add(jbLogar);

        //Imagem de fundo
        jlFundoLogin = new JLabel();
        jlFundoLogin.setIcon(new ImageIcon(getClass().getResource("/imagens/backgroundLogin.png")));
        jlFundoLogin.setBounds(0,0,800,500);
        add(jlFundoLogin);

    }

    private void criarEventos() {
        jbLogar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MenuBar main = new MenuBar("ADVOCATE");
                main.setVisible(true);
                setVisible(false);
            }
        });

    }
    public static void main(String[] args) {

        //objeto

        Login login = new Login("Advocatelink");
        login.setVisible(true);

    }
}
