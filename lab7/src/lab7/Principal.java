/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jason
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jd_Creacion = new javax.swing.JDialog();
        rb_Usuario = new javax.swing.JRadioButton();
        rb_Artista = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bt_Crear = new javax.swing.JButton();
        pf_Contraseña1 = new javax.swing.JPasswordField();
        jd_Nacimiento = new com.toedter.calendar.JDateChooser();
        tf_Apellido = new javax.swing.JTextField();
        tf_Nombre = new javax.swing.JTextField();
        jl_Usuario1 = new javax.swing.JLabel();
        tf_Usuario1 = new javax.swing.JTextField();
        jd_Usuario = new javax.swing.JDialog();
        jd_Artista = new javax.swing.JDialog();
        jl_Login = new javax.swing.JLabel();
        jl_Contraseña = new javax.swing.JLabel();
        jl_Usuario = new javax.swing.JLabel();
        tf_Usuario = new javax.swing.JTextField();
        pf_Contraseña = new javax.swing.JPasswordField();
        bt_Login = new javax.swing.JButton();
        bt_Crear_U = new javax.swing.JButton();
        bt_Crear_A = new javax.swing.JButton();

        rb_Usuario.setText("Usuario");

        rb_Artista.setText("Artista");

        jLabel1.setText("Nombre ");

        jLabel2.setText("Apellido");

        jLabel3.setText("Contraseña");

        jLabel4.setText("Fecha de Nacimiento");

        bt_Crear.setText("Crear");
        bt_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CrearActionPerformed(evt);
            }
        });

        jl_Usuario1.setText("Usuario");

        javax.swing.GroupLayout jd_CreacionLayout = new javax.swing.GroupLayout(jd_Creacion.getContentPane());
        jd_Creacion.getContentPane().setLayout(jd_CreacionLayout);
        jd_CreacionLayout.setHorizontalGroup(
            jd_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CreacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_CreacionLayout.createSequentialGroup()
                        .addComponent(rb_Usuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_Artista))
                    .addComponent(bt_Crear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jd_CreacionLayout.createSequentialGroup()
                .addGroup(jd_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_CreacionLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(21, 21, 21)
                        .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_CreacionLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(pf_Contraseña1))
                        .addGroup(jd_CreacionLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tf_Apellido))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jd_CreacionLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(jd_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_CreacionLayout.createSequentialGroup()
                        .addComponent(jl_Usuario1)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 152, Short.MAX_VALUE))
        );
        jd_CreacionLayout.setVerticalGroup(
            jd_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CreacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pf_Contraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jd_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_Usuario1)
                    .addComponent(tf_Usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jd_Nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jd_CreacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_Usuario)
                    .addComponent(rb_Artista))
                .addGap(18, 18, 18)
                .addComponent(bt_Crear)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jd_UsuarioLayout = new javax.swing.GroupLayout(jd_Usuario.getContentPane());
        jd_Usuario.getContentPane().setLayout(jd_UsuarioLayout);
        jd_UsuarioLayout.setHorizontalGroup(
            jd_UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_UsuarioLayout.setVerticalGroup(
            jd_UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jd_ArtistaLayout = new javax.swing.GroupLayout(jd_Artista.getContentPane());
        jd_Artista.getContentPane().setLayout(jd_ArtistaLayout);
        jd_ArtistaLayout.setHorizontalGroup(
            jd_ArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_ArtistaLayout.setVerticalGroup(
            jd_ArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_Login.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jl_Login.setText("Log In");

        jl_Contraseña.setText("Contraseña");

        jl_Usuario.setText("Usuario");

        bt_Login.setText("Login");
        bt_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LoginActionPerformed(evt);
            }
        });

        bt_Crear_U.setText("Crear Usuario");

        bt_Crear_A.setText("Crear Artista");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jl_Contraseña)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jl_Login)
                                .addComponent(tf_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jl_Usuario)
                            .addGap(18, 18, 18)
                            .addComponent(pf_Contraseña)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_Login)
                        .addGap(18, 18, 18)
                        .addComponent(bt_Crear_U)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_Crear_A)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jl_Login)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_Contraseña))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pf_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_Usuario))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Login)
                    .addComponent(bt_Crear_U)
                    .addComponent(bt_Crear_A))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_LoginActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < persona.size(); i++) {
            if (tf_Usuario.getText().equals(((Usuario) persona.get(i)).getUsuario()) && pf_Contraseña.getText().equals(((Usuario) persona.get(i)).getContraseña())) {
                jd_Usuario.setModal(true);
                jd_Usuario.pack();
                jd_Usuario.setLocationRelativeTo(this);
                jd_Usuario.setVisible(true);
            } else if (tf_Usuario.getText().equals(((Artista) persona.get(i)).getUsuario()) && pf_Contraseña.getText().equals(((Artista) persona.get(i)).getContraseña())) {
                jd_Artista.setModal(true);
                jd_Artista.pack();
                jd_Artista.setLocationRelativeTo(this);
                jd_Artista.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Usuario incorrecto o no existe");
                break;
            }
        }//Fin del for que recorre la lista de persona
        tf_Usuario.setText("");
        pf_Contraseña.setText("");
    }//GEN-LAST:event_bt_LoginActionPerformed

    private void bt_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CrearActionPerformed
        // TODO add your handling code here:
        if (rb_Usuario.isSelected() == true) {
            u = new Usuario(tf_Usuario1.getText(), tf_Nombre.getText(), tf_Apellido.getText(), pf_Contraseña1.getText(), jd_Nacimiento.getDate());
            adminPersona ap = new adminPersona("./Usuario");
            persona.add(u);
            ap.cargarArchivo();
            ap.setPersona(a);
            ap.escribirArchivo();
        } else if (rb_Artista.isSelected() == true) {
            a = new Artista(tf_Usuario1.getText(), tf_Nombre.getText(), tf_Apellido.getText(), pf_Contraseña1.getText(), jd_Nacimiento.getDate());
            adminPersona ap = new adminPersona("./Artista");
            persona.add(a);
            ap.cargarArchivo();
            ap.setPersona(a);
            ap.escribirArchivo();
        } else if (rb_Artista.isSelected() == false && rb_Usuario.isSelected() == false) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar usuario o artista");
        }
    }//GEN-LAST:event_bt_CrearActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Crear;
    private javax.swing.JButton bt_Crear_A;
    private javax.swing.JButton bt_Crear_U;
    private javax.swing.JButton bt_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JDialog jd_Artista;
    private javax.swing.JDialog jd_Creacion;
    private com.toedter.calendar.JDateChooser jd_Nacimiento;
    private javax.swing.JDialog jd_Usuario;
    private javax.swing.JLabel jl_Contraseña;
    private javax.swing.JLabel jl_Login;
    private javax.swing.JLabel jl_Usuario;
    private javax.swing.JLabel jl_Usuario1;
    private javax.swing.JPasswordField pf_Contraseña;
    private javax.swing.JPasswordField pf_Contraseña1;
    private javax.swing.JRadioButton rb_Artista;
    private javax.swing.JRadioButton rb_Usuario;
    private javax.swing.JTextField tf_Apellido;
    private javax.swing.JTextField tf_Nombre;
    private javax.swing.JTextField tf_Usuario;
    private javax.swing.JTextField tf_Usuario1;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Persona> persona = new ArrayList();
    private Usuario u;
    private Artista a;
}
