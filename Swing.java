package com.eonsahead.swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import javax.swing.JFrame;

public class Swing extends JFrame {
    
    private final int FRAME_WIDTH = 512;
    private final int FRAME_HEIGHT = 512;
    private final String FRAME_TITLE = "Try not to get dizzy challenge";

    private final SwingPanel panel;
    private BufferedImage image;

    public Swing() {
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setTitle(FRAME_TITLE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        int imageType = BufferedImage.TYPE_INT_RGB;
        this.image = new BufferedImage( FRAME_WIDTH, FRAME_HEIGHT, imageType );

        Container pane = this.getContentPane();
        this.panel = new SwingPanel();
        pane.add(panel);
        this.panel.setBackground(Color.CYAN);
        int [] yellow = { 255, 255, 0 };
        WritableRaster raster = this.image.getRaster();
        
        for (int i = 0; i < FRAME_WIDTH; i++){
            for (int j = 0; j < FRAME_WIDTH; j++){
            raster.setPixel(i,j,yellow);
            }
        }
        
        this.setVisible(true);
    } // Swing()


    public static void main(String[] args) {
        Swing swing = new Swing();
        SimpleBitmap bitmap = new SimpleBitmap();
    } // main( String [] )

} // Swing
