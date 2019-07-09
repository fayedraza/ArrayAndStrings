//created by fayed raza

import static java.lang.Math.*;
public class Question5 {

	//attempt question 5
	public static void checkedit(String realstring, String otherstring) {
		int differences = 0;
		
		realstring=  addChar(realstring,' ',0);
		realstring=  addChar(realstring,' ',(realstring.length()));
		otherstring=  addChar(otherstring,' ',0);
		otherstring= addChar(otherstring,' ',(otherstring.length()));
	   
		if(realstring.length() == otherstring.length()) {
			for(int x=0; x<realstring.length();x++ ) {
				
				if(realstring.charAt(x) != ' ') {
			if((otherstring.contains(realstring.substring(x, (x+1))) &&   (otherstring.charAt(x-1) == realstring.charAt(x-1)) &&  (otherstring.charAt(x+1) == realstring.charAt(x+1))   )){
				
				if((otherstring.charAt(x-1) == realstring.charAt(x-1)) &&  (otherstring.charAt(x+1) == realstring.charAt(x+1)) )
					differences++;
				
			}
			}else {
				
				if((otherstring.charAt(x-1) == realstring.charAt(x-1)) &&  (otherstring.charAt(x+1) == realstring.charAt(x+1)) )
					differences++;
				
			}
			
			}
			
			if(differences == 0 )
				System.out.println("There are no differences");
			else if (differences == 1 )
				System.out.println("There is only one difference");	
			else
				System.out.println("There are more than one differences" );
			
		}else if( (abs(realstring.length() - otherstring.length()))> 1){
			System.out.println("There are more than one differences" );
		}else if (realstring.length() > otherstring.length()) {
			
		}else if (realstring.length() < otherstring.length()) {
			
		}
	}
	
	
	
	
	public static void main (String [] args) {
		
		
		checkedit("pale", "bale");
		
		
	}
	
	
	public static String addChar(String str, char ch, int position) {
	    int len = str.length();
	    char[] updatedArr = new char[len + 1];
	    str.getChars(0, position, updatedArr, 0);
	    updatedArr[position] = ch;
	    str.getChars(position, len, updatedArr, position + 1);
	    return new String(updatedArr);
	}

	
	
	
	
}
