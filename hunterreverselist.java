package binarysearchtree;

import java.util.*;
class Node1{
	int key;
	Node1 next;
	Node1(int key){
		this.key=key;
		next=null;
	}
}
public class hunterreverselist {
static Node1 first(Node1 head,int key){
	
	Node1 nn=new Node1(key);

	nn.next=head;
	head=nn;
	return head;
}
	static Node1 addElement(Node1 head,int key){
		
		Node1 nn=new Node1(key);
		if(head==null){
			head=nn;
		}else
		{Node1 temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=nn;
		}
		return head;
	}
	
	static void display(Node1 head){
		
		Node1 temp=head;
		while(temp!=null){
			System.out.print(temp.key+"->");
			temp=temp.next;
		}
		System.out.print("null\n");
	}

	
	static Node1 reverselist(Node1 head1,Node1 head){
Node1 nn=new Node1(head.key);
nn.next=head1;
head1=nn;
		return head1;
	}
	
	
	public static void main(String[] args) {
		Node1 head=null;
		Node1 head1=null;
		System.out.println("Enter the no of elements in the list");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("Enter the value");
			head=addElement(head,in.nextInt());
		}
		
Node1 val=head;
while(val!=null){
	head1=reverselist(head1,val);
	val=val.next;
}
System.out.println("Original List");
display(head);
System.out.println("Reverse List");
display(head1);
	
	}
}
