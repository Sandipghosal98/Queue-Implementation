package Queueimplementation;
public class Queue {
	private Node first = null;
	private Node last = null;
	private int count = 0;
	
	public boolean isEmpty() {
		return first==null;
	}
	public void add(Object e) {
	if(isEmpty()) {
		first = new Node(e, null);
		last = first;
		count++;
		return;
	}
	last.next= new Node(e,null);
	last = last.next;
	count++;
	}
	public Object get() {
		Object a = first.ele;
		first= first.next;
		return a;
	}
	public Object peek() {
		return first.ele;
	}
}
