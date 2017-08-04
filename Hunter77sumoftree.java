package Guvi;

import java.util.Scanner;

class Node1{
	Node1 left;
	Node1 right;
	int key;
	
	Node1(int key){
		this.key=key;
		left=null;
		right=null;
	}
	
}

public class Hunter77sumoftree {
         static int sum=0;
	
	static Node1 addElement(Node1 head,int key){
		Node1 newnode=new Node1(key);
		
		if(head==null){
			System.out.println("root");
		head=newnode;
		
		}
		else{
			if(head.key<key){
				System.out.println("right");
			head.right=addElement(head.right,key);
		
			}
			if(head.key>key){
				System.out.println("left");
				head.left=addElement(head.left,key);
			
			}
			}
		
		return head;
	}
	static int sumOfTree(Node1 head){
		if(head==null)
			return 0;
		sumOfTree(head.left);
		sum+=head.key;
		sumOfTree(head.right);
		return sum;
	}
	
	public static void main(String[] args) {
		
		Node1 head=null;
		int check=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=in.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("Enter the element to add in the tree");
			head=addElement(head,in.nextInt());
		}
		
		check+=sumOfTree(head.right);
		sum=0;
		check+=sumOfTree(head.left);
		System.out.println(check+"  "+head.key);
		System.out.println((head.key==check)?"Sum of the right and left equal to root":"Sum of the right and left not equal to root");
		
	}
}
