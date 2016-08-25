package com.apollo.services;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.apollo.connection.DatabaseConnection;
import com.apollo.pojo.Greeting;


public class GreetinService {
	
public Greeting insertData(String greeting)

{
	Greeting greeting2=null;
	Connection connection=new DatabaseConnection().getDatabaseConnection();
	try {
		Statement statement=connection.createStatement();
		statement.executeUpdate("insert into greet(greeting) values('"+greeting+"')");
		ResultSet rs = statement.executeQuery("select id,greeting from greet where greeting='"+greeting+"'");
		while (rs.next()) {
			Long userid = rs.getLong("id");
			String username = rs.getString("greeting");
			greeting2=new Greeting(userid, username);
			
		}
		statement.close();
		connection.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally
	{
		return greeting2;
	}
	
}
public List<Greeting> getGreetingData()
{
	List<Greeting>list=new ArrayList<Greeting>();
	Connection connection=new DatabaseConnection().getDatabaseConnection();
	Statement statement;
	try {
		statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select id,greeting from greet");
		while (rs.next()) {
			Long userid = rs.getLong("id");
			String username = rs.getString("greeting");
			list.add(new Greeting(userid, username));
			
		}
		statement.close();
		connection.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		return list;
		
	}
	
}

}
