/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author Daniel
 */
public class SignIn extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public SignIn()
    {
        //cambiarBorde();
        this.setTitle("Log in");
        initComponents();
        jComboBox5.setBackground(Color.WHITE);
        jComboBox4.setBackground(Color.WHITE);
        
        jButton2.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        usuarioNombre2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        usuarioNombre3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(400, 700));
        setMinimumSize(new java.awt.Dimension(400, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre de usuario");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 140, 272, 31);

        usuarioNombre2.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        usuarioNombre2.setForeground(new java.awt.Color(51, 51, 51));
        usuarioNombre2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usuarioNombre2.setBorder(null);
        usuarioNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioNombre2ActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioNombre2);
        usuarioNombre2.setBounds(30, 180, 340, 40);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 37)); // NOI18N
        jLabel1.setText("Ready Parking");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 0, 270, 50);

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 610, 130, 40);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 320, 272, 31);

        jPasswordField1.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(30, 360, 340, 40);

        usuarioNombre3.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        usuarioNombre3.setForeground(new java.awt.Color(51, 51, 51));
        usuarioNombre3.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usuarioNombre3.setBorder(null);
        usuarioNombre3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioNombre3ActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioNombre3);
        usuarioNombre3.setBounds(30, 270, 340, 40);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Correo");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 230, 272, 31);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Confirmar contraseña");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 410, 272, 31);

        jPasswordField2.setFont(new java.awt.Font("Century Gothic", 0, 17)); // NOI18N
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(30, 450, 340, 40);

        jComboBox4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Número", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(210, 540, 160, 40);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Apartamento");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 500, 272, 31);

        jComboBox5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zona", "1", "2", "3" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox5);
        jComboBox5.setBounds(30, 540, 160, 40);

        jButton2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/volver.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 10, 40, 30);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Crear Usuario");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 80, 210, 40);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(100, 120, 200, 2);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/degradado header.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 400, 700);

        getAccessibleContext().setAccessibleName("Log in");
        getAccessibleContext().setAccessibleDescription("Iniciar sesión en el sistema");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioNombre2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_usuarioNombre2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Login eng = new Login();
        eng.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void usuarioNombre3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioNombre3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioNombre3ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        Login eng = new Login();
        eng.setVisible(true);
                            
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField usuarioNombre2;
    private javax.swing.JTextField usuarioNombre3;
    // End of variables declaration//GEN-END:variables




}
