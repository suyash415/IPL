package player;

import java.sql.Connection;
import java.sql.DriverManager;

public class PlayerConnection {

	public static Connection getConnection() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/t20wc?createDatabaseIfNotExist=true";
		String username = "root";
		String password = "rootpass";

		return DriverManager.getConnection(url, username, password);
	}
}
