package SoftwareMatricula.view.alumno;

/**
 *
 * @author Noe Elvis Ramirez Herrera
 */
public class jfrmAlumno extends javax.swing.JFrame {

        private static final long serialVersionUID = 1L;

        public jfrmAlumno() {
                initComponents();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel7 = new javax.swing.JPanel();
                jtbnActualizar = new javax.swing.JButton();
                jtbnRegistrar = new javax.swing.JButton();
                jtbnEliminar = new javax.swing.JButton();
                jPanel5 = new javax.swing.JPanel();
                jPanel1 = new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                jtxtBuscar = new javax.swing.JTextField();
                jtbnBuscar = new javax.swing.JButton();
                jPanel4 = new javax.swing.JPanel();
                jtxtNombre = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jtxtApellidoPaterno = new javax.swing.JTextField();
                jtxtApellidoMaterno = new javax.swing.JTextField();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jtxtEdad = new javax.swing.JTextField();
                jtxtGrado = new javax.swing.JTextField();
                jLabel7 = new javax.swing.JLabel();
                jtxtDNI = new javax.swing.JTextField();
                jLabel9 = new javax.swing.JLabel();
                jPanel3 = new javax.swing.JPanel();
                jScrollPane2 = new javax.swing.JScrollPane();
                jtblNotas_Alumno = new javax.swing.JTable();
                jLabel8 = new javax.swing.JLabel();
                jPanel2 = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                jtblAlumnos = new javax.swing.JTable();
                jLabel1 = new javax.swing.JLabel();
                jPanel6 = new javax.swing.JPanel();
                jPanel8 = new javax.swing.JPanel();
                jtbnActualizar1 = new javax.swing.JButton();
                jtbnRegistrar1 = new javax.swing.JButton();
                jtbnEliminar1 = new javax.swing.JButton();
                jPanel9 = new javax.swing.JPanel();
                jPanel10 = new javax.swing.JPanel();
                jLabel10 = new javax.swing.JLabel();
                jtxtBuscar1 = new javax.swing.JTextField();
                jtbnBuscar1 = new javax.swing.JButton();
                jPanel11 = new javax.swing.JPanel();
                jtxtNombre1 = new javax.swing.JTextField();
                jLabel11 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                jtxtApellidoPaterno1 = new javax.swing.JTextField();
                jtxtApellidoMaterno1 = new javax.swing.JTextField();
                jLabel13 = new javax.swing.JLabel();
                jLabel14 = new javax.swing.JLabel();
                jtxtEdad1 = new javax.swing.JTextField();
                jtxtGrado1 = new javax.swing.JTextField();
                jLabel15 = new javax.swing.JLabel();
                jtxtDNI1 = new javax.swing.JTextField();
                jLabel16 = new javax.swing.JLabel();
                jPanel12 = new javax.swing.JPanel();
                jScrollPane3 = new javax.swing.JScrollPane();
                jtblNotas_Alumno1 = new javax.swing.JTable();
                jLabel17 = new javax.swing.JLabel();
                jPanel13 = new javax.swing.JPanel();
                jScrollPane4 = new javax.swing.JScrollPane();
                jtblAlumnos1 = new javax.swing.JTable();
                jLabel18 = new javax.swing.JLabel();

                jPanel7.setBackground(new java.awt.Color(255, 255, 255));

                jtbnActualizar.setText("Actualizar");

                jtbnRegistrar.setText("Registrar");

                jtbnEliminar.setText("Eliminar");

                javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
                jPanel7.setLayout(jPanel7Layout);
                jPanel7Layout.setHorizontalGroup(
                        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jtbnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(30, 30, 30)
                                .addComponent(jtbnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(48, 48, 48)
                                .addComponent(jtbnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );
                jPanel7Layout.setVerticalGroup(
                        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jtbnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtbnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtbnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                jPanel5.setBackground(new java.awt.Color(255, 255, 255));

                jLabel2.setText("Buscar:");

                jtbnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Lupa.png"))); // NOI18N
                jtbnBuscar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jtbnBuscarActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(176, 176, 176))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtxtBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtbnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtbnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                );

                jLabel3.setText("Nombre:");

                jLabel4.setText("Apellido Paterno:");

                jLabel5.setText("Apellido Materno:");

                jLabel6.setText("Edad:");

                jLabel7.setText("Grado:");

                jLabel9.setText("DNI:");

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(
                        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtxtNombre)
                                        .addComponent(jtxtApellidoPaterno)
                                        .addComponent(jtxtGrado)
                                        .addComponent(jtxtApellidoMaterno)
                                        .addComponent(jtxtEdad)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(6, 6, 6)))
                                                .addGap(179, 179, 179))
                                        .addComponent(jtxtDNI)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(48, 48, 48))
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(4, 4, 4))
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(72, 72, 72)))
                                                .addGap(119, 119, 119))))
                );
                jPanel4Layout.setVerticalGroup(
                        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                );

                jtblNotas_Alumno.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "Año", "Bimestre 1", "Bimestre 2", "Bimestre 3", "Bimestre 4", "Promedio Final"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }
                });
                jScrollPane2.setViewportView(jtblNotas_Alumno);

                jLabel8.setText("Notas del Alumno");

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(245, 245, 245))
                );
                jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
                jPanel5.setLayout(jPanel5Layout);
                jPanel5Layout.setHorizontalGroup(
                        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(4, 4, 4))
                );
                jPanel5Layout.setVerticalGroup(
                        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(3, 3, 3))
                );

                jPanel2.setBackground(new java.awt.Color(255, 255, 255));

                jtblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
                jScrollPane1.setViewportView(jtblAlumnos);

                jLabel1.setText("Alumnos");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGap(2, 2, 2))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(522, 522, 522))
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                );

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Software Matricula-Alumnos");
                setBackground(new java.awt.Color(255, 255, 255));

                jPanel6.setBackground(new java.awt.Color(255, 255, 255));

                jPanel8.setBackground(new java.awt.Color(255, 255, 255));

                jtbnActualizar1.setBackground(new java.awt.Color(248, 248, 248));
                jtbnActualizar1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jtbnActualizar1.setForeground(new java.awt.Color(0, 0, 0));
                jtbnActualizar1.setText("Actualizar");
                jtbnActualizar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 208, 208)));

                jtbnRegistrar1.setBackground(new java.awt.Color(248, 248, 248));
                jtbnRegistrar1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jtbnRegistrar1.setForeground(new java.awt.Color(0, 0, 0));
                jtbnRegistrar1.setText("Registrar");
                jtbnRegistrar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 208, 208)));

                jtbnEliminar1.setBackground(new java.awt.Color(248, 248, 248));
                jtbnEliminar1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jtbnEliminar1.setForeground(new java.awt.Color(0, 0, 0));
                jtbnEliminar1.setText("Eliminar");
                jtbnEliminar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 208, 208)));

                javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
                jPanel8.setLayout(jPanel8Layout);
                jPanel8Layout.setHorizontalGroup(
                        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jtbnRegistrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(30, 30, 30)
                                .addComponent(jtbnActualizar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(48, 48, 48)
                                .addComponent(jtbnEliminar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );
                jPanel8Layout.setVerticalGroup(
                        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jtbnActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtbnRegistrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtbnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                jPanel9.setBackground(new java.awt.Color(255, 255, 255));

                jPanel10.setBackground(new java.awt.Color(255, 255, 255));

                jLabel10.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jLabel10.setForeground(new java.awt.Color(0, 0, 0));
                jLabel10.setText("Buscar:");

                jtxtBuscar1.setBackground(new java.awt.Color(255, 255, 255));
                jtxtBuscar1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jtxtBuscar1.setForeground(new java.awt.Color(0, 0, 0));
                jtxtBuscar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 208, 208)));

                jtbnBuscar1.setBackground(new java.awt.Color(248, 248, 248));
                jtbnBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Source/Lupa.png"))); // NOI18N
                jtbnBuscar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 208, 208)));
                jtbnBuscar1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jtbnBuscar1ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
                jPanel10.setLayout(jPanel10Layout);
                jPanel10Layout.setHorizontalGroup(
                        jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(176, 176, 176))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jtxtBuscar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtbnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                );
                jPanel10Layout.setVerticalGroup(
                        jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtbnBuscar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtxtBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                );

                jPanel11.setBackground(new java.awt.Color(255, 255, 255));

                jtxtNombre1.setBackground(new java.awt.Color(255, 255, 255));
                jtxtNombre1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jtxtNombre1.setForeground(new java.awt.Color(0, 0, 0));
                jtxtNombre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 208, 208)));

                jLabel11.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jLabel11.setForeground(new java.awt.Color(0, 0, 0));
                jLabel11.setText("Nombre:");

                jLabel12.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jLabel12.setForeground(new java.awt.Color(0, 0, 0));
                jLabel12.setText("Apellido Paterno:");

                jtxtApellidoPaterno1.setBackground(new java.awt.Color(255, 255, 255));
                jtxtApellidoPaterno1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jtxtApellidoPaterno1.setForeground(new java.awt.Color(0, 0, 0));
                jtxtApellidoPaterno1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 208, 208)));

                jtxtApellidoMaterno1.setBackground(new java.awt.Color(255, 255, 255));
                jtxtApellidoMaterno1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jtxtApellidoMaterno1.setForeground(new java.awt.Color(0, 0, 0));
                jtxtApellidoMaterno1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 208, 208)));

                jLabel13.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jLabel13.setForeground(new java.awt.Color(0, 0, 0));
                jLabel13.setText("Apellido Materno:");

                jLabel14.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jLabel14.setForeground(new java.awt.Color(0, 0, 0));
                jLabel14.setText("Edad:");

                jtxtEdad1.setBackground(new java.awt.Color(255, 255, 255));
                jtxtEdad1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jtxtEdad1.setForeground(new java.awt.Color(0, 0, 0));
                jtxtEdad1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 208, 208)));

                jtxtGrado1.setBackground(new java.awt.Color(255, 255, 255));
                jtxtGrado1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jtxtGrado1.setForeground(new java.awt.Color(0, 0, 0));
                jtxtGrado1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 208, 208)));

                jLabel15.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jLabel15.setForeground(new java.awt.Color(0, 0, 0));
                jLabel15.setText("Grado:");

                jtxtDNI1.setBackground(new java.awt.Color(255, 255, 255));
                jtxtDNI1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jtxtDNI1.setForeground(new java.awt.Color(0, 0, 0));
                jtxtDNI1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 208, 208)));

                jLabel16.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jLabel16.setForeground(new java.awt.Color(0, 0, 0));
                jLabel16.setText("DNI:");

                javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
                jPanel11.setLayout(jPanel11Layout);
                jPanel11Layout.setHorizontalGroup(
                        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jtxtNombre1)
                                        .addComponent(jtxtApellidoPaterno1)
                                        .addComponent(jtxtGrado1)
                                        .addComponent(jtxtApellidoMaterno1)
                                        .addComponent(jtxtEdad1)
                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(6, 6, 6)))
                                                .addGap(179, 179, 179))
                                        .addComponent(jtxtDNI1)
                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(48, 48, 48))
                                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(4, 4, 4))
                                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel11Layout.createSequentialGroup()
                                                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(72, 72, 72)))
                                                .addGap(119, 119, 119))))
                );
                jPanel11Layout.setVerticalGroup(
                        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                .addComponent(jtxtGrado1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                );

                jPanel12.setBackground(new java.awt.Color(255, 255, 255));

                jtblNotas_Alumno1.setBackground(new java.awt.Color(248, 248, 248));
                jtblNotas_Alumno1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 208, 208)));
                jtblNotas_Alumno1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jtblNotas_Alumno1.setForeground(new java.awt.Color(0, 0, 0));
                jtblNotas_Alumno1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "Año", "Bimestre 1", "Bimestre 2", "Bimestre 3", "Bimestre 4", "Promedio Final"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }
                });
                jScrollPane3.setViewportView(jtblNotas_Alumno1);

                jLabel17.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jLabel17.setForeground(new java.awt.Color(0, 0, 0));
                jLabel17.setText("Notas del Alumno");

                javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
                jPanel12.setLayout(jPanel12Layout);
                jPanel12Layout.setHorizontalGroup(
                        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                .addGap(245, 245, 245))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jScrollPane3)
                                .addContainerGap())
                );
                jPanel12Layout.setVerticalGroup(
                        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
                jPanel9.setLayout(jPanel9Layout);
                jPanel9Layout.setHorizontalGroup(
                        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(4, 4, 4))
                );
                jPanel9Layout.setVerticalGroup(
                        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(3, 3, 3))
                );

                jPanel13.setBackground(new java.awt.Color(255, 255, 255));

                jtblAlumnos1.setBackground(new java.awt.Color(248, 248, 248));
                jtblAlumnos1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(208, 208, 208)));
                jtblAlumnos1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jtblAlumnos1.setForeground(new java.awt.Color(0, 0, 0));
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
                jScrollPane4.setViewportView(jtblAlumnos1);

                jLabel18.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
                jLabel18.setForeground(new java.awt.Color(0, 0, 0));
                jLabel18.setText("Alumnos");

                javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
                jPanel13.setLayout(jPanel13Layout);
                jPanel13Layout.setHorizontalGroup(
                        jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel13Layout.createSequentialGroup()
                                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                                                .addGap(522, 522, 522))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                                .addComponent(jScrollPane4)
                                                .addContainerGap())))
                );
                jPanel13Layout.setVerticalGroup(
                        jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                jPanel6.setLayout(jPanel6Layout);
                jPanel6Layout.setHorizontalGroup(
                        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );
                jPanel6Layout.setVerticalGroup(
                        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))
                );

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
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void jtbnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnBuscarActionPerformed
                var buscar = jtxtBuscar.getText();
        }//GEN-LAST:event_jtbnBuscarActionPerformed

        private void jtbnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbnBuscar1ActionPerformed
                var buscar = jtxtBuscar.getText();
        }//GEN-LAST:event_jtbnBuscar1ActionPerformed

        public static void main(String[] args) {
                java.awt.EventQueue.invokeLater(() -> new jfrmAlumno().setVisible(true));

        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel16;
        private javax.swing.JLabel jLabel17;
        private javax.swing.JLabel jLabel18;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel10;
        private javax.swing.JPanel jPanel11;
        private javax.swing.JPanel jPanel12;
        private javax.swing.JPanel jPanel13;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JPanel jPanel7;
        private javax.swing.JPanel jPanel8;
        private javax.swing.JPanel jPanel9;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JScrollPane jScrollPane4;
        private javax.swing.JTable jtblAlumnos;
        private javax.swing.JTable jtblAlumnos1;
        private javax.swing.JTable jtblNotas_Alumno;
        private javax.swing.JTable jtblNotas_Alumno1;
        private javax.swing.JButton jtbnActualizar;
        private javax.swing.JButton jtbnActualizar1;
        private javax.swing.JButton jtbnBuscar;
        private javax.swing.JButton jtbnBuscar1;
        private javax.swing.JButton jtbnEliminar;
        private javax.swing.JButton jtbnEliminar1;
        private javax.swing.JButton jtbnRegistrar;
        private javax.swing.JButton jtbnRegistrar1;
        private javax.swing.JTextField jtxtApellidoMaterno;
        private javax.swing.JTextField jtxtApellidoMaterno1;
        private javax.swing.JTextField jtxtApellidoPaterno;
        private javax.swing.JTextField jtxtApellidoPaterno1;
        private javax.swing.JTextField jtxtBuscar;
        private javax.swing.JTextField jtxtBuscar1;
        private javax.swing.JTextField jtxtDNI;
        private javax.swing.JTextField jtxtDNI1;
        private javax.swing.JTextField jtxtEdad;
        private javax.swing.JTextField jtxtEdad1;
        private javax.swing.JTextField jtxtGrado;
        private javax.swing.JTextField jtxtGrado1;
        private javax.swing.JTextField jtxtNombre;
        private javax.swing.JTextField jtxtNombre1;
        // End of variables declaration//GEN-END:variables

}
