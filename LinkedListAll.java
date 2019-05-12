	
	import java.io.*;
public class LinkedListAll {


		static class Node{
			int data;
			Node next;
			Node(int data)
			{
				this.data=data;
				next=null;
			}
		}
		Node head;
		public void insert(int data)
		{
			Node p;
			Node node=new Node(data);
			if(head==null)
				head=node;
			else
			{
				p=head;
				while(p.next!=null)
				p=p.next;
				p.next=node;
			}
		}
		public void delete(int data)
		{
			Node p=head;
			if(head.next==null && head.data==data)
				head=null;
			else if (head.next!=null && head.data==data)
			{
			head=p.next;
			p.next=null;
			}
			else if(p.next.next==null && p.next.data==data)
			{
				head.next=null;
			}
			else{
				while(p.next!=null && p.next.data!=data)
					p=p.next;
				p.next=p.next.next;
			}
			
			
		}	
		public void addFirst(int data)
		{
			Node p;
			Node node=new Node(data);
			if(head==null)
				head=node;
			else{
			p=head;
			node.next=p;
			head=node;}
		}
		public void addLast(int data){
			Node node=new Node(data);
			Node p=head;
			if(head==null)
				head=node;
			else{
			while(p.next!=null)
				p=p.next;
			p.next=node;}
		}
		public void addBefore(int before,int data)
		{
			Node node=new Node(data);
			Node p=head;
			while(p.next!=null && p.next.data!=before)
			{
				p=p.next;
			}
			node.next=p.next;
			p.next=node;
		}
		public void addAfter(int after,int data)
		{
			Node node=new Node(data);
			Node p=head;
			while(p.data!=after)
			{
				p=p.next;
			}
			node.next=p.next;
			p.next=node;
		}
		
		public void deleteFirst(){
			Node p=head;
			if(head==null){System.out.println("no element");}
			else{
			head=p.next;
			p.next=null;
			}
		}
		public void deleteLast(){
			Node p=head;
			if(p.next==null)
				head=null;
				else{
			while(p.next.next!=null)
			p=p.next;
		p.next=null;
				}
		}
			
			public void deleteBefore(int data){
			Node p=head;
			if(head.next!=null && head.data==data || head==null || head.data==data)
				System.out.println("not possible operations");
			else if (p.next!=null && p.next.data==data)
			{
				head=p.next;
				p.next=null;
			}
			else{
			while(p.next!=null && p.next.next!=null && p.next.next.data!=data)
			{
				p=p.next;
			}
			p.next=p.next.next;
			}
			}
				
			public void deleteAfter(int data1){
			Node p=head;
			if(head.next==null)
				System.out.println("not possible operations");
			else if(p.next!=null && p.next.data==data1)
				p.next=null;
			else{
				while(p.data!=data1)
				{
					p=p.next;
				}
				if(p.next==null)
				System.out.println("not possible operations");
				else		
				p.next=p.next.next;
			}
			}
			public void print()
			{
				Node p=head;
				try{
				if(head==null)
				System.out.println("no data");
				while(p.next!=null)
				{
					System.out.print(p.data+"-->");
					p=p.next;
				}
				System.out.print(p.data);
				}
				catch(Exception e){}
				}
			
			public void deleteall()
			{
				head=null;
			}
		
		public static void main(String ag[])throws Exception{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int operationCode;
			LinkedListAll ll=new LinkedListAll();
			while(true){
				System.out.println("Enter the operation code 1 for LL insertion");
				System.out.println("Enter the operation code 2 for LL add First");
				System.out.println("Enter the operation code 3 for LL add Last");
				System.out.println("Enter the operation code 4 for LL add before");
				System.out.println("Enter the operation code 5 for LL add afetr");
				System.out.println("Enter the operation code 6 for LL delete first");
				System.out.println("Enter the operation code 7 for LL delete last");
				System.out.println("Enter the operation code 8 for LL delete before");
				System.out.println("Enter the operation code 9 for LL delete after");	
				System.out.println("Enter the operation code 10 for LL print");
				System.out.println("Enter the operation code 11 for LL deleteall");
				System.out.println("Enter the operation code 12 for LL read data from file");
					System.out.println("Enter the operation code 13 for LL delete");
			System.out.println("Enter the operation code other than above for exit");
				
				operationCode=Integer.parseInt(br.readLine());
				switch(operationCode)
				{
					case 1:
					System.out.println("Enter the data");
					int data=Integer.parseInt(br.readLine());
					ll.insert(data);
					break;
					case 2:
					System.out.println("Enter the data");
					int first=Integer.parseInt(br.readLine());
					ll.addFirst(first);
					break;
					case 3:
					System.out.println("Enter the data");
					int last=Integer.parseInt(br.readLine());
					ll.addLast(last);
					break;
					case 4:
					System.out.println("Enter the before element");
					int before=Integer.parseInt(br.readLine());
					System.out.println("Enter the data");
					int data1=Integer.parseInt(br.readLine());
					ll.addBefore(before,data1);
					break;
					case 5:
					System.out.println("Enter the before element");
					int after=Integer.parseInt(br.readLine());
					System.out.println("Enter the data");
					int data2=Integer.parseInt(br.readLine());
					ll.addAfter(after,data2);
					break;
					case 6:
					ll.deleteFirst();
					break;
					case 7:
					ll.deleteLast();
					break;
					case 8:
					System.out.println("Enter the before element");
					int before1=Integer.parseInt(br.readLine());
					ll.deleteBefore(before1);
					break; 
					case 9:
					System.out.println("Enter the after element");
					int after1=Integer.parseInt(br.readLine());
					ll.deleteAfter(after1);
					break;
					case 10:
					ll.print();
					System.out.println();
					break;
					case 11:
					ll.deleteall();
					break;
					case 12:
					try{
						String s;
						BufferedReader br1=new BufferedReader(new FileReader("data.txt"));
						while((s=br1.readLine())!=null)
						ll.insert(Integer.parseInt(s));
					}catch(Exception e){}
					break;
					case 13:
					System.out.println("Enter the element");
					int delete=Integer.parseInt(br.readLine());
					ll.delete(delete);
					break;
					default:
					System.exit(0);
					break;
			
			}
			}
			
		}
	}
