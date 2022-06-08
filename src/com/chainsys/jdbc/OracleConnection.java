package com.chainsys.jdbc;

import java.sql.*;
import java.util.Scanner;

public class OracleConnection 
{
	public static void main(String args[])
	{  
		try
		{  
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String userName="system";
			Scanner sc=new Scanner(System.in);
			//System.out.println("Enter the password");
			//String password=sc.next();
			String password="oracle";
			//String query="select * from employees";
		
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
		  
			//step2 create  the connection object      
			Connection con=DriverManager.getConnection(url,userName,password);  
		  
			//step3 create the statement object  
			Statement stmt=con.createStatement();  
		  
			//step4 execute query  
			ResultSet rs=stmt.executeQuery("select * from TABLE1");  
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
		  
			//step5 close the connection object  
			con.close();    
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}  
	}  
}
