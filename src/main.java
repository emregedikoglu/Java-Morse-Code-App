import java.util.HashMap;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class main {

	public static void main(String[] args) {
		
		hashMap h = new hashMap();
		
		HashMap<Integer, String> morseHMap = new HashMap<Integer, String>();
		
		morseHMap = h.morseHashMap();
		
		HashMap<Integer, String> charHMap = new HashMap<Integer, String>();

		charHMap = h.charHashMap();
		
		Scanner in = new Scanner(System.in); 
		
		morse m = new morse();
		
		for(int i=0; ; i++)
		{
			System.out.println("1.Enter a string");
			System.out.println("2.EXIT"); 
			System.out.println("Press 1 or 2:");
			
	        int a = in.nextInt();
	        in.nextLine();
	        
	        if(a == 1)
	        {	
	        	System.out.println("Enter a string: ");
	        	String s = in.nextLine();
	        	String fs = new String("");
	        	fs += s.charAt(0);
	        	
	        	if(fs.equals(".") || fs.equals("-"))
	        	{  
	        		s += " ";
	        		s = m.morseToAscii(s, morseHMap, charHMap);
	        		System.out.println("Ascii: " +s);
	        	}
	        	else if(s.charAt(0) >= 'A' && s.charAt(0) <= 'Z')
	        	{
	        		s = m.asciiToMorse(s, morseHMap, charHMap);
	        		System.out.println("Morse: " +s);
	        	}
	        	else
	        	{
	        		System.out.println("WRONG STRING!");
	        	}
	        }
	        else if(a == 2)
	        {
	        	System.out.println("BYE!");
	        	break;
	        }
	        else
	        {
	        	System.out.println("WRONG!");
	        }
		}
		
	}

}
