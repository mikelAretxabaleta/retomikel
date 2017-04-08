/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto;


import java.math.BigDecimal;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleTypes;
/**
 *
 * @author AliensOfMars
 */
public class Logistica {

public static GestionParte ap = new GestionParte();
public static DefaultTableModel model = (DefaultTableModel) ap.getjTable1().getModel();

/**
 * @param args the command line arguments
 */
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	//for(int i=0;i<Reto.model.getRowCount();i++){
	//Reto.model.removeRow(i);}
	
	verViajes();
	
	
}
public static void actualizar(){
                 model.setRowCount(0);
                    
	     //if(model.getRowCount()>0)
		//for (int i=0;i<model.getRowCount();i+=1){
		//model.removeRow(i);}
	            

}



public static void verViajes() throws ClassNotFoundException, SQLException{	
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "reto", "dragon13");
	
	String sql="{call seleccionarViajes (?)}";
        
	CallableStatement llamada = conexion.prepareCall(sql);
	
	llamada.registerOutParameter("c", OracleTypes.CURSOR);
	
	llamada.executeUpdate();
	
	ResultSet rs = (ResultSet) llamada.getObject("c");
	
	ap.setVisible(true);
	
	while (rs.next()) {
	BigDecimal resultado1 = rs.getBigDecimal(1);
	String resultado2 = (rs.getString(2));
	String resultado3 = rs.getString(3);
	BigDecimal resultado4  = rs.getBigDecimal(4);
	Date resultado5  = rs.getDate(5);
	
	
        
	model.addRow(new Object[]{resultado1, resultado2, resultado3, resultado4, resultado5 });
	
	
	}
	
	rs.close();
	llamada.close();
	conexion.close();
}

	


}
