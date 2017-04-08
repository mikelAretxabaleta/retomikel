/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto;

import com.toedter.calendar.JDateChooser;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import oracle.jdbc.OracleTypes;


/**
 *
 * @author m
 */
public class InsertarViaje extends javax.swing.JFrame {

/**
 * Creates new form InsertarViaje
 */
public InsertarViaje() {
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

                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jTextField3 = new javax.swing.JTextField();
                jTextField4 = new javax.swing.JTextField();
                jLabel5 = new javax.swing.JLabel();
                jTextField5 = new javax.swing.JTextField();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel2.setText("Hora Inicio:");

                jLabel3.setText("Hora Fin:");

                jButton1.setText("Volver");

                jButton2.setText("Añadir");
                jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jButton2MouseClicked(evt);
                        }
                });

                jLabel5.setText("ID Trabajador:");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(187, 187, 187)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton1)
                                                        .addComponent(jButton2))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel5)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jTextField4)
                                                                        .addComponent(jTextField3))))
                                                .addContainerGap())))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(222, 222, 222)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addContainerGap(80, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
              
	
		
		
		Connection conexion;	
	try {
		conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "reto", "dragon13");
	
	
        String sql2="{call insertarViajes (?,?,?)}";
	CallableStatement llamada = conexion.prepareCall(sql2);

	
	llamada.setString("HORAINICIAL",(getjTextField3().getText()));
	llamada.setString("HORAFINAL",(getjTextField4().getText()));
	
	
	llamada.setInt("TRABAJADORES_ID",Integer.parseInt(getjTextField5().getText()));
	
	
	llamada.executeUpdate();
	
	llamada.close();
	conexion.close();
	
	
	
	Logistica.actualizar();
	Logistica.verViajes();
	
	
	} catch (SQLException ex) {
		 
		Logger.getLogger(InsertarViaje.class.getName()).log(Level.SEVERE, null, ex);
	} catch (ClassNotFoundException ex) {
		Logger.getLogger(InsertarViaje.class.getName()).log(Level.SEVERE, null, ex);
	} 
        }//GEN-LAST:event_jButton2MouseClicked

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
		java.util.logging.Logger.getLogger(InsertarViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
		java.util.logging.Logger.getLogger(InsertarViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
		java.util.logging.Logger.getLogger(InsertarViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
		java.util.logging.Logger.getLogger(InsertarViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	public void run() {
		new InsertarViaje().setVisible(true);
		
		
		
		
		
	}
	});
}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JTextField jTextField3;
        private javax.swing.JTextField jTextField4;
        private javax.swing.JTextField jTextField5;
        // End of variables declaration//GEN-END:variables

	public JTextField getjTextField4() {
		return jTextField4;
	}

	

	public JTextField getjTextField3() {
		return jTextField3;
	}

	

	public JTextField getjTextField5() {
		return jTextField5;
	}

	

	
	

	

	





}
