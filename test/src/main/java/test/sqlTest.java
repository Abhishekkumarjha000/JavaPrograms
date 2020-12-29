package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sqlTest {
	
	// 1. Write JAVA code to connect to MSSQL server. Details are below.
		/*
		 * SQL server: sci-dt-99 DB Name: Interview Table Name : Testing
		 * Credentials: SQL Auth: interview Pwd: Welcome1
		 */
		Connection con = null;
		Statement stmt = null;

		public void connectDB() throws ClassNotFoundException, SQLException {
			
			String DB_Name="jdbc:ci-dt-99//localhost:3307/Interview";
			String username="interview";
			String Password="Welcome1";
			
			
			Class.forName("sci-dt-99");
			Connection con=DriverManager.getConnection(DB_Name,username,Password);
			stmt=con.createStatement();
			
			
			
			
			

		}

		// 2. Write a select query to fetch the EmpDpt of 'BB' and validate the
		// name.

		public void fetchWithEmpDpt() throws SQLException {
			
			String query="Select EmpName from Testing where EmpDpt='BB'";
			ResultSet rs1=stmt.executeQuery(query);
			String EmpDpt=rs1.getString("EmpDpt");
			if(EmpDpt=="BB") {
				System.out.println("Pass");
			}else {
				System.out.println("Fail");
			}
			
			

		}

		// Ans : Select EmpName from Testing where EmpDpt='BB'

		// 3 .Write a select query to fetch EmpDpt = AA and EmpRank = LEVEL and
		// validate it.

		public void fetchWithEmpDptAndEmpRank() throws SQLException {
			
		String query2="Select * from Testing where EmpDpt = 'AA' and EmpRank = 'LEVEL' ";
		ResultSet rs2=stmt.executeQuery(query2);
		String EmpDpt= rs2.getString("EmpDpt");
		String EmpRank=rs2.getString("EmpRank");
		if(EmpDpt=="AA" && EmpRank=="LEVEL") {
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}
		
		
		
		
		}

	}


