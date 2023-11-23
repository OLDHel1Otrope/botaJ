import java.util.ArrayList;
import java.util.Collections;

public class ArraylistImplementation {
	
	class Node {
		String value;
		Node next;
		
		Node(String value){
			this.value=value;
			this.next=null;
		}
	}
	Node head;
	
	public void addFirst(String data) {
		Node newNode=new Node(data);
		if(head==null) {
			head = newNode;
			return;
	 	}
	 
	 	newNode.next=head;
	 	head=newNode;
	 
	}
	
	public void addLast(String data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		
		Node currNode=head;
		while(currNode.next!=null) {
			currNode=currNode.next;
		}
		currNode.next=newNode;
		
		
	}
	
	public void printList() {
		if(head==null) {
			
			System.out.println("List is empty");
		}
		Node currNode=head;
		int i=1;
		while(currNode!=null) {
			System.out.println("node  "+i+" value=  "+currNode.value);
			currNode=currNode.next;
			i++;
		}
	}
	
	
	public void deleteFirst() {
		if(head==null) {
			System.out.println("cannot delete from an empty linkedlist");
		}
		
		else {
			head=head.next;
		}
	}
	
	public void DeleteLast() {
		if(head==null) {
			System.out.println("cannot delete from an empty linked list");
		}
		
		else if(head.next==null) {
			head=null;
			
		}
		else {
			Node currNode=head;
			Node lastNode=head.next;
			
			while(lastNode.next!=null) {
				currNode=lastNode;
				lastNode=lastNode.next;
			}
			
			currNode.next=null;
		}
	}
	
	
	public int size() {
		
		if(head==null) {
			return 0;
		}
		
		
		else {
			Node xurrNode=head;
			int i=0;
			while(xurrNode!=null) {
				xurrNode=xurrNode.next;
				i++;
			}
			return i;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		ArraylistImplementation list = new ArraylistImplementation();
		list.addFirst("a");
		list.addFirst("is");
		
		list.printList();
		
		list.addLast("hexxh");
		list.printList();
		
		list.addFirst("this");
		
		list.printList();
		
	}

	
}
