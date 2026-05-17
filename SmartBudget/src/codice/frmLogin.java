package codice;

//IMPORT
// <editor-fold defaultstate="collapsed">
import componenti.PaletteColori;
import componenti.RoundButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.ImageIcon;
// </editor-fold>

public class frmLogin extends javax.swing.JFrame {

//DICHIARAZIONI
    //COSTANTI PLACEHOLDER
    // <editor-fold defaultstate="collapsed">
    private final Color COLORE_PLACEHOLDER = PaletteColori.BLU_GRIGIO;
    private final Color COLORE_FONT = Color.BLACK;
    private final String PLACEHOLDER_USERNAME = "Inserisci nome utente...";
    private final String PLACEHOLDER_PASSWORD = "Inserisci password...";
    private final String PLACEHOLDER_CONFERMA_PASSWORD = "Conferma password...";
    // </editor-fold>

    //COSTANTI IMMAGINI
    // <editor-fold defaultstate="collapsed">
    private final ImageIcon USER_BLU = new ImageIcon(getClass().getResource("/immagini/UserBlu.png"));
    private final ImageIcon USER_ROSSO = new ImageIcon(getClass().getResource("/immagini/UserRosso.png"));
    private final ImageIcon LUCCHETTO_BLU = new ImageIcon(getClass().getResource("/immagini/LucchettoBlu.png"));
    private final ImageIcon LUCCHETTO_ROSSO = new ImageIcon(getClass().getResource("/immagini/LucchettoRosso.png"));
    private final ImageIcon SCUDO_BLU = new ImageIcon(getClass().getResource("/immagini/ScudoBlu.png"));
    private final ImageIcon SCUDO_ROSSO = new ImageIcon(getClass().getResource("/immagini/ScudoRosso.png"));
    private final ImageIcon ICONA_APP = new ImageIcon(getClass().getResource("/immagini/icona.png"));
    // </editor-fold>

    //CREAZIONE CARD LAYOUT
    java.awt.CardLayout cardLayout1 = null;

//COSTRUTTORE FRAME
    public frmLogin() {
        RegistraFont();
        initComponents();
        this.pack();
        this.setIconImage(ICONA_APP.getImage());
        cardLayout1 = (java.awt.CardLayout) getContentPane().getLayout();
        cardLayout1.show(getContentPane(), "Welcome");
    }

//CODICE AUTOGENERATO
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlWelcome = new javax.swing.JPanel();
        gradientPanel1 = new componenti.GradientPanel();
        jPanel1 = new javax.swing.JPanel();
        roundButton1 = new componenti.RoundButton();
        roundButton2 = new componenti.RoundButton();
        jSeparator1 = new javax.swing.JSeparator();
        imageLabel1 = new componenti.ImageLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlRegistrati = new javax.swing.JPanel();
        lblIstruzioni = new javax.swing.JLabel();
        pnlDati = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new componenti.RoundTextFieldIcon();
        flrSpazio1 = new javax.swing.Box.Filler(new java.awt.Dimension(420, 30), new java.awt.Dimension(420, 30), new java.awt.Dimension(420, 30));
        lblPassword = new javax.swing.JLabel();
        pswPassword = new componenti.RoundPasswordFieldIcon();
        flrSpazio2 = new javax.swing.Box.Filler(new java.awt.Dimension(420, 30), new java.awt.Dimension(420, 30), new java.awt.Dimension(420, 30));
        lblConfermaPassword = new javax.swing.JLabel();
        pswConfermaPassword = new componenti.RoundPasswordFieldIcon();
        sprLinea1 = new javax.swing.JSeparator();
        sprLinea2 = new javax.swing.JSeparator();
        imgLogo = new componenti.ImageLabel();
        grdGradiente = new componenti.GradientPanel();
        pnlBottoni = new javax.swing.JPanel();
        btnRegistrati = new componenti.RoundButton();
        btnAnnulla = new componenti.RoundButton();
        pnlLogin = new javax.swing.JPanel();
        lblIstruzioni1 = new javax.swing.JLabel();
        pnlDati1 = new javax.swing.JPanel();
        lblUsernameLogin = new javax.swing.JLabel();
        txtUsernameLogin = new componenti.RoundTextFieldIcon();
        flrSpazio3 = new javax.swing.Box.Filler(new java.awt.Dimension(420, 30), new java.awt.Dimension(420, 30), new java.awt.Dimension(420, 30));
        lblPasswordLogin = new javax.swing.JLabel();
        pswPasswordLogin = new componenti.RoundPasswordFieldIcon();
        sprLinea3 = new javax.swing.JSeparator();
        sprLinea4 = new javax.swing.JSeparator();
        imgLogo1 = new componenti.ImageLabel();
        grdGradiente1 = new componenti.GradientPanel();
        pnlBottoni1 = new javax.swing.JPanel();
        btnLogin = new componenti.RoundButton();
        btnAnnulla1 = new componenti.RoundButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SmartBudget");
        setMaximumSize(new java.awt.Dimension(420, 800));
        setMinimumSize(new java.awt.Dimension(420, 800));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        pnlWelcome.setBackground(java.awt.Color.white);
        pnlWelcome.setMaximumSize(new java.awt.Dimension(420, 800));
        pnlWelcome.setMinimumSize(new java.awt.Dimension(420, 800));
        pnlWelcome.setPreferredSize(new java.awt.Dimension(420, 800));
        pnlWelcome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gradientPanel1.setBackground(java.awt.Color.white);
        gradientPanel1.setColore1(java.awt.Color.white);
        gradientPanel1.setColore2(PaletteColori.VERDE);
        gradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 40, 20));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(0, 1, 0, 20));

        roundButton1.setForeground(PaletteColori.BLU);
        roundButton1.setText("Registrati");
        roundButton1.setBorderPainted(true);
        roundButton1.setColoreBordo(java.awt.Color.white);
        roundButton1.setColoreHover(PaletteColori.BLU);
        roundButton1.setFont(new java.awt.Font("Montserrat SemiBold", java.awt.Font.PLAIN, 20)
        );
        roundButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        roundButton1.setRaggio(40);
        roundButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGrandiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGrandiMouseExited(evt);
            }
        });
        roundButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(roundButton1);

        roundButton2.setForeground(PaletteColori.BLU);
        roundButton2.setText("Login");
        roundButton2.setColoreBordo(java.awt.Color.white);
        roundButton2.setColoreHover(PaletteColori.BLU);
        roundButton2.setFont(new java.awt.Font("Montserrat SemiBold", java.awt.Font.PLAIN, 20)
        );
        roundButton2.setRaggio(40);
        roundButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGrandiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGrandiMouseExited(evt);
            }
        });
        roundButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(roundButton2);

        gradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 420, 170));

        pnlWelcome.add(gradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 420, 400));

        jSeparator1.setForeground(PaletteColori.BLU);
        pnlWelcome.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 330, 40));

        imageLabel1.setImmagine("/immagini/logo.png");
        pnlWelcome.add(imageLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 480, 360));

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", java.awt.Font.PLAIN, 40));
        jLabel2.setForeground(new java.awt.Color(25, 45, 98));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Benvenuto!");
        jLabel2.setAlignmentX(0.5F);
        jLabel2.setPreferredSize(new java.awt.Dimension(37, 50));
        pnlWelcome.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 420, 40));

        jLabel3.setFont(new java.awt.Font("Montserrat", java.awt.Font.PLAIN, 16)
        );
        jLabel3.setForeground(new java.awt.Color(25, 45, 98));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Effettua il login o registrati");
        jLabel3.setAlignmentX(0.5F);
        jLabel3.setPreferredSize(new java.awt.Dimension(37, 50));
        pnlWelcome.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 420, -1));

        getContentPane().add(pnlWelcome, "Welcome");

        pnlRegistrati.setBackground(java.awt.Color.white);
        pnlRegistrati.setMaximumSize(new java.awt.Dimension(420, 800));
        pnlRegistrati.setMinimumSize(new java.awt.Dimension(420, 800));
        pnlRegistrati.setPreferredSize(new java.awt.Dimension(420, 800));
        pnlRegistrati.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIstruzioni.setFont(new java.awt.Font("Montserrat SemiBold", java.awt.Font.PLAIN, 15));
        lblIstruzioni.setForeground(new java.awt.Color(25, 45, 98));
        lblIstruzioni.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIstruzioni.setText("Inserisci i dati per continuare");
        lblIstruzioni.setAlignmentX(0.5F);
        lblIstruzioni.setPreferredSize(new java.awt.Dimension(37, 50));
        pnlRegistrati.add(lblIstruzioni, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 420, 40));

        pnlDati.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 20));
        pnlDati.setOpaque(false);
        pnlDati.setLayout(new javax.swing.BoxLayout(pnlDati, javax.swing.BoxLayout.PAGE_AXIS));

        lblUsername.setFont(new java.awt.Font("Montserrat SemiBold", java.awt.Font.PLAIN, 15)
        );
        lblUsername.setForeground(new java.awt.Color(25, 45, 98));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername.setText("Username");
        lblUsername.setAlignmentX(0.5F);
        lblUsername.setMaximumSize(new java.awt.Dimension(340, 30));
        lblUsername.setMinimumSize(new java.awt.Dimension(340, 30));
        lblUsername.setPreferredSize(new java.awt.Dimension(340, 30));
        pnlDati.add(lblUsername);

        txtUsername.setForeground(PaletteColori.BLU_GRIGIO);
        txtUsername.setText("Inserisci nome utente...");
        txtUsername.setColoreBordo(PaletteColori.BLU);
        txtUsername.setFont(new java.awt.Font("Montserrat", java.awt.Font.PLAIN, 16)
        );
        txtUsername.setIcona(new javax.swing.ImageIcon(getClass().getResource("/immagini/UserBlu.png"))); // NOI18N
        txtUsername.setMaximumSize(new java.awt.Dimension(340, 60));
        txtUsername.setMinimumSize(new java.awt.Dimension(340, 60));
        txtUsername.setPreferredSize(new java.awt.Dimension(340, 60));
        txtUsername.setRaggio(40);
        txtUsername.setSpazioOccupato(0.48);
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsernameKeyReleased(evt);
            }
        });
        pnlDati.add(txtUsername);
        pnlDati.add(flrSpazio1);

        lblPassword.setFont(new java.awt.Font("Montserrat SemiBold", java.awt.Font.PLAIN, 15)
        );
        lblPassword.setForeground(new java.awt.Color(25, 45, 98));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPassword.setText("Password");
        lblPassword.setAlignmentX(0.5F);
        lblPassword.setMaximumSize(new java.awt.Dimension(340, 30));
        lblPassword.setMinimumSize(new java.awt.Dimension(340, 30));
        lblPassword.setPreferredSize(new java.awt.Dimension(340, 30));
        pnlDati.add(lblPassword);

        pswPassword.setForeground(PaletteColori.BLU_GRIGIO);
        pswPassword.setText("Inserisci password...");
        pswPassword.setEchoChar((char) 0);
        pswPassword.setFont(new java.awt.Font("Montserrat", java.awt.Font.PLAIN, 16)
        );
        pswPassword.setIcona(new javax.swing.ImageIcon(getClass().getResource("/immagini/LucchettoBlu.png"))); // NOI18N
        pswPassword.setMaximumSize(new java.awt.Dimension(340, 60));
        pswPassword.setMinimumSize(new java.awt.Dimension(340, 60));
        pswPassword.setPreferredSize(new java.awt.Dimension(340, 60));
        pswPassword.setRaggio(40);
        pswPassword.setSpazioOccupato(0.48);
        pswPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pswPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pswPasswordFocusLost(evt);
            }
        });
        pswPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pswPasswordKeyReleased(evt);
            }
        });
        pnlDati.add(pswPassword);
        pnlDati.add(flrSpazio2);

        lblConfermaPassword.setFont(new java.awt.Font("Montserrat SemiBold", java.awt.Font.PLAIN, 15)
        );
        lblConfermaPassword.setForeground(new java.awt.Color(25, 45, 98));
        lblConfermaPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblConfermaPassword.setText("Conferma password");
        lblConfermaPassword.setAlignmentX(0.5F);
        lblConfermaPassword.setMaximumSize(new java.awt.Dimension(340, 30));
        lblConfermaPassword.setMinimumSize(new java.awt.Dimension(340, 30));
        lblConfermaPassword.setPreferredSize(new java.awt.Dimension(340, 30));
        pnlDati.add(lblConfermaPassword);

        pswConfermaPassword.setForeground(PaletteColori.BLU_GRIGIO);
        pswConfermaPassword.setText("Conferma password...");
        pswConfermaPassword.setEchoChar((char) 0);
        pswConfermaPassword.setFont(new java.awt.Font("Montserrat", java.awt.Font.PLAIN, 16)
        );
        pswConfermaPassword.setIcona(new javax.swing.ImageIcon(getClass().getResource("/immagini/ScudoBlu.png"))); // NOI18N
        pswConfermaPassword.setMaximumSize(new java.awt.Dimension(340, 60));
        pswConfermaPassword.setMinimumSize(new java.awt.Dimension(340, 60));
        pswConfermaPassword.setPreferredSize(new java.awt.Dimension(340, 60));
        pswConfermaPassword.setRaggio(40);
        pswConfermaPassword.setSpazioOccupato(0.48);
        pswConfermaPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pswConfermaPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pswConfermaPasswordFocusLost(evt);
            }
        });
        pswConfermaPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pswConfermaPasswordKeyReleased(evt);
            }
        });
        pnlDati.add(pswConfermaPassword);

        pnlRegistrati.add(pnlDati, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 420, 350));

        sprLinea1.setForeground(PaletteColori.BLU);
        pnlRegistrati.add(sprLinea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 330, 20));

        sprLinea2.setForeground(PaletteColori.BLU);
        pnlRegistrati.add(sprLinea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 330, 40));

        imgLogo.setImmagine("/immagini/logo.png");
        pnlRegistrati.add(imgLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 480, 210));

        grdGradiente.setBackground(java.awt.Color.white);
        grdGradiente.setColore1(java.awt.Color.white);
        grdGradiente.setColore2(PaletteColori.VERDE);
        grdGradiente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBottoni.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 40, 20));
        pnlBottoni.setOpaque(false);
        pnlBottoni.setLayout(new java.awt.GridLayout(0, 1, 0, 20));

        btnRegistrati.setForeground(PaletteColori.BLU);
        btnRegistrati.setText("Registrati");
        btnRegistrati.setBorderPainted(true);
        btnRegistrati.setColoreBordo(java.awt.Color.white);
        btnRegistrati.setColoreHover(PaletteColori.BLU);
        btnRegistrati.setFont(new java.awt.Font("Montserrat SemiBold", java.awt.Font.PLAIN, 20)
        );
        btnRegistrati.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrati.setRaggio(40);
        btnRegistrati.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGrandiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGrandiMouseExited(evt);
            }
        });
        btnRegistrati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistratiActionPerformed(evt);
            }
        });
        pnlBottoni.add(btnRegistrati);

        btnAnnulla.setForeground(PaletteColori.BLU);
        btnAnnulla.setText("Annulla");
        btnAnnulla.setColoreBordo(java.awt.Color.white);
        btnAnnulla.setColoreHover(PaletteColori.BLU);
        btnAnnulla.setFont(new java.awt.Font("Montserrat SemiBold", java.awt.Font.PLAIN, 20)
        );
        btnAnnulla.setRaggio(40);
        btnAnnulla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGrandiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGrandiMouseExited(evt);
            }
        });
        btnAnnulla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaActionPerformed(evt);
            }
        });
        pnlBottoni.add(btnAnnulla);

        grdGradiente.add(pnlBottoni, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 420, 170));

        pnlRegistrati.add(grdGradiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 420, 400));

        getContentPane().add(pnlRegistrati, "Registrati");

        pnlLogin.setBackground(java.awt.Color.white);
        pnlLogin.setMaximumSize(new java.awt.Dimension(420, 800));
        pnlLogin.setMinimumSize(new java.awt.Dimension(420, 800));
        pnlLogin.setPreferredSize(new java.awt.Dimension(420, 800));
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIstruzioni1.setFont(new java.awt.Font("Montserrat SemiBold", java.awt.Font.PLAIN, 15));
        lblIstruzioni1.setForeground(new java.awt.Color(25, 45, 98));
        lblIstruzioni1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIstruzioni1.setText("Inserisci i dati per continuare");
        lblIstruzioni1.setAlignmentX(0.5F);
        lblIstruzioni1.setPreferredSize(new java.awt.Dimension(37, 50));
        pnlLogin.add(lblIstruzioni1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 420, 40));

        pnlDati1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 20));
        pnlDati1.setOpaque(false);
        pnlDati1.setLayout(new javax.swing.BoxLayout(pnlDati1, javax.swing.BoxLayout.PAGE_AXIS));

        lblUsernameLogin.setFont(new java.awt.Font("Montserrat SemiBold", java.awt.Font.PLAIN, 15)
        );
        lblUsernameLogin.setForeground(new java.awt.Color(25, 45, 98));
        lblUsernameLogin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsernameLogin.setText("Username");
        lblUsernameLogin.setAlignmentX(0.5F);
        lblUsernameLogin.setMaximumSize(new java.awt.Dimension(340, 30));
        lblUsernameLogin.setMinimumSize(new java.awt.Dimension(340, 30));
        lblUsernameLogin.setPreferredSize(new java.awt.Dimension(340, 30));
        pnlDati1.add(lblUsernameLogin);

        txtUsernameLogin.setForeground(PaletteColori.BLU_GRIGIO);
        txtUsernameLogin.setText("Inserisci nome utente...");
        txtUsernameLogin.setColoreBordo(PaletteColori.BLU);
        txtUsernameLogin.setFont(new java.awt.Font("Montserrat", java.awt.Font.PLAIN, 16)
        );
        txtUsernameLogin.setIcona(new javax.swing.ImageIcon(getClass().getResource("/immagini/UserBlu.png"))); // NOI18N
        txtUsernameLogin.setMaximumSize(new java.awt.Dimension(340, 60));
        txtUsernameLogin.setMinimumSize(new java.awt.Dimension(340, 60));
        txtUsernameLogin.setPreferredSize(new java.awt.Dimension(340, 60));
        txtUsernameLogin.setRaggio(40);
        txtUsernameLogin.setSpazioOccupato(0.48);
        txtUsernameLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        txtUsernameLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsernameLoginKeyReleased(evt);
            }
        });
        pnlDati1.add(txtUsernameLogin);
        pnlDati1.add(flrSpazio3);

        lblPasswordLogin.setFont(new java.awt.Font("Montserrat SemiBold", java.awt.Font.PLAIN, 15)
        );
        lblPasswordLogin.setForeground(new java.awt.Color(25, 45, 98));
        lblPasswordLogin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPasswordLogin.setText("Password");
        lblPasswordLogin.setAlignmentX(0.5F);
        lblPasswordLogin.setMaximumSize(new java.awt.Dimension(340, 30));
        lblPasswordLogin.setMinimumSize(new java.awt.Dimension(340, 30));
        lblPasswordLogin.setPreferredSize(new java.awt.Dimension(340, 30));
        pnlDati1.add(lblPasswordLogin);

        pswPasswordLogin.setForeground(PaletteColori.BLU_GRIGIO);
        pswPasswordLogin.setText("Inserisci password...");
        pswPasswordLogin.setEchoChar((char) 0);
        pswPasswordLogin.setFont(new java.awt.Font("Montserrat", java.awt.Font.PLAIN, 16)
        );
        pswPasswordLogin.setIcona(new javax.swing.ImageIcon(getClass().getResource("/immagini/LucchettoBlu.png"))); // NOI18N
        pswPasswordLogin.setMaximumSize(new java.awt.Dimension(340, 60));
        pswPasswordLogin.setMinimumSize(new java.awt.Dimension(340, 60));
        pswPasswordLogin.setPreferredSize(new java.awt.Dimension(340, 60));
        pswPasswordLogin.setRaggio(40);
        pswPasswordLogin.setSpazioOccupato(0.48);
        pswPasswordLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pswPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pswPasswordFocusLost(evt);
            }
        });
        pswPasswordLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pswPasswordLoginKeyReleased(evt);
            }
        });
        pnlDati1.add(pswPasswordLogin);

        pnlLogin.add(pnlDati1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 420, 350));

        sprLinea3.setForeground(PaletteColori.BLU);
        pnlLogin.add(sprLinea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 330, 20));

        sprLinea4.setForeground(PaletteColori.BLU);
        pnlLogin.add(sprLinea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 330, 40));

        imgLogo1.setImmagine("/immagini/logo.png");
        pnlLogin.add(imgLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 480, 210));

        grdGradiente1.setBackground(java.awt.Color.white);
        grdGradiente1.setColore1(java.awt.Color.white);
        grdGradiente1.setColore2(PaletteColori.VERDE);
        grdGradiente1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBottoni1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 40, 20));
        pnlBottoni1.setOpaque(false);
        pnlBottoni1.setLayout(new java.awt.GridLayout(0, 1, 0, 20));

        btnLogin.setForeground(PaletteColori.BLU);
        btnLogin.setText("Login");
        btnLogin.setBorderPainted(true);
        btnLogin.setColoreBordo(java.awt.Color.white);
        btnLogin.setColoreHover(PaletteColori.BLU);
        btnLogin.setFont(new java.awt.Font("Montserrat SemiBold", java.awt.Font.PLAIN, 20)
        );
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogin.setRaggio(40);
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGrandiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGrandiMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnlBottoni1.add(btnLogin);

        btnAnnulla1.setForeground(PaletteColori.BLU);
        btnAnnulla1.setText("Annulla");
        btnAnnulla1.setColoreBordo(java.awt.Color.white);
        btnAnnulla1.setColoreHover(PaletteColori.BLU);
        btnAnnulla1.setFont(new java.awt.Font("Montserrat SemiBold", java.awt.Font.PLAIN, 20)
        );
        btnAnnulla1.setRaggio(40);
        btnAnnulla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGrandiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGrandiMouseExited(evt);
            }
        });
        btnAnnulla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnullaActionPerformed(evt);
            }
        });
        pnlBottoni1.add(btnAnnulla1);

        grdGradiente1.add(pnlBottoni1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 420, 170));

        pnlLogin.add(grdGradiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 420, 400));

        getContentPane().add(pnlLogin, "Login");

        pack();
    }// </editor-fold>//GEN-END:initComponents

//LISTENERS
    //LISTENERS BOTTONI 1
    // <editor-fold defaultstate="collapsed">
    private void btnGrandiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGrandiMouseExited
        RoundButton bottone = (RoundButton) evt.getSource();
        bottone.setColoreBordo(Color.WHITE);
        bottone.setForeground(PaletteColori.BLU);
    }//GEN-LAST:event_btnGrandiMouseExited

    private void btnGrandiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGrandiMouseEntered
        RoundButton bottone = (RoundButton) evt.getSource();
        bottone.setColoreBordo(PaletteColori.BLU);
        bottone.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnGrandiMouseEntered

    private void roundButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton2ActionPerformed
        cardLayout1.show(getContentPane(), "Login");
    }//GEN-LAST:event_roundButton2ActionPerformed

    private void roundButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton1ActionPerformed
        cardLayout1.show(getContentPane(), "Registrati");
    }//GEN-LAST:event_roundButton1ActionPerformed
    // </editor-fold>

    //LISTENERS TEXTFIELDS E PASSWORDFIELDS
    // <editor-fold defaultstate="collapsed">
    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        componenti.RoundTextFieldIcon txt = (componenti.RoundTextFieldIcon) evt.getSource();
        if (txt.getText().equals(PLACEHOLDER_USERNAME)) {
            txt.setText("");
            txt.setForeground(COLORE_FONT);
        }
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        componenti.RoundTextFieldIcon txt = (componenti.RoundTextFieldIcon) evt.getSource();
        if (txt.getText().isEmpty()) {
            txt.setText(PLACEHOLDER_USERNAME);
            txt.setForeground(COLORE_PLACEHOLDER);
        }
    }//GEN-LAST:event_txtUsernameFocusLost

    private void txtUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyReleased
        ControlloUsername();
    }//GEN-LAST:event_txtUsernameKeyReleased

    private void pswPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pswPasswordFocusGained
        componenti.RoundPasswordFieldIcon psw = (componenti.RoundPasswordFieldIcon) evt.getSource();
        String password = String.valueOf(psw.getPassword());
        if (password.equals(PLACEHOLDER_PASSWORD)) {
            psw.setText("");
            psw.setForeground(COLORE_FONT);
            psw.setEchoChar('•');
        }
    }//GEN-LAST:event_pswPasswordFocusGained

    private void pswPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pswPasswordFocusLost
        componenti.RoundPasswordFieldIcon psw = (componenti.RoundPasswordFieldIcon) evt.getSource();
        String password = String.valueOf(psw.getPassword());
        if (password.isEmpty()) {
            psw.setEchoChar((char) 0);
            psw.setText(PLACEHOLDER_PASSWORD);
            psw.setForeground(COLORE_PLACEHOLDER);
        }
    }//GEN-LAST:event_pswPasswordFocusLost

    private void pswPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswPasswordKeyReleased
        ControlloPassword();
        ControlloConfermaPassword();
    }//GEN-LAST:event_pswPasswordKeyReleased

    private void pswConfermaPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pswConfermaPasswordFocusGained
        String password = String.valueOf(pswConfermaPassword.getPassword());
        if (password.equals(PLACEHOLDER_CONFERMA_PASSWORD)) {
            pswConfermaPassword.setText("");
            pswConfermaPassword.setForeground(COLORE_FONT);
            pswConfermaPassword.setEchoChar('•');
        }
    }//GEN-LAST:event_pswConfermaPasswordFocusGained

    private void pswConfermaPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pswConfermaPasswordFocusLost
        String password = String.valueOf(pswConfermaPassword.getPassword());
        if (password.isEmpty()) {
            pswConfermaPassword.setEchoChar((char) 0);
            pswConfermaPassword.setText(PLACEHOLDER_CONFERMA_PASSWORD);
            pswConfermaPassword.setForeground(COLORE_PLACEHOLDER);
        }
    }//GEN-LAST:event_pswConfermaPasswordFocusLost

    private void pswConfermaPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswConfermaPasswordKeyReleased
        ControlloConfermaPassword();
    }//GEN-LAST:event_pswConfermaPasswordKeyReleased
// </editor-fold>

    //LISTENERS BOTTONI 2
    // <editor-fold defaultstate="collapsed">
    private void btnAnnullaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnullaActionPerformed
        cardLayout1.show(getContentPane(), "Welcome");
        UsernameValido();
        txtUsername.setText(PLACEHOLDER_USERNAME);
        PasswordValida();
        pswPassword.setText(PLACEHOLDER_PASSWORD);
        pswPassword.setEchoChar((char) 0);
        pswPassword.setForeground(COLORE_PLACEHOLDER);
        ConfermaPasswordValida();
        pswConfermaPassword.setText(PLACEHOLDER_CONFERMA_PASSWORD);
        pswConfermaPassword.setEchoChar((char) 0);
        pswConfermaPassword.setForeground(COLORE_PLACEHOLDER);
        UsernameValidoLogin();
        txtUsernameLogin.setText(PLACEHOLDER_USERNAME);
        PasswordValidaLogin();
        pswPasswordLogin.setText(PLACEHOLDER_PASSWORD);
        pswPasswordLogin.setEchoChar((char) 0);
        pswPasswordLogin.setForeground(COLORE_PLACEHOLDER);
    }//GEN-LAST:event_btnAnnullaActionPerformed

    private void btnRegistratiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistratiActionPerformed
        String username = txtUsername.getText();
        String password = String.valueOf(pswPassword.getPassword());
        String confermaPassword = String.valueOf(pswConfermaPassword.getPassword());
        if (ControlloDatiRegistrati(username, password, confermaPassword))
            RegistraUtente(username, password);
    }//GEN-LAST:event_btnRegistratiActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String username = txtUsernameLogin.getText();
        String password = String.valueOf(pswPasswordLogin.getPassword());
        if (ControlloDatiLogin(username, password))
            LoginUtente(username, password);
    }//GEN-LAST:event_btnLoginActionPerformed
    // </editor-fold>

    //KEY LISTENERS LOGIN
    // <editor-fold defaultstate="collapsed">
    private void txtUsernameLoginKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameLoginKeyReleased
        String username = txtUsernameLogin.getText();
        if (username.length() > 25)
            UsernameInvalidoLogin("massimo 25 caratteri");
        else
            UsernameValidoLogin();
    }//GEN-LAST:event_txtUsernameLoginKeyReleased

    private void pswPasswordLoginKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswPasswordLoginKeyReleased
        String password = String.valueOf(pswPasswordLogin.getPassword());;
        if (password.length() > 25)
            PasswordInvalidaLogin("massimo 25 caratteri");
        else
            PasswordValidaLogin();
    }//GEN-LAST:event_pswPasswordLoginKeyReleased
    // </editor-fold>

//GESTIONE DATI
    //GESTIONE USERNAME
    // <editor-fold defaultstate="collapsed">
    public boolean ControlloUsername() {
        String username = txtUsername.getText();
        if (username.equals(PLACEHOLDER_USERNAME) || username.isEmpty()) {
            UsernameValido();
            return true;
        } else if (username.contains(" ")) {
            UsernameInvalido("non può contenere spazi");
            return false;
        } else if (username.length() < 3) {
            UsernameInvalido("almeno 3 caratteri");
            return false;
        } else if (UsernameEsistente(username)) {
            UsernameInvalido("già esistente");
            return false;
        } else if (username.contains("\\")) {
            UsernameInvalido("non può contenere \\");
            return false;
        } else if (username.length() > 25) {
            UsernameInvalido("massimo 25 caratteri");
            return false;
        } else {
            UsernameValido();
            return true;
        }
    }

    public void UsernameValido() {
        txtUsername.setColoreBordo(PaletteColori.BLU);
        lblUsername.setForeground(PaletteColori.BLU);
        lblUsername.setText("Username");
        txtUsername.setIcona(USER_BLU);
    }

    public void UsernameValidoLogin() {
        txtUsernameLogin.setColoreBordo(PaletteColori.BLU);
        lblUsernameLogin.setForeground(PaletteColori.BLU);
        lblUsernameLogin.setText("Username");
        txtUsernameLogin.setIcona(USER_BLU);
    }

    public void UsernameInvalido(String messaggio) {
        txtUsername.setColoreBordo(PaletteColori.ROSSO);
        lblUsername.setForeground(PaletteColori.ROSSO);
        lblUsername.setText("Username - " + messaggio);
        txtUsername.setIcona(USER_ROSSO);
    }

    public void UsernameInvalidoLogin(String messaggio) {
        txtUsernameLogin.setColoreBordo(PaletteColori.ROSSO);
        lblUsernameLogin.setForeground(PaletteColori.ROSSO);
        lblUsernameLogin.setText("Username - " + messaggio);
        txtUsernameLogin.setIcona(USER_ROSSO);
    }

    public boolean UsernameEsistente(String username) {
        return getUtente(username) != null;
    }
    // </editor-fold>

    //GESTIONE PASSWORD
    // <editor-fold defaultstate="collapsed">
    public boolean ControlloPassword() {
        String password = String.valueOf(pswPassword.getPassword());
        if (password.equals(PLACEHOLDER_PASSWORD) || password.isEmpty()) {
            PasswordValida();
            return true;
        } else if (password.contains(" ")) {
            PasswordInvalida("non può contenere spazi");
            return false;
        } else if (password.length() < 8) {
            PasswordInvalida("almeno 8 caratteri");
            return false;
        } else if (password.length() > 25) {
            PasswordInvalida("massimo 25 caratteri");
            return false;
        } else if (password.contains("\\")) {
            PasswordInvalida("non può contenere \\");
            return false;
        } else {
            PasswordValida();
            return true;
        }
    }

    public boolean ControlloPassword(String username, String password) {
        Utente temp = getUtente(username);
        return password.equals(temp.getPassword());
    }

    public void PasswordValida() {
        pswPassword.setColoreBordo(PaletteColori.BLU);
        lblPassword.setForeground(PaletteColori.BLU);
        lblPassword.setText("Password");
        pswPassword.setIcona(LUCCHETTO_BLU);
    }

    public void PasswordValidaLogin() {
        pswPasswordLogin.setColoreBordo(PaletteColori.BLU);
        lblPasswordLogin.setForeground(PaletteColori.BLU);
        lblPasswordLogin.setText("Password");
        pswPasswordLogin.setIcona(LUCCHETTO_BLU);
    }

    public void PasswordInvalida(String messaggio) {
        pswPassword.setColoreBordo(PaletteColori.ROSSO);
        lblPassword.setForeground(PaletteColori.ROSSO);
        lblPassword.setText("Password - " + messaggio);
        pswPassword.setIcona(LUCCHETTO_ROSSO);

    }

    public void PasswordInvalidaLogin(String messaggio) {
        pswPasswordLogin.setColoreBordo(PaletteColori.ROSSO);
        lblPasswordLogin.setForeground(PaletteColori.ROSSO);
        lblPasswordLogin.setText("Password - " + messaggio);
        pswPasswordLogin.setIcona(LUCCHETTO_ROSSO);
    }// </editor-fold>

    //GESTIONE CONFERMA PASSWORD
    // <editor-fold defaultstate="collapsed">
    public boolean ControlloConfermaPassword() {
        String password = String.valueOf(pswConfermaPassword.getPassword());
        if (password.equals(PLACEHOLDER_CONFERMA_PASSWORD) || password.isEmpty()) {
            ConfermaPasswordValida();
            return true;
        } else if (!password.equals(String.valueOf(pswPassword.getPassword()))) {
            ConfermaPasswordInvalida("non sono identiche");
            return false;
        } else {
            ConfermaPasswordValida();
            return true;
        }
    }

    public void ConfermaPasswordValida() {
        pswConfermaPassword.setColoreBordo(PaletteColori.BLU);
        lblConfermaPassword.setForeground(PaletteColori.BLU);
        lblConfermaPassword.setText("Conferma password");
        pswConfermaPassword.setIcona(SCUDO_BLU);
    }

    public void ConfermaPasswordInvalida(String messaggio) {
        pswConfermaPassword.setColoreBordo(PaletteColori.ROSSO);
        lblConfermaPassword.setForeground(PaletteColori.ROSSO);
        lblConfermaPassword.setText("Conferma password - " + messaggio);
        pswConfermaPassword.setIcona(SCUDO_ROSSO);
    }// </editor-fold>

    //CONTROLLO DATI REGISTRAZIONE
    // <editor-fold defaultstate="collapsed">
    public boolean ControlloDatiRegistrati(String username, String password, String confermaPassword) {
        if (ControlloUsername() && ControlloPassword() && ControlloConfermaPassword()) {
            if (username.equals(PLACEHOLDER_USERNAME) || password.equals(PLACEHOLDER_PASSWORD) || confermaPassword.equals(PLACEHOLDER_CONFERMA_PASSWORD)) {
                if (username.equals(PLACEHOLDER_USERNAME)) {
                    UsernameInvalido("campo obbligatorio");
                }
                if (password.equals(PLACEHOLDER_PASSWORD)) {
                    PasswordInvalida("campo obbligatorio");
                }
                if (confermaPassword.equals(PLACEHOLDER_CONFERMA_PASSWORD)) {
                    ConfermaPasswordInvalida("campo obbligatorio");
                }
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }// </editor-fold>

    //CONTROLLO DATI LOGIN
    // <editor-fold defaultstate="collapsed">
    public boolean ControlloDatiLogin(String username, String password) {
        if (UsernameEsistente(username)) {
            if (username.equals(PLACEHOLDER_USERNAME) || password.equals(PLACEHOLDER_PASSWORD)) {
                if (username.equals(PLACEHOLDER_USERNAME)) {
                    UsernameInvalidoLogin("campo obbligatorio");
                }
                if (password.equals(PLACEHOLDER_PASSWORD)) {
                    PasswordInvalidaLogin("campo obbligatorio");
                }
                return false;
            } else {
                if (ControlloPassword(username, password)) {
                    return true;
                }
                UsernameInvalidoLogin("username o password errati");
                PasswordInvalidaLogin("username o password errati");
                return false;
            }
        } else {
            UsernameInvalidoLogin("username o password errati");
            PasswordInvalidaLogin("username o password errati");
            return false;
        }
    }// </editor-fold>

//GESTIONE UTENTI
    //GET UTENTE
    // <editor-fold defaultstate="collapsed">
    @SuppressWarnings("unchecked")
    public ArrayList<Utente> getListaUtenti() {
        try {
            FileInputStream file = new FileInputStream("Utenti.dat");
            ObjectInputStream input = new ObjectInputStream(file);
            ArrayList<Utente> lista = (ArrayList<Utente>) input.readObject();
            input.close();
            file.close();
            return lista;
        } catch (Exception e) {
            return null;
        }
    }

    public Utente getUtente(String username) {
        username = username.toLowerCase();
        ArrayList<Utente> utenti = getListaUtenti();
        if (utenti != null) {
            for (int i = 0; i < utenti.size(); i++) {
                Utente temp = utenti.get(i);
                if (temp.getUsername().toLowerCase().equals(username)) {
                    return temp;
                }
            }
        }
        return null;
    }// </editor-fold>

    //REGISTRA UTENTE
    // <editor-fold defaultstate="collapsed">
    public void RegistraUtente(String username, String password) {
        try {
            ArrayList<Utente> listaUtenti = getListaUtenti();
            if (listaUtenti == null) {
                listaUtenti = new ArrayList<>();
            }
            Utente nuovoUtente = new Utente(username, password);
            listaUtenti.add(nuovoUtente);
            java.io.FileOutputStream fileOut = new java.io.FileOutputStream("Utenti.dat");
            java.io.ObjectOutputStream out = new java.io.ObjectOutputStream(fileOut);
            out.writeObject(listaUtenti);
            out.close();
            fileOut.close();
            txtUsername.setText(PLACEHOLDER_USERNAME);
            pswPassword.setText(PLACEHOLDER_PASSWORD);
            pswConfermaPassword.setText(PLACEHOLDER_CONFERMA_PASSWORD);
            pswPassword.setEchoChar((char) 0);
            pswConfermaPassword.setEchoChar((char) 0);

            //CODICE DOPO CHE IL REGISTRATI VIENE EFFETTUATO CORRETTAMENTE
            javax.swing.JOptionPane.showMessageDialog(this, "Registrazione completata con successo!", "Successo", javax.swing.JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }// </editor-fold>

    //LOGIN UTENTE
    // <editor-fold defaultstate="collapsed">
    private void LoginUtente(String username, String password) {
        txtUsernameLogin.setText(PLACEHOLDER_USERNAME);
        pswPasswordLogin.setText(PLACEHOLDER_PASSWORD);
        pswPasswordLogin.setEchoChar((char) 0);

        //CODICE DOPO CHE IL LOGIN VIENE EFFETTUATO CORRETTAMENTE
        javax.swing.JOptionPane.showMessageDialog(this, "Login completato con successo!", "Successo", javax.swing.JOptionPane.INFORMATION_MESSAGE);

    }// </editor-fold>

//CONFIGURAZIONE FONT
    // <editor-fold defaultstate="collapsed">
    public void RegistraFont() {
        try {
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/fonts/Montserrat-Regular.ttf")));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/fonts/Montserrat-Bold.ttf")));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("/fonts/Montserrat-SemiBold.ttf")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }// </editor-fold>

//MAIN
    // <editor-fold defaultstate="collapsed">
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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }// </editor-fold>

//DICHIARAZIONI DEI COMPONENTI    
    //CODICE DI NETBEANS
    // <editor-fold defaultstate="collapsed">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componenti.RoundButton btnAnnulla;
    private componenti.RoundButton btnAnnulla1;
    private componenti.RoundButton btnLogin;
    private componenti.RoundButton btnRegistrati;
    private javax.swing.Box.Filler flrSpazio1;
    private javax.swing.Box.Filler flrSpazio2;
    private javax.swing.Box.Filler flrSpazio3;
    private componenti.GradientPanel gradientPanel1;
    private componenti.GradientPanel grdGradiente;
    private componenti.GradientPanel grdGradiente1;
    private componenti.ImageLabel imageLabel1;
    private componenti.ImageLabel imgLogo;
    private componenti.ImageLabel imgLogo1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblConfermaPassword;
    private javax.swing.JLabel lblIstruzioni;
    private javax.swing.JLabel lblIstruzioni1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPasswordLogin;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsernameLogin;
    private javax.swing.JPanel pnlBottoni;
    private javax.swing.JPanel pnlBottoni1;
    private javax.swing.JPanel pnlDati;
    private javax.swing.JPanel pnlDati1;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlRegistrati;
    private javax.swing.JPanel pnlWelcome;
    private componenti.RoundPasswordFieldIcon pswConfermaPassword;
    private componenti.RoundPasswordFieldIcon pswPassword;
    private componenti.RoundPasswordFieldIcon pswPasswordLogin;
    private componenti.RoundButton roundButton1;
    private componenti.RoundButton roundButton2;
    private javax.swing.JSeparator sprLinea1;
    private javax.swing.JSeparator sprLinea2;
    private javax.swing.JSeparator sprLinea3;
    private javax.swing.JSeparator sprLinea4;
    private componenti.RoundTextFieldIcon txtUsername;
    private componenti.RoundTextFieldIcon txtUsernameLogin;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>

}
