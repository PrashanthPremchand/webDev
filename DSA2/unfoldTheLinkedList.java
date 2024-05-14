import java.io.*;
import java.util.*;
 
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data ){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = new_node;
    }
}

class Solution {
	static Node reverse(Node even)
	{
		Node temp = null;
		Node prev = null;
		while(even != null)
			{
				temp = even.next;
				even.next = prev;
				prev = even;
				even = temp;
			}
			even = prev;
		return even;
	}
	static void printList(Node curr)
	{
		while(curr != null)
			{
				System.out.print(curr.data + " ");
				curr = curr.next;
			}
	}
    static void unfold(Node head)
    {
     // Your code here
		Node curr = head;
		Node odd = new Node(-1);
		Node even = new Node(-1);
		Node d1 = odd;
		Node d2 = even;
		int count = 1;
		while(curr != null)
			{
				if(count % 2 != 0)
				{
					odd.next = curr;
					curr = curr.next;
					odd = odd.next;
					count++;
				}
				else
				{
					even.next = curr;
					curr = curr.next;
					even = even.next;
					count++;
				}
			}
			
		odd.next = null;
		even.next = null;
		even = reverse(d2.next);
		odd.next = even;
		printList(d1.next);
    }
}
public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1= new LinkedList();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        Solution Ob = new Solution();
        Ob.unfold(l1.head);
    }
}