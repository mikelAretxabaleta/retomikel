/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author m
 */
public class GestionUsuarios extends javax.swing.JFrame {

/**
 * Creates new form GestionUsuarios
 */
public GestionUsuarios() {
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

                jScrollPane1 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                jInternalFrame1 = new javax.swing.JInternalFrame();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jTextField1 = new javax.swing.JTextField();
                jTextField2 = new javax.swing.JTextField();
                jTextField3 = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();
                jInternalFrame2 = new javax.swing.JInternalFrame();
                jLabel4 = new javax.swing.JLabel();
                jTextField4 = new javax.swing.JTextField();
                jButton2 = new javax.swing.JButton();
                jInternalFrame3 = new javax.swing.JInternalFrame();
                jLabel5 = new javax.swing.JLabel();
                jTextField5 = new javax.swing.JTextField();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jTextField6 = new javax.swing.JTextField();
                jTextField7 = new javax.swing.JTextField();
                jButton3 = new javax.swing.JButton();

                setTitle("GESTION USUARIOS");

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "Usuario", "Password", "Trabajador ID"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
                        };
                        boolean[] canEdit = new boolean [] {
                                false, true, false
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                jScrollPane1.setViewportView(jTable1);

                jInternalFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
                jInternalFrame1.setTitle("CREAR USUARIO");
                jInternalFrame1.setVisible(true);

                jLabel1.setText("Usuario");

                jLabel2.setText("Password");

                jLabel3.setText("Trabajador ID");

                jButton1.setText("Añadir");
                jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jButton1MouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
                jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
                jInternalFrame1Layout.setHorizontalGroup(
                        jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                                        .addComponent(jTextField2))
                                .addGap(18, 18, 18)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField3)))
                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                );
                jInternalFrame1Layout.setVerticalGroup(
                        jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addContainerGap(36, Short.MAX_VALUE))
                );

                jInternalFrame2.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
                jInternalFrame2.setTitle("BORRAR USUARIO");
                jInternalFrame2.setVisible(true);

                jLabel4.setText("Usuario");

                jButton2.setText("Borrar");
                jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jButton2MouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
                jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
                jInternalFrame2Layout.setHorizontalGroup(
                        jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                                .addComponent(jTextField4))
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jInternalFrame2Layout.setVerticalGroup(
                        jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addContainerGap(30, Short.MAX_VALUE))
                );

                jInternalFrame3.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
                jInternalFrame3.setTitle("ACTUALIZAR USUARIO");
                jInternalFrame3.setVisible(true);

                jLabel5.setText("Trabajador ID");

                jLabel6.setText("Usuario");

                jLabel7.setText("Password");

                jButton3.setText("Actualizar");
                jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jButton3MouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout jInternalFrame3Layout = new javax.swing.GroupLayout(jInternalFrame3.getContentPane());
                jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
                jInternalFrame3Layout.setHorizontalGroup(
                        jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jInternalFrame3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jInternalFrame3Layout.createSequentialGroup()
                                                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jTextField6)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                                                        .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                                                        .addComponent(jTextField7))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                jInternalFrame3Layout.setVerticalGroup(
                        jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jInternalFrame3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addContainerGap(15, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jInternalFrame3)
                                        .addComponent(jInternalFrame2)
                                        .addComponent(jInternalFrame1)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1184, Short.MAX_VALUE))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jInternalFrame3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
                
		    Connection conexion;	
	try {
		conexion = DriverManager.getConnection("jdbc:oracle:thin:@SrvOracle:1521:orcl", "noc03", "noc03");
	
	PreparedStatement ps;
	ps = conexion.prepareStatement("insert into usuarios values (?,?,?)");
        
	ps.setString(1, jTextField1.getText());
	ps.setString(2, jTextField2.getText());
	ps.setInt(3, Integer.parseInt(jTextField2.getText()));
	
	
	
	ps.executeUpdate();
	
	ps.close();
	conexion.close();
	
	
	
	Administracion.actualizarUsuarios();
	Administracion.verUsuarios();
		
		
		
	} catch (ClassNotFoundException ex) {
		Logger.getLogger(GestionTrabajadores.class.getName()).log(Level.SEVERE, null, ex);
	} catch (SQLException ex) {
		Logger.getLogger(GestionTrabajadores.class.getName()).log(Level.SEVERE, null, ex);
	}
		
		
        }//GEN-LAST:event_jButton1MouseClicked

        private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
                    Connection conexion;	
	try {
		conexion = DriverManager.getConnection("jdbc:oracle:thin:@SrvOracle:1521:orcl", "noc03", "noc03");
	
	PreparedStatement ps;
	ps = conexion.prepareStatement("delete from usuarios where usuario= (?) ");
        
	ps.setString(1, (jTextField4.getText()));
	
	
	
	
	ps.executeUpdate();
	
	ps.close();
	conexion.close();
	
	
	
	Administracion.actualizarUsuarios();
	Administracion.verUsuarios();
		
		
		
	} catch (ClassNotFoundException ex) {
		Logger.getLogger(GestionTrabajadores.class.getName()).log(Level.SEVERE, null, ex);
	} catch (SQLException ex) {
		Logger.getLogger(GestionTrabajadores.class.getName()).log(Level.SEVERE, null, ex);
	}
        }//GEN-LAST:event_jButton2MouseClicked

        private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
                
		Connection conexion;	
	try {
		conexion = DriverManager.getConnection("jdbc:oracle:thin:@SrvOracle:1521:orcl", "noc03", "noc03");
	
	PreparedStatement ps;
	ps = conexion.prepareStatement("update usuarios set usuario=(?), password=?"
		+ "where trabajadores_id=(?)");
        
	
	ps.setString(1, jTextField6.getText());
	ps.setString(2, jTextField7.getText());
	ps.setInt(3, Integer.parseInt(jTextField5.getText()));
	
	
	
	ps.executeUpdate();
	
	ps.close();
	conexion.close();
	
	
	
	Administracion.actualizarUsuarios();
	Administracion.verUsuarios();
		
		
		
	} catch (ClassNotFoundException ex) {
		Logger.getLogger(GestionTrabajadores.class.getName()).log(Level.SEVERE, null, ex);
	} catch (SQLException ex) {
		Logger.getLogger(GestionTrabajadores.class.getName()).log(Level.SEVERE, null, ex);
	} 
		
        }//GEN-LAST:event_jButton3MouseClicked

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
		java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
		java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
		java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
		java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	public void run() {
		new GestionUsuarios().setVisible(true);
	}
	});
}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JInternalFrame jInternalFrame1;
        private javax.swing.JInternalFrame jInternalFrame2;
        private javax.swing.JInternalFrame jInternalFrame3;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable jTable1;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JTextField jTextField2;
        private javax.swing.JTextField jTextField3;
        private javax.swing.JTextField jTextField4;
        private javax.swing.JTextField jTextField5;
        private javax.swing.JTextField jTextField6;
        private javax.swing.JTextField jTextField7;
        // End of variables declaration//GEN-END:variables

	public JTable getjTable1() {
		return jTable1;
	}



}