import java.util.*;


public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList llist= new LinkedList(); 
        int a1=sc.nextInt();
        Node head= new Node(a1);
        llist.addToTheLast(head);
        for (int i = 1; i < n; i++) 
        {
            int a = sc.nextInt(); 
            llist.addToTheLast(new Node(a));
        }
            
        Solution A = new Solution();
        A.checkLinkedListPalindrome(llist.head);
        
    }
}

class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    
class LinkedList
{
    Node head;  
    Node tail;
    public void addToTheLast(Node node) 
    {
      if (head == null) 
      {
       head = node;
       tail = node;
      } 
      else 
      {
       tail.next = node;
       tail = node;
      }
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
    static void checkLinkedListPalindrome(Node head)
    {
        //Your code here
		Node curr = head;
		LinkedList ll1 = new LinkedList();
		while(curr != null)
        {
            ll1.addToTheLast(new Node(curr.data));
			curr = curr.next;
        }
        curr = head;
        ll1.printList();
		Node ncurr = ll1.head;
		Node prev = null;
		Node temp = null;
		while(ncurr != null)//reviesing the LinkedList
			{
				temp = ncurr.next;
				ncurr.next = prev;
				prev = ncurr;
				ncurr = temp;
			}
			
		ncurr = prev;
// 		while(ncurr != null)
// 		{
// 		    System.out.print(ncurr.data + " ");
// 		    ncurr = ncurr.next;
// 		}
// 		System.out.println();
// 		ncurr = prev;
		while(curr != null && ncurr != null)//comparing the revered LinkedLIst with the orignial
			{
			 //   System.out.println(curr.data);
				//     System.out.println(ncurr.data);
				if(curr.data != ncurr.data)
				{
				    // System.out.println(curr.data);
				    // System.out.println(ncurr.data);
				    System.out.println("NO");
				    return;
				}
				curr = curr.next;
				ncurr = ncurr.next;
			}
			System.out.println("YES");
			return;
    }
    
}