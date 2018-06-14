package com.ef;



public class LogData {

private String date;
private String IP;
private String request;
private int status;
private String user_agent;

public LogData()
{
	
}

public LogData(String date,String IP,String request,int status,String User_agent )
{
	this.date=date;
	this.IP=IP;
	this.request=request;
	this.status=status;
	this.user_agent=User_agent;
}


public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getIP() {
	return IP;
}
public void setIP(String iP) {
	IP = iP;
}
public String getRequest() {
	return request;
}
public void setRequest(String request) {
	this.request = request;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public String getUser_agent() {
	return user_agent;
}
public void setUser_agent(String user_agent) {
	this.user_agent = user_agent;
}




	
}
