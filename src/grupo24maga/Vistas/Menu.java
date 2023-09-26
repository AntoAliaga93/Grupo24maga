/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo24maga.Vistas;

import javax.swing.JOptionPane;


public class Menu extends javax.swing.JFrame {
   
    
    public Menu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMAlum = new javax.swing.JMenu();
        jMFAlum = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMFmat = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMInscripciones = new javax.swing.JMenuItem();
        jmManipNot = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmAlumMat = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 600));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );

        jMAlum.setText("Alumno");
        jMAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAlumActionPerformed(evt);
            }
        });

        jMFAlum.setText("Formulario de Alumno");
        jMFAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFAlumActionPerformed(evt);
            }
        });
        jMAlum.add(jMFAlum);

        jMenuBar1.add(jMAlum);

        jMenu2.setText("Materia");

        jMFmat.setText("Formulario de Materia");
        jMFmat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFmatActionPerformed(evt);
            }
        });
        jMenu2.add(jMFmat);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Administración");

        jMInscripciones.setText("Manejo de inscripciones");
        jMInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMInscripcionesActionPerformed(evt);
            }
        });
        jMenu3.add(jMInscripciones);

        jmManipNot.setText("Manipulacion de notas");
        jmManipNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManipNotActionPerformed(evt);
            }
        });
        jMenu3.add(jmManipNot);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultas");

        jmAlumMat.setText("Alumnos por Materia");
        jmAlumMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlumMatActionPerformed(evt);
            }
        });
        jMenu4.add(jmAlumMat);

        jMenuBar1.add(jMenu4);

        jmSalir.setText("Salir");
        jmSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSalirMouseClicked(evt);
            }
        });
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMFmatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFmatActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        GestionMateria gm = new GestionMateria();
        gm.setVisible(true);
        escritorio.add(gm);
        escritorio.moveToFront(gm);
    }//GEN-LAST:event_jMFmatActionPerformed

    private void jMFAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFAlumActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        Alumnos gestionAlum = new Alumnos();
        gestionAlum.setVisible(true);
        escritorio.add(gestionAlum);
        escritorio.moveToFront(gestionAlum);
    }//GEN-LAST:event_jMFAlumActionPerformed

    private void jMAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAlumActionPerformed
       
    }//GEN-LAST:event_jMAlumActionPerformed

    private void jMInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMInscripcionesActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioInscripcion fi = new FormularioInscripcion();
        fi.setVisible(true);
        escritorio.add(fi);
        escritorio.moveToFront(fi);
    }//GEN-LAST:event_jMInscripcionesActionPerformed

    private void jmManipNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManipNotActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        CargadeNotas cn = new CargadeNotas();
        cn.setVisible(true);
        escritorio.add(cn);
        escritorio.moveToFront(cn);
    }//GEN-LAST:event_jmManipNotActionPerformed

    private void jmAlumMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlumMatActionPerformed
       escritorio.removeAll();
       escritorio.repaint();
       AlumnosporMateria aM = new AlumnosporMateria();
       aM.setVisible(true);
       escritorio.add(aM);
       escritorio.moveToFront(aM);
    }//GEN-LAST:event_jmAlumMatActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        //
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jmSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_jmSalirMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMAlum;
    private javax.swing.JMenuItem jMFAlum;
    private javax.swing.JMenuItem jMFmat;
    private javax.swing.JMenuItem jMInscripciones;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmAlumMat;
    private javax.swing.JMenuItem jmManipNot;
    private javax.swing.JMenu jmSalir;
    // End of variables declaration//GEN-END:variables
}
