import java.util.Arrays;

//Created By Fayed Raza
public class Question2 {

	//Purpose is to attempt question 2
	
		//attempt
	
	public static void checkPermuation(String string1, String string2) {
		char array1[]= string1.toCharArray(); //turns strings to arrays
		char array2[]=string2.toCharArray();
		
	Arrays.sort(array1); //sort both arrays
	     Arrays.sort(array2);
	     
	    /* for(char c: array2)
	    	 System.out.println(c); check if array is sorted */
	     
	     
	           if (Arrays.equals(array1, array2)) { //check if it is permutations
	        	   System.out.println("Both strings are permuations");
	           }else {
	        	   System.out.println("Both strings are not permuations");
	           }
	           
		
	}
	
	
	public static void main (String [] args) {
		checkPermuation("hi", "ih"); //test it out
	}
	
	
}
