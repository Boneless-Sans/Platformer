package com.boneless.platformer;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class MapMaker extends JFrame {
    private int boardSizeX = 5;
    private int boardSizeY = 5;
    public MapMaker(){
        setup();
        setVisible(true);
    }
    private void setup(){
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle(String.valueOf(this));
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = 0;

        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.red);
        mainPanel.setPreferredSize(new Dimension(300,300));

        JLabel questionText = new JLabel("Please enter X and Y (can be changed later)");
        JTextField answerFieldX = new JTextField();
        JTextField answerFieldY = new JTextField();
        answerFieldX.setPreferredSize(new Dimension(50,25));
        answerFieldY.setPreferredSize(new Dimension(50,25));

        mainPanel.add(questionText);
        mainPanel.add(answerFieldX);
        mainPanel.add(answerFieldY);

        add(mainPanel, gbc);
    }
    private void initUI(){
        setLayout(new GridLayout(boardSizeX, boardSizeY,1,1));

    }
    private JButton createTile() {
        JButton button = new JButton();
        button.setFocusable(false);
        return button;
    }
}
