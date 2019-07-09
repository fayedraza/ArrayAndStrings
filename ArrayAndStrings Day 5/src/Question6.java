//created by fayed raza
public class Question6 {
	//attempt question 6
	public static void StringCompress(String s) {
		char string[] = s.toCharArray();
	
		int amount = 0;
		String result = "";
		for(int x=0;x<string.length;x++) {
			amount++;
			if(( !((x+1) == string.length)) && (string[x] != string[x+1])) {
			
				result += (string[x]);
				result +=x;
				amount=0;
				
			}else {
			amount++;
			}
		}
		System.out.print(result);
	}
	
	
	
	
	public static void main (String[] args) {
		StringCompress("aabb");
	}
}
