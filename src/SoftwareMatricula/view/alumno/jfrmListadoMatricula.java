package SoftwareMatricula.view.alumno;

/**
 *
 * @author Noe Elvis Ramirez Herrera
 */
public class jfrmListadoMatricula extends javax.swing.JFrame {

        public jfrmListadoMatricula() {
                initComponents();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jScrollPane18 = new javax.swing.JScrollPane();
                jtblAlumnos1 = new javax.swing.JTable();
                jScrollPane19 = new javax.swing.JScrollPane();
                jtblNotas_Alumno16 = new javax.swing.JTable();
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
                jtxtBuscar1 = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();
                jLabel32 = new javax.swing.JLabel();
                jLabel33 = new javax.swing.JLabel();
                jLabel34 = new javax.swing.JLabel();
                jSeparator3 = new javax.swing.JSeparator();
                jtbnRegistrar4 = new javax.swing.JButton();
                jtbnActualizar4 = new javax.swing.JButton();
                jtbnEliminar4 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setExtendedState(6);
                setResizable(false);
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel1.setBackground(new java.awt.Color(0, 102, 102));
                jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jtblAlumnos1.setBackground(new java.awt.Color(51, 51, 255));
                jtblAlumnos1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 208, 208)));
                jtblAlumnos1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jtblAlumnos1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "ID", "DNI", "Nombre", "Apellido Paterno", "Apellido Materno", "Edad", "Grado"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }
                });
                jScrollPane18.setViewportView(jtblAlumnos1);

                jPanel1.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 1010, 110));

                jtblNotas_Alumno16.setBackground(new java.awt.Color(255, 102, 51));
                jtblNotas_Alumno16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 208, 208)));
                jtblNotas_Alumno16.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jtblNotas_Alumno16.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "Año", "Pago Matricula"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.Integer.class, java.lang.Integer.class
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }
                });
                jScrollPane19.setViewportView(jtblNotas_Alumno16);

                jPanel1.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 640, 440));

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

                jtxtBuscar1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jtxtBuscar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 208, 208)));

                jLabel32.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jLabel32.setText("Buscar:");

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
                                                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                                        .addComponent(jtxtDNI1, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel27Layout.createSequentialGroup()
                                                                .addComponent(jtxtBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(30, 30, 30))
                                        .addGroup(jPanel27Layout.createSequentialGroup()
                                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel27Layout.createSequentialGroup()
                                                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(jtxtGrado1, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jtxtEdad1, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(30, 30, 30))))
                );
                jPanel27Layout.setVerticalGroup(
                        jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel27Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtxtBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                .addContainerGap(19, Short.MAX_VALUE))
                );

                jPanel1.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 370, 440));

                jLabel33.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 48)); // NOI18N
                jLabel33.setForeground(new java.awt.Color(255, 255, 255));
                jLabel33.setText("COLEGIO");
                jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

                jLabel34.setFont(new java.awt.Font("Stencil", 2, 18)); // NOI18N
                jLabel34.setForeground(new java.awt.Color(255, 255, 255));
                jLabel34.setText("Nuestra señora del Carmen");
                jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 270, 40));

                jSeparator3.setBackground(new java.awt.Color(0, 0, 255));
                jSeparator3.setForeground(new java.awt.Color(0, 0, 204));
                jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 310, 10));

                jtbnRegistrar4.setBackground(new java.awt.Color(248, 248, 248));
                jtbnRegistrar4.setFont(new java.awt.Font("Cascadia Mono", 1, 14)); // NOI18N
                jtbnRegistrar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/sitio-web(1).png"))); // NOI18N
                jtbnRegistrar4.setText("Registrar");
                jtbnRegistrar4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 208, 208)));
                jtbnRegistrar4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jtbnRegistrar4ActionPerformed(evt);
                        }
                });
                jPanel1.add(jtbnRegistrar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 640, 120, 40));

                jtbnActualizar4.setBackground(new java.awt.Color(248, 248, 248));
                jtbnActualizar4.setFont(new java.awt.Font("Cascadia Mono", 1, 14)); // NOI18N
                jtbnActualizar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/actualizar-pagina(1).png"))); // NOI18N
                jtbnActualizar4.setText("Actualizar");
                jtbnActualizar4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 208, 208)));
                jPanel1.add(jtbnActualizar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 640, 130, 40));

                jtbnEliminar4.setBackground(new java.awt.Color(248, 248, 248));
                jtbnEliminar4.setFont(new java.awt.Font("Cascadia Mono", 1, 14)); // NOI18N
                jtbnEliminar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/hombre(1).png"))); // NOI18N
                jtbnEliminar4.setText("Eliminar");
                jtbnEliminar4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 208, 208)));
                jPanel1.add(jtbnEliminar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 640, 120, 40));

                jButton2.setBackground(new java.awt.Color(0, 102, 102));
                jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/anterior_1.png"))); // NOI18N
                jButton2.setText("REGRESAR");
                jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/IE(2).png"))); // NOI18N
                jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, -1, -1));

                getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jtbnRegistrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnRegistrar4ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jtbnRegistrar4ActionPerformed
        public static void main(String[] args) {
                java.awt.EventQueue.invokeLater(() -> new jfrmListadoMatricula().setVisible(true));
        }
        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel16;
        private javax.swing.JLabel jLabel32;
        private javax.swing.JLabel jLabel33;
        private javax.swing.JLabel jLabel34;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel27;
        private javax.swing.JScrollPane jScrollPane18;
        private javax.swing.JScrollPane jScrollPane19;
        private javax.swing.JSeparator jSeparator3;
        private javax.swing.JTable jtblAlumnos1;
        private javax.swing.JTable jtblNotas_Alumno16;
        private javax.swing.JButton jtbnActualizar4;
        private javax.swing.JButton jtbnEliminar4;
        private javax.swing.JButton jtbnRegistrar4;
        private javax.swing.JTextField jtxtApellidoMaterno1;
        private javax.swing.JTextField jtxtApellidoPaterno1;
        private javax.swing.JTextField jtxtBuscar1;
        private javax.swing.JTextField jtxtDNI1;
        private javax.swing.JTextField jtxtEdad1;
        private javax.swing.JTextField jtxtGrado1;
        private javax.swing.JTextField jtxtNombre1;
        // End of variables declaration//GEN-END:variables
}
