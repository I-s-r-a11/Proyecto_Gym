/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProyectoUVG;

import javax.swing.JFrame;

/**
 *
 * @author evely
 */
public class usuario extends javax.swing.JFrame {

    /**
     * Creates new form usuario
     */
    public usuario() {
        initComponents();
        setResizable(false); // Desactiva el redimensionamiento
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registro = new javax.swing.JPanel();
        RegistroG1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Registro1 = new javax.swing.JPanel();
        RegistroG2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Registro.setBackground(new java.awt.Color(0, 102, 102));
        Registro.setLayout(null);

        RegistroG1.setBackground(new java.awt.Color(51, 255, 51));
        RegistroG1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RegistroG1.setText("Aceptar");
        RegistroG1.setMaximumSize(new java.awt.Dimension(103, 33));
        RegistroG1.setPreferredSize(new java.awt.Dimension(103, 33));
        RegistroG1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistroG1MouseClicked(evt);
            }
        });
        RegistroG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroG1ActionPerformed(evt);
            }
        });
        Registro.add(RegistroG1);
        RegistroG1.setBounds(150, 430, 244, 42);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("FITNESS&HOUSE");
        Registro.add(jLabel1);
        jLabel1.setBounds(160, 20, 210, 40);

        Registro1.setBackground(new java.awt.Color(0, 102, 102));
        Registro1.setLayout(null);

        RegistroG2.setBackground(new java.awt.Color(51, 255, 51));
        RegistroG2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RegistroG2.setText("Aceptar");
        RegistroG2.setMaximumSize(new java.awt.Dimension(103, 33));
        RegistroG2.setPreferredSize(new java.awt.Dimension(103, 33));
        RegistroG2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistroG2MouseClicked(evt);
            }
        });
        RegistroG2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroG2ActionPerformed(evt);
            }
        });
        Registro1.add(RegistroG2);
        RegistroG2.setBounds(530, 590, 244, 42);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("FITNESS&HOUSE");
        Registro1.add(jLabel3);
        jLabel3.setBounds(640, 20, 240, 110);

        jLabel4.setText("jLabel2");
        Registro1.add(jLabel4);
        jLabel4.setBounds(360, 350, 37, 16);

        Registro.add(Registro1);
        Registro1.setBounds(0, 0, 0, 0);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Contraseña");
        Registro.add(jLabel5);
        jLabel5.setBounds(100, 280, 180, 16);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Usuario");
        Registro.add(jLabel6);
        jLabel6.setBounds(100, 170, 130, 25);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Olvido su contraseña");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Registro.add(jButton1);
        jButton1.setBounds(180, 380, 170, 23);
        Registro.add(jTextField1);
        jTextField1.setBounds(150, 200, 230, 30);
        Registro.add(jPasswordField1);
        jPasswordField1.setBounds(150, 310, 230, 30);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Registro.add(jButton2);
        jButton2.setBounds(1250, 20, 90, 32);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ProyectoUVG/gym4.jpg"))); // NOI18N
        Registro.add(jLabel2);
        jLabel2.setBounds(0, -50, 200, 210);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Atras");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Registro.add(jButton3);
        jButton3.setBounds(400, 10, 90, 32);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Registro, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Registro, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistroG1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroG1MouseClicked

    }//GEN-LAST:event_RegistroG1MouseClicked

    private void RegistroG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroG1ActionPerformed
        
        // TODO add your handling code here:
        
        Vista5 vis2 = new Vista5 ();
        vis2.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_RegistroG1ActionPerformed

    private void RegistroG2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroG2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistroG2MouseClicked

    private void RegistroG2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroG2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegistroG2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      Ingreso atras = new Ingreso();
      atras.setVisible(true);
      
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
     Ingreso atras = new Ingreso();
     atras.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     Vista12 premium = new Vista12();
     premium.setVisible(true);
     this.dispose();
    
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
     
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
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Registro;
    private javax.swing.JPanel Registro1;
    private javax.swing.JButton RegistroG1;
    private javax.swing.JButton RegistroG2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
