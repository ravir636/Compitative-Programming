import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsequtiveNumberOccurance {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int k=1;
		for(int i=0;i<str.length();i=i+k)
		{
			//k=1;
			for(int j=i+k;j<str.length();j++)
			{	
			if(str.charAt(i)==str.charAt(j))
				{
					k++;
				}
				else
				break;
		    }
			System.out.print(str.charAt(i)+""+k);
			//k=1;
	}
	}
}
