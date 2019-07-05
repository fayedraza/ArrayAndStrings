
//created by Fayed Raza
import java.util.ArrayList;
//purpose is to show the bigO runtimes of arraylists 
//arrays lists is a data structure
public class ArrayListTest {
/*inserting n elements takes O(n) times
 * average is O(1)
 * while worst is O(N)
 */

	public String ADD(String...x) {
		ArrayList<String> sentence =  new ArrayList<String> ();
		for(String s : x)
			sentence.add(s);
		
		return "completed";
		
		
	}
}
