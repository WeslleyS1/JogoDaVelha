package jogodavelha;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.*;
// Coloca um * porque sempre que for usar algo da biblioteca Swing e importa tudo quando for usar.

public class JogoDaVelha extends JFrame {

    JButton[] button = new JButton[9];
    JLabel placar = new JLabel("Placar");
    JLabel px = new JLabel("Pontuação X : 0");
    JLabel po = new JLabel("Pontuação O : 0");
    int PointsX = 0;
    int PointsO = 0;
    boolean xo = false;
    boolean[] click = new boolean[9];

    public JogoDaVelha() {
        setVisible(true);
        setTitle("Jogo da Velha");
        setDefaultCloseOperation(3);
        setLayout(null);
        setBounds(400, 100, 1000, 800);
        add (placar);
        add(px);
        add(po);
        placar.setBounds(400,50,100,30);
        px.setBounds(400,75,100,30);
        po.setBounds(600,75,100,30);
        int cont = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                button[cont] = new JButton();
                add(button[cont]);
                button[cont].setBounds((100 * i) + 50, (100 * j) + 50, 100, 100);
                button[cont].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 102), 2));
                button[cont].setFont(new Font("Arial", Font.BOLD, 50));
                cont++;
            }
        }
        for (int i = 0; i < 9; i++) {
            click[i] = false;
        }
        button[0].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[0] == false) {
                    click[0] = true;
                    mudar(button[0]);
                }
            }
        });
        button[1].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[1] == false) {
                    click[1] = true;
                    mudar(button[1]);
                }
            }
        });
        button[2].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[2] == false) {
                    click[2] = true;
                    mudar(button[2]);
                }
            }
        });
        button[3].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[3] == false) {
                    click[3] = true;
                    mudar(button[3]);
                }
            }
        });
        button[4].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[4] == false) {
                    click[4] = true;
                    mudar(button[4]);
                }
            }
        });
        button[5].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[5] == false) {
                    click[5] = true;
                    mudar(button[5]);
                }
            }
        });
        button[6].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[6] == false) {
                    click[6] = true;
                    mudar(button[6]);
                }
            }
        });
        button[7].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[7] == false) {
                    click[7] = true;
                    mudar(button[7]);
                }
            }
        });
        button[8].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (click[8] == false) {
                    click[8] = true;
                    mudar(button[8]);
                }
            }
        });
    }

    public void mudar(JButton btn) {
        if (xo) {
            btn.setText("O");
            xo = false;
        } else {
            btn.setText("X");
            xo = true;
        } // Vai ficar alternando entre False e True.
        vencedor();
    }
    
    public void atualizarplacar(){
        px.setText("Pontuação X : " + PointsX);
        po.setText("Pontuação O : " + PointsO);
    }

    public void vencedor() {
        int cont = 0;
        for (int i = 0; i < 9; i++) {
            if (click[i] == true){
                cont++;
            }
        }
        if ((button[0].getText() == "X" && button[1].getText() == "X" && button[2].getText() == "X")
                || (button[3].getText() == "X" && button[4].getText() == "X" && button[5].getText() == "X")
                || (button[6].getText() == "X" && button[7].getText() == "X" && button[8].getText() == "X")
                || (button[0].getText() == "X" && button[3].getText() == "X" && button[6].getText() == "X")
                || (button[1].getText() == "X" && button[4].getText() == "X" && button[7].getText() == "X")
                || (button[2].getText() == "X" && button[5].getText() == "X" && button[8].getText() == "X")
                || (button[0].getText() == "X" && button[4].getText() == "X" && button[8].getText() == "X")
                || (button[6].getText() == "X" && button[4].getText() == "X" && button[2].getText() == "X")) {
            JOptionPane.showMessageDialog(null, "X ganhou");
            PointsX++;
            atualizarplacar();
            limparx();
        }else if ((button[0].getText() == "O" && button[1].getText() == "O" && button[2].getText() == "O")
                || (button[3].getText() == "O" && button[4].getText() == "O" && button[5].getText() == "O")
                || (button[6].getText() == "O" && button[7].getText() == "O" && button[8].getText() == "O")
                || (button[0].getText() == "O" && button[3].getText() == "O" && button[6].getText() == "O")
                || (button[1].getText() == "O" && button[4].getText() == "O" && button[7].getText() == "O")
                || (button[2].getText() == "O" && button[5].getText() == "O" && button[8].getText() == "O")
                || (button[0].getText() == "O" && button[4].getText() == "O" && button[8].getText() == "O")
                || (button[6].getText() == "O" && button[4].getText() == "O" && button[2].getText() == "O")) {
            JOptionPane.showMessageDialog(null, "O ganhou");
            PointsO++;
            atualizarplacar();
            limparo();
        }else if(cont == 9){
            JOptionPane.showMessageDialog(null, "Empate");
            limparx();
        }
    }
    public void limparx(){
        for (int i = 0; i < 9; i++) {
            button[i].setText("");
            click[i] = false;
            xo = false;
        }
    }
     public void limparo(){
        for (int i = 0; i < 9; i++) {
            button[i].setText("");
            click[i] = false;
            xo = true;
        }
    }
    
    public static void main(String[] args) {
        new JogoDaVelha();

    }
}
