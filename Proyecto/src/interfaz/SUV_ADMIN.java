/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Fuentes.Moonglade;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.Map;

/**
 *
 * @author Pc
 */
public class SUV_ADMIN extends javax.swing.JFrame {
public static int mes=12;
    /**
     * Creates new form SUC_ADMIN
     */
    Moonglade tipoFuente;
    public SUV_ADMIN() {
        initComponents();
        jop.setVisible(false);
        tipoFuente= new Moonglade();
        jlb1.setFont(tipoFuente.fuente(tipoFuente.MOON, 3, 25));
        jlb2.setFont(tipoFuente.fuente(tipoFuente.MOON,3, 11));
        jlb3.setFont(tipoFuente.fuente(tipoFuente.MOON,3, 11));
        jlbman.setFont(tipoFuente.fuente(tipoFuente.MOON,3, 11));
        jlbman1.setFont(tipoFuente.fuente(tipoFuente.MOON,3, 11));
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlb1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlbman1 = new javax.swing.JLabel();
        jlbman = new javax.swing.JLabel();
        jbtatras = new javax.swing.JButton();
        jlb2 = new javax.swing.JLabel();
        jlb3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jop = new javax.swing.JOptionPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlb1.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jlb1.setForeground(new java.awt.Color(255, 255, 255));
        jlb1.setText("SUV");
        getContentPane().add(jlb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 140, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SUV_2.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 180, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SUV_2.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 220, 70));

        jlbman1.setForeground(new java.awt.Color(255, 255, 255));
        jlbman1.setText("MANTENIMIENTO");
        jlbman1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbman1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbman1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbman1MouseExited(evt);
            }
        });
        getContentPane().add(jlbman1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        jlbman.setForeground(new java.awt.Color(255, 255, 255));
        jlbman.setText("MANTENIMIENTO");
        jlbman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbmanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbmanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbmanMouseExited(evt);
            }
        });
        getContentPane().add(jlbman, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jbtatras.setText("REGRESAR");
        jbtatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtatrasActionPerformed(evt);
            }
        });
        getContentPane().add(jbtatras, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, -1, -1));

        jlb2.setForeground(new java.awt.Color(255, 255, 255));
        jlb2.setText("KIA SPORTAGE");
        getContentPane().add(jlb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jlb3.setForeground(new java.awt.Color(255, 255, 255));
        jlb3.setText("CHEVROLET TRAX");
        getContentPane().add(jlb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jop, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jMenu1.setText("MODELOS");

        jMenuItem1.setText("SEDAN");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("CONTRATOS");

        jMenuItem2.setText("C_SEDAN");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("C_SUV");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
SEDAN_ADMIN flujo = new SEDAN_ADMIN();
        flujo.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jlbman1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbman1MouseClicked
jop.showMessageDialog(null, "LA PR??XIMA FECHA DE MANTENIMIENTO DEL AUTO ES 01/0"+(mes-12+3)+"/2022");
jop.setVisible(true);
    }//GEN-LAST:event_jlbman1MouseClicked

    private void jlbman1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbman1MouseEntered
        Font font=jlbman1.getFont();
        Map attributes=font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
        jlbman1.setFont(font.deriveFont(attributes));
        jlbman1.setForeground(Color.blue);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jlbman1MouseEntered

    private void jlbman1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbman1MouseExited
        jlbman1.setForeground(Color.white);
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        Font font = jlbman1.getFont();
        Map attributes=font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, -1);
        jlbman1.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_jlbman1MouseExited

    private void jlbmanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbmanMouseClicked
jop.showMessageDialog(null, "LA PR??XIMA FECHA DE MANTENIMIENTO DEL AUTO ES 01/0"+(mes-12+3)+"/2022");
jop.setVisible(true);
    }//GEN-LAST:event_jlbmanMouseClicked

    private void jlbmanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbmanMouseEntered
        Font font=jlbman.getFont();
        Map attributes=font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE,TextAttribute.UNDERLINE_ON);
        jlbman.setFont(font.deriveFont(attributes));
        jlbman.setForeground(Color.blue);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jlbmanMouseEntered

    private void jlbmanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbmanMouseExited
        jlbman.setForeground(Color.white);
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        Font font = jlbman.getFont();
        Map attributes=font.getAttributes();
        attributes.put(TextAttribute.UNDERLINE, -1);
        jlbman.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_jlbmanMouseExited

    private void jbtatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtatrasActionPerformed
Administrador flujo= new Administrador();
        flujo.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtatrasActionPerformed

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
            java.util.logging.Logger.getLogger(SUV_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SUV_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SUV_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SUV_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SUV_ADMIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JButton jbtatras;
    private javax.swing.JLabel jlb1;
    private javax.swing.JLabel jlb2;
    private javax.swing.JLabel jlb3;
    private javax.swing.JLabel jlbman;
    private javax.swing.JLabel jlbman1;
    private javax.swing.JOptionPane jop;
    // End of variables declaration//GEN-END:variables
}
