
import java.util.*;

public class NcodersGoldman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> coders=new ArrayList<>();
		coders.add(5);
		coders.add(2);
		coders.add(3);
		coders.add(1);
		coders.add(4);
		int a=getCountOfPossibleTeams(coders);
		
	}
	  static int getCountOfPossibleTeams(List<Integer> coders) {
	        int count=coders.size();
	        int countcoder=0;
	        for(int i=0;i<count;i++)
	        {
	                for(int j=i+1;j<count;j++)
	                {
	                    for(int k=j+1;k<count;k++)
	                    {
	                    if((coders.get(i) < coders.get(j)) && (coders.get(j) < coders.get(k)))
	                        countcoder++;
	                    else if((coders.get(i) > coders.get(j)) && (coders.get(j) > coders.get(k)))
	                        countcoder++;
	                    }
	                }
	        }
	    return countcoder;
	    }
}
