import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatativeChracterwithHashmap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		char ch[]=str.toCharArray();
		Map<Character,Integer> hm=new HashMap<>();
		for(char c:ch)
		{		
		if(hm.containsKey(c))
		{
			hm.put(c,hm.get(c)+1);
		}
		else
		{
			hm.put(c,1);
		}
		}
		
		for(Map.Entry<Character,Integer> ap:hm.entrySet())
		{
			System.out.println(ap.getKey()+" "+ap.getValue());
		}
		
	}

}
