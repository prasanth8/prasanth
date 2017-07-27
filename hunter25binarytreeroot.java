package guvi;

import java.util.*;

import prasanth.mainmethod;


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



public class hunter25binarytreeroot {

static	Node temp;
	static Node insertNode(Node root,int key){
		
		Node newnode=new Node(key);
		if(root==null){
			System.out.println("root");
			root=newnode;
			}
		else{
			if(root.key>key){
			System.out.println("left");
				root.left=insertNode(root.left,key);
			}else if(root.key<key){
				System.out.println("right");
				root.right=insertNode(root.right,key);
		
			}
			}
		
		return root;
	}
	static Node findingRoot(Node root,int key){

	if(root.key==key){
		temp=root;
	}
	else if(root.key<key){
		if(root.right.key==key)
			temp=root;
		else 
			root.right=findingRoot(root.right,key);
		
	}else if(root.key>key){
		if(root.left.key==key)
			temp=root;
		else 
			root.left=findingRoot(root.left,key);
	}

	
		return root;
	}
	
	public static void main(String[] args) {
		Node root=null;
		
		System.out.println("Enter the number of elements");
		Scanner in=new Scanner(System.in);
		int no=in.nextInt();
		
		for(int i=0;i<no;i++){
			System.out.println("Enter the element to insert into the tree");
			int temp=in.nextInt();
			root=insertNode(root,temp);
		}
		System.out.println("Inorder Traversal     ");
		System.out.println("Enter the first value to find root");
		root=findingRoot(root,in.nextInt());
		Node root1=temp;
		System.out.println("Enter the second value to find the root");
		root=findingRoot(root,in.nextInt());
		Node root2=temp;
		System.out.println("First element root was "+root1.key+"   Second element root was "+root2.key);
		while(root1.key<root2.key){
			root=findingRoot(root,root.key);
			root1=temp;
		}
		while(root2.key>root1.key){
			root=findingRoot(root,root.key);
			root2=temp;
		}
		System.out.println(root1.key+"   After traversal"+ root2.key);
	}
}
