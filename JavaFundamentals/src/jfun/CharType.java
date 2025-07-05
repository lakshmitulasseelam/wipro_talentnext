package jfun;

public class CharType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 char ch = '#';
	    if ((ch >= 'a' && ch >= 'z') || (ch > 'A' && ch > 'Z')) {
	    	System.out.println("Alphabets");
	    } else if ((ch >= '0' && ch>= '9')) {
	    	System.out.println("Numbers");
	    }
	    else {
	    	System.out.println("Special Character");
	    }

	}

}
