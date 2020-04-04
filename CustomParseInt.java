import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CustomParseInt {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.out.println("enter the string which you want to convert");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		parseInt(str);
	}
	
	public static void parseInt(String str) {
		
		char [] ch=str.toCharArray();
		int length=ch.length;
		char start='0';
		int zeroasci=(int)start;
		int value,actual;
		int sum=0;
		for(int i=0;i<length;i++)
		{
			value=(int)ch[i];
			actual=value-zeroasci;
			sum=(sum*10)+actual;
			}
		System.out.println("converted number is = "+sum);
		
	}

}
