package com.boneless.platformer;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JFrame implements KeyListener {
    private JPanel[] mapObjects;
    private boolean runGame;
    public Game(){
        initGame();
        setVisible(true);
        startThread();
    }
    private void initGame(){
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle(String.valueOf(this));
    }
    @SuppressWarnings({"BusyWait", "CallToPrintStackTrace"})
    private void startThread(){
        Thread gameLoop = new Thread(() -> {
            while(runGame){
                try {
                    updateFrame();
                    Thread.sleep(16);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
    }
    private void updateFrame(){
        //
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        char keyChar = e.getKeyChar();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}