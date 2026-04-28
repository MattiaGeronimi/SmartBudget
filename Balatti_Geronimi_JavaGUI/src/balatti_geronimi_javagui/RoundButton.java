/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package balatti_geronimi_javagui;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author gabri
 */
public class RoundButton extends JButton {

    private int raggio = 20;
    private Color coloreBordo = Color.BLACK;

    public RoundButton() {
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);   
        setFocusPainted(false);
        setMargine();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graficaButton = (Graphics2D) g.create();
        graficaButton.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graficaButton.setColor(getBackground());
        graficaButton.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, raggio, raggio);
        graficaButton.dispose();
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D graficaButton = (Graphics2D) g.create();
        graficaButton.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graficaButton.setColor(coloreBordo);
        graficaButton.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, raggio, raggio);
        graficaButton.dispose();
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
