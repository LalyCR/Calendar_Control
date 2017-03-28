
package Horarios;

import Tools.DataBase;
import javax.swing.ImageIcon;

/**
 * Frame secundario del API, pero principal del sistema que se piensa desarrollar
 * @author Nekszer
 * @version 1.3.0
 * @since JConexionDB 1.0
 */
public class Profesores extends javax.swing.JFrame{
    DataBase db = new DataBase();
    ImageIcon ii;
    Ayuda ay = new Ayuda();
    public Profesores() {
        initComponents();
        this.setSize(380,227);
        this.setLocationRelativeTo(null);
        ii=new ImageIcon(this.getClass().getResource("/Imagenes/HORARIO.png"));
        this.setIconImage(ii.getImage());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(2, 27, 90, 16);
        getContentPane().add(user);
        user.setBounds(82, 24, 268, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(2, 79, 80, 16);

        jButton1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(260, 110, 70, 25);

        jButton3.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jButton3.setText("Registrarse");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 170, 120, 25);

        jButton2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(260, 170, 70, 25);
        getContentPane().add(password);
        password.setBounds(82, 76, 268, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formulario.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -20, 370, 270);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        if (user.getText().equals("")||password.getText().equals("")) {
//            JOptionPane.showMessageDialog(null, "Llene todos los espacios");
//        }else{
//
//            String nombre=user.getText();
//            String contra=password.getText();
//
//        }
        ay.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        RegistroP rp=new RegistroP();
//        rp.setVisible(true);
//        this.dispose();
        ay.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Inicio in=new Inicio();
        in.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

    
}


