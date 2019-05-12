import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackWithArray {

	int []stack=new int[5];//stack size
	int top=-1;
	public void push(int ele)
	{
		if(top==stack.length-1)
			System.out.println("stack is already full");
		else
			stack[++top]=ele;
	}
	public int pop()
	{
		if(top==-1) {
			System.out.println("Stack is already empty");
		return 0;
		}else
			return stack[top--];
			//top--;
			//return temp;
	}
	public int peek()
	{
		if(top==-1) {
			System.out.println("Stack is already empty");
		return 0;
		}else
			return stack[top];
	}
	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	public void print()
	{
		for(int i=top;i>=0;i--)
			System.out.println(stack[i]+"-->");
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		
		StackWithArray stack=new StackWithArray();
		while(true)
		{
			System.out.println("push 1, pop 2, peek 3, empty 4, print 5, other than this for exit");
		System.out.println("Enter the operation code");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		switch(Integer.parseInt(br.readLine()))
		{
		case 1:
		System.out.println("Enter the element");
		stack.push(Integer.parseInt(br.readLine()));
		break;
		case 2:
			stack.pop();
			break;
		case 3:
			System.out.println(stack.peek());
			break;
		case 4:
			System.out.println(stack.isEmpty());
			break;
		case 5:
			stack.print();
			break;
		default:
			System.exit(0);
			break;
		}
		}
		
	}

}
