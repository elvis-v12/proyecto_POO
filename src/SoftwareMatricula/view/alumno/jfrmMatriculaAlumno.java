package SoftwareMatricula.view.alumno;

/**
 *
 * @author Elvis
 */
public class jfrmMatriculaAlumno extends javax.swing.JFrame {

        private static final long serialVersionUID = 1L;

        public jfrmMatriculaAlumno() {
                initComponents();
                this.setLocationRelativeTo(null);
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel6 = new javax.swing.JPanel();
                jLabel34 = new javax.swing.JLabel();
                jSeparator3 = new javax.swing.JSeparator();
                jLabel1 = new javax.swing.JLabel();
                jLabel33 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jPanel1 = new javax.swing.JPanel();
                jLabel3 = new javax.swing.JLabel();
                jPanel27 = new javax.swing.JPanel();
                jtxtNombre1 = new javax.swing.JTextField();
                jLabel11 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                jtxtApellidoPaterno1 = new javax.swing.JTextField();
                jtxtApellidoMaterno1 = new javax.swing.JTextField();
                jLabel13 = new javax.swing.JLabel();
                jLabel14 = new javax.swing.JLabel();
                jtxtEdad1 = new javax.swing.JTextField();
                jLabel15 = new javax.swing.JLabel();
                jtxtDNI1 = new javax.swing.JTextField();
                jLabel16 = new javax.swing.JLabel();
                jtxtGrado1 = new javax.swing.JTextField();
                jLabel4 = new javax.swing.JLabel();
                jtxtGrado2 = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jButton3 = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Matricula del alumno");
                setResizable(false);

                jPanel6.setBackground(new java.awt.Color(0, 102, 102));
                jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel34.setFont(new java.awt.Font("Stencil", 2, 18)); // NOI18N
                jLabel34.setForeground(new java.awt.Color(255, 255, 255));
                jLabel34.setText("Nuestra señora del Carmen");
                jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 270, 40));

                jSeparator3.setBackground(new java.awt.Color(0, 0, 255));
                jSeparator3.setForeground(new java.awt.Color(0, 0, 204));
                jPanel6.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 310, 10));

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/IE(2).png"))); // NOI18N
                jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, -1, -1));

                jLabel33.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 48)); // NOI18N
                jLabel33.setForeground(new java.awt.Color(255, 255, 255));
                jLabel33.setText("COLEGIO");
                jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel2.setText("MATRICULATE YA!");
                jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

                jPanel1.setBackground(new java.awt.Color(0, 102, 102));

                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                jLabel3.setText("COMPLETE TUS RESPECTIVOS DATOS;");

                jPanel27.setBackground(new java.awt.Color(255, 255, 102));

                jtxtNombre1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jtxtNombre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 208, 208)));

                jLabel11.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jLabel11.setText("Nombre:");

                jLabel12.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jLabel12.setText("Apellido Paterno:");

                jtxtApellidoPaterno1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jtxtApellidoPaterno1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 208, 208)));

                jtxtApellidoMaterno1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jtxtApellidoMaterno1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 208, 208)));

                jLabel13.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jLabel13.setText("Apellido Materno:");

                jLabel14.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jLabel14.setText("Edad:");

                jtxtEdad1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jtxtEdad1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 208, 208)));

                jLabel15.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jLabel15.setText("Grado:");

                jtxtDNI1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jtxtDNI1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 208, 208)));

                jLabel16.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jLabel16.setText("DNI:");

                jtxtGrado1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jtxtGrado1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 208, 208)));

                jLabel4.setText("Telefono:");

                jtxtGrado2.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jtxtGrado2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 208, 208)));

                javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
                jPanel27.setLayout(jPanel27Layout);
                jPanel27Layout.setHorizontalGroup(
                        jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel27Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel27Layout.createSequentialGroup()
                                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jtxtApellidoMaterno1, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jtxtApellidoPaterno1))
                                                .addGap(30, 30, 30))
                                        .addGroup(jPanel27Layout.createSequentialGroup()
                                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel27Layout.createSequentialGroup()
                                                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                                                .addGap(6, 6, 6)))
                                                .addGap(194, 194, 194))
                                        .addGroup(jPanel27Layout.createSequentialGroup()
                                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel27Layout.createSequentialGroup()
                                                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(48, 48, 48))
                                                        .addGroup(jPanel27Layout.createSequentialGroup()
                                                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(4, 4, 4))
                                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel27Layout.createSequentialGroup()
                                                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(72, 72, 72)))
                                                .addGap(134, 134, 134))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jtxtNombre1, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jtxtDNI1, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(30, 30, 30))
                                        .addGroup(jPanel27Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jtxtGrado2, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jtxtGrado1, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jtxtEdad1, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(30, 30, 30))))
                );
                jPanel27Layout.setVerticalGroup(
                        jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel27Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtDNI1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtApellidoPaterno1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtApellidoMaterno1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtGrado1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtGrado2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );

                jButton1.setBackground(new java.awt.Color(33, 45, 62));
                jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jButton1.setForeground(new java.awt.Color(255, 0, 0));
                jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/cancelado.png"))); // NOI18N
                jButton1.setText("Matricularme");

                jButton2.setBackground(new java.awt.Color(33, 45, 62));
                jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jButton2.setForeground(new java.awt.Color(255, 0, 0));
                jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/tesis(1).png"))); // NOI18N
                jButton2.setText("Cancelar Matricula");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(157, 157, 157))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(140, 140, 140))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(jButton1)
                                .addGap(72, 72, 72)
                                .addComponent(jButton2)
                                .addGap(0, 90, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                );

                jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 680, 550));

                jButton3.setBackground(new java.awt.Color(0, 102, 102));
                jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/anterior_1.png"))); // NOI18N
                jButton3.setText("REGRESAR");
                jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel16;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel33;
        private javax.swing.JLabel jLabel34;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel27;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JSeparator jSeparator3;
        private javax.swing.JTextField jtxtApellidoMaterno1;
        private javax.swing.JTextField jtxtApellidoPaterno1;
        private javax.swing.JTextField jtxtDNI1;
        private javax.swing.JTextField jtxtEdad1;
        private javax.swing.JTextField jtxtGrado1;
        private javax.swing.JTextField jtxtGrado2;
        private javax.swing.JTextField jtxtNombre1;
        // End of variables declaration//GEN-END:variables
}
