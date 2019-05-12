import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StackWithLinkedList {
	Node root;
	
	static class Node{
		int data;
		Node next=null;
		Node(int data)
		{
			this.data=data;
		}
	}
	public void push(int data)
	{
		Node node=new Node(data);
		if(root==null)
			root=node;
		else
		{
			Node temp=root;
			root=node;
			node.next=temp;
		}
	}
	
	public int pop()
	{
	if(root == null)
	{
		System.out.println("stack is empty");
		return 0;
	}
	else
	{
	int data=root.data;
	root=root.next;
	return data;
	}
	}
	
	public int peek()
	{
		if(root==null)
		{
			System.out.println("stack is empty");
			return 0;
		}
		else {
	int data=root.data;
	return data;
		}
	}
	
	public boolean isEmpty()
	{
	if(root==null)
		return true;
	else 
		return false;
	}
	public void print()
	{
		Node temp=root;
	while(temp!=null)
	{
		System.out.println(temp.data+"-->");
		temp=temp.next;
	}
	}

	
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		StackWithLinkedList stack=new StackWithLinkedList();
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
			System.out.println(stack.pop());
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