package SoftwareMatricula.view.registro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import SoftwareAsistencia.config.ConexionSQL;
import SofwareAsistencia.controler.metodos.FaceRecognition;
import SofwareAsistencia.controler.metodos.ReconocerRostro;
import SofwareRegistroAsistencia.view.Lista.jfrmAsistencia;

public class jfrmRegistroDocente extends javax.swing.JFrame {
  ConexionSQL conexionSQL;
       ConexionSQL cd;
        public jfrmRegistroDocente() {
                initComponents();
                this.setLocationRelativeTo(null);
             conexionSQL = new ConexionSQL();
        }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnRegistrar1 = new javax.swing.JButton();
        btnFoto1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(33, 45, 62));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Iniciar Sesión");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 275, 53));

        jLabel4.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuario:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        btnRegistrar.setBackground(new java.awt.Color(73, 181, 172));
        btnRegistrar.setFont(new java.awt.Font("Gotham Extra Light", 0, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/tesis.png"))); // NOI18N
        btnRegistrar.setText("Registrarse");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.setRequestFocusEnabled(false);
        btnRegistrar.setVerifyInputWhenFocusTarget(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        btnRegistrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRegistrarKeyPressed(evt);
            }
        });
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 210, 60));

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

        jSeparator1.setBackground(new java.awt.Color(73, 181, 172));
        jSeparator1.setForeground(new java.awt.Color(73, 181, 172));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 310, 10));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 48, 36));

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

        btnRegistrar1.setBackground(new java.awt.Color(73, 181, 172));
        btnRegistrar1.setFont(new java.awt.Font("Gotham Extra Light", 0, 18)); // NOI18N
        btnRegistrar1.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/ingresar.png"))); // NOI18N
        btnRegistrar1.setText("Ingresar");
        btnRegistrar1.setBorderPainted(false);
        btnRegistrar1.setContentAreaFilled(false);
        btnRegistrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrar1.setFocusPainted(false);
        btnRegistrar1.setRequestFocusEnabled(false);
        btnRegistrar1.setVerifyInputWhenFocusTarget(false);
        btnRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrar1ActionPerformed(evt);
            }
        });
        btnRegistrar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRegistrar1KeyPressed(evt);
            }
        });
        jPanel2.add(btnRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 210, 60));

        btnFoto1.setBackground(new java.awt.Color(73, 181, 172));
        btnFoto1.setFont(new java.awt.Font("Gotham Extra Light", 0, 18)); // NOI18N
        btnFoto1.setForeground(new java.awt.Color(255, 255, 255));
        btnFoto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/camara-fotografica.png"))); // NOI18N
        btnFoto1.setText("Reconocer Rostro");
        btnFoto1.setBorderPainted(false);
        btnFoto1.setContentAreaFilled(false);
        btnFoto1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFoto1.setFocusPainted(false);
        btnFoto1.setRequestFocusEnabled(false);
        btnFoto1.setVerifyInputWhenFocusTarget(false);
        btnFoto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoto1ActionPerformed(evt);
            }
        });
        btnFoto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnFoto1KeyPressed(evt);
            }
        });
        jPanel2.add(btnFoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 230, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
    jfrmRegistro jfrmRegistro=new jfrmRegistro();
jfrmRegistro.setVisible(true);
   dispose();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnRegistrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRegistrarKeyPressed

    }//GEN-LAST:event_btnRegistrarKeyPressed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
           
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
            System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void btnRegistrar1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRegistrar1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrar1KeyPressed
//
    private void btnRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrar1ActionPerformed
        // Obtener la conexión a la base de datos
        try (Connection conexion = conexionSQL.getConnection()) {
            // Obtener el usuario y la contraseña ingresados por el usuario
            String usuario = txtUsuario.getText();
          
            // Construir la consulta SQL para autenticar al usuario
            String consultaSQL = "SELECT * FROM ingreso WHERE correo = ?";
            try {
                // Preparar la consulta
                try (PreparedStatement preparedStatement = conexion.prepareStatement(consultaSQL)) {
                    preparedStatement.setString(1, usuario);
                  

                    // Ejecutar la consulta
                    try (ResultSet resultado = preparedStatement.executeQuery()) {
                        if (resultado.next()) {
                            // Usuario autenticado correctamente
                            jfrmAsistencia jfrmAsistencia=new jfrmAsistencia();
                            jfrmAsistencia.setVisible(true);
                            dispose();
                            System.out.println("Usuario autenticado correctamente");
                        } else {
                            // Usuario no autenticado
                            System.out.println("Usuario no autenticado");
                        }
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
 
                         
    }//GEN-LAST:event_btnRegistrar1ActionPerformed

    private void btnFoto1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnFoto1KeyPressed

    }//GEN-LAST:event_btnFoto1KeyPressed

    private void btnFoto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFoto1ActionPerformed
  ReconocerRostro ReconocerRostro=new ReconocerRostro();
   
    }//GEN-LAST:event_btnFoto1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFoto1;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrar1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
