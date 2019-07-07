//Created By Fayed Raza

public class Question1 {
      
	//Purpose is to attempt question 1
	
	//attempt
	public static void returnResult(char uniqueCharacters[], String string){
		char List[] = string.toCharArray(); //turn string to char array
		Boolean s = true;
		for(int x=0; x< List.length; x++)
			for(int y=0; y< uniqueCharacters.length; y++)
				if(uniqueCharacters[y] == List[x]) { /*returns a statement if
					                                 there is a unique character
					                                 in a string*/
			       System.out.println("Unique character is founded at " + List[x] 
			    		   +" at index " + x);
			       s=false;
				}
		if(s) { //returns a statement if there are no unique characters
			 System.out.println("There are no unique characters in this string");
		}
		
	}
	

	
	
	
}
