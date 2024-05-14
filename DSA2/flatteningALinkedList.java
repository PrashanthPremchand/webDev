import java.util.*;

// Java program for flattening a Linked List
public class Main
{

  /* Linked list Node */
  static class Node
  {

    int data;
    Node right, down;

      Node (int data)
    {
      this.data = data;
      right = null;
      down = null;
    }
  }

  static Node flatten (Node root)
  {
    // your code here
    Node curr = root.right;
    Node prev = root;
    while (curr != null && prev != null)
      {
	prev = rearrange (prev, curr);
	curr = curr.right;

      }
    prev.right = null;
    return prev;
  }
  static Node rearrange (Node l1, Node l2)
  {
    Node temp = new Node (-1);
    Node d = temp;
    while (l1 != null && l2 != null)
      {
	if (l1.data < l2.data)
	  {
	    temp.down = l1;
	    l1 = l1.down;
	    temp = temp.down;
	  }
	else
	  {
	    temp.down = l2;
	    l2 = l2.down;
	    temp = temp.down;
	  }
      }
    if (l1 != null)
      temp.down = l1;
    if (l2 != null)
      temp.down = l2;
    return d.down;


  }
  static void printList (Node head)
  {
    // your code here
    while (head != null)
      {
	System.out.print (head.data + " ");
	head = head.down;
      }
    System.out.println ();
  }

  public static boolean isCorrect (Node claim)
  {
    if (claim.right != null)
      return false;
    Node copy = claim;
    while (copy.down != null)
      {
	if (copy.down.data < copy.data)
	  return false;
	copy = copy.down;
      }
    return true;
  }

  // Driver's code
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
    Node ll = new Node (-1), prev1 = null, head = ll;
    for (int i = 0; i < n; i++)
      {
	int k = sc.nextInt ();
	Node prev2 = null, copy = ll;
	while (k-- != 0)
	  {
	    int val = sc.nextInt ();
	    copy.data = val;
	    copy.down = new Node (-1);
	    prev2 = copy;
	    copy = copy.down;
	  }
	prev2.down = null;
	ll.right = new Node (-1);
	prev1 = ll;
	ll = ll.right;
      }
    sc.close ();
    prev1.right = null;
    Node flattenedNode = flatten (head);
    printList (flattenedNode);
    if (isCorrect (flattenedNode))
      System.out.println ("yes");
    else
      System.out.println ("no");
  }
}
