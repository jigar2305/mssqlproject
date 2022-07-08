package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import bean.UserBean;
import util.Dbconnection;

public class UserDao {

public void insertuser(UserBean userBean) {
	
	Connection  con =  Dbconnection.getConnection();
	try {
		PreparedStatement pstmt = con.prepareStatement("INSERT INTO users_1(firstname,lastname,email,password,gender,usertype) VALUES(?,?,?,?,?,?)");
		pstmt.setString(1, userBean.getFirstname());
		pstmt.setString(2, userBean.getLastname());
		pstmt.setString(3, userBean.getEmail());
		pstmt.setString(4, userBean.getPassword());
		pstmt.setString(5, userBean.getGender());
		pstmt.setString(6, "customer");
		
		int record = pstmt.executeUpdate();
		
		System.out.println(record +"inserted");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("smw error at insertuser()");
		e.printStackTrace();
	}

}
}
