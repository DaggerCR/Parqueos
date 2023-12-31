/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.border.Border;

/**
 *
 * @author Daniel
 */
public class verCamaras extends javax.swing.JFrame {

    
    public verCamaras()
    {
        //cambiarBorde();
        this.setTitle("Cámaras");
        initComponents();
        
        jButton9.setOpaque(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setBorderPainted(false);
        
        Camaras.setBackground(Color.WHITE);
        
    }
    
    public void fondo(Icon fondo)
    {
        this.fondo.setIcon(fondo);
    }
        
    
    public void usuario(String usuario)
    {
        this.Usuario.setText(usuario);
        this.Usuario.setVisible(false);
        System.out.print(this.Usuario.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        foto4 = new javax.swing.JButton();
        foto1 = new javax.swing.JButton();
        foto3 = new javax.swing.JButton();
        foto2 = new javax.swing.JButton();
        Usuario = new javax.swing.JLabel();
        Camaras = new javax.swing.JComboBox<>();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(410, 700));
        setMinimumSize(new java.awt.Dimension(410, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ver Cámaras");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 70, 200, 38);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(30, 570, 320, 10);

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("- Sección 2");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel21);
        jLabel21.setBounds(220, 220, 160, 31);

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("- Entrada");
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel22);
        jLabel22.setBounds(210, 390, 160, 31);

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("- Sección 1");
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel23);
        jLabel23.setBounds(30, 220, 160, 31);

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("- Sección 3");
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel24);
        jLabel24.setBounds(20, 390, 160, 31);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(100, 110, 200, 10);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 37)); // NOI18N
        jLabel9.setText("Ready Parking");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(70, 0, 270, 50);

        jButton9.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/volver.png"))); // NOI18N
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(10, 10, 40, 30);

        foto4.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        foto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/camara4.png"))); // NOI18N
        foto4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        foto4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        foto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foto4ActionPerformed(evt);
            }
        });
        getContentPane().add(foto4);
        foto4.setBounds(200, 430, 180, 120);

        foto1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        foto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/camara1.png"))); // NOI18N
        foto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        foto1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        foto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foto1ActionPerformed(evt);
            }
        });
        getContentPane().add(foto1);
        foto1.setBounds(10, 250, 180, 120);

        foto3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        foto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/camara3.png"))); // NOI18N
        foto3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        foto3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        foto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foto3ActionPerformed(evt);
            }
        });
        getContentPane().add(foto3);
        foto3.setBounds(10, 430, 180, 120);

        foto2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        foto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/camara2.png"))); // NOI18N
        foto2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        foto2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        foto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foto2ActionPerformed(evt);
            }
        });
        getContentPane().add(foto2);
        foto2.setBounds(200, 250, 180, 120);

        Usuario.setFont(new java.awt.Font("Century Gothic", 1, 19)); // NOI18N
        Usuario.setForeground(new java.awt.Color(255, 255, 255));
        Usuario.setText("A");
        Usuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Usuario);
        Usuario.setBounds(30, 610, 160, 25);

        Camaras.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Camaras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zona A", "Zona B", "Zona C" }));
        Camaras.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CamarasItemStateChanged(evt);
            }
        });
        getContentPane().add(Camaras);
        Camaras.setBounds(20, 170, 180, 40);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Imagenes/degradado header.png"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 400, 700);

        getAccessibleContext().setAccessibleName("Log in");
        getAccessibleContext().setAccessibleDescription("Iniciar sesión en el sistema");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        this.dispose();
        menuPrincipal eng = new menuPrincipal();
        eng.usuario(this.Usuario.getText());
        eng.fondo(this.fondo.getIcon());
        eng.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void foto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foto4ActionPerformed
        this.dispose();
        verXcamara4 eng = new verXcamara4();
        eng.usuario(this.Usuario.getText());
        eng.setVisible(true);
    }//GEN-LAST:event_foto4ActionPerformed

    private void foto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foto1ActionPerformed
        this.dispose();
        verXcamara1 eng = new verXcamara1();
        eng.usuario(this.Usuario.getText());
        eng.setVisible(true);
    }//GEN-LAST:event_foto1ActionPerformed

    private void foto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foto3ActionPerformed
        this.dispose();
        verXcamara3 eng = new verXcamara3();
        eng.usuario(this.Usuario.getText());
        eng.setVisible(true);
    }//GEN-LAST:event_foto3ActionPerformed

    private void foto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foto2ActionPerformed
        this.dispose();
        verXcamara2 eng = new verXcamara2();
        eng.usuario(this.Usuario.getText());
        eng.setVisible(true);
    }//GEN-LAST:event_foto2ActionPerformed

    private void CamarasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CamarasItemStateChanged
        // TODO add your handling code here:
        Icon camara1 = this.foto1.getIcon();
        Icon camara2 = this.foto2.getIcon();
        Icon camara3 = this.foto3.getIcon();
        Icon camara4 = this.foto4.getIcon();
        
        if(this.Camaras.getSelectedIndex()==0)
        {
            this.foto1.setIcon(camara1);
            this.foto2.setIcon(camara2);
            this.foto3.setIcon(camara3);
            this.foto4.setIcon(camara4);
        }
        else
            if(this.Camaras.getSelectedIndex()==1)
            {
                this.foto1.setIcon(camara2);
                this.foto2.setIcon(camara3);
                this.foto3.setIcon(camara4);
                this.foto4.setIcon(camara1);
            }
            else
            {
                this.foto1.setIcon(camara3);
                this.foto2.setIcon(camara4);
                this.foto3.setIcon(camara1);
                this.foto4.setIcon(camara2);
            }
    }//GEN-LAST:event_CamarasItemStateChanged

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
            java.util.logging.Logger.getLogger(verCamaras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verCamaras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verCamaras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verCamaras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                
                new verCamaras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Camaras;
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton foto1;
    private javax.swing.JButton foto2;
    private javax.swing.JButton foto3;
    private javax.swing.JButton foto4;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables




}
