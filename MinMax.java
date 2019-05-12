import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the "+(i+1)+" number");
			a[i]=sc.nextInt();
			
		}
		sc.close();
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
			else if(a[i]<min)
				min=a[i];
		}
		System.out.println("Max number is-->"+max+"/nMin number is-->"+min);
		
	}

}
