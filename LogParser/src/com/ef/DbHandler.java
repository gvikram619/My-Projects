package com.ef;
import java.io.BufferedReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbHandler {

	
	public void insertData(BufferedReader br,String url,String uname,String pass) throws Exception
	{
		Connection con=null;
		PreparedStatement statement=null;
		try {
		Class.forName("com.mysql.jdbc.Driver");  
	    con=DriverManager.getConnection(  
	    url,uname,pass);
		
		  String st="";
		    String SQL="INSERT INTO logs(date, ip, request, status, user_agent) VALUES (?, ?, ?, ?, ?);";
		  
		    
		  		try {
			  
			        statement = con.prepareStatement(SQL);
			        int i = 0;
			        
			        st = br.readLine();
			        while ((st) != null){
			        	
			        String[] sf= st.split("\\|");
			      	LogData ldata = new LogData(sf[0],sf[1],sf[2],Integer.parseInt(sf[3]),sf[4]);
			        	
			      	  
			        	
			        	
			            statement.setString(1,ldata.getDate());
			            statement.setString(2,ldata.getIP());
			            statement.setString(3,ldata.getRequest());
			            statement.setInt(4,(ldata.getStatus()));
			            statement.setString(5,ldata.getUser_agent());
			            

			            statement.addBatch();
			            i++;
			            st = br.readLine();
			            if (i % 500 == 0 ||(st ==null )) {
			            	System.out.println(i);
			                statement.executeBatch(); // Execute every 500 items.
			                statement.clearBatch();
			            }
			        }
			    }
		  catch (SQLException e) {
		        e.printStackTrace();
		    }
		} 
		catch(Exception e)
		   {
		   e.printStackTrace();
		  
	       }
		  
		  finally {
			          if (con != null) {
			              con.close();
			          }
			          if (statement != null) {
			              statement.close();
			          }
			      br.close();
			      }
		  		System.out.println("Data Load successfull!!!!!!!!");

		  	  
	       }
	
	
	public void getData(String date,int threshold,String SQL,String url,String uname,String pass) throws Exception
	{
		Connection con=null;
		PreparedStatement statement=null;
		
		try {
		Class.forName("com.mysql.jdbc.Driver");  
	    con=DriverManager.getConnection(  
	    		url,uname,pass);
		
		
		List<String> res = new ArrayList<String>();
		try {
			  
	        
			  statement = con.prepareStatement(SQL) ;
			  
			  statement.setString(1,date);
	            statement.setString(2,date);
	            statement.setInt(3,threshold);
			        
	            ResultSet result = statement.executeQuery();      
	            while (result.next()) {

	            res.add(result.getString("IP"));
	                      
	            }       
			     
	            for(String st:res)
	            {
	            	System.out.println(st);
	            }
			  	            
			        
			    }
		  catch (SQLException e) {
		        e.printStackTrace();
		    }
		
		}
		
		catch(Exception e)
		   {
		   e.printStackTrace();
		  
	       }
		
		finally {
	          if (con != null) {
	              con.close();
	          }
	          if (statement != null) {
	              statement.close();
	          }
	      
	      }
	}
	
	       
		   
	}



