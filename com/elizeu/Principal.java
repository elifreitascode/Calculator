package com.elizeu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal {

    private static final int ADICAO = 1;
    private static final int SUBTRACAO = 2;
    private static final int MULTIPLICACAO = 3;
    private static final int DIVISAO = 4;

    private static Float num1, num2;
    private static int operacao;


    public static void main(String[] args) {
        //JFrame
        JFrame tela = new JFrame("Calculadora");
        tela.setBounds(0, 0, 350, 600);
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tela.getContentPane().setLayout(new BorderLayout());

        //JPanel FlowLayout
        JPanel display = new JPanel();
        display.setPreferredSize(new Dimension(330, 60));
        display.setBackground(Color.GRAY);
        display.setLayout(new FlowLayout());

        //JTextField
        JTextField visor = new JTextField();
        visor.setFont(new Font("Arial", Font.PLAIN, 20) {
        });
        visor.setPreferredSize(new Dimension(330, 50));
        display.add(visor);
        visor.setText("0");
        tela.getContentPane().add(display, BorderLayout.NORTH);

        //JPanel GridLayout
        JPanel botoes = new JPanel();
        botoes.setSize(330, 510);
        botoes.setBackground(Color.green);
        botoes.setLayout(new GridLayout(5, 4));

        //JButton 5 x 4
        JButton botao[][] = new JButton[5][4];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                //botao[i][j] = new JButton(i + "," + j);
                botao[i][j] = new JButton();
                botao[i][j].setPreferredSize(new Dimension(82, 102));
                botao[i][j].setFont(new Font("Arial", Font.BOLD, 30) {
                });
                botoes.add(botao[i][j]).setLocation(i, j);
            }
        }
        botao[0][0].setText("CE");
        botao[0][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = null;
                visor.setText("0");
            }
        });
        botao[0][1].setText("C");
        botao[0][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = null;
                num2 = null;
            }
        });

        botao[0][2].setText("<x");
        botao[0][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = visor.getText();
                if (!temp.isEmpty())
                    temp = temp.substring(0, temp.length() - 1);
                if (temp.isEmpty())
                    visor.setText("0");
                visor.setText(temp);
                if (temp.isEmpty())
                    visor.setText("0");
            }
        });
        botao[0][3].setText("/");
        botao[0][3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = DIVISAO;
                if (num1 == null) {
                    String temp = visor.getText();
                    temp = temp.replace(",", ".");
                    num1 = Float.parseFloat(temp);
                }

                if (!(num1 == null)) {
                    String temp = visor.getText();
                    temp = temp.replace(",", ".");
                    num1 = Float.parseFloat(temp);
                }
                visor.setText("0");
            }
        });
        botao[1][0].setText("7");
        botao[1][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = visor.getText();
                if (temp.equals("0"))
                    temp = "";
                visor.setText(temp + "7");
            }
        });
        botao[1][1].setText("8");
        botao[1][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = visor.getText();
                if (temp.equals("0"))
                    temp = "";
                visor.setText(temp + "8");
            }
        });
        botao[1][2].setText("9");
        botao[1][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = visor.getText();
                if (temp.equals("0"))
                    temp = "";
                visor.setText(temp + "9");
            }
        });
        botao[1][3].setText("*");
        botao[1][3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = MULTIPLICACAO;
                if (num1 == null) {
                    String temp = visor.getText();
                    temp = temp.replace(",", ".");
                    num1 = Float.parseFloat(temp);
                }

                if (!(num1 == null)) {
                    String temp = visor.getText();
                    temp = temp.replace(",", ".");
                    num1 = Float.parseFloat(temp);
                }
                visor.setText("0");
            }
        });
        botao[2][0].setText("4");
        botao[2][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = visor.getText();
                if (temp.equals("0"))
                    temp = "";
                visor.setText(temp + "4");
            }
        });
        botao[2][1].setText("5");
        botao[2][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = visor.getText();
                if (temp.equals("0"))
                    temp = "";
                visor.setText(temp + "5");
            }
        });
        botao[2][2].setText("6");
        botao[2][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = visor.getText();
                if (temp.equals("0"))
                    temp = "";
                visor.setText(temp + "6");
            }
        });
        botao[2][3].setText("-");
        botao[2][3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = SUBTRACAO;
                if (num1 == null) {
                    String temp = visor.getText();
                    temp = temp.replace(",", ".");
                    num1 = Float.parseFloat(temp);
                }

                if (!(num1 == null)) {
                    String temp = visor.getText();
                    temp = temp.replace(",", ".");
                    num1 = Float.parseFloat(temp);
                }
                visor.setText("0");
            }
        });
        botao[3][0].setText("1");
        botao[3][0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = visor.getText();
                if (temp.equals("0"))
                    temp = "";
                visor.setText(temp + "1");
            }
        });
        botao[3][1].setText("2");
        botao[3][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = visor.getText();
                if (temp.equals("0"))
                    temp = "";
                visor.setText(temp + "2");
            }
        });
        botao[3][2].setText("3");
        botao[3][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = visor.getText();
                if (temp.equals("0"))
                    temp = "";
                visor.setText(temp + "3");
            }
        });
        botao[3][3].setText("+");
        botao[3][3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacao = ADICAO;
                if (num1 == null) {
                    String temp = visor.getText();
                    temp = temp.replace(",", ".");
                    num1 = Float.parseFloat(temp);
                }

                if (!(num1 == null)) {
                    String temp = visor.getText();
                    temp = temp.replace(",", ".");
                    num1 = Float.parseFloat(temp);
                }
                visor.setText("0");
            }
        });
        botao[4][0].setText("+-");
        botao[4][1].setText("0");
        botao[4][1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = visor.getText();
                if (temp.equals("0"))
                    temp = "";
                visor.setText(temp + "0");
            }
        });
        botao[4][2].setText(",");
        botao[4][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = visor.getText();
                if (!temp.contains(","))
                    visor.setText(temp + ",");
            }
        });
        botao[4][3].setText("=");
        botao[4][3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (num2 == null) {
                    String temp = visor.getText();
                    temp = temp.replace(",", ".");
                    num2 = Float.parseFloat(temp);
                }

                if (!(num2 == null)) {
                    String temp = visor.getText();
                    temp = temp.replace(",", ".");
                    num2 = Float.parseFloat(temp);
                }

                Float resultado = num2;
                switch (operacao){
                    case ADICAO:
                        resultado = num1 + num2;
                        break;
                    case SUBTRACAO:
                        resultado = num1 - num2;
                        break;
                    case MULTIPLICACAO:
                        resultado = num1 * num2;
                        break;
                    case DIVISAO:
                        resultado = num1 / num2;
                        break;
                }
                visor.setText(resultado.toString().replace(".", ","));
                num1 = resultado;
            }
        });

        tela.getContentPane().add(botoes, BorderLayout.CENTER);

        tela.pack();

        tela.setVisible(true);
    }
}