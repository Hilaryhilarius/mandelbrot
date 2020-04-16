package com.eonsahead.swing;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Simple extends JFrame{
    private static final int SIMPLE_WIDTH = 512;
    private static final int SIMPLE_HEIGHT = 512;
    private static final String SIMPLE_TITLE = "Simple";
    
    public Simple(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(SIMPLE_WIDTH, SIMPLE_HEIGHT);
        this.setTitle(SIMPLE_TITLE);
        
        Container pane = this.getContentPane();
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        pane.add(panel);
        
        this.setVisible(true);
    }
    public static void main(String[] args){
        Simple simple = new Simple();
    }
    
}
    