import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RevrseNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int number=Integer.parseInt(br.readLine());
		
		int sum=0,value;
		while(number!=0) 
		{
		value=number%10;
		sum=(sum*10)+value;
		number=number/10;
		}
			System.out.println("number is "+sum);
	}

}
