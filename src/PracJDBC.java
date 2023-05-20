import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PracJDBC {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String host		= "localhost";
		String port 	= "3306";
		String constr	= "jdbc:mysql://" +host+ ":" +port+ "/QADB";
		String usr		= "root";
		String pass		= ":w9ai(@h";
		String qryStr	= "select * from empInf;";
		String insStr	= "update empInf set empJnDt = '4st Sep 2022' where empId = 1;";
		String uptStr	= "insert into empInf values (5,'Roopali','Sales','2nd Sep 2022');";
		Connection con	= DriverManager.getConnection(constr,usr,pass);
		
		//Statement s = con.createStatement();
		PreparedStatement psi = con.prepareStatement(insStr);
		PreparedStatement psu = con.prepareStatement(uptStr);
		Statement qs = con.createStatement();
		
		//psi.executeUpdate();
		//psu.executeUpdate();
		
		ResultSet rs = qs.executeQuery(qryStr);
		System.out.print("Table data :");
		while (rs.next()) {
			System.out.print("\n" + rs.getInt(1));
			int p = 2;
			while(p<5) {
				System.out.print(" " + rs.getString(p));
				p++;
			}
		}
		con.close();
	}
}