import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class UserDAO {

	public User get(int id) throws SQLException, ClassNotFoundException
	{
		Connection con=DBUtil.getConnection();
		PreparedStatement stmt =con.prepareStatement("select * from user where id = ?");
		stmt.setInt(1, id);
		ResultSet rs=stmt.executeQuery();
		rs.next();
		User user=new User(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getDate(7), rs.getString(8));
		return user;
		
	}
	public User findByName(String name) throws ClassNotFoundException, SQLException
	{
		User user=null;
		Connection con=DBUtil.getConnection();
		PreparedStatement st=con.prepareStatement("select * from user where name=?");
		st.setString(1,name);
		ResultSet rs=st.executeQuery();
		while(rs.next())
		{
			user=new User(rs.getInt(1),name,rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getDate(7),rs.getString(8));
		}
		return user;
		
	}

}
