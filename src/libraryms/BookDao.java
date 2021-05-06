/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryms;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

/**
 *
 * @author KELSON
 */
public class BookDao {
    
    public static int save(String callno,String name,String author,String publisher,int quantity,int issued,String added_date){
	int status=0;
	try{
		Connection con=DatabaseConfig.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into books(callno,name,author,publisher,quantity,issued,added_date) values(?,?,?,?,?,?,?)");
		ps.setString(1,callno);
		ps.setString(2,name);
		ps.setString(3,author);
		ps.setString(4,publisher);
		ps.setInt(5,quantity);
                ps.setInt(6,issued);
                ps.setString(7,added_date);

		status=ps.executeUpdate();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
    
}
}