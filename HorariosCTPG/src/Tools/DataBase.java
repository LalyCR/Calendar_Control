
package Tools;

import java.security.MessageDigest;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DataBase {
    static Connection con=null;
    PreparedStatement cmd;
    String nm,ap1,ap2,ced,em,mat;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost/horarios","root","");
        } catch (InstantiationException|IllegalAccessException|SQLException|ClassNotFoundException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
        return con;
    }
    
    public void nuevoUsuario(int a,String b,String c,String d,String e,String f,String g,String h){
        try {
            Connection ing=this.conexion();
            cmd=ing.prepareStatement("INSERT INTO profesores(Nombre,Apellido1,Apellido2,Cedula,Email,Materia,Usuario,Contrasena,TU) VALUES (?,?,?,?,?,?,?,?,?)");
            cmd.setString(1, b);
            cmd.setString(2, c);
            cmd.setString(3, d);
            cmd.setInt(4, a);
            cmd.setString(5, e);
            cmd.setString(6, f);
            cmd.setString(7, g);
            cmd.setString(8, c);
            cmd.setString(9, "Normal");
            int er=cmd.executeUpdate();
            if (er!=0) {
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean validarCampos(JComboBox j,JTextField... x){
        int c=0;
        boolean b=true;
        for (JTextField x1:x) {
            if (x1.getText().equals("")) {
                c++;
            }
        }
        if (j.getSelectedItem().toString().equals("")) {
            c++;
        }
        if (c!=0) {
            JOptionPane.showMessageDialog(null, "Llene todos los espacios");
            b=false;
        }
        return b;
    }
    
    public String md5(String clear) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] b = md.digest(clear.getBytes());

        int size = b.length;
        StringBuffer h = new StringBuffer(size);
        for (int i = 0; i < size; i++) {
            int u = b[i] & 255;
            if (u < 16) {
                h.append("0" + Integer.toHexString(u));
            } else {
                h.append(Integer.toHexString(u));
            }
        }
        return h.toString();
    }
    
    public void verLogin(){
        
    }
    
}
