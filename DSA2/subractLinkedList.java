import java.util.*;

class Node
{
  int data;
  Node next;

    Node (int d)
  {
    data = d;
    next = null;
  }
}
class LinkedList
{
  Node head;
  void add (int data)
  {
    Node new_node = new Node (data);
    if (head == null)
      {
	head = new_node;
	return;
      }
    Node curr = head;
    while (curr.next != null)
      curr = curr.next;
    curr.next = new_node;
  }
}

class Main
{
  static void printList (Node n)
  {
    while (n != null)
      {
	System.out.print (n.data + " ");
	n = n.next;
      }
    System.out.println ();
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    int val = sc.nextInt ();
    Node first = new Node (val);
    Node tail = first;
    for (int i = 0; i < n - 1; i++)
      {
	val = sc.nextInt ();
	tail.next = new Node (val);
	tail = tail.next;
      }
    int m = sc.nextInt ();
    val = sc.nextInt ();
    Node second = new Node (val);
    tail = second;
    for (int i = 0; i < m - 1; i++)
      {
	val = sc.nextInt ();
	tail.next = new Node (val);
	tail = tail.next;
      }

    Solution g = new Solution ();
    Node res = g.subtract (first, second, n, m);
    printList (res);
  }
}

class Solution
{
  static Node subtract (Node l1, Node l2, int n, int m)
  {
    Node currs = null;
    Node curr1 = l1;
    Node curr2 = l2;
    int a = curr1.data;
    int b = curr2.data;
      curr1 = reverse (curr1);
      curr2 = reverse (curr2);
    if (n == m)
      {
	if (a > b)
	  currs = csubtract (curr1, curr2);
	else
	  currs = csubtract (curr2, curr1);
      }
    if (n > m)
        currs = csubtract (curr1, curr2);
    else
      currs = csubtract (curr2, curr1);
    currs = reverse (currs);
    LinkedList ans = new LinkedList ();
    while (currs != null)
      {
	if (currs.data == 0 && ans.head == null && currs.next != null)
	  {
	    currs = currs.next;
	    continue;
	  }

	ans.add (currs.data);
	currs = currs.next;
      }
    return ans.head;
  }
  public static Node reverse (Node curr)
  {
    Node prev = null;
    Node temp = null;
    while (curr != null)
      {
	temp = curr.next;
	curr.next = prev;
	prev = curr;
	if (curr != null)
	  curr = temp;

      }
    curr = prev;
    return curr;
  }
  public static Node csubtract (Node curr1, Node curr2)
  {
    LinkedList sl = new LinkedList ();
    while (curr1 != null && curr2 != null)
      {
	if (curr1.data < curr2.data)
	  {

	    sl.add ((curr1.data + 10) - curr2.data);
	    curr1 = curr1.next;
	    curr1.data = curr1.data - 1;
	    curr2 = curr2.next;

	  }
	else
	  {
	    sl.add (curr1.data - curr2.data);
	    curr1 = curr1.next;
	    curr2 = curr2.next;
	  }
      }
    while (curr1 != null)
      {
	sl.add (curr1.data);
	curr1 = curr1.next;
      }
    while (curr2 != null)
      {
	sl.add (curr2.data);
	curr2 = curr2.next;
      }
    return sl.head;
  }

}
