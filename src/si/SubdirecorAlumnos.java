/*
 * @(#) SubdirectorAlumnos.java
 * 
 * Copyright (c) Software Solutions
 * Todos los derechos reservados
 */
package si;

import java.util.Vector;

/**
 *@version 1.0 05/12/12
 * 
 * @author Cruz Francisco Hernández Hernández
 */


public class SubdirecorAlumnos extends javax.swing.JFrame {
    
    
    private String nombre;
    
    private String materno;
    
    private String paterno;
    
    private String gafete;
    
    private String grupo;
    
    private int edad;
    
    private String calle;
    
    private int num;
    
    private String colonia;
    
    private int telefono;
    
    private String matricula;
    
    private int semestre;
    
    private String turno;
    
    private String materias;
    
    private int numBeca;
    
    private String origenBeca;
    
    private int año;
    
    private int mes;
    
    private int dia;

    /**
     * Creates new form SubdirecorAlumnos
     */
    public SubdirecorAlumnos() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1Consulta = new javax.swing.JTextArea();
        jButton1Consultar = new javax.swing.JButton();
        jButton2Limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Datos de todos los alumnos:");

        jTextArea1Consulta.setColumns(20);
        jTextArea1Consulta.setRows(5);
        jScrollPane1.setViewportView(jTextArea1Consulta);

        jButton1Consultar.setText("Consultar");
        jButton1Consultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1ConsultarMouseClicked(evt);
            }
        });
        jButton1Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ConsultarActionPerformed(evt);
            }
        });

        jButton2Limpiar.setText("Limpiar");
        jButton2Limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2LimpiarMouseClicked(evt);
            }
        });
        jButton2Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1Consultar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2Limpiar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1Consultar)
                    .addComponent(jButton2Limpiar))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ConsultarActionPerformed

    private void jButton2LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2LimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2LimpiarActionPerformed

    private void jButton1ConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1ConsultarMouseClicked
        // TODO add your handling code here:
        
        
        ConsultaAlumno consultaAlumnoNum = new ConsultaAlumno();
        Vector<Alumnos> historialAlumC = consultaAlumnoNum.getHistorialAlumn();
        
        for (Alumnos e : historialAlumC){
            jTextArea1Consulta.append("Alumno: " + e + "\n");
            
        }
    }//GEN-LAST:event_jButton1ConsultarMouseClicked

    private void jButton2LimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2LimpiarMouseClicked
        // TODO add your handling code here:
        
        
        jTextArea1Consulta.setText("");
    }//GEN-LAST:event_jButton2LimpiarMouseClicked

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
            java.util.logging.Logger.getLogger(SubdirecorAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubdirecorAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubdirecorAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubdirecorAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubdirecorAlumnos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Consultar;
    private javax.swing.JButton jButton2Limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1Consulta;
    // End of variables declaration//GEN-END:variables
}
