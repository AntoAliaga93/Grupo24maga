/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo24maga.Vistas;

import grupo24maga.AccesoADatos.AlumnoData;
import grupo24maga.Entidades.Alumno;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;

/**
 *
 * @author Anto
 */
public class Alumnos extends javax.swing.JInternalFrame {
    public Alumnos() {
        initComponents();
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLApellido = new javax.swing.JLabel();
        jTFApellido = new javax.swing.JTextField();
        jLNombre = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jBEliminar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jTFDni = new javax.swing.JTextField();
        jBEstado = new javax.swing.JRadioButton();
        JButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTFidAlumno = new javax.swing.JTextField();
        jDFecha = new com.toedter.calendar.JDateChooser();
        jBModif = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Alumno");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Documento:");

        jLApellido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLApellido.setForeground(new java.awt.Color(0, 0, 0));
        jLApellido.setText("Apellido:");

        jTFApellido.setBackground(new java.awt.Color(255, 255, 255));
        jTFApellido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLNombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLNombre.setForeground(new java.awt.Color(0, 0, 0));
        jLNombre.setText("Nombre:");

        jTFNombre.setBackground(new java.awt.Color(255, 255, 255));
        jTFNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Fecha de Nacimiento:");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Estado:");

        jBEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jBEliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(0, 0, 0));
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBGuardar.setBackground(new java.awt.Color(255, 255, 255));
        jBGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBGuardar.setForeground(new java.awt.Color(0, 0, 0));
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBSalir.setBackground(new java.awt.Color(255, 255, 255));
        jBSalir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(0, 0, 0));
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jTFDni.setBackground(new java.awt.Color(255, 255, 255));
        jTFDni.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBEstado.setBackground(new java.awt.Color(102, 153, 255));
        jBEstado.setForeground(new java.awt.Color(255, 255, 255));
        jBEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEstadoActionPerformed(evt);
            }
        });

        JButton.setBackground(new java.awt.Color(255, 255, 255));
        JButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JButton.setForeground(new java.awt.Color(0, 0, 0));
        JButton.setText("Buscar");
        JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Id Alumno:");

        jTFidAlumno.setBackground(new java.awt.Color(255, 255, 255));
        jTFidAlumno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jDFecha.setForeground(new java.awt.Color(255, 255, 255));
        jDFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDFechaPropertyChange(evt);
            }
        });

        jBModif.setBackground(new java.awt.Color(255, 255, 255));
        jBModif.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jBModif.setForeground(new java.awt.Color(0, 0, 0));
        jBModif.setText("Modificar");
        jBModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModifActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBModif)
                        .addGap(35, 35, 35)
                        .addComponent(jBEliminar)
                        .addGap(38, 38, 38)
                        .addComponent(jBGuardar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLApellido)
                            .addComponent(jLNombre)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel1))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jDFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTFApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                .addComponent(jTFNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTFDni, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jBEstado, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTFidAlumno)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButton))
                .addGap(29, 38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel7)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTFidAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JButton))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLApellido))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel12))
                    .addComponent(jBEstado, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jDFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEliminar)
                    .addComponent(jBGuardar)
                    .addComponent(jBSalir)
                    .addComponent(jBModif))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBEstadoActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        int elimXiD = Integer.parseInt(jTFidAlumno.getText());
        AlumnoData aD = new AlumnoData();
        aD.eliminarAlumno(elimXiD);
        
    }//GEN-LAST:event_jBEliminarActionPerformed
    
    private void JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonActionPerformed
        boolean encontrado = false;
        try {
            int bpdni = Integer.parseInt(jTFDni.getText());
            AlumnoData aD = new AlumnoData();
            Alumno alumnoDni =  aD.buscarAlumnoporDni(bpdni);
            if (alumnoDni != null) {
                mostrarDatosAlumno(alumnoDni);
                encontrado = true;
            } 
        } catch (NumberFormatException nf) {
            
        }
        try{
            int bpid = Integer.parseInt(jTFidAlumno.getText());
            AlumnoData aD = new AlumnoData();
            Alumno alumnoId =  aD.buscarAlumno(bpid);
             if (alumnoId != null) {
                mostrarDatosAlumno(alumnoId);
                encontrado = true;
            } 
        }catch(NumberFormatException nf){
            jTFDni.setText("");
            jTFidAlumno.setText("");
        }
    }//GEN-LAST:event_JButtonActionPerformed

    private void jDFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDFechaPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jDFechaPropertyChange

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
       AlumnoData alu = new AlumnoData();
       //Desde textField
       int dni = Integer.parseInt(jTFDni.getText());
       String Apellido = jTFApellido.getText();
       String Nombre = jTFNombre.getText();
       LocalDate fechaNac = jDFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
       boolean activo = jBEstado.isSelected();
       
       Alumno alumno = new Alumno(dni, Apellido, Nombre, fechaNac, activo);
       alu.guardarAlumno(alumno);
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModifActionPerformed
       AlumnoData alu = new AlumnoData();
       //buscar alumno
       int bpid = Integer.parseInt(jTFidAlumno.getText());
       Alumno alumno = alu.buscarAlumno(bpid);
       if(alumno != null){
            alumno.setDni(Integer.parseInt(jTFDni.getText()));
            alumno.setApellido(jTFApellido.getText());
            alumno.setNombre(jTFNombre.getText());
            alumno.setFechaNac(jDFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            alu.modificarAlumno(alumno);
       }
    }//GEN-LAST:event_jBModifActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JRadioButton jBEstado;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBModif;
    private javax.swing.JButton jBSalir;
    private com.toedter.calendar.JDateChooser jDFecha;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFDni;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFidAlumno;
    // End of variables declaration//GEN-END:variables
    private void mostrarDatosAlumno(Alumno alumno){
        jTFidAlumno.setText(alumno.getIdAlumno() + "");
        jTFDni.setText(alumno.getDni()+"");
        jTFApellido.setText(alumno.getApellido());
        jTFNombre.setText(alumno.getNombre());
        boolean estado = alumno.isActivo();
        jBEstado.setSelected(estado);
        LocalDate fNac = alumno.getFechaNac();
        jDFecha.setDate(java.sql.Date.valueOf(fNac));
    }
}
