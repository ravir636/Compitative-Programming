class main
{
	 /*private final*/ void name()
{
	System.out.println("main");
	}
}

class child extends main{
	public  void name() {
		System.out.println("child");
	}

}
public class JavaOverride extends main{	
	public static void main(String[] args) {
 main c1=new child();
c1.name();
	}

}
