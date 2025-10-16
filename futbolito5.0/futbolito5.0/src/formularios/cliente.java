package formularios;

import tranferencias.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Security;

import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import javax.crypto.Cipher;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.table.DefaultTableModel;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.openssl.PEMParser;

import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;
import org.bouncycastle.pkcs.PKCS8EncryptedPrivateKeyInfo;
import org.bouncycastle.pkcs.jcajce.JcePKCSPBEInputDecryptorProviderBuilder;

/**
 * @author hsandoval
 */
public class cliente extends javax.swing.JFrame {

    BlockChain bc;
    private ArrayList<Transferencia> listaTran;
    private DefaultTableModel tmPadre;//para la tabla de padres
    private DefaultTableModel tmHijo;//para la tabla de hijos
    private String llave;
    private String TextoCadena;

    public cliente() {
        initComponents();
        this.llave = "";
        listaTran = new ArrayList<>();
        this.tmPadre = ((DefaultTableModel) this.jTable3.getModel());//para mostrar la tabla de padres
        this.tmHijo = ((DefaultTableModel) this.jTable4.getModel());//para mostrar la tabla de hijos
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnAgregarPadre = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAgregarHijo = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnGuardarReporte = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        btnGenerarReporte = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnLlavePub = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        btnLlavePri = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnEncriptar = new javax.swing.JButton();
        btnDesencriptar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable2);

        btnAgregarPadre.setText("1 - REALIZAR TRANFERENCIA");
        btnAgregarPadre.setEnabled(false);
        btnAgregarPadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPadreActionPerformed(evt);
            }
        });

        jTextField1.setToolTipText("");

        jLabel1.setText("ID");

        jLabel2.setText("EQUIPO QUE ENVIA");

        jLabel3.setText("EQUIPO QUE RECIBE");

        btnAgregarHijo.setText("2 - ASIGNAR DETALLES");
        btnAgregarHijo.setEnabled(false);
        btnAgregarHijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarHijoActionPerformed(evt);
            }
        });

        jTextField4.setEditable(false);

        jLabel5.setText("ID PADRE");

        jLabel7.setText("DORSAL ASIGANDO");

        jLabel8.setText("SALARIO DEVENGADO");

        btnGuardarReporte.setText("GUARDAR REPORTE");
        btnGuardarReporte.setEnabled(false);
        btnGuardarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarReporteActionPerformed(evt);
            }
        });

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel10.setText("POSICION DE FUTBOL");

        btnGenerarReporte.setText("GENERAR REPORTE JSON");
        btnGenerarReporte.setEnabled(false);
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ENVIA", "RECIBE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable3);

        jLabel11.setText("Llave Publica:");

        btnLlavePub.setText("Seleccionar");
        btnLlavePub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlavePubActionPerformed(evt);
            }
        });

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDPADRE", "JUGADOR", "POSICION", "DORSAL", "SALARIO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable4);

        btnLlavePri.setText("Seleccionar");
        btnLlavePri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlavePriActionPerformed(evt);
            }
        });

        jLabel12.setText("Llave Privada:");

        btnEncriptar.setText("ENCRIPTAR DATOS");
        btnEncriptar.setEnabled(false);
        btnEncriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncriptarActionPerformed(evt);
            }
        });

        btnDesencriptar.setText("DESENCRIPTAR DATOS");
        btnDesencriptar.setEnabled(false);
        btnDesencriptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesencriptarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("BlockChain viewer");

        jLabel16.setText("Transactions detail:");

        jScrollPane1.setMinimumSize(new java.awt.Dimension(170, 103));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane1.setViewportView(jTextArea2);

        jScrollPane2.setMinimumSize(new java.awt.Dimension(170, 103));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton3.setText("3- MINAR BLOQUE");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel9)
                        .addGap(222, 222, 222)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198)
                        .addComponent(jLabel16)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(7, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel16)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel17.setText("JUGADOR");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(4, 1, 6, 1));

        jLabel14.setText("Minig complexity level:");

        jLabel15.setText("Mining key character:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" }));

        jButton4.setText("INICIAR/CREAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15)
                                .addGap(14, 14, 14)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addComponent(btnAgregarPadre, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField7)
                                                .addComponent(jTextField6)
                                                .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                                .addComponent(jTextField4)
                                                .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addComponent(btnAgregarHijo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnDesencriptar)
                                        .addGap(61, 61, 61)
                                        .addComponent(btnGuardarReporte)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEncriptar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnLlavePri))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnLlavePub)))
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGenerarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(162, 162, 162))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(btnGenerarReporte)
                            .addComponent(jButton4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(40, 40, 40)
                        .addComponent(btnAgregarPadre))
                    .addComponent(jScrollPane3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLlavePub)))
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLlavePri))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDesencriptar)
                            .addComponent(btnEncriptar)
                            .addComponent(btnGuardarReporte)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgregarHijo))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTON DE AGRAGAR PADRE
    private void btnAgregarPadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPadreActionPerformed
        Transferencia tmp = new Transferencia();

        //verificamos que los campos no esten vacios
        if (this.jTextField1.getText().trim().isEmpty()
                | this.jTextField2.getText().trim().isEmpty()
                | this.jTextField3.getText().trim().isEmpty()) {
            // Mostrar un mensaje de error, si algun campo esta vacio
            JOptionPane.showMessageDialog(null, "PORFAVOR LLENE TODOS LOS CAMPOS SOLICITADOS.");
        } else {
            try {
                // si todos los campos estan llenos intentamos convertir la cadena id en entero y agregar a la lista 
                Integer.parseInt(this.jTextField1.getText());

                tmp.setCodigo(Integer.parseInt(this.jTextField1.getText()));
                tmp.setEquipoEnvia(this.jTextField2.getText());
                tmp.setEquipoRecibe(this.jTextField3.getText());

                tmp.setFechaHora(new Date());
                this.listaTran.add(tmp);
                String sId = this.jTextField1.getText().trim().toUpperCase();
                String sEnvia = this.jTextField2.getText().trim().toUpperCase();
                String SRecibe = this.jTextField3.getText().trim().toUpperCase();

                String sFecha = new Date().toString();
                String[] aTemp = {sId, sEnvia, SRecibe, sFecha};
                this.tmPadre.addRow(aTemp);
                this.jTextField4.setText(sId);
                

                String cad = this.jTextArea1.getText() + "\n";
                bc.createBlock();
                Block lastBlk = bc.getLastBlock();
                cad += "New Block id: " + Integer.toString(lastBlk.getId()) + "\n"
                        + "Timestamp: " + Long.toString(lastBlk.getTimeStamp()) + "\n"
                        + "Previous Hash: " + lastBlk.getPreviousHash();
                this.jTextArea1.setText(cad);
                
                this.btnAgregarPadre.setEnabled(false);
                this.btnAgregarHijo.setEnabled(true);

            } catch (NumberFormatException e) {
                // si la cadena id no es entero muetra un error indicandolo
                JOptionPane.showMessageDialog(null, "INGRESE UN ID VALIDO QUE SEA ENTERO.");
            }

        }
    }//GEN-LAST:event_btnAgregarPadreActionPerformed

    //BOTON AGREGAR HIJO
    private void btnAgregarHijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarHijoActionPerformed
        //Transferencia tmp = new Transferencia();

        //verificamos que los campos no esten vacios
        if (this.jTextField4.getText().trim().isEmpty() 
                || this.jTextField5.getText().trim().isEmpty()
                || this.jTextField6.getText().trim().isEmpty()
                || this.jTextField7.getText().trim().isEmpty()
                || this.jTextField8.getText().trim().isEmpty()) {
            // Mostrar un mensaje de error si algun campo esta vacio
            JOptionPane.showMessageDialog(null, "PORFAVOR LLENE TODOS LOS CAMPOS SOLICITADOS DE LA SUBOPERACION.");
        } else {
            try {
                // si todos los campos estan llenos intentamos convertir la cadena id en entero y agregar a la lista
                int padre = Integer.parseInt(this.jTextField4.getText());
                //int padre = Integer.parseInt(this.jTextField4.getText());
                String jugador = this.jTextField5.getText();
                String posicion = this.jTextField6.getText();
                int dorsal = Integer.parseInt(this.jTextField7.getText());
                double salario = Double.parseDouble(this.jTextField8.getText());

                for (int i = 0; i < this.listaTran.size(); i++) {

                    this.listaTran.get(i).Transferencia(padre, jugador, posicion, dorsal, salario);
                    String sId = this.jTextField4.getText().trim().toUpperCase();
                    String sJugador = this.jTextField5.getText().trim().toUpperCase();
                    String sPosicion = this.jTextField6.getText().trim().toUpperCase();
                    String SDorsal = this.jTextField7.getText().trim().toUpperCase();
                    String sSalario = this.jTextField8.getText().trim().toUpperCase();
                    String[] aTemp = {sId, sJugador, sPosicion, SDorsal, sSalario};
                    this.tmHijo.addRow(aTemp);

                }
                String sJugador = this.jTextField5.getText().trim().toUpperCase();
                String sPosicion = this.jTextField6.getText().trim().toUpperCase();
                int iDorsal = Integer.parseInt(this.jTextField7.getText());
                double dSalario = Double.parseDouble(this.jTextField8.getText());
                bc.getLastBlock().setTransaction(sJugador, sPosicion,dSalario, iDorsal);
                this.jTextField5.setText("");
                this.jTextField6.setText("");
                this.jTextField7.setText("");
                this.jTextField8.setText("");
                this.jButton3.setEnabled(true);
                
            } catch (Exception e) {

                // si la cadena id no es entero muetra un error indicandolo
                JOptionPane.showMessageDialog(null, "CAMPOS INCORRECTOS(IDPADRE,DORSAL) SON ENTEROS Y SALARIO LLEVA DECIMAL.");
            }

        }
    }//GEN-LAST:event_btnAgregarHijoActionPerformed

    /* Funcion para mostrar como va quedando la lista principal con su lista hija */
    private void btnGuardarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarReporteActionPerformed
        try {
            // 2. Obtener ruta de la llave
            String rutaLlave = this.jTextField10.getText();
            if (rutaLlave.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Seleccione la llave publica primero");
                return;
            }
            // 3. Leer la llave pública PEM
            PublicKey publicKey = cargarLlavePublica(rutaLlave);

            /*abrimos el gestor de archivos */
            PrintWriter pw = null;
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            int result = fileChooser.showOpenDialog(this);
            File selectedFile = null;
            if (result == JFileChooser.APPROVE_OPTION) {
                selectedFile = fileChooser.getSelectedFile();
            }
            try {
                pw = new PrintWriter(new File(selectedFile.getAbsolutePath()));
            } catch (Exception e) {
            }

            // 1. Obtener el texto y convertirlo a bytes
            String cadena = TextoCadena;

            byte[] data = cadena.getBytes(StandardCharsets.UTF_8);

            // 4. Encriptar en bloques con OAEP SHA-256
            List<String> encryptedBlocks = new ArrayList<>();
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            cipher.init(Cipher.ENCRYPT_MODE, publicKey);

            int blockSize = 190; // Tamaño máximo seguro para RSA 2048 bits con OAEP SHA-256
            for (int i = 0; i < data.length; i += blockSize) {
                int length = Math.min(blockSize, data.length - i);
                byte[] block = cipher.doFinal(data, i, length);
                encryptedBlocks.add(Base64.getEncoder().encodeToString(block));
            }
            // 5. Mostrar resultado en taResultado
            StringBuilder sb = new StringBuilder();
            for (String block : encryptedBlocks) {
                sb.append(block).append("\n");
            }

            /*mostramnos en el textarea 3 el texto cifrado*/
            //this.jTextArea3.setText(sb.toString());
            /*escribimos en el archivo para posteriormente guardar*/
            pw.write(sb.toString());
            //ventanaDatos.setCadenaEnc(sb.toString());
            pw.close();
            //JOptionPane.showMessageDialog(this, "Texto encriptado correctamente.");
            //ventanaDatos.setVisible(true);
            this.btnAgregarPadre.setEnabled(true);
            this.jButton3.setEnabled(false);
            this.btnGenerarReporte.setEnabled(false);
            this.btnGuardarReporte.setEnabled(false);
            this.btnDesencriptar.setEnabled(false);
            this.btnEncriptar.setEnabled(false);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al encriptar: " + e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarReporteActionPerformed

    /* Funcion para generar un reporte json */
    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed

        StringBuilder strLinea = new StringBuilder();
        Transferencia temp;
        Transferencia temp2;
        if (this.listaTran.isEmpty()) {
            // Mostrar un mensaje de error si no hay tranferencias hechas 
            JOptionPane.showMessageDialog(null, "PORFAVOR REALICE UNA OPERACION PRIMERO.");
        } else {
            try {
                strLinea.append("{" + "\n");
                strLinea.append("\t\"FechaHora\" : \"" + new Date() + "\",\n");
                strLinea.append("\t\"transferencia\" : \n");
                strLinea.append("\t[\n");
                for (int i = 0; i < this.listaTran.size(); i++) {
                    //impresion de los padres 
                    temp = this.listaTran.get(i);
                    strLinea.append("\t\t{\n");
                    strLinea.append("\t\t\t\"id\" : " + temp.getCodigo() + ",\n");
                    strLinea.append("\t\t\t\"equipo que envia\" : \"" + temp.getEquipoEnvia() + "\",\n");
                    strLinea.append("\t\t\t\"equipo que recibe\" : \"" + temp.getEquipoRecibe() + "\"");
                    
                    for (int j = 0; j < temp.aTran.size(); j++) {
                        //impresion de los hijos 
                        temp2 = temp.aTran.get(j);

                        if (j == 0) {
                            strLinea.append(" ,\n");
                        } else {
                            strLinea.append(", \n");
                        }
                        strLinea.append("\t\t\t\"");
                        strLinea.append("suboperacion " + (j + 1));
                        strLinea.append("\" : \n");
                        strLinea.append("\t\t\t{\n");
                        strLinea.append("\t\t\t\t\"idhijo\" : " + (j + 1) + ",\n");
                        strLinea.append("\t\t\t\t\"jugador\"  : \"" + temp2.getJugador() + "\",\n");
                        strLinea.append("\t\t\t\t\"posicion del jugador\" : \"" + temp2.getPosicion() + "\",\n");
                        strLinea.append("\t\t\t\t\"dorsal del jugador\" : " + temp2.getDorsal() + ",\n");
                        strLinea.append("\t\t\t\t\"salario del jugador\"  : " + temp2.getSalario() + "\n");
                        if (j == this.listaTran.size() - 1) {
                            strLinea.append("\t\t\t}\n");
                        } else {
                            strLinea.append("\t\t\t}\n");
                        }
                    }
                    if (i == this.listaTran.size() - 1) {
                        strLinea.append("\t\t}\n");
                    } else {
                        strLinea.append("\t\t},\n");
                    }

                }
                strLinea.append("\t]\n");
                strLinea.append("}");

                // 1. Obtener el texto y convertirlo a bytes
                String cadena = strLinea.toString();
                TextoCadena = strLinea.toString();
                /*mostramnos en el textarea 3 el texto cifrado*/
                this.jTextArea3.setText(TextoCadena);
                this.btnDesencriptar.setEnabled(true);
                this.btnEncriptar.setEnabled(true);
                this.btnGuardarReporte.setEnabled(true);
            } catch (Exception e) {
                // Mostrar un mensaje de error  
                JOptionPane.showMessageDialog(null, "ERROR VERIFIQUE LOS DATOS INGRESADOS.");
            }
        }


    }//GEN-LAST:event_btnGenerarReporteActionPerformed

    /*Funcion para el boton buscar archivo*/
    private void btnLlavePubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlavePubActionPerformed
        // Crear un JFileChooser
        javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();

        // Mostrar el diálogo de apertura (puedes usar showOpenDialog o showSaveDialog)
        int result = fileChooser.showOpenDialog(this);

        if (result == javax.swing.JFileChooser.APPROVE_OPTION) {
            // Obtener el archivo seleccionado
            java.io.File selectedFile = fileChooser.getSelectedFile();
            this.llave = selectedFile.getAbsolutePath();
            // Mostrar la ruta absoluta en el JTextField
            this.jTextField10.setText(selectedFile.getAbsolutePath());
        }
    }//GEN-LAST:event_btnLlavePubActionPerformed

    /*boton para seleccionar la llave privada*/
    private void btnLlavePriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlavePriActionPerformed
        // Ruta de la llave privada
        JFileChooser selectorPem = new JFileChooser();
        selectorPem.setDialogTitle("Selecciona la llave privada (.pem)");
        if (selectorPem.showOpenDialog(this) != JFileChooser.APPROVE_OPTION) {
            return;
        }
        String tmp = selectorPem.getSelectedFile().getAbsolutePath();
        this.jTextField11.setText(tmp);

    }//GEN-LAST:event_btnLlavePriActionPerformed

    private void btnEncriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncriptarActionPerformed

        if (TextoCadena == null) {
            JOptionPane.showMessageDialog(null, "NO HAY DATOS QUE ENCRIPTAR, VERIFIQUE QUE YA REALIZO UNA TRANFERENCIA Y GENERO UN REPORTE.");
        } else {
            try {
                // 1. Obtener el texto y convertirlo a bytes
                String cadena = TextoCadena;

                byte[] data = cadena.getBytes(StandardCharsets.UTF_8);

                // 2. Obtener ruta de la llave
                String rutaLlave = this.jTextField10.getText();
                if (rutaLlave.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Seleccione la llave pública primero");
                    return;
                }

                // 3. Leer la llave pública PEM
                PublicKey publicKey = cargarLlavePublica(rutaLlave);

                // 4. Encriptar en bloques con OAEP SHA-256
                List<String> encryptedBlocks = new ArrayList<>();
                Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
                cipher.init(Cipher.ENCRYPT_MODE, publicKey);

                int blockSize = 190; // Tamaño máximo seguro para RSA 2048 bits con OAEP SHA-256
                for (int i = 0; i < data.length; i += blockSize) {
                    int length = Math.min(blockSize, data.length - i);
                    byte[] block = cipher.doFinal(data, i, length);
                    encryptedBlocks.add(Base64.getEncoder().encodeToString(block));
                }

                // 5. Mostrar resultado en taResultado
                StringBuilder sb = new StringBuilder();
                for (String block : encryptedBlocks) {
                    sb.append(block).append("\n");
                }
                this.jTextArea3.setText(sb.toString());

                JOptionPane.showMessageDialog(this, "Texto encriptado correctamente.");

            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al encriptar: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnEncriptarActionPerformed

    private void btnDesencriptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesencriptarActionPerformed

        if (this.jTextArea3.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "NO HAY CONTENIDO QUE DECIFRAR O NO HA GENERADO EL REPORTE.");
        } else {
            try {
                // 1. Verificar que ya se haya seleccionado la llave PEM
                String pem = this.jTextField11.getText();

                if (pem == null || pem.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Seleccione primero la llave privada PEM usando el botón '...'");
                    return;
                }

                // 2. Pedir contraseña 
                char[] password = pedirContrasenia("Ingrese la contraseña de la llave privada");
                if (password.length == 0) {
                    return;
                }

                // 3. Cargar la llave privada usando la ruta y la contraseña
                PrivateKey privateKey = cargarLlavePrivadaDesdePem(pem, password);
                if (privateKey == null) {
                    JOptionPane.showMessageDialog(this, "No se pudo cargar la llave privada");
                    return;
                }
                /*odtenemos todo el texto*/
                String contenido = this.jTextArea3.getText();
                String[] lineas = contenido.split("\\R");      // separa por saltos de línea

                List<byte[]> bloques = new ArrayList<>();
                for (String linea : lineas) {
                    if (!linea.trim().isEmpty()) {
                        bloques.add(Base64.getDecoder().decode(linea));
                    }
                }

                // 6. Desencriptar bloque por bloque
                Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
                cipher.init(Cipher.DECRYPT_MODE, privateKey);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                for (byte[] bloque : bloques) {
                    baos.write(cipher.doFinal(bloque));
                }
                String cadena = new String(baos.toByteArray(), StandardCharsets.UTF_8);
                this.jTextArea3.setText(cadena);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnDesencriptarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        bc.mineBlock();
        Block blk = bc.getLastBlock();
        String cad1 = this.jTextArea1.getText() + "\n";
        cad1 += "--- Mined ---\n"
                + "Nonce: " + blk.getNonce() + "\n"
                + "Hash:  " + blk.getHash() + "\n"
                + "---------------------------------------------------------------------------------------------------";
        this.jTextArea1.setText(cad1);
        String cad2 = "";
        for (int i = 1; i < bc.size(); i++) {
            cad2 += "Block ID: " + Integer.toString(bc.getBlock(i).getId()) + bc.transactionReport(bc.getBlock(i).getId())
                    + "---------------------------------------------------------------------------------------------------\n";
        }
        this.jTextArea2.setText(cad2);
        this.btnGenerarReporte.setEnabled(true);
        this.btnAgregarHijo.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int iComplexity = Integer.parseInt(this.jSpinner1.getValue().toString());
        String sMineChar = this.jComboBox1.getSelectedItem().toString();
        this.bc = new BlockChain(iComplexity, sMineChar);
        this.bc.createGenesis();
        Block blk = bc.getLastBlock();
        String cad = "Genesis Block Hash: " + blk.getHash() + "\n"
                + "Timestamp: " + Long.toString(blk.getTimeStamp()) + "\n"
                + "---------------------------------------------------------------------------------------------------";
        this.jTextArea1.setText(cad);
        this.btnAgregarPadre.setEnabled(true); 
        this.jButton4.setEnabled(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    /*
     * funcion para cifrar.
     */
    private PublicKey cargarLlavePublica(String rutaPem) throws Exception {
        String contenido = new String(Files.readAllBytes(new File(rutaPem).toPath()),
                StandardCharsets.US_ASCII);

        contenido = contenido.replaceAll("-----BEGIN PUBLIC KEY-----", "")
                .replaceAll("-----END PUBLIC KEY-----", "")
                .replaceAll("\\s", ""); // quita los saltos de línea

        byte[] der = Base64.getDecoder().decode(contenido);
        X509EncodedKeySpec especificacion = new X509EncodedKeySpec(der);
        KeyFactory fabrica = KeyFactory.getInstance("RSA");
        return fabrica.generatePublic(especificacion);
    }

    /*
     * para pedir la contrasena.
     */
    private char[] pedirContrasenia(String mensaje) {
        JPasswordField campo = new JPasswordField();
        int r = JOptionPane.showConfirmDialog(this, campo, mensaje, JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        return (r == JOptionPane.OK_OPTION) ? campo.getPassword() : new char[0];
    }

    /*
     * Carga una llave privada RSA desde un archivo PEM PKCS#8 (cifrada o no).
     */
    private PrivateKey cargarLlavePrivadaDesdePem(String rutaPem, char[] contrasenia) throws Exception {
        if (Security.getProvider("BC") == null) {
            Security.addProvider(new BouncyCastleProvider());
        }

        try (PEMParser parser = new PEMParser(new FileReader(rutaPem))) {
            Object obj = parser.readObject();
            JcaPEMKeyConverter converter = new JcaPEMKeyConverter().setProvider("BC");

            if (obj instanceof PKCS8EncryptedPrivateKeyInfo) {
                PKCS8EncryptedPrivateKeyInfo epki = (PKCS8EncryptedPrivateKeyInfo) obj;

                // Usamos la contraseña que ya viene como parámetro
                JcePKCSPBEInputDecryptorProviderBuilder builder = new JcePKCSPBEInputDecryptorProviderBuilder();
                builder.setProvider("BC");  // Muy importante
                return converter.getPrivateKey(epki.decryptPrivateKeyInfo(builder.build(contrasenia)));

            } else if (obj instanceof org.bouncycastle.asn1.pkcs.PrivateKeyInfo) {
                return converter.getPrivateKey((org.bouncycastle.asn1.pkcs.PrivateKeyInfo) obj);
            } else {
                throw new IllegalArgumentException("Formato de llave no soportado: " + obj.getClass());
            }
        }
    }

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
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarHijo;
    private javax.swing.JButton btnAgregarPadre;
    private javax.swing.JButton btnDesencriptar;
    private javax.swing.JButton btnEncriptar;
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JButton btnGuardarReporte;
    private javax.swing.JButton btnLlavePri;
    private javax.swing.JButton btnLlavePub;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
