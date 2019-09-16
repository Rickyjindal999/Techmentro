package innerclasses;

import java.util.Scanner;

public class LinkedListMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		boolean flag = true;
		while (flag) {
		System.out.println("1.Add the item to the list at start");
		System.out.println("2.Add the item to the list at Last");
		System.out.println("3.Add the item to the list at Position");
		System.out.println("4.Delete first item from the list");
		System.out.println("5.Delete Last item from the list");
		System.out.println("6.Delete item from the given position");
		System.out.println("7.View List");
		System.out.println("8.Exit");
		System.out.println("Enter Your Choice");
		int Choice = sc.nextInt();
		int position,val;
		switch (Choice) {
		case 1:
			
			System.out.println("Enter value of list item");
			 val= sc.nextInt();
			 list.insertAtFirst(val);
			 break;
			
		case 2:
			System.out.println("Enter value of list item");
			 val= sc.nextInt();
			 list.insertAtLast(val);
			 break;
			
			
		case 3:
			System.out.println("Enter Position");
			position=sc.nextInt();
			System.out.println("Enter value of list item");
			 val= sc.nextInt();
			list.insertAtPos(val, position);
			break;
		case 4:
			list.deleteFirst();
			break;
		case 5:
			list.deleteLast();
			break;
		case 6:
			System.out.println("Enter Position");
			position =sc.nextInt();
			list.deleteAtPos(position);
			break;
		case 7:
			list.viewList();
			break;
		case 8:
			flag= false;
			break;
			
		
			default :
			System.out.println("Invalid choice");
		
		}
		
	}
	}

}
