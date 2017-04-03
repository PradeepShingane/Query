import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class IdeaDAO {
public List<Idea> get(User user) throws ClassNotFoundException, SQLException
{
	List<Idea> idea =new ArrayList<Idea>();
	Connection con=DBUtil.getConnection();
	PreparedStatement stmt =con.prepareStatement("select * from idea where postedBy=?");
	stmt.setInt(1,user.getId());
	ResultSet rs=stmt.executeQuery();
	while(rs.next())
	{
		idea.add(new Idea(rs.getInt("id"),rs.getString("description"),rs.getDate("postedDate"),user,rs.getString("status")));
	}
	return idea;

}

public void update(int id,String desc) throws ClassNotFoundException, SQLException
{
	
	List<Idea> l=new ArrayList<Idea>();
	Connection con=DBUtil.getConnection();
	 PreparedStatement ps =con.prepareStatement("update idea set description=? where id=?");
	 ps.setString(1,desc);
	 ps.setInt(2,id);
	ps.executeUpdate();
}
}
