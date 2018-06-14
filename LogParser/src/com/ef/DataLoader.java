package com.ef;

import java.io.*;


public class DataLoader {
	
	
public static void main(String[] args)throws Exception
{
	String path=args[0];
	
	File file = new File(path);
	BufferedReader br = new BufferedReader(new FileReader(file));
	String param="";
	String fpath="";
	
	String uname="";
	String pass="";
	String url="";
	
	
	while((param=br.readLine())!=null)
	{
		String[] plist=param.split("-");
		if(plist[0].equals("filepath"))
		{
			fpath=plist[1];
		}
		else if(plist[0].equals("URL"))
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
	
	
	
	File file1 = new File(fpath);
	System.out.println(fpath);
	BufferedReader br1 = new BufferedReader(new FileReader(file1));
	 

	
	DbHandler db=new DbHandler();
	db.insertData(br1,url,uname,pass);
	
		
}
}
