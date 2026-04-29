/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package balatti_geronimi_javagui;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author FABLAB
 */
public class ImageLabel extends JLabel {

    private Image immagine;
    String percorso = "indirizzo...";
    boolean adatta = false;

    public ImageLabel (){
        super();
        setText(null);
        setPreferredSize(new Dimension(50, 50));
        setOpaque(false);
    }
    
    public String getImmagine() {
        return percorso;
    }

    public void setImmagine(String percorso) {
        this.percorso = percorso;
        this.immagine = new ImageIcon(percorso).getImage();
        repaint();
    }

    public boolean isAdatta() {
        return adatta;
    }

    public void setAdatta(boolean adatta) {
        this.adatta = adatta;
        repaint();
    }

    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (immagine != null) {
            Graphics2D graficaLabel = (Graphics2D) g;
            graficaLabel.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            if(adatta){
                graficaLabel.drawImage(immagine, 0, 0, getWidth(), getHeight(), this);
            }else{
                int larghezzaPnl = getWidth();
                int altezzaPnl = getHeight();
                int larghezzaImg = immagine.getWidth(this);
                int altezzaImg = immagine.getHeight(this);
                double rapportoX = (double) larghezzaPnl / larghezzaImg;
                double rapportoY = (double) altezzaPnl / altezzaImg;
                double rapporto = Math.min(rapportoX, rapportoY);
                int nuovaLarghezza = (int) (larghezzaImg * rapporto);
                int nuovaAltezza = (int) (altezzaImg * rapporto);
                int x = (larghezzaPnl - nuovaLarghezza) / 2;
                int y = (altezzaPnl - nuovaAltezza) / 2;
                graficaLabel.drawImage(immagine, x, y, nuovaLarghezza, nuovaAltezza, this);
            }
        }   
    }
}
