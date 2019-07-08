//Created By Fayed Raza
public class Question3 {
	//Purpose is to attempt question 3
	
		//attempt
	
	public static void put20(String s) {
	
		if(s.charAt(s.length() - 1) == ' ') {
			
					s=s.trim();  //trim spaces at beginning and end
				
			}
			
		
	
		for(int x = 0;x<s.length(); x++) {
			
			if(s.charAt(x) == ' ' ) 
		s=s.substring(0, x).concat("%20").concat(s.substring((x+1),s.length()));
			
			/* takes substring till spaces 
		 * concats %20
		 * then concats the phrase after the space				
		 */
				
		}	
		
		System.out.println(s);
		
		
	}
	
	public static void main (String [] args) {
		
		put20("Mr John Smith   "); //test it out
		
	}
	
	
	
	
	
	
}
