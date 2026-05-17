/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenti;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author gabri
 */
public class RoundPasswordField extends JPasswordField {
    private int raggio = 20;
    private Color coloreBordo = Color.BLACK;

    public RoundPasswordField() {
        super();
        setOpaque(false);                 
        setBackground(new Color(0,0,0,0));
        setMargine();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graficaPasswordField = (Graphics2D) g.create();
        graficaPasswordField.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graficaPasswordField.setColor(getBackground());
        graficaPasswordField.fillRoundRect(1, 1, getWidth() - 2, getHeight() - 2, raggio, raggio);
        graficaPasswordField.dispose();
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D graficaPasswordField = (Graphics2D) g.create();
        graficaPasswordField.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graficaPasswordField.setColor(coloreBordo);
        graficaPasswordField.drawRoundRect(1, 1, getWidth() - 3, getHeight() - 3, raggio, raggio);
        graficaPasswordField.dispose();
    }

    private void setMargine() {
        int margine = raggio / 3;
        setBorder(new EmptyBorder(0, margine, 0, margine));
    }

    public int getRaggio() {
        return raggio;
    }

    public void setRaggio(int raggio) {
        if (raggio < 0) {
            this.raggio = 0;
        } else {
            this.raggio = raggio;
        }
        setMargine();
        repaint();
    }

    public Color getColoreBordo() {
        return coloreBordo;
    }

    public void setColoreBordo(Color coloreBordo) {
        this.coloreBordo = coloreBordo;
        repaint();
    }
}
