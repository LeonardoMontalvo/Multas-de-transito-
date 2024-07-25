package Vista;


import Controlador.ConexionBDD;
import Controlador.InfraccionControlador;
import Controlador.MultasControlador;
import Controlador.PuntosControlador;
import Modelo.Infraccion_Multas;
import Modelo.Usuario;
import Modelo.Vehiculo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import Modelo.Pdfs;
import Modelo.Propietario;
import java.awt.Desktop;
import java.io.File;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Leo
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        actualizarTotalPagar();
        actualizarCedula();
        setModeloMultas();
        
        setModeloInfraccion();
        
        setModeloPropietario();
        
    }

private MultasControlador multasControlador = new MultasControlador();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jPanel15 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        btnBuscarmultas = new javax.swing.JButton();
        btnEditarCli = new javax.swing.JButton();
        btnEliminarCli = new javax.swing.JButton();
        btnNuevaMulta = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        PDF1 = new javax.swing.JLabel();
        btnPDFClientes = new javax.swing.JButton();
        jLabel80 = new javax.swing.JLabel();
        FechaEmision = new com.toedter.calendar.JDateChooser();
        jLabel51 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        txtPlacaM = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        txtTotalPagarM = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txaArticuloLiteral = new javax.swing.JTextArea();
        cbbTipo = new javax.swing.JComboBox<>();
        jLabel81 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JLabel();
        txtNombreM = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableMultas = new javax.swing.JTable();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        jPanel19 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        btnBuscarAbono = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        PDF4 = new javax.swing.JLabel();
        btnPDFPuntos = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        txtCedulaL = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblPuntos = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        lblLicencias = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTablePuntos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableInfraccion = new javax.swing.JTable();
        jPanelContratos = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        btnBuscarInfraccion = new javax.swing.JButton();
        btnEditarContrato = new javax.swing.JButton();
        btnEliminarContrato = new javax.swing.JButton();
        btnNuevaInfraccion = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        PDF3 = new javax.swing.JLabel();
        btnPDFContrato = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        txtCitacion = new javax.swing.JTextField();
        FechaNotificacion = new com.toedter.calendar.JDateChooser();
        jLabel82 = new javax.swing.JLabel();
        FechaPago = new com.toedter.calendar.JDateChooser();
        jLabel83 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        txtPuntosInfraccion = new javax.swing.JTextField();
        jPanel42 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        cbbEntidad = new javax.swing.JComboBox<>();
        txtIPlacaInfraccion = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JLabel();
        jInternalFrame5 = new javax.swing.JInternalFrame();
        jPanel14 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        btnCTE = new javax.swing.JButton();
        btnATM = new javax.swing.JButton();
        btnSantoDomingo = new javax.swing.JButton();
        btnCuenca = new javax.swing.JButton();
        btnANT = new javax.swing.JButton();
        btnAmbato = new javax.swing.JButton();
        lblPagar_Icono = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnMultas = new javax.swing.JButton();
        btnPuntos = new javax.swing.JButton();
        btnPago = new javax.swing.JButton();
        btnInfraccion = new javax.swing.JButton();
        tipo = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(229, 240, 238));
        jDesktopPane1.setForeground(new java.awt.Color(229, 240, 238));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jInternalFrame2.setPreferredSize(new java.awt.Dimension(1110, 600));
        jInternalFrame2.setVisible(true);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setForeground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 0));
        jLabel46.setText("Nombres");
        jPanel15.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 80, -1));

        jLabel49.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setText("Cedula");
        jPanel15.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jPanel28.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 140, 2));

        jPanel31.setBackground(new java.awt.Color(8, 248, 206));

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Listado de Multas ");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel50)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel15.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 60));

        jPanel33.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 320, 2));

        btnBuscarmultas.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscarmultas.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Lupa.png")); // NOI18N
        btnBuscarmultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarmultasActionPerformed(evt);
            }
        });
        jPanel15.add(btnBuscarmultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 40, 35));

        btnEditarCli.setBackground(new java.awt.Color(204, 204, 204));
        btnEditarCli.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Modificar.png")); // NOI18N
        btnEditarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCliActionPerformed(evt);
            }
        });
        jPanel15.add(btnEditarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 40, 40));

        btnEliminarCli.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarCli.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\eliminar.png")); // NOI18N
        btnEliminarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCliActionPerformed(evt);
            }
        });
        jPanel15.add(btnEliminarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 40, 35));

        btnNuevaMulta.setBackground(new java.awt.Color(204, 204, 204));
        btnNuevaMulta.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\nuevo.png")); // NOI18N
        btnNuevaMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaMultaActionPerformed(evt);
            }
        });
        jPanel15.add(btnNuevaMulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 40, 35));

        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Buscar");
        jPanel15.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 70, -1));

        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Editar");
        jPanel15.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 40, -1));

        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Nuevo");
        jPanel15.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 60, -1));

        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Eliminar");
        jPanel15.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 60, -1));

        PDF1.setForeground(new java.awt.Color(0, 0, 0));
        PDF1.setText("PDF : ");
        jPanel15.add(PDF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 60, -1));

        btnPDFClientes.setBackground(new java.awt.Color(187, 187, 187));
        btnPDFClientes.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\PDF.png")); // NOI18N
        btnPDFClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFClientesActionPerformed(evt);
            }
        });
        jPanel15.add(btnPDFClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 40, 40));

        jLabel80.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(0, 0, 0));
        jLabel80.setText("Tipo de Multa");
        jPanel15.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 190, -1));

        FechaEmision.setBackground(new java.awt.Color(204, 204, 204));
        FechaEmision.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel15.add(FechaEmision, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 230, 30));

        jLabel51.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("Placa");
        jPanel15.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jPanel29.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 140, 2));

        txtPlacaM.setBackground(new java.awt.Color(255, 255, 255));
        txtPlacaM.setBorder(null);
        txtPlacaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaMActionPerformed(evt);
            }
        });
        txtPlacaM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPlacaMKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPlacaMKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlacaMKeyTyped(evt);
            }
        });
        jPanel15.add(txtPlacaM, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 140, 30));

        jLabel55.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 0, 0));
        jLabel55.setText("Total a Pagar:");
        jPanel15.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, -1));

        jPanel30.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, 90, 2));

        txtTotalPagarM.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalPagarM.setBorder(null);
        txtTotalPagarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPagarMActionPerformed(evt);
            }
        });
        txtTotalPagarM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTotalPagarMKeyReleased(evt);
            }
        });
        jPanel15.add(txtTotalPagarM, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, 90, 30));

        jLabel64.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 0, 0));
        jLabel64.setText("Artículo/Literal");
        jPanel15.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 160, -1));

        txaArticuloLiteral.setBackground(new java.awt.Color(204, 204, 204));
        txaArticuloLiteral.setColumns(20);
        txaArticuloLiteral.setRows(5);
        txaArticuloLiteral.setBorder(null);
        jScrollPane6.setViewportView(txaArticuloLiteral);

        jPanel15.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 320, 90));

        cbbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendientes", "Anuladas", "Pagadas" }));
        cbbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTipoActionPerformed(evt);
            }
        });
        jPanel15.add(cbbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 220, 30));

        jLabel81.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(0, 0, 0));
        jLabel81.setText("Fecha de Emisión");
        jPanel15.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 170, -1));
        jPanel15.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 150, 30));
        jPanel15.add(txtNombreM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 320, 30));

        jTableMultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableMultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMultasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableMultas);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
            .addComponent(jScrollPane3)
        );

        jTabbedPane1.addTab("1", jInternalFrame2);

        jInternalFrame3.setVisible(true);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setForeground(new java.awt.Color(255, 255, 255));
        jPanel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel19MouseClicked(evt);
            }
        });
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel45.setBackground(new java.awt.Color(8, 248, 206));

        jLabel65.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 0, 0));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("Puntos de Licencia");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel65)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel19.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 60));

        btnBuscarAbono.setBackground(new java.awt.Color(187, 187, 187));
        btnBuscarAbono.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Lupa.png")); // NOI18N
        btnBuscarAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAbonoActionPerformed(evt);
            }
        });
        jPanel19.add(btnBuscarAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, 40, 40));

        jLabel67.setForeground(new java.awt.Color(0, 0, 0));
        jLabel67.setText("Buscar :");
        jPanel19.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 550, 60, -1));

        PDF4.setForeground(new java.awt.Color(0, 0, 0));
        PDF4.setText("PDF : ");
        jPanel19.add(PDF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 60, -1));

        btnPDFPuntos.setBackground(new java.awt.Color(187, 187, 187));
        btnPDFPuntos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\PDF.png")); // NOI18N
        btnPDFPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFPuntosActionPerformed(evt);
            }
        });
        jPanel19.add(btnPDFPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 40, 40));

        jLabel47.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setText("Identificación");
        jPanel19.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel66.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 0, 0));
        jLabel66.setText("Nombres ");
        jPanel19.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 90, -1));

        jPanel32.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 220, 2));

        jPanel34.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 180, 2));

        txtCedulaL.setBackground(new java.awt.Color(255, 255, 255));
        txtCedulaL.setBorder(null);
        txtCedulaL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaLActionPerformed(evt);
            }
        });
        txtCedulaL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaLKeyReleased(evt);
            }
        });
        jPanel19.add(txtCedulaL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 180, 30));

        jLabel74.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(0, 0, 0));
        jLabel74.setText("Puntos");
        jPanel19.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jPanel35.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 50, 2));

        jLabel75.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(0, 0, 0));
        jLabel75.setText("Licencias:");
        jPanel19.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));
        jPanel19.add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 220, 30));
        jPanel19.add(lblPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 50, 30));

        jPanel36.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 100, 2));
        jPanel19.add(lblLicencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 50, 30));

        jTablePuntos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablePuntos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePuntosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTablePuntos);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Multas\\src\\main\\resource\\Imagenes\\tipos-de-licencias-768x560.jpg")); // NOI18N

        javax.swing.GroupLayout jInternalFrame3Layout = new javax.swing.GroupLayout(jInternalFrame3.getContentPane());
        jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
        jInternalFrame3Layout.setHorizontalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jInternalFrame3Layout.setVerticalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
            .addComponent(jScrollPane4)
            .addGroup(jInternalFrame3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("2", jInternalFrame3);

        jInternalFrame1.setVisible(true);

        jTableInfraccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableInfraccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableInfraccionMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableInfraccion);

        jPanelContratos.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContratos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel38.setBackground(new java.awt.Color(8, 248, 206));

        jLabel56.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 0, 0));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Detalle de infraccion");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel56)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanelContratos.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 60));

        btnBuscarInfraccion.setBackground(new java.awt.Color(204, 204, 204));
        btnBuscarInfraccion.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Lupa.png")); // NOI18N
        btnBuscarInfraccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarInfraccionActionPerformed(evt);
            }
        });
        jPanelContratos.add(btnBuscarInfraccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 40, 35));

        btnEditarContrato.setBackground(new java.awt.Color(204, 204, 204));
        btnEditarContrato.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Modificar.png")); // NOI18N
        btnEditarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarContratoActionPerformed(evt);
            }
        });
        jPanelContratos.add(btnEditarContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 40, 40));

        btnEliminarContrato.setBackground(new java.awt.Color(204, 204, 204));
        btnEliminarContrato.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\eliminar.png")); // NOI18N
        btnEliminarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarContratoActionPerformed(evt);
            }
        });
        jPanelContratos.add(btnEliminarContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 40, 35));

        btnNuevaInfraccion.setBackground(new java.awt.Color(204, 204, 204));
        btnNuevaInfraccion.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\nuevo.png")); // NOI18N
        btnNuevaInfraccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaInfraccionActionPerformed(evt);
            }
        });
        jPanelContratos.add(btnNuevaInfraccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 40, 35));

        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Buscar");
        jPanelContratos.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 70, -1));

        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Editar");
        jPanelContratos.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 40, -1));

        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setText("Nuevo");
        jPanelContratos.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 60, -1));

        jLabel59.setForeground(new java.awt.Color(0, 0, 0));
        jLabel59.setText("Eliminar");
        jPanelContratos.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 60, -1));

        jPanel41.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelContratos.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 492, 50, 0));

        jPanel56.setBackground(new java.awt.Color(0, 110, 255));

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelContratos.add(jPanel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 312, 220, 0));

        PDF3.setForeground(new java.awt.Color(0, 0, 0));
        PDF3.setText("PDF : ");
        jPanelContratos.add(PDF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 60, -1));

        btnPDFContrato.setBackground(new java.awt.Color(187, 187, 187));
        btnPDFContrato.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\PDF.png")); // NOI18N
        btnPDFContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFContratoActionPerformed(evt);
            }
        });
        jPanelContratos.add(btnPDFContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, 40, 40));

        jLabel52.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setText("Entidad");
        jPanelContratos.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, -1));

        jPanel39.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanelContratos.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 180, 2));

        txtCitacion.setBackground(new java.awt.Color(255, 255, 255));
        txtCitacion.setBorder(null);
        txtCitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCitacionActionPerformed(evt);
            }
        });
        jPanelContratos.add(txtCitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 180, 30));

        FechaNotificacion.setBackground(new java.awt.Color(204, 204, 204));
        FechaNotificacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelContratos.add(FechaNotificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 230, 30));

        jLabel82.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(0, 0, 0));
        jLabel82.setText("Fecha de Notificación");
        jPanelContratos.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 180, -1));

        FechaPago.setBackground(new java.awt.Color(204, 204, 204));
        FechaPago.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelContratos.add(FechaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 230, 30));

        jLabel83.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(0, 0, 0));
        jLabel83.setText("Fecha límite de pago");
        jPanelContratos.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 170, -1));

        jLabel54.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 0));
        jLabel54.setText("Citación");
        jPanelContratos.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel57.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 0, 0));
        jLabel57.setText("Puntos");
        jPanelContratos.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 80, -1));

        jPanel40.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanelContratos.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 60, 2));

        txtPuntosInfraccion.setBackground(new java.awt.Color(255, 255, 255));
        txtPuntosInfraccion.setBorder(null);
        txtPuntosInfraccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPuntosInfraccionActionPerformed(evt);
            }
        });
        jPanelContratos.add(txtPuntosInfraccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 60, 30));

        jPanel42.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanelContratos.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 180, 2));

        jLabel60.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(0, 0, 0));
        jLabel60.setText("Placa");
        jPanelContratos.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 50, -1));

        jLabel61.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(0, 0, 0));
        jLabel61.setText("Total a pagar");
        jPanelContratos.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 100, -1));

        jPanel43.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanelContratos.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 60, 2));

        cbbEntidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pagar multas ANT / Policía Nacional", "Pagar multas CTE / Comisión de Tránsito del Ecuador", "Pagar multas ATM / Guayaquil", "Pagar multas Santo Domingo", "Pagar multas EMOV EP - Cuenca", "Pagar multas Ambato" }));
        cbbEntidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbEntidadActionPerformed(evt);
            }
        });
        jPanelContratos.add(cbbEntidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 220, 30));
        jPanelContratos.add(txtIPlacaInfraccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 180, 30));
        jPanelContratos.add(txtTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 60, 30));

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jPanelContratos, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1091, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
            .addComponent(jPanelContratos, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("3", jInternalFrame1);

        jInternalFrame5.setVisible(true);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jPanel24.setBackground(new java.awt.Color(8, 248, 206));

        jLabel44.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Pagar multas de tránsito");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel44)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btnCTE.setBackground(new java.awt.Color(255, 255, 255));
        btnCTE.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCTE.setForeground(new java.awt.Color(0, 0, 0));
        btnCTE.setText("Pagar multas CTE / Comisión de Tránsito del Ecuador");
        btnCTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCTEActionPerformed(evt);
            }
        });

        btnATM.setBackground(new java.awt.Color(255, 255, 255));
        btnATM.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnATM.setForeground(new java.awt.Color(0, 0, 0));
        btnATM.setText("Pagar multas ATM / Guayaquil");
        btnATM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnATMActionPerformed(evt);
            }
        });

        btnSantoDomingo.setBackground(new java.awt.Color(255, 255, 255));
        btnSantoDomingo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSantoDomingo.setForeground(new java.awt.Color(0, 0, 0));
        btnSantoDomingo.setText("Pagar multas Santo Domingo");
        btnSantoDomingo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSantoDomingoActionPerformed(evt);
            }
        });

        btnCuenca.setBackground(new java.awt.Color(255, 255, 255));
        btnCuenca.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCuenca.setForeground(new java.awt.Color(0, 0, 0));
        btnCuenca.setText("Pagar multas EMOV EP - Cuenca");
        btnCuenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuencaActionPerformed(evt);
            }
        });

        btnANT.setBackground(new java.awt.Color(255, 255, 255));
        btnANT.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnANT.setForeground(new java.awt.Color(0, 0, 0));
        btnANT.setText("Pagar multas ANT / Policía Nacional");
        btnANT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnANTActionPerformed(evt);
            }
        });

        btnAmbato.setBackground(new java.awt.Color(255, 255, 255));
        btnAmbato.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAmbato.setForeground(new java.awt.Color(0, 0, 0));
        btnAmbato.setText("Pagar multas Ambato");
        btnAmbato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmbatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCTE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnANT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnATM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSantoDomingo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCuenca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAmbato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnANT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnCTE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnATM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnSantoDomingo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnCuenca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnAmbato, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        lblPagar_Icono.setBackground(new java.awt.Color(187, 187, 187));
        lblPagar_Icono.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Multas\\src\\main\\resource\\Imagenes\\pagarmultassss.png")); // NOI18N

        javax.swing.GroupLayout jInternalFrame5Layout = new javax.swing.GroupLayout(jInternalFrame5.getContentPane());
        jInternalFrame5.getContentPane().setLayout(jInternalFrame5Layout);
        jInternalFrame5Layout.setHorizontalGroup(
            jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPagar_Icono, javax.swing.GroupLayout.PREFERRED_SIZE, 1053, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jInternalFrame5Layout.setVerticalGroup(
            jInternalFrame5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jInternalFrame5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPagar_Icono, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("4", jInternalFrame5);

        jDesktopPane1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1490, 670));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 1530, 800));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jPanel1.setBackground(new java.awt.Color(229, 240, 238));

        btnMultas.setBackground(new java.awt.Color(8, 248, 206));
        btnMultas.setForeground(new java.awt.Color(0, 0, 0));
        btnMultas.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\contract_icon_194172.png")); // NOI18N
        btnMultas.setText("Multas");
        btnMultas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnMultas.setFocusable(false);
        btnMultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultasActionPerformed(evt);
            }
        });

        btnPuntos.setBackground(new java.awt.Color(8, 248, 206));
        btnPuntos.setForeground(new java.awt.Color(0, 0, 0));
        btnPuntos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Clientes.png")); // NOI18N
        btnPuntos.setText("Puntos de Licencia");
        btnPuntos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPuntos.setFocusable(false);
        btnPuntos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntosActionPerformed(evt);
            }
        });

        btnPago.setBackground(new java.awt.Color(8, 248, 206));
        btnPago.setForeground(new java.awt.Color(0, 0, 0));
        btnPago.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Carrito-de-compras.png")); // NOI18N
        btnPago.setText("Pagar multas");
        btnPago.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPago.setFocusable(false);
        btnPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagoActionPerformed(evt);
            }
        });

        btnInfraccion.setBackground(new java.awt.Color(8, 248, 206));
        btnInfraccion.setForeground(new java.awt.Color(0, 0, 0));
        btnInfraccion.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Geaturim\\src\\main\\resource\\Imagenes\\Mantenimiento.png")); // NOI18N
        btnInfraccion.setText("Detalle de infraccion");
        btnInfraccion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInfraccion.setFocusable(false);
        btnInfraccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnInfraccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInfraccionMouseClicked(evt);
            }
        });
        btnInfraccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfraccionActionPerformed(evt);
            }
        });

        tipo.setForeground(new java.awt.Color(255, 255, 255));

        lblLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leo\\Documents\\NetBeansProjects\\Multas\\src\\main\\resource\\Imagenes\\logo_3.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnPago, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnInfraccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMultas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPuntos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(tipo)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblLogo)
                .addGap(96, 96, 96)
                .addComponent(btnMultas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tipo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPuntos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110)
                .addComponent(btnInfraccion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(btnPago, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 860));

        jPanel4.setBackground(new java.awt.Color(229, 240, 238));

        jLabel38.setBackground(new java.awt.Color(0, 0, 0));
        jLabel38.setFont(new java.awt.Font("Yu Gothic Light", 3, 36)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Consultar multas ANT por placa o cédula - Ecuador");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(318, Short.MAX_VALUE)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 1152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1530, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultasActionPerformed
        limpiarMultas();
        limpiarTablaMultas();
        setModeloMultas();
        actualizarMulta();
        jTabbedPane1.setSelectedIndex(0);
        actualizarMulta();
        setModeloMultas();
        limpiarTablaMultas();
        limpiarMultas();

    }//GEN-LAST:event_btnMultasActionPerformed

    private void btnPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntosActionPerformed
        limpiarDatosPropietario();
        limpiarPuntos();
        jTabbedPane1.setSelectedIndex(1);
        limpiarPuntos();
        limpiarDatosPropietario();
        
    }//GEN-LAST:event_btnPuntosActionPerformed

    private void btnPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagoActionPerformed

            jTabbedPane1.setSelectedIndex(3);

    }//GEN-LAST:event_btnPagoActionPerformed

    private void btnInfraccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfraccionMouseClicked

    }//GEN-LAST:event_btnInfraccionMouseClicked

    private void btnInfraccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfraccionActionPerformed
        limpiarDetalleInfraccion();
        limpiarTablaInfraccion();
       setModeloInfraccion();
        jTabbedPane1.setSelectedIndex(2);
        setModeloInfraccion();
        limpiarTablaInfraccion();

    }//GEN-LAST:event_btnInfraccionActionPerformed

    private void btnPDFContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFContratoActionPerformed

        String[] opciones = {"Crear PDF", "Abrir PDF"};
        int opcionSeleccionada = JOptionPane.showOptionDialog(null, "¿Qué deseas hacer?", "Opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (opcionSeleccionada == 0) {

            String fileName = "reporte Contratos.pdf";
            String titulo = "Reporte de Contratos de Geaturim";
            Pdfs.generarPDF(jTableInfraccion, fileName, titulo);
        } else if (opcionSeleccionada == 1) {
            try {
                String fileName = "reporte Contratos.pdf";
                File file = new File(fileName);

                if (!Desktop.isDesktopSupported()) {
                    JOptionPane.showMessageDialog(null, "El sistema no soporta la apertura automática de archivos.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Desktop desktop = Desktop.getDesktop();

                if (file.exists() && file.isFile()) {
                    desktop.open(file);
                } else {
                    JOptionPane.showMessageDialog(null, "El archivo PDF no existe o no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al intentar abrir el archivo PDF: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnPDFContratoActionPerformed

    private void btnNuevaInfraccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaInfraccionActionPerformed
      int idMulta = multasControlador.getIdMulta(); 
    if (idMulta == 0) {
        JOptionPane.showMessageDialog(this, "ID de multa no encontrado. Por favor, complete el primer formulario correctamente.");
        return;
    }
    
    String entidad = (String) cbbEntidad.getSelectedItem(); 
    String citacion = txtCitacion.getText();
    java.util.Date fechaNotificacion = FechaNotificacion.getDate();
    java.util.Date fechaLimite = FechaPago.getDate();

    if (entidad == null || entidad.isEmpty() || citacion.isEmpty() || fechaNotificacion == null || fechaLimite == null) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos del segundo formulario.");
        return;
    }

    InfraccionControlador infraccionControlador = new InfraccionControlador();
    
    try {
        int puntosARestar = calcularPuntosARestar();
        infraccionControlador.insertarDatosAdicionales(idMulta, entidad, citacion, fechaNotificacion, fechaLimite, puntosARestar);
        JOptionPane.showMessageDialog(this, "Datos adicionales guardados correctamente.");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al guardar los datos adicionales: " + e.getMessage());
    }
}  

private int calcularPuntosARestar() {
    String puntosTexto = txtPuntosInfraccion.getText();
    
    int puntosARestar = 0;
    
    try {
        puntosARestar = Integer.parseInt(puntosTexto);
        
        puntosARestar = Math.max(puntosARestar, 1); 
        puntosARestar = Math.min(puntosARestar, 30); 
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El valor ingresado no es válido. Debe ser un número entero.");
    }
    
    return puntosARestar; 
    }//GEN-LAST:event_btnNuevaInfraccionActionPerformed

    private void btnEditarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarContratoActionPerformed
//        int filaSeleccionada = jTableContrato.getSelectedRow();
//
//        if (filaSeleccionada >= 0) {
//            try {
//                DefaultTableModel modelo = (DefaultTableModel) jTableContrato.getModel();
//
//                int contratoId = Integer.parseInt(modelo.getValueAt(filaSeleccionada, 0).toString());
//
//                String nuevaPlaca = cbbPlacas.getSelectedItem().toString();
//                String nuevaCedulaCliente = cbbCliente.getSelectedItem().toString();
//                String nuevoDestino = txtDestino.getText();
//                Date nuevaFecha = FeachaContrato.getDate();
//                String nuevoConductor = txtConductor1.getText();
//                int nuevosDias = Integer.parseInt(txtDias.getText());
//                int nuevosAsientos = Integer.parseInt(txtAsientos.getText());
//
//                java.sql.Date sqlNuevaFecha = new java.sql.Date(nuevaFecha.getTime());
//
//                ContratoControlador controlador = new ContratoControlador();
//                boolean exito = controlador.editarContrato(contratoId, nuevaPlaca, nuevaCedulaCliente, nuevoDestino, sqlNuevaFecha, nuevoConductor, nuevosDias, nuevosAsientos);
//
//                if (exito) {
//                    modelo.setValueAt(nuevaPlaca, filaSeleccionada, 1);
//                    modelo.setValueAt(nuevaCedulaCliente, filaSeleccionada, 2);
//                    modelo.setValueAt(nuevoDestino, filaSeleccionada, 3);
//                    modelo.setValueAt(nuevaFecha, filaSeleccionada, 4);
//                    modelo.setValueAt(nuevoConductor, filaSeleccionada, 5);
//                    modelo.setValueAt(nuevosDias, filaSeleccionada, 6);
//                    modelo.setValueAt(nuevosAsientos, filaSeleccionada, 7);
//
//                    JOptionPane.showMessageDialog(null, "Contrato editado con éxito.");
//                } else {
//                    JOptionPane.showMessageDialog(null, "Error al editar el contrato.");
//                }
//            } catch (NumberFormatException e) {
//                JOptionPane.showMessageDialog(null, "Por favor, ingrese valores numéricos válidos para días y asientos.");
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, "Error al editar el contrato: " + e.getMessage());
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Seleccione una fila para editar.");
//        }
    }//GEN-LAST:event_btnEditarContratoActionPerformed

    private void btnBuscarInfraccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarInfraccionActionPerformed
buscarInfracciones();
    }//GEN-LAST:event_btnBuscarInfraccionActionPerformed
private void buscarInfracciones() {
    String cedula = txtIPlacaInfraccion.getText();
    String placa = txtIPlacaInfraccion.getText();
    String cedulaPlaca = "";

    if (!cedula.isEmpty()) {
        cedulaPlaca = cedula;
    } else if (!placa.isEmpty()) {
        cedulaPlaca = placa;
    } else {
        JOptionPane.showMessageDialog(null, "Ingrese la cédula o placa para buscar las infracciones.");
        return;
    }

    InfraccionControlador infraccionControlador = new InfraccionControlador();
    ArrayList<Object[]> resultados = infraccionControlador.buscarInfracciones(cedulaPlaca);

    DefaultTableModel modelo = (DefaultTableModel) jTableInfraccion.getModel();
    modelo.setRowCount(0); 

    if (resultados != null && !resultados.isEmpty()) {
        for (Object[] fila : resultados) {
            modelo.addRow(fila); 
        }
    } else {
        JOptionPane.showMessageDialog(null, "No se encontraron infracciones para la cédula o placa ingresada.");
    }
}

    private void jTableInfraccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableInfraccionMouseClicked
   DefaultTableModel modelo = (DefaultTableModel) jTableInfraccion.getModel();
    int selectedRow = jTableInfraccion.getSelectedRow();

    // Asegurarse de que se ha seleccionado una fila
    if (selectedRow != -1) {
        // Obtener los valores de las celdas seleccionadas
        String entidad = (String) modelo.getValueAt(selectedRow, 1);
        String citacion = (String) modelo.getValueAt(selectedRow, 2);
        Date fechaNotificacion = (Date) modelo.getValueAt(selectedRow, 3);
        Date fechaLimite = (Date) modelo.getValueAt(selectedRow, 4);
        BigDecimal puntosInfraccion = (BigDecimal) modelo.getValueAt(selectedRow, 5);
        BigDecimal totalPagar = (BigDecimal) modelo.getValueAt(selectedRow, 6);

        // Rellenar los campos de texto con los valores obtenidos
        cbbEntidad.setSelectedItem(entidad);
        txtCitacion.setText(citacion);
        FechaNotificacion.setDate(fechaNotificacion);
        FechaPago.setDate(fechaLimite);
        txtPuntosInfraccion.setText(puntosInfraccion.toPlainString());
        txtTotalPagar.setText(txtTotalPagarM.getText()); 
        txtIPlacaInfraccion.setText(txtPlacaM.getText());
    } else {
        // Mostrar un mensaje de error si no se ha seleccionado una fila
        JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila.");
    }
    }//GEN-LAST:event_jTableInfraccionMouseClicked
private void actualizarTotalPagar() {
    txtTotalPagar.setText(txtTotalPagarM.getText());
}

    private void jPanel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseClicked

    }//GEN-LAST:event_jPanel19MouseClicked

    private void btnPDFPuntosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFPuntosActionPerformed
        String nombrePropietario = buscarDatosPorCedula();

    if (nombrePropietario == null || nombrePropietario.isEmpty()) {
        JOptionPane.showMessageDialog(this, "No se encontró el propietario para la cédula ingresada.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String[] opciones = {"Crear PDF", "Abrir PDF"};
    int opcionSeleccionada = JOptionPane.showOptionDialog(null, "¿Qué deseas hacer?", "Opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

    if (opcionSeleccionada == 0) {
        String fileName = "reporte_Puntos.pdf";
        String titulo = "Reporte de Puntos de " + nombrePropietario;
        Pdfs.generarPDF(jTablePuntos, fileName, titulo);
    } else if (opcionSeleccionada == 1) {
        try {
            String fileName = "reporte_Puntos.pdf";
            File file = new File(fileName);

            if (!Desktop.isDesktopSupported()) {
                JOptionPane.showMessageDialog(null, "El sistema no soporta la apertura automática de archivos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Desktop desktop = Desktop.getDesktop();

            if (file.exists() && file.isFile()) {
                desktop.open(file);
            } else {
                JOptionPane.showMessageDialog(null, "El archivo PDF no existe o no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al intentar abrir el archivo PDF: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_btnPDFPuntosActionPerformed

    private void btnBuscarAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAbonoActionPerformed
    buscarPuntosLicencia();
    }//GEN-LAST:event_btnBuscarAbonoActionPerformed
private void buscarPuntosLicencia() {
    String cedula = txtCedulaL.getText();

    if (cedula.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Ingrese la cédula para buscar los puntos de licencia.");
        return;
    }

    PuntosControlador propietarioControlador = new PuntosControlador();
    ArrayList<Object[]> resultados = propietarioControlador.buscarPuntosLicencia(cedula);

    DefaultTableModel modelo = (DefaultTableModel) jTablePuntos.getModel();
    modelo.setRowCount(0); 

    if (resultados != null && !resultados.isEmpty()) {
        for (Object[] fila : resultados) {
            modelo.addRow(fila); 
        }
    } else {
        JOptionPane.showMessageDialog(null, "No se encontraron puntos de licencia para la cédula ingresada.");
    }
}
    private void jTableMultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMultasMouseClicked
 DefaultTableModel modelo = (DefaultTableModel) jTableMultas.getModel();
    int selectedRow = jTableMultas.getSelectedRow();

    String placa = (String) modelo.getValueAt(selectedRow, 1);
    String articuloLiteral = (String) modelo.getValueAt(selectedRow, 2);
    Date fechaEmision = (Date) modelo.getValueAt(selectedRow, 3);
    String tipo = (String) modelo.getValueAt(selectedRow, 4);
    BigDecimal totalPagar = (BigDecimal) modelo.getValueAt(selectedRow, 5);

    txtPlacaM.setText(placa);
    txaArticuloLiteral.setText(articuloLiteral);
    FechaEmision.setDate(fechaEmision);
    cbbTipo.setSelectedItem(tipo);
    txtTotalPagarM.setText(totalPagar.toPlainString()); 


    MultasControlador multasControlador = new MultasControlador();

        String nombre = multasControlador.obtenerNombrePropietarioPorPlaca(placa);
        String cedula = multasControlador.obtenerCedulaPropietarioPorPlaca(placa);

    txtNombreM.setText(nombre);
    txtCedula.setText(cedula);
    }//GEN-LAST:event_jTableMultasMouseClicked

    private void btnPDFClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFClientesActionPerformed

        String[] opciones = {"Crear PDF", "Abrir PDF"};
        int opcionSeleccionada = JOptionPane.showOptionDialog(null, "¿Qué deseas hacer?", "Opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (opcionSeleccionada == 0) {

            String fileName = "reporte de Multas.pdf";
            String titulo = "Reporte de Multas";
            Pdfs.generarPDF(jTableMultas, fileName, titulo);
        } else if (opcionSeleccionada == 1) {
            try {
                String fileName = "reporte de Multas.pdf";
                File file = new File(fileName);

                if (!Desktop.isDesktopSupported()) {
                    JOptionPane.showMessageDialog(null, "El sistema no soporta la apertura automática de archivos.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Desktop desktop = Desktop.getDesktop();

                if (file.exists() && file.isFile()) {
                    desktop.open(file);
                } else {
                    JOptionPane.showMessageDialog(null, "El archivo PDF no existe o no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al intentar abrir el archivo PDF: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnPDFClientesActionPerformed

    private void btnNuevaMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaMultaActionPerformed
    String placa = txtPlacaM.getText(); 
    String articuloLiteral = txaArticuloLiteral.getText();
    java.util.Date fechaEmisionDate = FechaEmision.getDate();
    String tipo = cbbTipo.getSelectedItem().toString();
    String totalPagar = txtTotalPagarM.getText();
    
    // Validar que los campos no estén vacíos
    if (placa.isEmpty() || articuloLiteral.isEmpty() || fechaEmisionDate == null || tipo.isEmpty()) {
        System.out.println("Campos vacíos detectados."); 
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos del primer formulario.");
        return;
    }

    // Validar que totalPagar sea un número
    double totalPagarValue;
    try {
        totalPagarValue = Double.parseDouble(totalPagar);
    } catch (NumberFormatException e) {
        System.out.println("Error en el campo 'Total a Pagar': no es un número válido.");
        JOptionPane.showMessageDialog(this, "El campo 'Total a Pagar' debe ser un número válido.");
        return;
    }

    try {
        // Insertar datos básicos y obtener el ID de la multa
        int idMulta = multasControlador.insertarDatosBasicos(placa, articuloLiteral, fechaEmisionDate, tipo, totalPagarValue);
        System.out.println("ID de multa insertado: " + idMulta); 

        // Establecer el ID de la multa en el controlador
        multasControlador.setIdMulta(idMulta);

        // Cambiar a la segunda pestaña y actualizar los campos
        txtIPlacaInfraccion.setText(txtPlacaM.getText());
        txtTotalPagar.setText(txtTotalPagarM.getText());
        
        jTabbedPane1.setSelectedIndex(2);
        
    } catch (SQLException e) {
        System.out.println("Error SQL al guardar los datos: " + e.getMessage()); // Para depuración
        JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + e.getMessage());
    }
    }//GEN-LAST:event_btnNuevaMultaActionPerformed

    


    private void btnEliminarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCliActionPerformed

//        int filaSeleccionada = jTableMultas.getSelectedRow();
//
//        if (filaSeleccionada >= 0) {
//            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este cliente?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
//
//            if (confirmacion == JOptionPane.YES_OPTION) {
//                DefaultTableModel modelo = (DefaultTableModel) jTableMultas.getModel();
//                String nombre = modelo.getValueAt(filaSeleccionada, 1).toString();
//                String apellido = modelo.getValueAt(filaSeleccionada, 2).toString();
//                String telefono = modelo.getValueAt(filaSeleccionada, 3).toString();
//                String cedula = modelo.getValueAt(filaSeleccionada, 4).toString();
//                String direccion = modelo.getValueAt(filaSeleccionada, 5).toString();
//
//                ClienteControlador clienteControlador = new ClienteControlador();
//                clienteControlador.eliminarCliente(nombre, apellido, telefono, cedula, direccion);
//
//                modelo.removeRow(filaSeleccionada);
//
//                // Actualizar el JComboBox de clientes
//                mostrarListaClientesCedula();
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar");
//        }
    }//GEN-LAST:event_btnEliminarCliActionPerformed

    private void btnEditarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCliActionPerformed
//        int filaSeleccionada = jTableMultas.getSelectedRow();
//
//        if (filaSeleccionada >= 0) {
//            DefaultTableModel modelo = (DefaultTableModel) jTableMultas.getModel();
//            String cedulaAntigua = modelo.getValueAt(filaSeleccionada, 4).toString();
//            String nombreAntiguo = modelo.getValueAt(filaSeleccionada, 1).toString();
//            String apellidoAntiguo = modelo.getValueAt(filaSeleccionada, 2).toString();
//            String telefonoAntiguo = modelo.getValueAt(filaSeleccionada, 3).toString();
//            String direccionAntigua = modelo.getValueAt(filaSeleccionada, 5).toString();
//
//            String nuevoNombre = txtNombreM.getText();
//            String nuevoApellido = txtApellidoC.getText();
//            String nuevoTelefono = txtTelefono.getText();
//            String nuevaCedula = txtCedulaM.getText();
//            String nuevaDireccion = txtDireccion.getText();
//
//            if (nuevoNombre.isEmpty() || nuevoApellido.isEmpty() || nuevoTelefono.isEmpty() || nuevaCedula.isEmpty() || nuevaDireccion.isEmpty()) {
//                JOptionPane.showMessageDialog(null, "Ingrese nuevos valores para todos los campos");
//            } else {
//                ClienteControlador clienteControlador = new ClienteControlador();
//                clienteControlador.editarCliente(cedulaAntigua, nuevoNombre, nuevoApellido, nuevoTelefono, nuevaCedula, nuevaDireccion);
//
//                // Actualizar la tabla de clientes
//                modelo.setValueAt(nuevoNombre, filaSeleccionada, 1);
//                modelo.setValueAt(nuevoApellido, filaSeleccionada, 2);
//                modelo.setValueAt(nuevoTelefono, filaSeleccionada, 3);
//                modelo.setValueAt(nuevaCedula, filaSeleccionada, 4);
//                modelo.setValueAt(nuevaDireccion, filaSeleccionada, 5);
//
//                // Actualizar el JComboBox de clientes
//                mostrarListaClientesCedula();
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Seleccione una fila para editar");
//        }
    }//GEN-LAST:event_btnEditarCliActionPerformed

    private void btnBuscarmultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarmultasActionPerformed
buscarMultas();

    }//GEN-LAST:event_btnBuscarmultasActionPerformed
private void buscarMultas() {
    String cedula = txtPlacaM.getText();
    String placa = txtPlacaM.getText();
    String cedulaPlaca = "";

    if (!cedula.isEmpty()) {
        cedulaPlaca = cedula;
    } else if (!placa.isEmpty()) {
        cedulaPlaca = placa;
    } else {
        JOptionPane.showMessageDialog(null, "Ingrese la cédula o placa para buscar las multas.");
        return;
    }

    MultasControlador multasControlador = new MultasControlador();
    ArrayList<Object[]> resultados = multasControlador.buscarMultas(cedulaPlaca);

    DefaultTableModel modelo = (DefaultTableModel) jTableMultas.getModel();
    modelo.setRowCount(0); // Limpiar la tabla antes de agregar nuevas filas

    if (resultados != null && !resultados.isEmpty()) {
        for (Object[] fila : resultados) {
            modelo.addRow(fila); // Agregar cada fila de resultados a la tabla
        }
    } else {
        JOptionPane.showMessageDialog(null, "No se encontraron multas para la cédula o placa ingresada.");
    }
}

    private void txtPlacaMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaMActionPerformed

    private void btnCTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCTEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCTEActionPerformed

    private void btnATMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnATMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnATMActionPerformed

    private void btnSantoDomingoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSantoDomingoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSantoDomingoActionPerformed

    private void btnCuencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuencaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCuencaActionPerformed

    private void btnANTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnANTActionPerformed
     int filaSeleccionada = jTableMultas.getSelectedRow();

    if (filaSeleccionada == -1) {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione la multa que desea pagar.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String entidad = (String) jTableMultas.getValueAt(filaSeleccionada, 1);
    String estado = (String) jTableMultas.getValueAt(filaSeleccionada, 5);

    if (!"Pagar multas ANT".equals(entidad)) {
        JOptionPane.showMessageDialog(this, "La multa seleccionada no corresponde a la entidad ANT.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!"pendiente".equalsIgnoreCase(estado)) {
        JOptionPane.showMessageDialog(this, "La multa seleccionada no está en estado pendiente.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Aquí debes actualizar el estado de la multa en la base de datos
    int idMulta = (int) jTableMultas.getValueAt(filaSeleccionada, 1); // Suponiendo que la columna de ID es la primera

    try {
        // Supongamos que tienes un método en tu controlador para cambiar el estado
        MultasControlador multaControlador = new MultasControlador();
        multaControlador.cambiarEstadoMulta(idMulta, "pagada");

        // Actualizar la tabla para reflejar el cambio
        modeloInfraccion_Multas.setValueAt("Pagadas", filaSeleccionada, 4); // Actualizar el estado en la tabla

        JOptionPane.showMessageDialog(this, "El estado de la multa ha sido cambiado a pagada.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al actualizar el estado de la multa: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }        
    }//GEN-LAST:event_btnANTActionPerformed

    private void txtTotalPagarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPagarMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPagarMActionPerformed

    private void cbbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbTipoActionPerformed

    private void txtCedulaLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaLActionPerformed

    private void txtCitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCitacionActionPerformed

    private void btnAmbatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmbatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAmbatoActionPerformed

    private void txtPuntosInfraccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPuntosInfraccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPuntosInfraccionActionPerformed

    private void btnEliminarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarContratoActionPerformed
//        int filaSeleccionada = jTableContrato.getSelectedRow();
//
//        if (filaSeleccionada >= 0) {
//            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar este contrato?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
//
//            if (confirmacion == JOptionPane.YES_OPTION) {
//                DefaultTableModel modelo = (DefaultTableModel) jTableContrato.getModel();
//                Date fecha = (Date) modelo.getValueAt(filaSeleccionada, 4);
//
//                String numeroPlaca = (String) modelo.getValueAt(filaSeleccionada, 1);
//                String cedulaCliente = (String) modelo.getValueAt(filaSeleccionada, 2);
//
//                ContratoControlador contratoControlador = new ContratoControlador();
//                contratoControlador.eliminarContrato((java.sql.Date) fecha, numeroPlaca, cedulaCliente);
//
//                modelo.removeRow(filaSeleccionada);
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar");
//        }
    }//GEN-LAST:event_btnEliminarContratoActionPerformed

    private void jTablePuntosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePuntosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTablePuntosMouseClicked

    private void cbbEntidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbEntidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbEntidadActionPerformed

    private void txtPlacaMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaMKeyReleased
      buscarDatosPorPlaca();
    }//GEN-LAST:event_txtPlacaMKeyReleased

    private void txtPlacaMKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaMKeyPressed

    }//GEN-LAST:event_txtPlacaMKeyPressed

    private void txtCedulaLKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaLKeyReleased
    buscarDatosPorCedula();
    }//GEN-LAST:event_txtCedulaLKeyReleased

    private void txtPlacaMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaMKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaMKeyTyped

    private void txtTotalPagarMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalPagarMKeyReleased


    }//GEN-LAST:event_txtTotalPagarMKeyReleased



    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Menu menu = new Menu();
                menu.setVisible(true);
            }
        });
    }

/////////////////////////////////////////////////////////////////////////////////////// TABLA de MULTAS //////////////////////////////////////////////////////////////////////////////////////
    
private DefaultTableModel modeloInfraccion_Multas = new DefaultTableModel();

public void setModeloMultas() {
    String[] cabecera = {"Nro.", "Placa", "Artículo/Literal", "Fecha de Emisión", "Tipo", "Total a pagar"};
    modeloInfraccion_Multas.setColumnIdentifiers(cabecera);

    MultasControlador multasControlador = new MultasControlador();
    ArrayList<Object[]> datos = multasControlador.datosMultas();

    if (datos != null) {
        for (Object[] fila : datos) {
            modeloInfraccion_Multas.addRow(fila);
        }
    }

    jTableMultas.setModel(modeloInfraccion_Multas);
}

public void mostrarDatosMultas(Infraccion_Multas multas, Vehiculo vehiculo) {
    DefaultTableModel modelo = (DefaultTableModel) jTableMultas.getModel();
    Object[] fila = new Object[6];

    fila[0] = modelo.getRowCount() + 1;
    fila[1] = vehiculo.getPlaca();
    fila[2] = multas.getArticulo_literal();
    fila[3] = multas.getFecha_emision();
    fila[4] = multas.getTipo();
    fila[5] = multas.getTotal_pagar();
    modelo.addRow(fila);
}


/////////////////////////////////////////////////////////////////////////////////////////  TABLA DETALLE INFRACCION  //////////////////////////////////////////////////////////////////////////////////////
   
private DefaultTableModel modeloInfraccion = new DefaultTableModel();

public void setModeloInfraccion() {
    String[] cabecera = {"Infracción", "Entidad", "Citacion", "Fecha Notificación", "Fecha Límite", "Puntos de Licencia", "Total a Pagar"};
    modeloInfraccion.setColumnIdentifiers(cabecera);

    InfraccionControlador infraccionControlador = new InfraccionControlador();
    ArrayList<Object[]> datos = infraccionControlador.datosInfraccion();

    if (datos != null) {
        for (Object[] fila : datos) {
            modeloInfraccion.addRow(fila);
        }
    }

    jTableInfraccion.setModel(modeloInfraccion);
}

public void mostrarDatosInfraccion(Infraccion_Multas infraccion, Vehiculo vehiculo, Propietario propietario) {
    DefaultTableModel modelo = (DefaultTableModel) jTableInfraccion.getModel();
    Object[] fila = new Object[7];

    fila[0] = infraccion.getId_infraccion(); 
    fila[1] = infraccion.getEntidad(); 
    fila[2] = infraccion.getCitacion(); 
    fila[3] = infraccion.getFecha_notificacion(); 
    fila[4] = infraccion.getFecha_limite(); 
    fila[5] = propietario.getPuntos(); 
    fila[6] = infraccion.getTotal_pagar(); 

    modelo.addRow(fila);
}



/////////////////////////////////////////////////////////////////////////////////////////  TABLA PUNTOS LICENCIA  //////////////////////////////////////////////////////////////////////////////////////

private DefaultTableModel modeloPropietario = new DefaultTableModel();

public void setModeloPropietario() {
    String[] cabecera = { "Nombres", "Puntos de Licencia", "Licencias"};
    modeloPropietario.setColumnIdentifiers(cabecera);

    PuntosControlador propietarioControlador = new PuntosControlador();
    ArrayList<Object[]> datos = propietarioControlador.datosPropietario();

    if (datos != null) {
        for (Object[] fila : datos) {
            modeloPropietario.addRow(fila);
        }
    }

    jTablePuntos.setModel(modeloPropietario); 
}


public void mostrarDatosPuntosLicencia(Propietario puntosLicencia) {
    DefaultTableModel modelo = (DefaultTableModel) jTablePuntos.getModel();
    Object[] fila = new Object[3]; // Ajusta el tamaño del arreglo según el número de columnas
    fila[0] = puntosLicencia.getNombres();
    fila[1] = puntosLicencia.getPuntos(); 
    fila[2] = puntosLicencia.getLicencias(); 

    modelo.addRow(fila);
}


/////////////////////////////////////////////////////////////////////////////////////// METODOS DE TABLAS //////////////////////////////////////////////////////////////////////////////////////

    
    
    
/////////////////////////////////////////////////////////////////TABLA Multas////////////////////////////////////////////////////////////////////////////////// 

public void limpiarTablaMultas() {
    DefaultTableModel modelo = (DefaultTableModel) jTableMultas.getModel();
    int rowCount = modelo.getRowCount();
    for (int i = rowCount - 1; i >= 0; i--) {
        modelo.removeRow(i);
    }
}



    private void actualizarMulta() {
        DefaultTableModel modelo = (DefaultTableModel) jTableMultas.getModel();
        modelo.setRowCount(0);
        MultasControlador controlador = new MultasControlador();
        ArrayList<Object[]> datos = controlador.datosMultas();

        if (datos != null) {
            for (Object[] fila : datos) {
                modelo.addRow(fila);
            }
        }
    }
    private void limpiarMultas() {
   txtPlacaM.setText("");
    txaArticuloLiteral.setText("");
    FechaEmision.setDate(null); 
    cbbTipo.setSelectedIndex(-1); 
    txtTotalPagarM.setText("");
    txtNombreM.setText("");
    txtCedula.setText("");
}

    
private void buscarDatosPorPlaca() {
        String placa = txtPlacaM.getText().trim();
            txtIPlacaInfraccion.setText(txtPlacaM.getText());
        if (placa.isEmpty()) {
            txtNombreM.setText(""); 
            txtCedula.setText(""); 
            return;
        }

        Connection conectar = null;
        PreparedStatement ejecutar = null;
        ResultSet res = null;

        try {
            // Establecer conexión
            ConexionBDD parametros = new ConexionBDD();
            conectar = parametros.conectar();
            
      
            String query = "SELECT p.NOMBRES, v.CEDULA " +
                   "FROM vehiculo v " +
                   "JOIN propietario p ON v.CEDULA = p.CEDULA " +
                   "WHERE v.PLACA = ?";

            ejecutar = conectar.prepareStatement(query);
            ejecutar.setString(1, placa);
            
           
            res = ejecutar.executeQuery();

            if (res.next()) {
                String nombre = res.getString("nombres");
                String cedula = res.getString("cedula");
               
                txtNombreM.setText(nombre);
                txtCedula.setText(cedula);
            } else {
                txtNombreM.setText("");
                txtCedula.setText(""); 
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al buscar los datos: " + e.getMessage());
        } finally {
            // Cerrar recursos
            try {
                if (res != null) res.close();
                if (ejecutar != null) ejecutar.close();
                if (conectar != null) conectar.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

///////////////////////////////////////////////////////////////TABLA  DETALLE INFRACCION////////////////////////////////////////////////////////////////////////////////// 
    
    public void limpiarTablaInfraccion() {
    DefaultTableModel modelo = (DefaultTableModel) jTableInfraccion.getModel();
    int rowCount = modelo.getRowCount();
    for (int i = rowCount - 1; i >= 0; i--) {
        modelo.removeRow(i);
    }
}
    

private void limpiarDetalleInfraccion() {
    cbbEntidad.setSelectedIndex(-1); 
    txtCitacion.setText("");
    txtPuntosInfraccion.setText("");
    FechaNotificacion.setDate(null);
    FechaPago.setDate(null);
    txaArticuloLiteral.setText("");
    txtNombreM.setText("");
    txtCedula.setText("");
    txtIPlacaInfraccion.setText("");
    txtTotalPagar.setText("");
}

private void actualizarCedula() {
    MultasControlador multasControlador = new MultasControlador();
    
    String placa = txtPlacaM.getText();
    
    String cedula = multasControlador.obtenerCedulaPropietarioPorPlaca(placa);
    
    txtCedula.setText(cedula);
}

private void eventoPago() {
         txtTotalPagar.setText(txtTotalPagarM.getText());

    }

///////////////////////////////////////////////////////////////TABLA  PUNTOS ////////////////////////////////////////////////////////////////////////////////// 
    
    public void limpiarPuntos() {
    DefaultTableModel modelo = (DefaultTableModel) jTablePuntos.getModel();
    int rowCount = modelo.getRowCount();
    for (int i = rowCount - 1; i >= 0; i--) {
        modelo.removeRow(i);
    }
}
    
private void limpiarDatosPropietario() {
    txtCedulaL.setText("");
    lblNombres.setText(""); // Limpiar el nombre
    lblPuntos.setText(""); // Limpiar los puntos
    lblLicencias.setText(""); // Limpiar las licencias
}
   
public String buscarDatosPorCedula() {
    String cedula = txtCedulaL.getText().trim();

    if (cedula.isEmpty()) {
        lblNombres.setText(""); 
        lblPuntos.setText("");
        lblLicencias.setText(""); 
        return null;
    }

    Connection conectar = null;
    PreparedStatement ejecutar = null;
    ResultSet res = null;

    String nombrePropietario = null;

    try {
        ConexionBDD parametros = new ConexionBDD();
        conectar = parametros.conectar();

        String query = "SELECT NOMBRES, PUNTOS_DE_LICENCIA, LICENCIAS " +
                       "FROM propietario " +
                       "WHERE CEDULA = ?";
        ejecutar = conectar.prepareStatement(query);
        ejecutar.setString(1, cedula);

        res = ejecutar.executeQuery();

        if (res.next()) {
            String nombres = res.getString("NOMBRES");
            String puntos = res.getString("PUNTOS_DE_LICENCIA");
            String licencias = res.getString("LICENCIAS");

            lblNombres.setText(nombres);
            lblPuntos.setText(puntos);
            lblLicencias.setText(licencias);

            nombrePropietario = nombres; // Guardar el nombre del propietario
        } else {
            lblNombres.setText(""); 
            lblPuntos.setText(""); 
            lblLicencias.setText(""); 
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al buscar los datos: " + e.getMessage());
    } finally {
        try {
            if (res != null) res.close();
            if (ejecutar != null) ejecutar.close();
            if (conectar != null) conectar.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return nombrePropietario;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaEmision;
    private com.toedter.calendar.JDateChooser FechaNotificacion;
    private com.toedter.calendar.JDateChooser FechaPago;
    private javax.swing.JLabel PDF1;
    private javax.swing.JLabel PDF3;
    private javax.swing.JLabel PDF4;
    private javax.swing.JButton btnANT;
    private javax.swing.JButton btnATM;
    private javax.swing.JButton btnAmbato;
    private javax.swing.JButton btnBuscarAbono;
    private javax.swing.JButton btnBuscarInfraccion;
    private javax.swing.JButton btnBuscarmultas;
    private javax.swing.JButton btnCTE;
    private javax.swing.JButton btnCuenca;
    private javax.swing.JButton btnEditarCli;
    private javax.swing.JButton btnEditarContrato;
    private javax.swing.JButton btnEliminarCli;
    private javax.swing.JButton btnEliminarContrato;
    private javax.swing.JButton btnInfraccion;
    private javax.swing.JButton btnMultas;
    private javax.swing.JButton btnNuevaInfraccion;
    private javax.swing.JButton btnNuevaMulta;
    private javax.swing.JButton btnPDFClientes;
    private javax.swing.JButton btnPDFContrato;
    private javax.swing.JButton btnPDFPuntos;
    private javax.swing.JButton btnPago;
    private javax.swing.JButton btnPuntos;
    private javax.swing.JButton btnSantoDomingo;
    private javax.swing.JComboBox<String> cbbEntidad;
    private javax.swing.JComboBox<String> cbbTipo;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JInternalFrame jInternalFrame5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanelContratos;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableInfraccion;
    private javax.swing.JTable jTableMultas;
    private javax.swing.JTable jTablePuntos;
    private javax.swing.JLabel lblLicencias;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblPagar_Icono;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JLabel tipo;
    private javax.swing.JTextArea txaArticuloLiteral;
    private javax.swing.JLabel txtCedula;
    private javax.swing.JTextField txtCedulaL;
    private javax.swing.JTextField txtCitacion;
    private javax.swing.JLabel txtIPlacaInfraccion;
    private javax.swing.JLabel txtNombreM;
    private javax.swing.JTextField txtPlacaM;
    private javax.swing.JTextField txtPuntosInfraccion;
    private javax.swing.JLabel txtTotalPagar;
    private javax.swing.JTextField txtTotalPagarM;
    // End of variables declaration//GEN-END:variables
}