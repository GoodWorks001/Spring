package jp_co.good_works.lesson.springmvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import jp_co.good_works.lesson.springmvc.form.LoginForm;
import jp_co.good_works.lesson.springmvc.logic.LoginInfo;

public class UserDao {


public LoginInfo select(String userID,String password) throws SQLException {
	LoginForm loginForm = new LoginForm();
	LoginInfo loginInfo = null;//new LoginInfo();
	String url ="jdbc:mysql://localhost/lesson20xx?autoReconnect=true&useSSL=false";
	String id ="root";
	String pass ="password";
	java.sql.Connection cnct = null;
	java.sql.Statement st = null;
	java.sql.ResultSet rs = null;
	java.sql.PreparedStatement pst = null;

	
	try {
		

		
		Class.forName("com.mysql.jdbc.Driver");
		cnct= DriverManager.getConnection(url,id,pass);
		//st = cnct.createStatement();
		
		String quary = "select * from user where name = ? and pass = ?";
		System.out.println(quary);
		pst = cnct.prepareStatement(quary);
		pst.setString(1,userID);
		pst.setString (2,password);
		rs = pst.executeQuery();
		//rs = st.executeQuery("SELECT * from user where userID="+userID);
		if(rs.next()) {
			loginInfo = new LoginInfo();
			loginInfo.setUserID(userID);
			loginInfo.setUserID(password);

			}else {
	
			}
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
		}finally {
		if(cnct!=null) cnct.close();
		if(rs!=null)rs.close();
		if(pst!=null)pst.close();
		if(st!=null)st.close();
	}
	return loginInfo;
}
}


