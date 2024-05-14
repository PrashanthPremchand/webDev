
import java.util.*;
import java.io.*;
public class Main {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        LinkedList a = new LinkedList();
        LinkedList b = new LinkedList();
        for(int i = 0; i < n; i++){
            a.add(input.nextInt());
        }
        for(int i = 0; i < m; i++){
            b.add(input.nextInt());
        }
        LinkedList ans = new LinkedList();
        Solution A = new Solution();
        ans.head = A.addTwoLinkedLists(a.head, b.head);
        ans.printList();

    }
}


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
    void add(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node curr = head;
        while(curr.next != null)
            curr = curr.next;
        curr.next = new_node;
    }
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
}


class Solution
{

    public static Node addTwoLinkedLists(Node head1, Node head2)
    {
        //Write your code here
		LinkedList sl = new LinkedList();	
		int carry = 0;
		Node curr1 = head1;
		Node curr2 = head2;
		curr1 = reverse(curr1);
		curr2 = reverse(curr2);
		while(curr1 != null && curr2 != null)
			{
				sl.add((curr1.data + curr2.data + carry) % 10);
				carry = (curr1.data + curr2.data + carry) / 10;
				curr1 = curr1.next;
				curr2 = curr2.next;
			}
		while(curr1 != null)
			{
				sl.add(curr1.data + carry);
				carry = (carry) / 10;
				curr1   = curr1.next;
			}
		while(curr2 != null)
			{
				sl.add(curr2.data + carry);
				carry = (carry) / 10;
				curr2 = curr2.next;
			}
			if(carry != 0)
			{
			    sl.add(carry);
			}
			Node currs = sl.head;
		currs = reverse(currs);
    return currs;
    }
	public static Node reverse(Node curr)
	{
		Node prev = null;
		Node temp = null;
	while(curr != null)
			{
				temp = curr.next;
				curr.next = prev;
				prev = curr;
				curr = temp;
			}
		curr = prev;	
		return curr;
	}
}