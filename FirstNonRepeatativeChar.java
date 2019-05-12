import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatativeChar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("Enter the string");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char ch[] = str.toCharArray();
		System.out.println(firstNonRepeatativeChar(ch));
	}

	//with linkedhash map
	/*
	 * public static Character firstNonRepeatativeChar(char[] ch) {
	 * 
	 * Map<Character,Integer> hm=new LinkedHashMap<>(); for(char c:ch) {
	 * if(hm.containsKey(c)) { hm.put(c,hm.get(c)+1); } else { hm.put(c,1); } }
	 * for(Map.Entry<Character,Integer> ap:hm.entrySet()) { if(ap.getValue()==1)
	 * return ap.getKey(); } return null; }
	 */
//without linked hashmap
	public static Character firstNonRepeatativeChar(char[] ch) {

		Map<Character, Integer> hm = new HashMap<>();
		for (char c : ch) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		for (char c:ch) {
			if (hm.get(c) == 1)
				return c;
		}
		return null;
	}

}
