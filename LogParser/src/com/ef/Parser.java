package com.ef;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class Parser {
	
	
	
	public static void main(String[] args) throws Exception
	{    
		String path=args[0];
		
		File file = new File(path);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String param="";
		String uname="";
		String pass="";
		String url="";
		
		while((param=br.readLine())!=null)
		{
			String[] plist=param.split("-");
			if(plist[0].equals("URL"))
			{
				url=plist[1];
			}
			else  if(plist[0].equals("username"))
			{
				uname=plist[1];
			}
			else if(plist[0].equals("Password"))
			{
				pass=plist[1];
			}
		}
		
		br.close();
		

		String date=args[1];
		String duration=args[2];
		String SQL = "";
		int threshold=Integer.parseInt(args[3]);
		
		if(duration.equals("hourly"))
		{
			SQL="select IP from logparser.logs \r\n" + 
			  		"where date between ? and DATE_ADD( ?, INTERVAL + 1 HOUR)\r\n" + 
			  		"group by 1\r\n" + 
			  		"having count(*) > ?\r\n" + 
			  		"order by 1";
		}
		else if(duration.equals("daily"))
		{
			SQL="select IP from logparser.logs \r\n" + 
			  		"where date between ? and DATE_ADD( ?, INTERVAL + 1 DAY)\r\n" + 
			  		"group by 1\r\n" + 
			  		"having count(*) > ?\r\n" + 
			  		"order by 1";
		}
		
		
		DbHandler db=new DbHandler();
		
		db.getData(date,threshold,SQL,url,uname,pass);
	    
	    
	}

}
