package SoftwareMatricula.view.registro;

/**
 *
 * @author Elvis
 */
public class jfrmRegistro extends javax.swing.JFrame {

        /**
         * Creates new form Registros
         */
        public jfrmRegistro() {
                initComponents();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                buttonGroup1 = new javax.swing.ButtonGroup();
                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                btnAlumno = new javax.swing.JButton();
                btnAdministrador = new javax.swing.JButton();
                jLabel3 = new javax.swing.JLabel();
                jButton3 = new javax.swing.JButton();
                jLabel4 = new javax.swing.JLabel();
                jSeparator3 = new javax.swing.JSeparator();
                jLabel14 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Principal");

                jPanel1.setBackground(new java.awt.Color(0, 0, 0));
                jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/colegio.png"))); // NOI18N
                jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

                jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 48)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setText("COLEGIO");
                jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

                btnAlumno.setBackground(new java.awt.Color(0, 0, 255));
                btnAlumno.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
                btnAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estudiante.png"))); // NOI18N
                btnAlumno.setText("ALUMNO");
                btnAlumno.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnAlumnoActionPerformed(evt);
                        }
                });
                jPanel1.add(btnAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 200, 90));

                btnAdministrador.setBackground(new java.awt.Color(0, 0, 255));
                btnAdministrador.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
                btnAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/administrador.png"))); // NOI18N
                btnAdministrador.setText("ADMINISTRADOR");
                btnAdministrador.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnAdministradorActionPerformed(evt);
                        }
                });
                jPanel1.add(btnAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, 90));

                jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                jLabel3.setText("@2023-7 by Blue Web");
                jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 570, -1, -1));

                jButton3.setBackground(new java.awt.Color(204, 0, 0));
                jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerca.png"))); // NOI18N
                jButton3.setText("CERRAR");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });
                jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 120, 70));

                jLabel4.setFont(new java.awt.Font("Stencil", 2, 18)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                jLabel4.setText("Nuestra señora del Carmen");
                jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 270, 40));

                jSeparator3.setBackground(new java.awt.Color(0, 0, 255));
                jSeparator3.setForeground(new java.awt.Color(0, 0, 204));
                jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 310, 10));

                jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IE(2).png"))); // NOI18N
                jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, 100));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void btnAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnoActionPerformed

            jfrmRegistroAlumno alumno = new jfrmRegistroAlumno();
            alumno.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnAlumnoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministradorActionPerformed
            jfrmRegistroAdministrador admi = new jfrmRegistroAdministrador();
            admi.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnAdministradorActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnAdministrador;
        private javax.swing.JButton btnAlumno;
        private javax.swing.ButtonGroup buttonGroup1;
        private javax.swing.JButton jButton3;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JSeparator jSeparator3;
        // End of variables declaration//GEN-END:variables
}
