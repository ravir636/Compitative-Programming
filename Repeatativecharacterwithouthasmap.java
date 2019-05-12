import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Repeatativecharacterwithouthasmap {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the string");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int charcatercount=256;
		int len=str.length();
		int ch1[]=new int[charcatercount];
		
		for(int i=0;i<len;i++)
		{
			ch1[(int)str.charAt(i)]++;
		}
		
		for(int i=0;i<256;i++)
		{
			if(ch1[i]>=1)
			{
				System.out.println((char)i+"-->"+ch1[i]);
			}
		}
		
		
		
		
	}

}
