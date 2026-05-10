package componenti;

import java.awt.*;
import javax.swing.*;

public class RoundTextFieldIcon extends RoundTextField {

    private Image immagineIcona;
    private int distanzaIcona = 15;
    double spazioOccupato = 0.40;
    
    public RoundTextFieldIcon() {
        super();
    }

    public void setIcona(Icon icona) {
        this.immagineIcona = ((ImageIcon) icona).getImage();
        aggiornaMargini();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (immagineIcona != null) {
            Graphics2D graficaTextFieldIcon = (Graphics2D) g.create();
            graficaTextFieldIcon.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int altezzaIcona = (int) (getHeight() * spazioOccupato);
            double rapporto = (double) immagineIcona.getWidth(null) / immagineIcona.getHeight(null);
            int larghezzaIcona = (int) (altezzaIcona * rapporto);
            int y = (getHeight() - altezzaIcona) / 2;
            graficaTextFieldIcon.drawImage(immagineIcona, distanzaIcona, y, larghezzaIcona, altezzaIcona, null);
            graficaTextFieldIcon.dispose();
        }
    }

    private void aggiornaMargini() {
    int margineBase = getRaggio() / 3;
    int larghezzaIconaStimata = 24; 
    int margineSinistro = distanzaIcona + larghezzaIconaStimata + 10;
    setBorder(new javax.swing.border.EmptyBorder(0, margineSinistro, 0, margineBase));
}

    @Override
    public void setRaggio(int raggio) {
        super.setRaggio(raggio);
        aggiornaMargini();
    }

    public double getSpazioOccupato() {
        return spazioOccupato;
    }

    public void setSpazioOccupato(double spazioOccupato) {
        this.spazioOccupato = spazioOccupato;
        aggiornaMargini();
        repaint();
    }

    public int getDistanzaIcona() {
        return distanzaIcona;
    }

    public void setDistanzaIcona(int distanzaIcona) {
        this.distanzaIcona = distanzaIcona;
        aggiornaMargini();
        repaint();
    }
    
}
