//Created by Fayed Raza
public class stringbuild {
//Purpose is to use string builder 
	
	public void returnnewString(String...s) {
		StringBuilder  t = new StringBuilder();
		for(String y : s)
			t.append(y);
	}
	
	public String makeStringBuilder() {
		StringBuilder  t = new StringBuilder("abcdef");
		int x=0;
		return t.substring(x);
		
	}
}
