/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenti;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author gabri
 */
public class RoundButton extends JButton {

    private int raggio = 20;
    private Color coloreBordo = Color.BLACK;
    private Color coloreHover = null;
    private boolean hover = false;

    public RoundButton() {
        super();
        this.setBackground(Color.WHITE);
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setMargine();
        aggiungiListenerHover();
    }

    private void aggiungiListenerHover() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                hover = true;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                hover = false;
                repaint();
            }
        });
    }

    private Color getColoreHoverEffettivo() {
        if (coloreHover != null) {
            return coloreHover;
        }
        Color base = getBackground();
        float fattore = 0.85f;
        return new Color(
                (int) (base.getRed() * fattore),
                (int) (base.getGreen() * fattore),
                (int) (base.getBlue() * fattore)
        );
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graficaButton = (Graphics2D) g.create();
        graficaButton.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (hover) {
            graficaButton.setColor(getColoreHoverEffettivo());
        } else {
            graficaButton.setColor(getBackground());
        }
        graficaButton.fillRoundRect(1, 1, getWidth() - 2, getHeight() - 2, raggio, raggio);
        graficaButton.dispose();
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D graficaButton = (Graphics2D) g.create();
        graficaButton.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graficaButton.setColor(coloreBordo);
        graficaButton.drawRoundRect(1, 1, getWidth() - 3, getHeight() - 3, raggio, raggio);
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

    public Color getColoreHover() {
        return coloreHover;
    }

    public void setColoreHover(Color coloreHover) {
        this.coloreHover = coloreHover;
        repaint();
    }
}
