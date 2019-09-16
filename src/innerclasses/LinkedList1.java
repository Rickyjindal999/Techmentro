package innerclasses;
class LinkedList{

	private int size;
	private Node1 Start;
	
	
	public boolean isEmpty()
	{
		if (Start == null)
			return (true);
		else 
			return(false);
	}
	public int listSize()
	{
		return (size);
	}
	public void viewList() 
	{
		Node1 t;
		if (isEmpty())
			System.out.println("List is Empty");
		else {
			t= Start;
			for (int i= 1;i<=size;i++)
			{
				System.out.println("  "+t.getData());
				t.getNext();
			}
			}
	}
	
	public void insertAtFirst(int val)
	{
		Node1 n = new Node1(val, Start);
		n.setData(val);
		n.setNext(Start);
		Start = n;
		size++;
		
	}
	
	public void insertAtLast(int val)
	{
		Node1 n,t;  //
		n = new Node1(val, Start);
		n.setData(val);
		t=Start;
		if (t== null)
			Start = n;
		else {
		while (t.getNext() !=null)
			t= t.getNext();
		t.setNext(n);
		}
		size++;
	}
	
	public void insertAtPos(int val,int pos)
	{
		if (pos==1)
			insertAtFirst(val);
		else if (pos == size+1)
			insertAtLast(val);
		else if(pos> 1 && pos <= size)
		{
			Node1 n,t ;
			n = new Node1(val, null);
			t= Start;
			for (int i=1;i<pos-1;i++ )
				t=t.getNext();
			n.setNext(t.getNext());
			t.setNext(n);
			size++;
		}
		else
			System.out.println("Insertion not possible at position" +pos);
		}
	
	public void deleteFirst()
	{
		if (Start==null)
			System.out.println("List is already empty");
		else 
		{
			Start=Start.getNext();
			size--;
		}
		
	}
	
	public void deleteLast()
	{
		if (Start==null)
			System.out.println("List is already empty");
		else if (size==1) {
			Start=null;
			size--;
		}
		else 
		{
			Node1 t;
			t=Start;
			for(int i = 1;i<size-1;i++)
			t = t.getNext();
			t.setNext(null);
			size--;
		}
	}
	public void deleteAtPos(int pos)
	{
	if (Start == null)
		System.out.println("List is already empty");
	else if (pos <1 || pos>size)
	{
		System.out.println("Invalid Position");
	}
	else if (pos ==1)
	{
		deleteFirst();
		
	}
	else if (pos == size)
	{
		deleteLast();
	}
	else
	{
	Node1 t,t1;
	t= Start;
	for (int i = 1 ; i<pos-1;i++)
	{
		t=t.getNext();
		t1=t.getNext();
		t.setNext(t1.getNext());
		
	}
	}
	}
	
public class Node1 {
	private int data ;
	private Node1 next;
	public Node1(int d,Node1 n)
	{
		data = d;
		next = n;
	}
	public void setData(int d)
	{
		data = d;
	}
	public void setNext(Node1 n)
	{
		next =n;
	}
	public int getData()
	{
		return (data);
	}
	public Node1 getNext()
	{
		return (next);
	}
	
}
	
}
