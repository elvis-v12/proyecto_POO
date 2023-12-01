package SoftwareAsistencia.view.Lista;

import SoftwareAsistencia.controller.AsignaturaController;
import SoftwareAsistencia.methods.FaceRecognition;
import static SoftwareAsistencia.util.Data.getDateString;
import static SoftwareAsistencia.util.Data.getString;
import static SoftwareAsistencia.util.DataTransforme.alumnos;
import static SoftwareAsistencia.util.SwingUtil.*;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elnoe
 */
public class jfrmAsistencia extends javax.swing.JFrame {

        private static final AsignaturaController ASIGNATURA_CONTROLLER = new AsignaturaController();

        public jfrmAsistencia() {
                initComponents();
                updateModelJComboBox(getModel(jcbxCurso), ASIGNATURA_CONTROLLER.readAll());
                updateJTableModel(getModel(jtblAlumnosRegistrar), alumnos(getString(jcbxCurso :: getSelectedItem)));
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                Estado = new javax.swing.ButtonGroup();
                jCheckBox2 = new javax.swing.JCheckBox();
                jCheckBox3 = new javax.swing.JCheckBox();
                jScrollPane3 = new javax.swing.JScrollPane();
                jtblAlumnosRegistrar = new javax.swing.JTable();
                jbtnGrabarAsistenciaAlumno = new javax.swing.JButton();
                jbtnGrabarAsistencia = new javax.swing.JButton();
                jtxtAlumnoApellidoPaterno = new javax.swing.JTextField();
                jLabel1 = new javax.swing.JLabel();
                jtxtAlumnoID = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                jtxtAlumnoNombres = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                jtxtAlumnoApellidoMaterno = new javax.swing.JTextField();
                jLabel4 = new javax.swing.JLabel();
                jcbxCurso = new javax.swing.JComboBox<>();
                jCheckBox1 = new javax.swing.JCheckBox();
                jLabel5 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                btnfoto = new javax.swing.JButton();
                jLabel6 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("FORMULARIO ASISTENCIA");
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                Estado.add(jCheckBox2);
                jCheckBox2.setText("Falta");
                getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 376, -1, -1));

                Estado.add(jCheckBox3);
                jCheckBox3.setText("Justificación");
                getContentPane().add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 376, -1, -1));

                jtblAlumnosRegistrar.setBackground(new java.awt.Color(255, 77, 94));
                jtblAlumnosRegistrar.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "IDAlumno", "Alumno"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.Integer.class, java.lang.String.class
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }
                });
                jScrollPane3.setViewportView(jtblAlumnosRegistrar);

                getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 249, 339, 239));

                jbtnGrabarAsistenciaAlumno.setBackground(new java.awt.Color(152, 201, 167));
                jbtnGrabarAsistenciaAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/disco-flexible.png"))); // NOI18N
                jbtnGrabarAsistenciaAlumno.setText("GRABAR ASISTENCIA ALUMNO");
                jbtnGrabarAsistenciaAlumno.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jbtnGrabarAsistenciaAlumnoActionPerformed(evt);
                        }
                });
                getContentPane().add(jbtnGrabarAsistenciaAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 442, -1, 46));

                jbtnGrabarAsistencia.setBackground(new java.awt.Color(152, 201, 167));
                jbtnGrabarAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/disco-flexible.png"))); // NOI18N
                jbtnGrabarAsistencia.setText("Grabar Asistencia");
                jbtnGrabarAsistencia.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jbtnGrabarAsistenciaActionPerformed(evt);
                        }
                });
                getContentPane().add(jbtnGrabarAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 1000, 46));

                jtxtAlumnoApellidoPaterno.setEditable(false);
                jtxtAlumnoApellidoPaterno.setText("ap");
                getContentPane().add(jtxtAlumnoApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 278, 200, -1));

                jLabel1.setText("ID Alumno:");
                getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 214, 123, 26));

                jtxtAlumnoID.setEditable(false);
                jtxtAlumnoID.setText("id");
                getContentPane().add(jtxtAlumnoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 214, 200, -1));

                jLabel2.setText("Nombres:");
                getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 246, 123, 26));

                jtxtAlumnoNombres.setEditable(false);
                jtxtAlumnoNombres.setText("nombre1 nombre2");
                getContentPane().add(jtxtAlumnoNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 246, 200, -1));

                jLabel3.setText("Apellido Paterno");
                getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 278, 123, 26));

                jTable1.setBackground(new java.awt.Color(255, 77, 94));
                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "IDAlumno", "Alumno", "Fecha", "Asignatura", "Estado"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }
                });
                jScrollPane1.setViewportView(jTable1);

                getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 6, 1208, 152));

                jtxtAlumnoApellidoMaterno.setEditable(false);
                jtxtAlumnoApellidoMaterno.setText("am");
                getContentPane().add(jtxtAlumnoApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 200, -1));

                jLabel4.setText("Apellido Materno");
                getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 309, 123, 26));

                jcbxCurso.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jcbxCursoActionPerformed(evt);
                        }
                });
                getContentPane().add(jcbxCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 186, 200, 57));

                Estado.add(jCheckBox1);
                jCheckBox1.setSelected(true);
                jCheckBox1.setText("Asistencia");
                getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 376, -1, -1));

                jLabel5.setText("Asignaturas");
                getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 164, 77, -1));

                jButton1.setBackground(new java.awt.Color(152, 201, 167));
                jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jButton1.setText("REGISTRAR ALUMNO");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });
                getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1061, 310, -1, 60));

                btnfoto.setBackground(new java.awt.Color(73, 181, 172));
                btnfoto.setFont(new java.awt.Font("Gotham Extra Light", 0, 18)); // NOI18N
                btnfoto.setForeground(new java.awt.Color(255, 255, 255));
                btnfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/camara-fotografica.png"))); // NOI18N
                btnfoto.setText("Foto");
                btnfoto.setBorderPainted(false);
                btnfoto.setContentAreaFilled(false);
                btnfoto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                btnfoto.setFocusPainted(false);
                btnfoto.setRequestFocusEnabled(false);
                btnfoto.setVerifyInputWhenFocusTarget(false);
                btnfoto.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnfotoActionPerformed(evt);
                        }
                });
                btnfoto.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                                btnfotoKeyPressed(evt);
                        }
                });
                getContentPane().add(btnfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 210, 60));

                jLabel6.setText("jLabel6");
                getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, 210, 200));

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void jbtnGrabarAsistenciaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGrabarAsistenciaAlumnoActionPerformed
                // Data:
                var idAlumno = getString(jtxtAlumnoID :: getText);
                var nombresAlumno = getString(jtxtAlumnoNombres :: getText);
                var apellidoPaternoAlumno = getString(jtxtAlumnoApellidoPaterno :: getText);
                var apellidoMaternoAlumno = getString(jtxtAlumnoApellidoMaterno :: getText);
                var fechaRegistroAlumno = getDateString();
                var asignatura = getString(jcbxCurso :: getSelectedItem);
                var estado = "";

                JCheckBox[] checkBoxes = {jCheckBox1, jCheckBox2, jCheckBox3};
                for (JCheckBox jCheckBox : checkBoxes) {
                        if (jCheckBox.isSelected()) {
                                estado = getString(jCheckBox :: getText);
                        }
                }

                var model = (DefaultTableModel) jTable1.getModel();
                Object[] alumnoRegistrado = {idAlumno,
                                             nombresAlumno + " " + apellidoPaternoAlumno + " " + apellidoMaternoAlumno,
                                             fechaRegistroAlumno, asignatura, estado
                };
                model.addRow(alumnoRegistrado);
        }//GEN-LAST:event_jbtnGrabarAsistenciaAlumnoActionPerformed

        private void jbtnGrabarAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGrabarAsistenciaActionPerformed

        }//GEN-LAST:event_jbtnGrabarAsistenciaActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                // TODO add your handling code here:

        }//GEN-LAST:event_jButton1ActionPerformed

        private void btnfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfotoActionPerformed
                FaceRecognition faceRecognition = new FaceRecognition();
                dispose();

        }//GEN-LAST:event_btnfotoActionPerformed

        private void btnfotoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnfotoKeyPressed

        }//GEN-LAST:event_btnfotoKeyPressed

        private void jcbxCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxCursoActionPerformed
                updateJTableModel(getModel(jtblAlumnosRegistrar), alumnos(getString(jcbxCurso :: getSelectedItem)));
        }//GEN-LAST:event_jcbxCursoActionPerformed

        public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(() -> new jfrmAsistencia().setVisible(true));
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.ButtonGroup Estado;
        private javax.swing.JButton btnfoto;
        private javax.swing.JButton jButton1;
        private javax.swing.JCheckBox jCheckBox1;
        private javax.swing.JCheckBox jCheckBox2;
        private javax.swing.JCheckBox jCheckBox3;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JTable jTable1;
        private javax.swing.JButton jbtnGrabarAsistencia;
        private javax.swing.JButton jbtnGrabarAsistenciaAlumno;
        private javax.swing.JComboBox<String> jcbxCurso;
        private javax.swing.JTable jtblAlumnosRegistrar;
        private javax.swing.JTextField jtxtAlumnoApellidoMaterno;
        private javax.swing.JTextField jtxtAlumnoApellidoPaterno;
        private javax.swing.JTextField jtxtAlumnoID;
        private javax.swing.JTextField jtxtAlumnoNombres;
        // End of variables declaration//GEN-END:variables
}
