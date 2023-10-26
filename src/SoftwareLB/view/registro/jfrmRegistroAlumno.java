package SoftwareLB.view.registro;

import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;



/**
 *
 * @author Elvis
 */
public class jfrmRegistroAlumno extends javax.swing.JFrame {

        public jfrmRegistroAlumno() {
                initComponents();
                this.setLocationRelativeTo(null);
                Shape forma = new RoundRectangle2D.Double(0, 0, getBounds().width, getBounds().height, 20, 20);
        }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, 46, 41));

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("COLEGIO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jLabel11.setFont(new java.awt.Font("Stencil", 2, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nuestra señora del Carmen");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 270, 40));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("@2023-7 by Blue Web");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 204));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 310, 10));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/estudiantes.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/IE(2).png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/anterior_1.png"))); // NOI18N
        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        jPanel2.setBackground(new java.awt.Color(33, 45, 62));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Iniciar Sesión");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 275, 53));

        jLabel4.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CORREO:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONTRASEÑA:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        btnIngresar.setBackground(new java.awt.Color(73, 181, 172));
        btnIngresar.setFont(new java.awt.Font("Gotham Extra Light", 0, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/ingresar.png"))); // NOI18N
        btnIngresar.setText("REGISTRAR");
        btnIngresar.setBorderPainted(false);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIngresar.setFocusPainted(false);
        btnIngresar.setRequestFocusEnabled(false);
        btnIngresar.setVerifyInputWhenFocusTarget(false);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        btnIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnIngresarKeyPressed(evt);
            }
        });
        jPanel2.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 210, 60));

        txtUsuario.setBackground(new java.awt.Color(33, 45, 62));
        txtUsuario.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(73, 181, 172));
        txtUsuario.setBorder(null);
        txtUsuario.setCaretColor(new java.awt.Color(73, 181, 172));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 270, 40));

        txtContraseña.setBackground(new java.awt.Color(33, 45, 62));
        txtContraseña.setFont(txtContraseña.getFont().deriveFont(txtContraseña.getFont().getSize()+7f));
        txtContraseña.setForeground(new java.awt.Color(73, 181, 172));
        txtContraseña.setBorder(null);
        txtContraseña.setCaretColor(new java.awt.Color(73, 181, 172));
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyPressed(evt);
            }
        });
        jPanel2.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 270, 36));

        jSeparator1.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator1.setForeground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 310, 10));

        jSeparator2.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator2.setForeground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 310, 10));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 48, 36));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 48, 42));

        jLabel9.setFont(new java.awt.Font("Gotham Thin", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(73, 181, 172));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("x");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 30, 30));

        btnSalir.setBackground(new java.awt.Color(73, 181, 172));
        btnSalir.setFont(new java.awt.Font("Gotham Extra Light", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/salida.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.setFocusPainted(false);
        btnSalir.setFocusable(false);
        btnSalir.setRequestFocusEnabled(false);
        btnSalir.setVerifyInputWhenFocusTarget(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 210, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
      
     
//        
     
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnIngresarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIngresarKeyPressed

    }//GEN-LAST:event_btnIngresarKeyPressed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
            if (evt.getKeyCode() == evt.VK_ENTER) {
                    txtContraseña.requestFocus();

            }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyPressed
            if (evt.getKeyCode() == evt.VK_ENTER) {
                    btnIngresar.requestFocus();

            }
    }//GEN-LAST:event_txtContraseñaKeyPressed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
            System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
            System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
            
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField txtContraseña;
    public static javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
