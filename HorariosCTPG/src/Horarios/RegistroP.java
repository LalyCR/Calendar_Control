
package Horarios;

import Tools.DataBase;
import javafx.scene.Parent;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class RegistroP extends javax.swing.JFrame{
    Parent RegistroP;
    ImageIcon ii;
    DataBase db=new DataBase();
    Materias mt = new Materias();
    public RegistroP() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        ii=new ImageIcon(this.getClass().getResource("/Imagenes/HORARIO.png"));
        this.setIconImage(ii.getImage());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nomb = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ap1 = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        contr = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        ccontr = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        Registrar = new javax.swing.JButton();
        alerta = new javax.swing.JLabel();
        mater = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ced = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        usur = new javax.swing.JTextField();
        ap2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        nomb.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        nomb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel2.setText("Primer Apellido:");

        ap1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        ap1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ap1KeyTyped(evt);
            }
        });

        email.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel3.setText("Correo electrónico:");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel4.setText("Departamento:");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel5.setText("Contraseña:");

        contr.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        contr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contrKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel6.setText("Confirmar contraseña:");

        ccontr.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        ccontr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ccontrKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Registrar.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        Registrar.setText("Continuar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        alerta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        alerta.setForeground(new java.awt.Color(255, 51, 51));
        alerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        mater.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Español", "Matemáticas", "Cíencias", "Estudios Sociales", "Cívica", "Inlgés", "Inglés Conversacional", "Inglés Técnico" }));
        mater.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                materItemStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel7.setText("Segundo Apellido:");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel8.setText("Cédula:");

        ced.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        ced.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel9.setText("Nombre de usuario:");

        usur.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N

        ap2.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        ap2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ap2KeyTyped(evt);
            }
        });

        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ap1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ced)
                            .addComponent(email, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ccontr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                    .addComponent(contr, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(usur, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mater, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alerta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Registrar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ap2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ap1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ap2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ced, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mater, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(usur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccontr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alerta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Registrar)
                            .addComponent(jButton1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombKeyTyped
        char c=evt.getKeyChar();
        if ((c<'a'||c>'z')&&(c<'A'||c>'Z')&&(c<'é'||c>'é')&&(c<'á'||c>'Ñ'))evt.consume();
    }//GEN-LAST:event_nombKeyTyped

    private void ap1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ap1KeyTyped
        char c=evt.getKeyChar();
        if (c>'0'&&c<'9')evt.consume();
    }//GEN-LAST:event_ap1KeyTyped

    private void contrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contrKeyTyped
        char c=evt.getKeyChar();
        if ((c<'a'||c>'z')&&(c<'A'||c>'Z')&&(c<'0'||c>'9'))evt.consume();
    }//GEN-LAST:event_contrKeyTyped

    private void ccontrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ccontrKeyTyped
        char c=evt.getKeyChar();
        if ((c<'a'||c>'z')&&(c<'A'||c>'Z')&&(c<'0'||c>'9'))evt.consume();

    }//GEN-LAST:event_ccontrKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Profesores pr=new Profesores();
        pr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        JTextField[] fields={nomb,ap1,ap2,ced,email,usur,contr,ccontr};
        String cont="";
        if (contr.getText().equals(ccontr.getText())&&db.validarCampos(mater,fields)) {
            try {
                cont=db.md5(contr.getText());
            } catch (Exception ex) {}
            int ced1=Integer.parseInt(ced.getText());
            String nm1=nomb.getText(),
                    ape1=ap1.getText(),
                    ape2=ap2.getText(),
                    eml1=email.getText(),
                    mat=mater.getSelectedItem().toString(),
                    us=usur.getText();
                    db.nuevoUsuario(ced1, nm1, ape1, ape2, eml1, mat, us, cont);
            Profesores pfr= new Profesores();
            pfr.setVisible(true);
            this.dispose();
        }
        
        
    }//GEN-LAST:event_RegistrarActionPerformed

    private void materItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_materItemStateChanged
        int x=mater.getSelectedIndex();
        if (x==1) {
            mt.setVisible(true);
            mt.verDerp(1);
        }
        if (x==2) {
            mt.setVisible(true);
            mt.verDerp(2);
        }
        
    }//GEN-LAST:event_materItemStateChanged

    private void ap2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ap2KeyTyped
        char c=evt.getKeyChar();
        if ((c<'a'||c>'z')&&(c<'A'||c>'Z')&&(c<'é'||c>'é')&&(c<'á'||c>'Ñ'))evt.consume();
    }//GEN-LAST:event_ap2KeyTyped

    private void cedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedKeyTyped
        char c=evt.getKeyChar();
        if (c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_cedKeyTyped
    
    //<editor-fold desc="Variables" defaultstate="collapsed">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrar;
    private javax.swing.JLabel alerta;
    private javax.swing.JTextField ap1;
    private javax.swing.JTextField ap2;
    private javax.swing.JPasswordField ccontr;
    private javax.swing.JTextField ced;
    private javax.swing.JPasswordField contr;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox mater;
    private javax.swing.JTextField nomb;
    private javax.swing.JTextField usur;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
    
}


