package codice;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import componenti.PaletteColori;
import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 *
 * @author matge
 */
public class FrmHome extends javax.swing.JFrame {

    /**
     * Creates new form FrmHome
     */
    //Font
    public Font fontSaldo = new java.awt.Font("Montserrat SemiBold", java.awt.Font.PLAIN, 50);
    

    // <editor-fold defaultstate="collapsed" desc="Import Icone/Immagini">
    //Menu
        //Icona menu chiara
        ImageIcon menuIconLight = new ImageIcon(getClass().getResource("/immagini/MenuIconLight.png"));
        Image menuIconScaledLight = menuIconLight.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        //Icona menu scura
        ImageIcon menuIconDark = new ImageIcon(getClass().getResource("/immagini/MenuIconDark.png"));
        Image menuIconScaledDark = menuIconDark.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
    
    //Home
        //Icona home chiara
        ImageIcon homeIconLight = new ImageIcon(getClass().getResource("/immagini/HomeIconLight.png"));
        Image homeIconScaledLight = homeIconLight.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        //Icona home scura
        ImageIcon homeIconDark = new ImageIcon(getClass().getResource("/immagini/HomeIconDark.png"));
        Image homeIconScaledDark = homeIconDark.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        //Icona home verde
        ImageIcon homeIconVerde = new ImageIcon(getClass().getResource("/immagini/HomeIconVerde.png"));
        Image homeIconScaledVerde = homeIconVerde.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        //Icona home rossa
        ImageIcon homeIconRossa = new ImageIcon(getClass().getResource("/immagini/HomeIconRosso.png"));
        Image homeIconScaledRossa = homeIconRossa.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        //Icona home Blu
        ImageIcon homeIconBlu = new ImageIcon(getClass().getResource("/immagini/HomeIconBlu.png"));
        Image homeIconScaledBlu = homeIconBlu.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
    
    //Piu
        //Icona piu chiara
        ImageIcon piuIconLight = new ImageIcon(getClass().getResource("/immagini/PiuIconLight.png"));
        Image piuIconScaledLight = piuIconLight.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        //Icona piu scura
        ImageIcon piuIconDark = new ImageIcon(getClass().getResource("/immagini/PiuIconDark.png"));
        Image piuIconScaledDark = piuIconDark.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        //Icona home verde
        ImageIcon piuIconVerde = new ImageIcon(getClass().getResource("/immagini/PiuIconVerde.png"));
        Image piuIconScaledVerde = piuIconVerde.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        //Icona home rossa
        ImageIcon piuIconRossa = new ImageIcon(getClass().getResource("/immagini/PiuIconRosso.png"));
        Image piuIconScaledRossa = piuIconRossa.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        //Icona home Blu
        ImageIcon piuIconBlu = new ImageIcon(getClass().getResource("/immagini/PiuIconBlu.png"));
        Image piuIconScaledBlu = piuIconBlu.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
    
    //Meno
        //Icona meno chiara
        ImageIcon menoIconLight = new ImageIcon(getClass().getResource("/immagini/MenoIconLight.png"));
        Image menoIconScaledLight = menoIconLight.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        //Icona meno scura
        ImageIcon menoIconDark = new ImageIcon(getClass().getResource("/immagini/MenoIconDark.png"));
        Image menoIconScaledDark = menoIconDark.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        //Icona home verde
        ImageIcon menoIconVerde = new ImageIcon(getClass().getResource("/immagini/MenoIconVerde.png"));
        Image menoIconScaledVerde = menoIconVerde.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        //Icona home rossa
        ImageIcon menoIconRossa = new ImageIcon(getClass().getResource("/immagini/MenoIconRosso.png"));
        Image menoIconScaledRossa = menoIconRossa.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        //Icona home Blu
        ImageIcon menoIconBlu = new ImageIcon(getClass().getResource("/immagini/MenoIconBlu.png"));
        Image menoIconScaledBlu = menoIconBlu.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
    
    //Incremento 
        //Icona incremento chiara
        ImageIcon increaseIconLight = new ImageIcon(getClass().getResource("/immagini/IncreaseIconLight.png"));
        Image increaseIconScaledLight = increaseIconLight.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        //Icona incremento scura
        ImageIcon increaseIconDark = new ImageIcon(getClass().getResource("/immagini/IncreaseIconDark.png"));
        Image increaseIconScaledDark = increaseIconDark.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        //Icona home verde
        ImageIcon increaseIconVerde = new ImageIcon(getClass().getResource("/immagini/IncreaseIconVerde.png"));
        Image increaseIconScaledVerde = increaseIconVerde.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        //Icona home rossa
        ImageIcon increaseIconRossa = new ImageIcon(getClass().getResource("/immagini/IncreaseIconRosso.png"));
        Image increaseIconScaledRossa = increaseIconRossa.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        //Icona home Blu
        ImageIcon increaseIconBlu = new ImageIcon(getClass().getResource("/immagini/IncreaseIconBlu.png"));
        Image increaseIconScaledBlu = increaseIconBlu.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH); 
    
    //Profilo
        //Icona profilo chiara
        ImageIcon profileIconLight = new ImageIcon(getClass().getResource("/immagini/ProfileIconLight.png"));
        Image profileIconScaledLight = profileIconLight.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        //Icona profilo scura
        ImageIcon profileIconDark = new ImageIcon(getClass().getResource("/immagini/ProfileIconDark.png"));
        Image profileIconScaledDark = profileIconDark.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
    
    // </editor-fold>
    

    //COSTRUTTORE FRAME   
    public FrmHome() 
    {
        RegistraFont();                             //Metodo per importare i Font 
        coloreSecondario = PaletteColori.VERDE;     //Imposto colore secondario di base
        initComponents();
        
        this.pack();                    //Per fare in modo che la dimensione dela finestra comprendi la barra messa da Windows
        setTitle("SmartBudget");        //Titolo
        
        jLabel1.setFont(fontSaldo);     //Imposta Font personalizzato al saldo
              
        // <editor-fold defaultstate="collapsed" desc="ICONA DELLA FINESTRA">
        URL iconURL = getClass().getResource("/immagini/icona.png");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        // </editor-fold>
                   
        // <editor-fold defaultstate="collapsed" desc="IMPOSTAZIONE BOTTONI">
        //Bottone Menu
        BtnMenu.setFocusPainted(false);
        BtnMenu.setBorderPainted(false);
        BtnMenu.setContentAreaFilled(false);
        BtnMenu.setOpaque(false);  
        
        //Bottone Home
        BtnHome.setFocusPainted(false);
        BtnHome.setBorderPainted(false);
        BtnHome.setContentAreaFilled(false);
        BtnHome.setOpaque(false); 
        
        //Bottone Piu
        BtnPiu.setFocusPainted(false);
        BtnPiu.setBorderPainted(false);
        BtnPiu.setContentAreaFilled(false);
        BtnPiu.setOpaque(false); 
        
        //Bottone Meno
        BtnMeno.setFocusPainted(false);
        BtnMeno.setBorderPainted(false);
        BtnMeno.setContentAreaFilled(false);
        BtnMeno.setOpaque(false); 
        
        //Bottone Incremento
        BtnIncrease.setFocusPainted(false);
        BtnIncrease.setBorderPainted(false);
        BtnIncrease.setContentAreaFilled(false);
        BtnIncrease.setOpaque(false);
        
        //Bottone Profilo
        BtnProfilo.setFocusPainted(false);
        BtnProfilo.setBorderPainted(false);
        BtnProfilo.setContentAreaFilled(false);
        BtnProfilo.setOpaque(false); 
        // </editor-fold>
        
        // <editor-fold defaultstate="collapsed" desc="IMPOSTAZIONE SCROLLPANEL">
        ScrollPnlTransazioni.getViewport().setOpaque(false);
        ScrollPnlTransazioni.setViewportBorder(BorderFactory.createEmptyBorder());
        ScrollPnlTransazioni.setOpaque(false);
        ScrollPnlTransazioni.setBorder(BorderFactory.createEmptyBorder());
        ScrollPnlTransazioni.getVerticalScrollBar().setUnitIncrement(10);
        PnlContainerScroll.setOpaque(false);
        PnlContainerScroll.setBackground(new Color(0,0,0,0));
  
        for(int i = 0; i< 5 ; i++)
        {
            PnlTransazione p = new PnlTransazione();
            PnlContainerScroll.add(p);
            PnlContainerScroll.add(Box.createRigidArea(new Dimension(0, 9)));   
        }
        // </editor-fold>
        
        //Card Layout
        card = (CardLayout) PnlScheda.getLayout();

        
        // <editor-fold defaultstate="collapsed" desc="IMPOSTAZIONI MENU LATERALE">
        //Pannello menu
        menu.setBounds(-200, 100, 200, 700);        //Disegna il menu fuori dallo schermo,
        menu.setVisible(false);                     //Non visibile,
        PnlLayer.add(menu, Integer.valueOf(1));     //In un layer alto
        menu.setFrame(this);
        menu.disegnaComboBox(menu.getjComboBoxTema(), tema);
        menu.disegnaComboBox(menu.getjComboBoxValuta(), tema);
        menu.setFont();
        // </editor-fold>
        
        //Imposta modalita di visualizzazione colori
        this.colorMode();
        
    }
    
    
    private void RegistraFont() 
    {
        //Importa i Font non presenti
        try 
        {
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT,getClass().getResourceAsStream("/fonts/Montserrat-Regular.ttf")));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT,getClass().getResourceAsStream("/fonts/Montserrat-Bold.ttf")));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT,getClass().getResourceAsStream("/fonts/Montserrat-SemiBold.ttf")));
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="METODO IMPOSTAZIONI COLORMODE colorMode()">
    //Imposta i colori seguendo il tema attualmente selezionato
    public void colorMode()
    {
        if(tema == ColorMode.CHIARO)
        {
            PnlHeader.setBackground(PaletteColori.BIANCO);
            PnlHome.setColore1(PaletteColori.BIANCO);
            PnlResoconto.setColore1(PaletteColori.BIANCO);
            PnlEntrata.setColore1(PaletteColori.BIANCO);
            PnlUscita.setColore1(PaletteColori.BIANCO);            
            menu.setBackground(PaletteColori.BIANCO);
            MenuBar.setBackground(PaletteColori.BIANCO);
            MenuBar.setColoreBordo(PaletteColori.BIANCO);
            menu.setLabelsColor(PaletteColori.NERO);
            jLabel1.setForeground(PaletteColori.NERO);
            BtnMenu.setIcon(new ImageIcon(menuIconScaledDark));
            BtnHome.setIcon(new ImageIcon(homeIconScaledDark));
            BtnPiu.setIcon(new ImageIcon(piuIconScaledDark));
            BtnMeno.setIcon(new ImageIcon(menoIconScaledDark));
            BtnIncrease.setIcon(new ImageIcon(increaseIconScaledDark));
            BtnProfilo.setIcon(new ImageIcon(profileIconScaledDark));
        }
        else
        {
            PnlHeader.setBackground(PaletteColori.NERO);
            PnlHome.setColore1(PaletteColori.NERO);
            PnlResoconto.setColore1(PaletteColori.NERO);
            PnlEntrata.setColore1(PaletteColori.NERO);
            PnlUscita.setColore1(PaletteColori.NERO);    
            menu.setBackground(PaletteColori.NERO);
            MenuBar.setBackground(PaletteColori.NERO);
            MenuBar.setColoreBordo(PaletteColori.NERO);
            menu.setLabelsColor(PaletteColori.BIANCO);
            jLabel1.setForeground(PaletteColori.BIANCO);
            BtnMenu.setIcon(new ImageIcon(menuIconScaledLight));
            BtnHome.setIcon(new ImageIcon(homeIconScaledLight));
            BtnPiu.setIcon(new ImageIcon(piuIconScaledLight));
            BtnMeno.setIcon(new ImageIcon(menoIconScaledLight));
            BtnIncrease.setIcon(new ImageIcon(increaseIconScaledLight));
            BtnProfilo.setIcon(new ImageIcon(profileIconScaledLight));
        } 
        
        Container sc = (Container) ScrollPnlTransazioni.getViewport().getView();
        Component[] transazioni = sc.getComponents();
        
        for(Component transazione : transazioni)
        {
            if (transazione instanceof PnlTransazione)
                ((PnlTransazione) transazione).setColorMode(this.getTema());
        }
        
        menu.disegnaComboBox(menu.getjComboBoxTema(), tema);
        menu.disegnaComboBox(menu.getjComboBoxValuta(), tema);
        PnlHome.setColore2(coloreSecondario);
        PnlResoconto.setColore2(coloreSecondario);
        PnlEntrata.setColore2(coloreSecondario);
        PnlUscita.setColore2(coloreSecondario);
        PnlBottomMenu.setBackground(coloreSecondario);
        this.setMenuBarIcon();
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="METODO IMPOSTAZIONI ICONE MENUBAR setMenuBarIcon()">
    public void setMenuBarIcon()
    {
       
        if(selectedCard == "home")
        {
            if(coloreSecondario == PaletteColori.ROSSO)
            {
                BtnHome.setIcon(new ImageIcon(homeIconScaledRossa));
            }
            else if(coloreSecondario == PaletteColori.BLU)
            {
                BtnHome.setIcon(new ImageIcon(homeIconScaledBlu));
            }
            else
            {
                BtnHome.setIcon(new ImageIcon(homeIconScaledVerde));
            }
        }
        else if (selectedCard == "entrata")
        {
            if(coloreSecondario == PaletteColori.ROSSO)
            {
                BtnPiu.setIcon(new ImageIcon(piuIconScaledRossa));
            }
            else if(coloreSecondario == PaletteColori.BLU)
            {
                BtnPiu.setIcon(new ImageIcon(piuIconScaledBlu));
            }
            else
            {
                BtnPiu.setIcon(new ImageIcon(piuIconScaledVerde));
            }
        }
        else if (selectedCard == "uscita")
        {
            if(coloreSecondario == PaletteColori.ROSSO)
            {
                BtnMeno.setIcon(new ImageIcon(menoIconScaledRossa));
            }
            else if(coloreSecondario == PaletteColori.BLU)
            {
                BtnMeno.setIcon(new ImageIcon(menoIconScaledBlu));
            }
            else
            {
                BtnMeno.setIcon(new ImageIcon(menoIconScaledVerde));
            }
        }
        else if (selectedCard == "resoconto")
        {
            if(coloreSecondario == PaletteColori.ROSSO)
            {
                BtnIncrease.setIcon(new ImageIcon(increaseIconScaledRossa));
            }
            else if(coloreSecondario == PaletteColori.BLU)
            {
                BtnIncrease.setIcon(new ImageIcon(increaseIconScaledBlu));
            }
            else
            {
                BtnIncrease.setIcon(new ImageIcon(increaseIconScaledVerde));
            }
        }
        
        
    }
    // </editor-fold>
       
    //Cambia tema
    public void setTema()
    {
        if(tema == ColorMode.SCURO)
        {
            tema = ColorMode.CHIARO;
        }
        else
        {
            tema = ColorMode.SCURO;
        }
    }
    
    //Restituisce il tema attualmente selezionato
    public ColorMode getTema()
    {
        return tema;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlFinestra = new javax.swing.JPanel();
        PnlLayer = new javax.swing.JLayeredPane();
        PnlContenuto = new javax.swing.JPanel();
        PnlHeader = new javax.swing.JPanel();
        BtnMenu = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(220, 100), new java.awt.Dimension(0, 0));
        BtnProfilo = new javax.swing.JButton();
        PnlBottomMenu = new javax.swing.JPanel();
        MenuBar = new componenti.RoundPanel();
        BtnHome = new javax.swing.JButton();
        BtnPiu = new javax.swing.JButton();
        BtnMeno = new javax.swing.JButton();
        BtnIncrease = new javax.swing.JButton();
        PnlScheda = new javax.swing.JPanel();
        PnlHome = new componenti.GradientPanel();
        PnlSaldo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ScrollPnlTransazioni = new javax.swing.JScrollPane();
        PnlContainerScroll = new javax.swing.JPanel();
        PnlEntrata = new componenti.GradientPanel();
        PnlResoconto = new componenti.GradientPanel();
        PnlUscita = new componenti.GradientPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.darkGray);
        setMinimumSize(new java.awt.Dimension(420, 800));
        setResizable(false);

        PnlFinestra.setMaximumSize(new java.awt.Dimension(420, 800));
        PnlFinestra.setMinimumSize(new java.awt.Dimension(420, 800));
        PnlFinestra.setOpaque(false);
        PnlFinestra.setPreferredSize(new java.awt.Dimension(420, 800));

        PnlLayer.setMaximumSize(new java.awt.Dimension(420, 800));
        PnlLayer.setMinimumSize(new java.awt.Dimension(420, 800));

        PnlContenuto.setBackground(java.awt.Color.darkGray);
        PnlContenuto.setMaximumSize(new java.awt.Dimension(420, 800));
        PnlContenuto.setMinimumSize(new java.awt.Dimension(420, 800));
        PnlContenuto.setOpaque(false);
        PnlContenuto.setPreferredSize(new java.awt.Dimension(420, 800));

        PnlHeader.setBackground(new java.awt.Color(14, 17, 17));
        PnlHeader.setMaximumSize(new java.awt.Dimension(420, 100));
        PnlHeader.setMinimumSize(new java.awt.Dimension(420, 100));
        PnlHeader.setPreferredSize(new java.awt.Dimension(420, 100));

        BtnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMenu.setMaximumSize(new java.awt.Dimension(100, 100));
        BtnMenu.setMinimumSize(new java.awt.Dimension(100, 100));
        BtnMenu.setPreferredSize(new java.awt.Dimension(100, 100));
        BtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuActionPerformed(evt);
            }
        });

        BtnProfilo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnProfilo.setMaximumSize(new java.awt.Dimension(100, 100));
        BtnProfilo.setMinimumSize(new java.awt.Dimension(100, 100));
        BtnProfilo.setPreferredSize(new java.awt.Dimension(100, 100));
        BtnProfilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProfiloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlHeaderLayout = new javax.swing.GroupLayout(PnlHeader);
        PnlHeader.setLayout(PnlHeaderLayout);
        PnlHeaderLayout.setHorizontalGroup(
            PnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlHeaderLayout.createSequentialGroup()
                .addComponent(BtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnProfilo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PnlHeaderLayout.setVerticalGroup(
            PnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addGroup(PnlHeaderLayout.createSequentialGroup()
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(BtnProfilo, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        );

        PnlBottomMenu.setBackground(PaletteColori.VERDE);
        PnlBottomMenu.setMaximumSize(new java.awt.Dimension(420, 100));
        PnlBottomMenu.setMinimumSize(new java.awt.Dimension(420, 100));
        PnlBottomMenu.setPreferredSize(new java.awt.Dimension(420, 100));
        PnlBottomMenu.setLayout(new java.awt.GridBagLayout());

        MenuBar.setBackground(new java.awt.Color(0, 0, 0));
        MenuBar.setMaximumSize(new java.awt.Dimension(380, 80));
        MenuBar.setMinimumSize(new java.awt.Dimension(380, 80));
        MenuBar.setPreferredSize(new java.awt.Dimension(380, 80));
        MenuBar.setRaggio(50);
        MenuBar.setLayout(new java.awt.GridLayout(1, 0));

        BtnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHomeActionPerformed(evt);
            }
        });
        MenuBar.add(BtnHome);

        BtnPiu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnPiu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPiuActionPerformed(evt);
            }
        });
        MenuBar.add(BtnPiu);

        BtnMeno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnMeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenoActionPerformed(evt);
            }
        });
        MenuBar.add(BtnMeno);

        BtnIncrease.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnIncrease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIncreaseActionPerformed(evt);
            }
        });
        MenuBar.add(BtnIncrease);

        PnlBottomMenu.add(MenuBar, new java.awt.GridBagConstraints());

        PnlScheda.setLayout(new java.awt.CardLayout());

        PnlHome.setColore1(new java.awt.Color(14, 17, 17));
        PnlHome.setColore2(new java.awt.Color(37, 178, 146));
        PnlHome.setMaximumSize(new java.awt.Dimension(420, 600));
        PnlHome.setMinimumSize(new java.awt.Dimension(420, 600));
        PnlHome.setPreferredSize(new java.awt.Dimension(420, 600));

        PnlSaldo.setBackground(java.awt.Color.black);
        PnlSaldo.setMaximumSize(new java.awt.Dimension(420, 200));
        PnlSaldo.setMinimumSize(new java.awt.Dimension(420, 200));
        PnlSaldo.setOpaque(false);
        PnlSaldo.setPreferredSize(new java.awt.Dimension(420, 200));
        PnlSaldo.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("0,00€");
        jLabel1.setMaximumSize(new java.awt.Dimension(250, 100));
        jLabel1.setMinimumSize(new java.awt.Dimension(250, 100));
        jLabel1.setPreferredSize(new java.awt.Dimension(250, 100));
        jLabel1.setRequestFocusEnabled(false);
        PnlSaldo.add(jLabel1, new java.awt.GridBagConstraints());

        ScrollPnlTransazioni.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ScrollPnlTransazioni.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollPnlTransazioni.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        ScrollPnlTransazioni.setOpaque(false);

        PnlContainerScroll.setOpaque(false);
        PnlContainerScroll.setLayout(new javax.swing.BoxLayout(PnlContainerScroll, javax.swing.BoxLayout.Y_AXIS));
        ScrollPnlTransazioni.setViewportView(PnlContainerScroll);

        javax.swing.GroupLayout PnlHomeLayout = new javax.swing.GroupLayout(PnlHome);
        PnlHome.setLayout(PnlHomeLayout);
        PnlHomeLayout.setHorizontalGroup(
            PnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ScrollPnlTransazioni)
        );
        PnlHomeLayout.setVerticalGroup(
            PnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlHomeLayout.createSequentialGroup()
                .addComponent(PnlSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ScrollPnlTransazioni))
        );

        PnlScheda.add(PnlHome, "CardHome");

        PnlEntrata.setColore1(new java.awt.Color(14, 17, 17));
        PnlEntrata.setColore2(new java.awt.Color(37, 178, 146));
        PnlEntrata.setMaximumSize(new java.awt.Dimension(420, 600));
        PnlEntrata.setMinimumSize(new java.awt.Dimension(420, 600));

        javax.swing.GroupLayout PnlEntrataLayout = new javax.swing.GroupLayout(PnlEntrata);
        PnlEntrata.setLayout(PnlEntrataLayout);
        PnlEntrataLayout.setHorizontalGroup(
            PnlEntrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        PnlEntrataLayout.setVerticalGroup(
            PnlEntrataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        PnlScheda.add(PnlEntrata, "CardEntrata");

        PnlResoconto.setColore1(new java.awt.Color(14, 17, 17));
        PnlResoconto.setColore2(new java.awt.Color(37, 178, 146));
        PnlResoconto.setMaximumSize(new java.awt.Dimension(420, 600));
        PnlResoconto.setMinimumSize(new java.awt.Dimension(420, 600));

        javax.swing.GroupLayout PnlResocontoLayout = new javax.swing.GroupLayout(PnlResoconto);
        PnlResoconto.setLayout(PnlResocontoLayout);
        PnlResocontoLayout.setHorizontalGroup(
            PnlResocontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        PnlResocontoLayout.setVerticalGroup(
            PnlResocontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        PnlScheda.add(PnlResoconto, "CardResoconto");

        PnlUscita.setColore1(new java.awt.Color(14, 17, 17));
        PnlUscita.setColore2(new java.awt.Color(37, 178, 146));
        PnlUscita.setMaximumSize(new java.awt.Dimension(420, 600));
        PnlUscita.setMinimumSize(new java.awt.Dimension(420, 600));

        javax.swing.GroupLayout PnlUscitaLayout = new javax.swing.GroupLayout(PnlUscita);
        PnlUscita.setLayout(PnlUscitaLayout);
        PnlUscitaLayout.setHorizontalGroup(
            PnlUscitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        PnlUscitaLayout.setVerticalGroup(
            PnlUscitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        PnlScheda.add(PnlUscita, "CardUscita");

        javax.swing.GroupLayout PnlContenutoLayout = new javax.swing.GroupLayout(PnlContenuto);
        PnlContenuto.setLayout(PnlContenutoLayout);
        PnlContenutoLayout.setHorizontalGroup(
            PnlContenutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlContenutoLayout.createSequentialGroup()
                .addGroup(PnlContenutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PnlContenutoLayout.createSequentialGroup()
                        .addGroup(PnlContenutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PnlScheda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PnlBottomMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 418, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PnlContenutoLayout.setVerticalGroup(
            PnlContenutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlContenutoLayout.createSequentialGroup()
                .addComponent(PnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PnlScheda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PnlBottomMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PnlLayer.setLayer(PnlContenuto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PnlLayerLayout = new javax.swing.GroupLayout(PnlLayer);
        PnlLayer.setLayout(PnlLayerLayout);
        PnlLayerLayout.setHorizontalGroup(
            PnlLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(PnlLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PnlContenuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlLayerLayout.setVerticalGroup(
            PnlLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(PnlLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlLayerLayout.createSequentialGroup()
                    .addComponent(PnlContenuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout PnlFinestraLayout = new javax.swing.GroupLayout(PnlFinestra);
        PnlFinestra.setLayout(PnlFinestraLayout);
        PnlFinestraLayout.setHorizontalGroup(
            PnlFinestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFinestraLayout.createSequentialGroup()
                .addComponent(PnlLayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PnlFinestraLayout.setVerticalGroup(
            PnlFinestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlLayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(PnlFinestra, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    // <editor-fold defaultstate="collapsed" desc="ACTION PERFORMED SU BOTTONE MENU LATERALE">
    private void BtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuActionPerformed
        
        //Codice che gestisce apertura e chiusura del menu
        //laterale animandolo con un timer
        
        //CHIUSURA
        if(menu.isVisible())
        {    
            Timer closeTimer = new Timer(5, null);              //Crea timer
            BtnMenu.setEnabled(false);                          //Disabilita il bottone per evitare che l'utente lo prema durante l'animazione
            closeTimer.addActionListener(e -> {
                int x = menu.getX();
                if (x > -200)                                   //Fino a quando il menu non arriva a -200
                {
                    menu.setLocation(x - 10, menu.getY());      //Sposta a sinistra di 10
                } 
                else 
                {
                    menu.setLocation(-200, menu.getY());        //Imposta definitivamente posizione a -200
                    closeTimer.stop();                          //Stop del timer
                    menu.setVisible(false);                     //Rende il menu invisibile
                    BtnMenu.setEnabled(true);                   //Riabilita il bottone
                }
            });
            closeTimer.start();
        }
        //APERTURA (Come chiusura)
        else
        {
            menu.setVisible(true);
            Timer openTimer = new Timer(5, null);
            BtnMenu.setEnabled(false);
            openTimer.addActionListener(e -> 
            {
                int x = menu.getX();

                if (x < 0) 
                {
                    menu.setLocation(x + 10, menu.getY());
                } 
                else 
                {
                    menu.setLocation(0, menu.getY());
                    BtnMenu.setEnabled(true);
                    openTimer.stop();
                }
            });
            openTimer.start();
        } 
    }//GEN-LAST:event_BtnMenuActionPerformed
    // </editor-fold>
    
    private void BtnProfiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProfiloActionPerformed
        
    }//GEN-LAST:event_BtnProfiloActionPerformed

    // <editor-fold defaultstate="collapsed" desc="ACTION PERFORMED SU BOTTONE + (ENTRATA)">
    private void BtnPiuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPiuActionPerformed
        card.show(PnlScheda, "CardEntrata");
        if(this.getTema() == ColorMode.CHIARO)
        {
            BtnHome.setIcon(new ImageIcon(homeIconScaledDark));
            BtnPiu.setIcon(new ImageIcon(piuIconScaledDark));
            BtnMeno.setIcon(new ImageIcon(menoIconScaledDark));
            BtnIncrease.setIcon(new ImageIcon(increaseIconScaledDark));
        }
        else
        {
            BtnHome.setIcon(new ImageIcon(homeIconScaledLight));
            BtnPiu.setIcon(new ImageIcon(piuIconScaledLight));
            BtnMeno.setIcon(new ImageIcon(menoIconScaledLight));
            BtnIncrease.setIcon(new ImageIcon(increaseIconScaledLight));
        }             
        selectedCard = "entrata";
        this.setMenuBarIcon();
    }//GEN-LAST:event_BtnPiuActionPerformed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="ACTION PERFORMED SU BOTTONE HOME">
    private void BtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHomeActionPerformed
        card.show(PnlScheda, "CardHome");
        if(this.getTema() == ColorMode.CHIARO)
        {
            BtnHome.setIcon(new ImageIcon(homeIconScaledDark));
            BtnPiu.setIcon(new ImageIcon(piuIconScaledDark));
            BtnMeno.setIcon(new ImageIcon(menoIconScaledDark));
            BtnIncrease.setIcon(new ImageIcon(increaseIconScaledDark));
        }
        else
        {
            BtnHome.setIcon(new ImageIcon(homeIconScaledLight));
            BtnPiu.setIcon(new ImageIcon(piuIconScaledLight));
            BtnMeno.setIcon(new ImageIcon(menoIconScaledLight));
            BtnIncrease.setIcon(new ImageIcon(increaseIconScaledLight));
        }
        selectedCard = "home";
        this.setMenuBarIcon();
    }//GEN-LAST:event_BtnHomeActionPerformed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="ACTION PERFORMED SU BOTTONE - (USCITA)">
    private void BtnMenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenoActionPerformed
        card.show(PnlScheda, "CardUscita");
        if(this.getTema() == ColorMode.CHIARO)
        {
            BtnHome.setIcon(new ImageIcon(homeIconScaledDark));
            BtnPiu.setIcon(new ImageIcon(piuIconScaledDark));
            BtnMeno.setIcon(new ImageIcon(menoIconScaledDark));
            BtnIncrease.setIcon(new ImageIcon(increaseIconScaledDark));
        }
        else
        {
            BtnHome.setIcon(new ImageIcon(homeIconScaledLight));
            BtnPiu.setIcon(new ImageIcon(piuIconScaledLight));
            BtnMeno.setIcon(new ImageIcon(menoIconScaledLight));
            BtnIncrease.setIcon(new ImageIcon(increaseIconScaledLight));
        }
        selectedCard = "uscita";
        this.setMenuBarIcon();
    }//GEN-LAST:event_BtnMenoActionPerformed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="ACTION PERFORMED SU BOTTONE RESOCONTO">
    private void BtnIncreaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIncreaseActionPerformed
        card.show(PnlScheda, "CardResoconto");
        if(this.getTema() == ColorMode.CHIARO)
        {
            BtnHome.setIcon(new ImageIcon(homeIconScaledDark));
            BtnPiu.setIcon(new ImageIcon(piuIconScaledDark));
            BtnMeno.setIcon(new ImageIcon(menoIconScaledDark));
            BtnIncrease.setIcon(new ImageIcon(increaseIconScaledDark));
        }
        else
        {
            BtnHome.setIcon(new ImageIcon(homeIconScaledLight));
            BtnPiu.setIcon(new ImageIcon(piuIconScaledLight));
            BtnMeno.setIcon(new ImageIcon(menoIconScaledLight));
            BtnIncrease.setIcon(new ImageIcon(increaseIconScaledLight));
        }
        selectedCard = "resoconto";
        this.setMenuBarIcon();
    }//GEN-LAST:event_BtnIncreaseActionPerformed
    // </editor-fold>
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmHome().setVisible(true);
                
            }
        });
    }
    
    //Dichiarazioni variabili
    private ColorMode tema = ColorMode.CHIARO;      
    private PnlMenu menu = new PnlMenu(); 
    public Color coloreSecondario;
    private CardLayout card;
    private String selectedCard = "home";
    private char valuta = '€';
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHome;
    private javax.swing.JButton BtnIncrease;
    private javax.swing.JButton BtnMeno;
    private javax.swing.JButton BtnMenu;
    private javax.swing.JButton BtnPiu;
    private javax.swing.JButton BtnProfilo;
    private componenti.RoundPanel MenuBar;
    private javax.swing.JPanel PnlBottomMenu;
    private javax.swing.JPanel PnlContainerScroll;
    private javax.swing.JPanel PnlContenuto;
    private componenti.GradientPanel PnlEntrata;
    private javax.swing.JPanel PnlFinestra;
    private javax.swing.JPanel PnlHeader;
    private componenti.GradientPanel PnlHome;
    private javax.swing.JLayeredPane PnlLayer;
    private componenti.GradientPanel PnlResoconto;
    private javax.swing.JPanel PnlSaldo;
    private javax.swing.JPanel PnlScheda;
    private componenti.GradientPanel PnlUscita;
    private javax.swing.JScrollPane ScrollPnlTransazioni;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
