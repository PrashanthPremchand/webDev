package DSA3.Stack.queueUsingLinkedLIst;

import java.util.*;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
class Queue {
    //Write your code here
	int count = 0;
	Node head;
    public void push(int value) {
        //Write your code here
		count++;
		Node newNode = new Node(value);
		if(head == null)head = newNode;
		else {
			Node curr = head;
			while(curr.next != null)curr = curr.next;
			curr.next = newNode;
		}
    }
    public int pop() {
        //Write your code here
		if(head == null)return -1;
		else{
			count--;
			Node temp = head.next;
			int pop = head.data;
			head.next = null;
			head = temp;
			return pop;
		}
    }
    public int front() {
        //Write your code here
		if(head == null)return -1;
		else return head.data;
    }
    public int getSize() {
        //Write your code here
		return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int op = sc.nextInt();
            if(op == 1) {
                int x = sc.nextInt();
                q.push(x);
            }
            else if(op == 2) {
                System.out.println(q.pop());
            }
            else if(op == 3)
                System.out.println(q.front());
            else if(op == 4)
                System.out.println(q.getSize());
        }
    }
}
