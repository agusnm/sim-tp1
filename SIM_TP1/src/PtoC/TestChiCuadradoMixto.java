package PtoC;

import javax.swing.table.DefaultTableModel;

public class TestChiCuadradoMixto extends javax.swing.JFrame {

    private int intervalo;
    private int nivelConfianza;
    private int cantNumeros;
    DefaultTableModel datos;
    DefaultTableModel test;

    /**
     * Creates new form TestDeChiCuadrado
     */
    public TestChiCuadradoMixto() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Test de Chi Cuadrado");
        test = new DefaultTableModel(new Object[]{"N°", "Intervalo", "Fobs", "Fesp", "(Fobs - Fesp)2"}, 0);
        datos = new DefaultTableModel(new Object[]{"N°", "Ri"}, 0);
        jTable.setModel(datos);
        jTable2.setModel(test);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTabla1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_generar = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtXo = new javax.swing.JTextField();
        txta = new javax.swing.JTextField();
        txtc = new javax.swing.JTextField();
        txtM = new javax.swing.JTextField();
        txtm = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        RBtn10 = new javax.swing.JRadioButton();
        Rbtn5 = new javax.swing.JRadioButton();
        RBtn20 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        RBtn95 = new javax.swing.JRadioButton();
        RBtn99 = new javax.swing.JRadioButton();
        BtnRealizarTest = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_gradolibertad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtxtChi = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_chitabulado = new javax.swing.JTextField();

        jTabla.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "i", "Xi", "(a * Xi) + c", "Xi + 1", "ri"
            }
        ));
        jScrollPane2.setViewportView(jTabla);

        jTabla1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "i", "Xi", "(a * Xi) + c", "Xi + 1", "ri"
            }
        ));
        jScrollPane3.setViewportView(jTabla1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable1);

        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText("M =");
        jLabel3.setToolTipText("Cantidad de valores a generar");

        btn_generar.setBackground(new java.awt.Color(242, 242, 242));
        btn_generar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btn_generar.setText("Generar");
        btn_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("Generador Mixto");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setText("a =");
        jLabel5.setToolTipText("Cantidad de valores a generar");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setText("c =");
        jLabel6.setToolTipText("Cantidad de valores a generar");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setText("Xo=");
        jLabel8.setToolTipText("Cantidad de valores a generar");

        txtXo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txta.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtc.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtM.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txtm.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel9.setText("m =");
        jLabel9.setToolTipText("Cantidad de valores a generar");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 153));
        jLabel10.setText("Test de Chi Cuadrado ");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel1.setText("K =");
        jLabel1.setToolTipText("Número de intervalos");

        RBtn10.setBackground(new java.awt.Color(255, 255, 255));
        RBtn10.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        RBtn10.setText("10");
        RBtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtn10ActionPerformed(evt);
            }
        });

        Rbtn5.setBackground(new java.awt.Color(255, 255, 255));
        Rbtn5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        Rbtn5.setText("5");
        Rbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbtn5ActionPerformed(evt);
            }
        });

        RBtn20.setBackground(new java.awt.Color(255, 255, 255));
        RBtn20.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        RBtn20.setText("20");
        RBtn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtn20ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setText("Nivel de confianza =");

        RBtn95.setBackground(new java.awt.Color(255, 255, 255));
        RBtn95.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        RBtn95.setText("95%");
        RBtn95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtn95ActionPerformed(evt);
            }
        });

        RBtn99.setBackground(new java.awt.Color(255, 255, 255));
        RBtn99.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        RBtn99.setText("99%");
        RBtn99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBtn99ActionPerformed(evt);
            }
        });

        BtnRealizarTest.setBackground(new java.awt.Color(242, 242, 242));
        BtnRealizarTest.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        BtnRealizarTest.setText("Realizar Test");
        BtnRealizarTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRealizarTestActionPerformed(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
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
        jScrollPane5.setViewportView(jTable2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel13.setText("Decisión:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane6.setViewportView(jTextArea1);

        jButton1.setBackground(new java.awt.Color(242, 242, 242));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jButton1.setText("Limpiar Tablas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setText("Grados de Libertad");

        txt_gradolibertad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_gradolibertadActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel12.setText("Chi Cuadrado resultante");

        jtxtChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtChiActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel11.setText("Chi Cuadrado tabulado");

        txt_chitabulado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_chitabuladoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)))
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(BtnRealizarTest, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(btn_generar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(174, 174, 174))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtXo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(37, 37, 37)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(98, 98, 98))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_chitabulado, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(txt_gradolibertad)
                                    .addComponent(jtxtChi))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Rbtn5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RBtn10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RBtn20)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RBtn95)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RBtn99))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtXo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtM, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(btn_generar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Rbtn5)
                    .addComponent(RBtn10)
                    .addComponent(RBtn20)
                    .addComponent(RBtn95)
                    .addComponent(RBtn99)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_gradolibertad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jtxtChi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_chitabulado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnRealizarTest, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed
        //AQUI IRIA NROS GENERADOS POR TESTCHICUADRADO
        rellenarTablaRi();
    }//GEN-LAST:event_btn_generarActionPerformed
    
    public void rellenarTablaRi() {
        GeneradorMixto gm;
        gm = new GeneradorMixto();
        for (int i = 0; i < Integer.valueOf(txtM.getText()); i++) {
            Object[] fila = new Object[2];
            fila[0] = i;
            //Vector que genera Ri mixtos que se va guardando en la fila 1
            fila[1] = gm.sacarGeneradorMixto(Integer.valueOf(txtM.getText()), Integer.valueOf(txtXo.getText()), Integer.valueOf(txta.getText()), Integer.valueOf(txtc.getText()), Integer.valueOf(txtm.getText()))[i];

            datos.addRow(fila);
        }
    }
    private void RBtn99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtn99ActionPerformed
        RBtn95.setSelected(false);
    }//GEN-LAST:event_RBtn99ActionPerformed

    private void RBtn95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtn95ActionPerformed
        RBtn99.setSelected(false);
    }//GEN-LAST:event_RBtn95ActionPerformed

    private void RBtn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtn20ActionPerformed
        Rbtn5.setSelected(false);
        RBtn10.setSelected(false);
    }//GEN-LAST:event_RBtn20ActionPerformed

    private void RBtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBtn10ActionPerformed
        Rbtn5.setSelected(false);
        RBtn20.setSelected(false);
    }//GEN-LAST:event_RBtn10ActionPerformed

    private void Rbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbtn5ActionPerformed
        RBtn10.setSelected(false);
        RBtn20.setSelected(false);
    }//GEN-LAST:event_Rbtn5ActionPerformed

    private void txtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmActionPerformed

    private void BtnRealizarTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRealizarTestActionPerformed
        inicializaciones();

        double cte = (1.0000 / intervalo); // divido 1 por el intervalo para obtener la cte que va sumando
        double fesp = (double) Integer.valueOf(txtM.getText()) / intervalo;

        String valInt[] = new String[intervalo];
        /*DecimalFormat RedondearADos = new DecimalFormat("0.0000");
         */

        //Creamos los vectores
        //vector de Ri
        GeneradorMixto gm;
        gm = new GeneradorMixto();
        Double vec[] = gm.sacarGeneradorMixto(Integer.valueOf(txtM.getText()), Integer.valueOf(txtXo.getText()), Integer.valueOf(txta.getText()), Integer.valueOf(txtc.getText()), Integer.valueOf(txtm.getText()));

        // Vector de frecuencias observadas
        int cont[] = new int[intervalo];
        //vector de diferecias al cuadrado
        double dif[] = new double[intervalo];
        //inicio- fin intervalo
        double intfinal = 0.0000;
        double intinicial;

        for (int i = 0; i < intervalo; i++) {
            intinicial = intfinal;//inicia el limite izq de cada linea

            intfinal = (intinicial + cte);//inicial el limite derecho de cada linea
            valInt[i] = intinicial + " - " + intfinal;

            for (Double vec1 : vec) {
                //recorre los valores del rnd
                if (vec1 >= intinicial && vec1 < intfinal) {
                    //ubica de acuerdo al intervalo
                    cont[i]++;//cuenta
                }
            }

        }
        for (int i = 0; i < cont.length; i++) {// cacula el cuadrado
            dif[i] = Math.pow((cont[i] - fesp), 2);

        }
        //Rellena TABLA
        for (int i = 0; i < intervalo; i++) {
            Object[] fila = new Object[5];
            fila[0] = i;
            fila[1] = valInt[i];
            fila[2] = cont[i];
            fila[3] = fesp;
            fila[4] = dif[i];

            test.addRow(fila);
        }

        double acu = 0;
        for (int i = 0; i < dif.length; i++) {
            acu += dif[i];
        }
        System.out.println(acu);
        double chi = acu / fesp;
        jtxtChi.setText(String.valueOf(chi));
        jtxtChi.enable(false);
        txt_chitabulado.enable(false);
        txt_gradolibertad.enable(false);

        if (Double.parseDouble(jtxtChi.getText()) < Double.parseDouble(txt_chitabulado.getText())) {
            jTextArea1.setText("Como Chi cuadrado observado ( "
                    + jtxtChi.getText()
                    + " ) es MENOR a Chi cuadrado tabulado\n con el nivel de confianza y los grados de libertad seleccionados \n"
                    + "podemos decir que no rechazaremos la Ho (Hipotesis nula o cero)");
        } else {
            jTextArea1.setText("Como Chi cuadrado observado ( "
                    + jtxtChi.getText()
                    + " ) es MAYOR a Chi cuadrado tabulado\n con el nivel de confianza y los grados de libertad seleccionados \n"
                    + "podemos decir que rechazaremos la Ho (Hipotesis nula o cero) y aceptaremos una H1 (Hipotesis alternativa)");
        }


    }//GEN-LAST:event_BtnRealizarTestActionPerformed
    
    private void inicializaciones() {
        //pasando valores de radiobutton a variables 
        if (Rbtn5.isSelected() == true) {
            this.intervalo = 5;
        }
        if (RBtn10.isSelected() == true) {
            this.intervalo = 10;
        }
        if (RBtn20.isSelected() == true) {
            this.intervalo = 20;
        }
        if (RBtn95.isSelected() == true) {
            this.nivelConfianza = 95;
        } else {
            this.nivelConfianza = 99;
        }

        //grados de libertad
        int gl = intervalo - 1;
        txt_gradolibertad.setText(String.valueOf(gl));

        //Chi tabulado
        if (Rbtn5.isSelected() == true && RBtn95.isSelected() == true) {
            txt_chitabulado.setText("9.4877");
        }
        if (Rbtn5.isSelected() == true && RBtn99.isSelected() == true) {
            txt_chitabulado.setText("13.2767");
        }

        if (RBtn10.isSelected() == true && RBtn95.isSelected() == true) {
            txt_chitabulado.setText("16.9190");
        }
        if (RBtn10.isSelected() == true && RBtn99.isSelected() == true) {
            txt_chitabulado.setText("21.6660");
        }

        if (RBtn20.isSelected() == true && RBtn95.isSelected() == true) {
            txt_chitabulado.setText("30.1435");
        }
        if (RBtn20.isSelected() == true && RBtn99.isSelected() == true) {
            txt_chitabulado.setText("36.1908");
        }
    }
    private void txt_gradolibertadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_gradolibertadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_gradolibertadActionPerformed

    private void txt_chitabuladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_chitabuladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_chitabuladoActionPerformed

    private void jtxtChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtChiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int numDatos = datos.getRowCount();
        for (int i = 0; i < numDatos; i++) {
            datos.removeRow(0);
        }
        int numDatos1 = test.getRowCount();
        for (int j = 0; j < numDatos1; j++) {
            test.removeRow(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TestChiCuadradoMixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestChiCuadradoMixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestChiCuadradoMixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestChiCuadradoMixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new TestChiCuadradoMixto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRealizarTest;
    private javax.swing.JRadioButton RBtn10;
    private javax.swing.JRadioButton RBtn20;
    private javax.swing.JRadioButton RBtn95;
    private javax.swing.JRadioButton RBtn99;
    private javax.swing.JRadioButton Rbtn5;
    private javax.swing.JToggleButton btn_generar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTabla;
    private javax.swing.JTable jTabla1;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jtxtChi;
    private javax.swing.JTextField txtM;
    private javax.swing.JTextField txtXo;
    private javax.swing.JTextField txt_chitabulado;
    private javax.swing.JTextField txt_gradolibertad;
    private javax.swing.JTextField txta;
    private javax.swing.JTextField txtc;
    private javax.swing.JTextField txtm;
    // End of variables declaration//GEN-END:variables
}
