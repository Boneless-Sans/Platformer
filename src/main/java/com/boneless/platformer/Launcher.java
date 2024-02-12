package com.boneless.platformer;

import javax.swing.*;

public class Launcher extends JFrame {
    public Launcher(){
        initUI();
        setVisible(true);
    }
    private void initUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        dispose();
        new MapMaker();
    }
    public static void main(String[] args){
        new Launcher();
    }
}