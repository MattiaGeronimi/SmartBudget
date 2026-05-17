package codice;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
import componenti.PaletteColori;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author matge
 */
public class PnlMenu extends javax.swing.JPanel {

    //Variabile per contenere il frame padre
    private FrmHome frame;
    //Dichiarazione Font per le voci del Menu
    public Font font = new java.awt.Font("Montserrat Bold", java.awt.Font.PLAIN, 24);
    /**
     * Creates new form PnlMenu
     */
    public PnlMenu() 
    {
        initComponents(); 
    }
    
    // <editor-fold defaultstate="collapsed" desc="METODO DISEGNA COMBOBOX">
    public void disegnaComboBox(JComboBox<?> combo, ColorMode tema) //JComboBox<?> serve per prendere una combobox come parametro 
    {
        //Impostazione colori in base al tema
        Color backColor;
        Color textColor;
        if(tema == ColorMode.SCURO)
        {
            backColor = PaletteColori.NERO; 
            textColor = PaletteColori.BIANCO;
        }
        else
        {
            backColor = PaletteColori.BIANCO;
            textColor = PaletteColori.NERO;
        }
        Color c2 = frame.coloreSecondario;
        
        combo.setFont(font);
        combo.setBackground(backColor);
        combo.setForeground(textColor);
        combo.setFocusable(false);
        combo.setOpaque(false);
        
        combo.setRenderer(new DefaultListCellRenderer()    //Modifica il Renderer della tendina che si apre nella Combobox
            {
                @Override
                public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                    JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                    label.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));       //Bordo
                    label.setFont(font);                                    //Font
                    label.setHorizontalAlignment(SwingConstants.CENTER);    //Allineamento orizzontale
                    if (isSelected)     //Colora l'opzione selezionata
                    {       
                        label.setForeground(c2);    //Testo in colore secondario
                        label.setBackground(backColor);
                    } 
                    else 
                    {
                        // Colore normale
                        label.setBackground(backColor);
                        label.setForeground(textColor);
                    }
                    return label;
                }      
            }
        );
        
        combo.setUI(new javax.swing.plaf.basic.BasicComboBoxUI()       
            {
                @Override
                protected JButton createArrowButton()   //Modifica il bottone contenente la freccia della Combobox
                {
                    JButton flatButton = new JButton("▼"); 
                    flatButton.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
                    flatButton.setContentAreaFilled(false);
                    flatButton.setFocusPainted(false);
                    flatButton.setOpaque(false);
                    flatButton.setBackground(backColor);
                    flatButton.setForeground(textColor);
                    return flatButton;
                }

                @Override
                public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {
                    //Sovrascrivo il metodo lasciandolo vuoto per impedire il disegno di un rettangolo grigio di base
                    //che si mostrerebbe come bordo nel design attuale
                }              
            }
        );
    }
     // </editor-fold>
    
    public JComboBox<String> getjComboBoxTema() {
        return jComboBoxTema;
    }

    public JComboBox<String> getjComboBoxValuta() {
        return jComboBoxValuta;
    }
    
    
    
    //Imposta il colore del testo di tutte le voci del menu
    public void setLabelsColor(Color c)
    {
        lblColorMode.setForeground(c);
        jLabel4.setForeground(c);
        jLabel5.setForeground(c);
        jLabel6.setForeground(c);
        jLabel7.setForeground(c);
    }
    
    //Imposta attributo frame, metodo richiamato dal frame stesso
    public void setFrame(FrmHome frame)
    {
        this.frame = frame;
    }
    
    //Imposta font personalizzato a tutte le voci del menu
    public void setFont()
    {
        lblColorMode.setFont(font);
        jLabel4.setFont(font);
        jLabel5.setFont(font);
        jLabel6.setFont(font);
        jLabel7.setFont(font);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblColorMode = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jComboBoxTema = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jComboBoxValuta = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(14, 17, 17));
        setMaximumSize(new java.awt.Dimension(200, 700));
        setMinimumSize(new java.awt.Dimension(200, 700));
        setPreferredSize(new java.awt.Dimension(200, 700));

        lblColorMode.setBackground(new java.awt.Color(14, 17, 17));
        lblColorMode.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblColorMode.setForeground(new java.awt.Color(255, 255, 255));
        lblColorMode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblColorMode.setText("SCURO");
        lblColorMode.setMaximumSize(new java.awt.Dimension(200, 100));
        lblColorMode.setMinimumSize(new java.awt.Dimension(200, 0));
        lblColorMode.setPreferredSize(new java.awt.Dimension(200, 75));
        lblColorMode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblColorModeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblColorModeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblColorModeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblColorModeMousePressed(evt);
            }
        });
        add(lblColorMode);

        jSeparator1.setMaximumSize(new java.awt.Dimension(100, 10));
        jSeparator1.setMinimumSize(new java.awt.Dimension(100, 0));
        jSeparator1.setPreferredSize(new java.awt.Dimension(100, 5));
        add(jSeparator1);

        jPanel1.setMaximumSize(new java.awt.Dimension(200, 100));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 0));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 75));

        jComboBoxTema.setBackground(new java.awt.Color(255, 0, 51));
        jComboBoxTema.setForeground(PaletteColori.NERO);
        jComboBoxTema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VERDE", "ROSSO", "BLU" }));
        jComboBoxTema.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jComboBoxTema.setFocusable(false);
        jComboBoxTema.setPreferredSize(new java.awt.Dimension(175, 70));
        jComboBoxTema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBoxTemaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jComboBoxTemaMouseExited(evt);
            }
        });
        jComboBoxTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTemaActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxTema);

        add(jPanel1);

        jSeparator2.setMaximumSize(new java.awt.Dimension(100, 10));
        jSeparator2.setMinimumSize(new java.awt.Dimension(100, 0));
        jSeparator2.setPreferredSize(new java.awt.Dimension(100, 5));
        add(jSeparator2);

        jPanel2.setMaximumSize(new java.awt.Dimension(200, 100));
        jPanel2.setMinimumSize(new java.awt.Dimension(200, 0));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 75));

        jComboBoxValuta.setBackground(new java.awt.Color(255, 0, 51));
        jComboBoxValuta.setForeground(PaletteColori.NERO);
        jComboBoxValuta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "€", "$", "£", "¥" }));
        jComboBoxValuta.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jComboBoxValuta.setFocusable(false);
        jComboBoxValuta.setPreferredSize(new java.awt.Dimension(175, 70));
        jComboBoxValuta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBoxValutaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jComboBoxValutaMouseExited(evt);
            }
        });
        jComboBoxValuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxValutaActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxValuta);

        add(jPanel2);

        jSeparator3.setMaximumSize(new java.awt.Dimension(100, 10));
        jSeparator3.setMinimumSize(new java.awt.Dimension(100, 0));
        jSeparator3.setPreferredSize(new java.awt.Dimension(100, 5));
        add(jSeparator3);

        jLabel4.setBackground(new java.awt.Color(14, 17, 17));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("VOCI");
        jLabel4.setMaximumSize(new java.awt.Dimension(200, 100));
        jLabel4.setMinimumSize(new java.awt.Dimension(200, 0));
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 75));
        add(jLabel4);

        jSeparator4.setMaximumSize(new java.awt.Dimension(100, 10));
        jSeparator4.setMinimumSize(new java.awt.Dimension(100, 0));
        jSeparator4.setPreferredSize(new java.awt.Dimension(100, 5));
        add(jSeparator4);

        jLabel5.setBackground(new java.awt.Color(14, 17, 17));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("VOCI");
        jLabel5.setMaximumSize(new java.awt.Dimension(200, 100));
        jLabel5.setMinimumSize(new java.awt.Dimension(200, 0));
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 75));
        add(jLabel5);

        jSeparator5.setMaximumSize(new java.awt.Dimension(100, 10));
        jSeparator5.setMinimumSize(new java.awt.Dimension(100, 0));
        jSeparator5.setPreferredSize(new java.awt.Dimension(100, 5));
        add(jSeparator5);

        jLabel7.setBackground(new java.awt.Color(14, 17, 17));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setMaximumSize(new java.awt.Dimension(200, 100));
        jLabel7.setMinimumSize(new java.awt.Dimension(200, 0));
        jLabel7.setPreferredSize(new java.awt.Dimension(200, 75));
        add(jLabel7);

        jLabel6.setBackground(new java.awt.Color(14, 17, 17));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setMaximumSize(new java.awt.Dimension(200, 100));
        jLabel6.setMinimumSize(new java.awt.Dimension(200, 0));
        jLabel6.setPreferredSize(new java.awt.Dimension(200, 100));
        add(jLabel6);
    }// </editor-fold>//GEN-END:initComponents

    private void lblColorModeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblColorModeMouseClicked

    }//GEN-LAST:event_lblColorModeMouseClicked

    private void lblColorModeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblColorModeMousePressed
        frame.setTema();    //Cambia tema
        if(frame.getTema() == ColorMode.SCURO)      //Cambia colori della label
        {
            lblColorMode.setText("CHIARO"); 
            lblColorMode.setBackground(PaletteColori.NERO);
        }
        else
        {
            lblColorMode.setText("SCURO");
            lblColorMode.setBackground(PaletteColori.BIANCO);
        }
        frame.colorMode();      //Aggiorna tutti i colori al nuovo tema
    }//GEN-LAST:event_lblColorModeMousePressed

    private void lblColorModeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblColorModeMouseEntered
        lblColorMode.setForeground(frame.coloreSecondario);     //Hover con mouse, colore secondario     
    }//GEN-LAST:event_lblColorModeMouseEntered

    private void lblColorModeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblColorModeMouseExited
        if(frame.getTema() == ColorMode.SCURO)      //Resetta a colore normale dopo Hover
        {
            lblColorMode.setForeground(PaletteColori.BIANCO);
        }
        else
        {
            lblColorMode.setForeground(PaletteColori.NERO);
        }
    }//GEN-LAST:event_lblColorModeMouseExited

    private void jComboBoxTemaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxTemaMouseEntered
        jComboBoxTema.setForeground(frame.coloreSecondario);        //Hover con mouse, colore secondario
    }//GEN-LAST:event_jComboBoxTemaMouseEntered

    private void jComboBoxTemaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxTemaMouseExited
        if(frame.getTema() == ColorMode.SCURO)                      //Resetta a colore normale dopo Hover
        {
            jComboBoxTema.setForeground(PaletteColori.BIANCO);
        }
        else
        {
            jComboBoxTema.setForeground(PaletteColori.NERO);
        }
    }//GEN-LAST:event_jComboBoxTemaMouseExited

    private void jComboBoxTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTemaActionPerformed
        Object sceltaTema = jComboBoxTema.getSelectedItem();
        String colore = sceltaTema.toString();
        //Imposta il tema del colore secondario tra le opzioni della combobox
        switch(colore)
        {
            case "BLU":
                frame.coloreSecondario = PaletteColori.BLU;
                break;
            case "VERDE":
                frame.coloreSecondario = PaletteColori.VERDE;
                break;
            case "ROSSO":
                frame.coloreSecondario = PaletteColori.ROSSO;
                break;
            default:
                frame.coloreSecondario = PaletteColori.VERDE;
                break;
        }
        
        //Aggiorna colore e ridisegna frame
        frame.colorMode();
        frame.repaint();
    }//GEN-LAST:event_jComboBoxTemaActionPerformed

    private void jComboBoxValutaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxValutaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxValutaMouseEntered

    private void jComboBoxValutaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxValutaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxValutaMouseExited

    private void jComboBoxValutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxValutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxValutaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxTema;
    private javax.swing.JComboBox<String> jComboBoxValuta;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblColorMode;
    // End of variables declaration//GEN-END:variables
}
