package com.chainsys.jdbc;
import java.sql.*;
public class ex
{
	public static void main(String args[]){  
		try{  
		//Class.forName("oracle.jdbc.driver.OracleDriver");  
		  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
		  
		PreparedStatement stmt=con.prepareStatement("insert into Employee values(?,?)");  
		stmt.setInt(1,101);//1 specifies the first parameter in the query  
		stmt.setString(2,"ak");  
		  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted");  
		  
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		  
		}  
}
