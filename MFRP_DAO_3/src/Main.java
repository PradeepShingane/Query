import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		
		UserDAO dao=new UserDAO();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		IdeaDAO dao2 =new IdeaDAO();
		System.out.println("Enter the name");
		String name=br.readLine();
		IdeaDAO dao1=new IdeaDAO();
		UserDAO user=new UserDAO();
		List<Idea> idea=new ArrayList<Idea>();
		idea=dao1.get(user.findByName(name));
		for (Iterator iterator = idea.iterator(); iterator.hasNext();) {
			Idea idea2 = (Idea) iterator.next();
			System.out.println(idea2.getId()+" "+idea2.getDescription());
		}
		
		
		
		System.out.println("Enter idea id to change");
		
		int ic=Integer.parseInt(br.readLine());
		System.out.println("Enter your new idea");
		String desc=br.readLine();
		
		System.out.println("Updated successfully");
		System.out.println("After Update");
		dao1.update(ic, desc);
		idea=dao1.get(user.findByName(name));
		for (Iterator iterator = idea.iterator(); iterator.hasNext();) {
			Idea idea2 = (Idea) iterator.next();
			System.out.println(idea2.getId()+" "+idea2.getDescription());
		}
		
		
	}
}
