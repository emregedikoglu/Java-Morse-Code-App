import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class morse {

	public String asciiToMorse(String str, HashMap<Integer, String> morseHMap, HashMap<Integer, String> charHMap) {
		String retStr = new String("");

		for (int i = 0; i < str.length(); i++) {
			int j = 0;
			String chh = new String("");
			chh += str.charAt(i);

			while (j < 26) {

				String c = new String();
				c = charHMap.get(j);

				if (c.equals(chh)) {
					String ch = morseHMap.get(j);

					retStr += ch;
					retStr += " ";
				}
				j++;
			}

		}

		return retStr;
	}

	public String morseToAscii(String str, HashMap<Integer, String> morseHMap, HashMap<Integer, String> charHMap) {
		String retStr = new String("");

		for (int i = 0; i < str.length(); i++) {
			int j = 0;
			String chh = new String("");

			for (int k = 0; ; k++) {
				String chhh = new String("");
				chhh += str.charAt(i);
				
				if (chhh.equals(" ")) {
					break;
				}
				else {
					chh += chhh;
					i++;
				}
			}
			while (j < 26) {

				String c = new String();
				c = morseHMap.get(j);

				if (c.equals(chh)) {
					String ch = charHMap.get(j);

					retStr += ch;
				}
				j++;
			}

		}

		return retStr;
	}

}
