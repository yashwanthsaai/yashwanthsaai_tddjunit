package learn_epam.tddjunithometask;

public class DelAinFirst2Chars {

	public String removeA(String string) {
		char removeletter = 'A';
		int stringlength = string.length();
		
		if(stringlength == 0) 
		{
			return "";
		}
		
		else if(stringlength == 1) {
			char letter1 = string.charAt(0);
			if(letter1 != removeletter) {
				return string;
			}
			return "";
			
		}
		
		char firstchar = string.charAt(0);
		char secondchar = string.charAt(1);
		String remainstring = string.substring(2);
		String afterremoveA = "";
		
		if(firstchar != removeletter) {
			afterremoveA = afterremoveA + firstchar;
			if(secondchar != removeletter) {
				afterremoveA = afterremoveA + secondchar;		
			}
		}
		else {
			if(secondchar != removeletter) {
				afterremoveA = afterremoveA + secondchar;		
			}
		}
		
		return ""+ afterremoveA + remainstring;
	}

}
