/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package balatti_geronimi_javagui;

import javax.swing.JPanel;
import java.awt.*;

/**
 *
 * @author gabri
 */
public class GradientPanel extends JPanel {
    private Color colore1 = Color.BLACK;
    private Color colore2 = Color.BLUE;
    
    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        java.awt.Graphics2D graficaPannello = (java.awt.Graphics2D) g;
        graficaPannello.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        int larghezza = getWidth();
        int altezza = getHeight();
        java.awt.GradientPaint gradiente = new java.awt.GradientPaint(0, 0, colore1, 0, altezza, colore2);
        graficaPannello.setPaint(gradiente);
        graficaPannello.fillRect(0, 0, larghezza, altezza);
    }

    public Color getColore1() {
        return colore1;
    }

    public void setColore1(Color colore1) {
        this.colore1 = colore1;
        repaint();
    }

    public Color getColore2() {
        return colore2;
    }

    public void setColore2(Color colore2) {
        this.colore2 = colore2;
        repaint();
    }
    
    
}
