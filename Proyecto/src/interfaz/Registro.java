/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;
import Fuentes.Moonglade;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Pc
 */

public class Registro extends javax.swing.JFrame {

    public static FileWriter flwriter = null; 
   public static String name;
   public static String age;
   public static String license;
   public static String username;
   public static char[] password; 
   public static String ncadena="";
   public static long pos = 0, linex=0;
   public static boolean alreadyRegister = false;

    /** Creates new form Registro */
   Moonglade tipoFuente;
    public Registro() {
        initComponents();
        jop1.setVisible(false);
        tipoFuente= new Moonglade();
        jlb1.setFont(tipoFuente.fuente(tipoFuente.MOON, 3, 11));
        jlb2.setFont(tipoFuente.fuente(tipoFuente.MOON,3, 11));
        jlb3.setFont(tipoFuente.fuente(tipoFuente.MOON,3, 11));
        jlb4.setFont(tipoFuente.fuente(tipoFuente.MOON,3, 11));
        jlb5.setFont(tipoFuente.fuente(tipoFuente.MOON,3, 11));
            this.setLocationRelativeTo(null);
    }
public void limpiar(){
      jTfName.setText("") ;
      jTfAge.setText("");
      jTfLicense.setText("");
      jTfUsername.setText("");
      jTfPassword.setText("");
      jButton1.setEnabled(false);
    }

    public void asignar(){
      ncadena="";
      ncadena+=jTfName.getText() + ",";
      ncadena+=jTfAge.getText() + ",";
      ncadena+=jTfLicense.getText() + ",";
      ncadena+=jTfUsername.getText() + ",";
      ncadena+=String.valueOf(jTfPassword.getPassword());
      username=jTfUsername.getText();
            
    }
    
    public void registroArchivo(){
       String xname ="", xlicense="", xage="", xusername="",xpassword=""; 
        try {  //crea el flujo para escribir en el archivo
          File flwriter = new File("C:\\BD\\EQ05.txt");
          Scanner leer_archivo = null;
          leer_archivo = new Scanner(flwriter);
          while(leer_archivo.hasNextLine()){
             String Linea_archivo = leer_archivo.nextLine();
             Scanner delimitar = new Scanner(Linea_archivo);
             delimitar.useDelimiter("\\s*,\\s*");
             xname = delimitar.next();
             xage = delimitar.next();
             xlicense = delimitar.next();
             xusername = delimitar.next();
             xpassword = delimitar.next();
             
             if(username.equals(xusername)){
                 jop1.showMessageDialog(null, "Este usuario ya existe");
                 jop1.setVisible(true);
                 alreadyRegister = true;
                 break;
             }
          }
       } catch (IOException e) {
            e.printStackTrace();
         } finally {  // consolida el cierre de archivo con transacciones
              if (flwriter != null) {
                 try {//cierra el flujo principal
                    flwriter.close();
                    System.exit( 0 );
                 } catch (IOException e) {
                      e.printStackTrace();
                   }
              }
           }
}    
    public void cambiarArchivo(){
       try {
                flwriter = new FileWriter("C:\\BD\\EQ05.txt",true);
                flwriter.write(ncadena + "\n");
                flwriter.close(); 
            } catch (IOException e) {
                e.printStackTrace();
            } finally {  
          if (flwriter != null) {
              try {
                 flwriter.close();
              } catch (IOException e) { 
                    e.printStackTrace();  
                }
          }
        }
}    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
   
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlb1 = new javax.swing.JLabel();
        jlb2 = new javax.swing.JLabel();
        jlb3 = new javax.swing.JLabel();
        jlb4 = new javax.swing.JLabel();
        jTfLicense = new javax.swing.JTextField();
        jTfName = new javax.swing.JTextField();
        jlb5 = new javax.swing.JLabel();
        jTfAge = new javax.swing.JTextField();
        jTfUsername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTfPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jop1 = new javax.swing.JOptionPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlb1.setForeground(new java.awt.Color(255, 255, 255));
        jlb1.setText("NOMBRE");
        getContentPane().add(jlb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jlb2.setForeground(new java.awt.Color(255, 255, 255));
        jlb2.setText("EDAD");
        getContentPane().add(jlb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jlb3.setForeground(new java.awt.Color(255, 255, 255));
        jlb3.setText("NUMERO DE LICENCIA");
        getContentPane().add(jlb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jlb4.setForeground(new java.awt.Color(255, 255, 255));
        jlb4.setText("USUARIO");
        getContentPane().add(jlb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        getContentPane().add(jTfLicense, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 130, 30));
        getContentPane().add(jTfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 300, 30));

        jlb5.setForeground(new java.awt.Color(255, 255, 255));
        jlb5.setText("CONTRASE??A");
        getContentPane().add(jlb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        getContentPane().add(jTfAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 300, 30));
        getContentPane().add(jTfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 300, 30));

        jButton1.setText("REGISTRARSE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));
        getContentPane().add(jTfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 280, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo_2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 300));
        getContentPane().add(jop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Cliente flujo= new Cliente();
        flujo.setVisible(true);
        asignar();
        registroArchivo();
        if(!alreadyRegister){
        cambiarArchivo();
        }else{
            limpiar();
            alreadyRegister = false;
        }
        limpiar();          

dispose();
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTfAge;
    private javax.swing.JTextField jTfLicense;
    private javax.swing.JTextField jTfName;
    private javax.swing.JPasswordField jTfPassword;
    private javax.swing.JTextField jTfUsername;
    private javax.swing.JLabel jlb1;
    private javax.swing.JLabel jlb2;
    private javax.swing.JLabel jlb3;
    private javax.swing.JLabel jlb4;
    private javax.swing.JLabel jlb5;
    private javax.swing.JOptionPane jop1;
    // End of variables declaration//GEN-END:variables

}
