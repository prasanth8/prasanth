package Guvi;

import java.util.Scanner;

class Node{
	
		Node left;
		Node right;
	    int key;
	    
	   Node(int key){
		   this.key=key;
		   left=null;
		   right=null;
	   }
}

public class Hunter79HeightOfTree {

	static Node addElement(Node head,int key){
	  Node newNode=new Node(key);
	  if(head==null)
		  head=newNode;
	  else{
		  if(key<head.key)
			  head.left=addElement(head.left,key);
		  else if(key>head.key)
			  head.right=addElement(head.right,key);
			  
	  }
		
		return head;
	}
	
	static int  heightOfTree(Node head){
		
		if(head==null)
		return -1;
		else{
		int right=heightOfTree(head.right);
		int left=heightOfTree(head.left);
		
		if(left>right)
			return left+1;
		
			return right+1;
		}
		}
	
	public static void main(String[] args) {
		
		Node head=null;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of elements :");
		
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the element");
		head=addElement(head,in.nextInt());	
		}
		
		
		System.out.println("The height of the tree = "+heightOfTree(head));
	}
	
}
