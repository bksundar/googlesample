package lab1;

/**
 * Class to test List.java
 * @author Bhargavi Kumar Sundaresan
 */
import java.util.NoSuchElementException;

public class ListTest {
	public static void main(String[] args) {
 List L = new List();
 System.out.println("Should print nothing (an empty list): " + L);
 //Code to test addFirst goes here!
 System.out.println("**Testing addFirst**");
 L.addFirst(3);
 System.out.println("Should print 3: " + L);
 L.addFirst(2);
 System.out.println("Should print 2 3: " + L);
 L.addFirst(1);
 System.out.println("Should print 1 2 3: " + L);

 //Code to test addLast goes here!
 System.out.println("**Testing addLast**");
 L.addLast(4);
 System.out.println("Should print 1 2 3 4: " + L);
 
 L.addLast(5);
 System.out.println("Should print 1 2 3 4 5: " + L);
 
 L.addLast(6);
 System.out.println("Should print 1 2 3 4 5 6: " + L);
 
 //Code to test getFirst goes here!
 System.out.println("\n**Testing getFirst**");
 System.out.println("Should print 1: " + L.getFirst());
 L.removeFirst();
 System.out.println("Should print 2: " + L.getFirst());
 L.removeFirst();
 System.out.println("Should print 3: " + L.getFirst());
 
 //Code to test getLast goes here!
 System.out.println("\n**Testing getLast**");
 System.out.println("Should print 6: " + L.getLast());
 L.removeLast();
 System.out.println("Should print 5: " + L.getLast());
 L.removeLast();
 System.out.println("Should print 4: " + L.getLast());
 
 //Code to test removeFirst goes here!
 System.out.println("\n**Testing removeFirst**");
 L.addFirst(2);
 L.addFirst(1);
 L.addLast(5);
 L.addLast(6);
 L.removeFirst(); 
 System.out.println("Should print 2 3 4 5 6: " + L);
 L.removeFirst();
 System.out.println("Should print 3 4 5 6: " + L);
 L.removeFirst();
 System.out.println("Should print 4 5 6: " + L);
 L.removeFirst(); 
 L.removeFirst(); 
 L.removeFirst(); 
 //empty
 try {
 L.removeFirst();
 } catch(NoSuchElementException e) {
 System.out.println(e.getMessage());
 }
 
 //Code to test removeLast goes here!
 System.out.println("\n**Testing removeLast**");
 L.addFirst(6);
 L.addFirst(5);
 L.addFirst(4);
 L.addFirst(3);
 L.addFirst(2);
 L.addFirst(1);
 L.removeLast();
 System.out.println("Should print 1 2 3 4 5: " + L);
 L.removeLast();
 System.out.println("Should print 1 2 3 4: " + L); 
 L.removeLast();
 L.removeLast();
 L.removeLast();
 L.removeLast();
 //empty
 try {
 L.removeLast();
 } catch(NoSuchElementException e) {
 System.out.println(e.getMessage());
 }
 
 //Code to test isEmpty goes here!

 System.out.println("\n**Testing isEmpty**");
 List L2 = new List();
 System.out.println("Should print true: " + L2.isEmpty());
 L2.addFirst(4);
 System.out.println("Should print false: " + L2.isEmpty());
 L2.removeFirst();
 System.out.println("Should print true: " + L2.isEmpty());
 
 //Code to test getLength goes here!
 System.out.println("\n**Testing getLength**");
 System.out.println("Should print 0: " + L.getLength());
 L.addFirst(1);
 System.out.println("Should print 1: " + L.getLength());
 System.out.println("Should print 0: " + L2.getLength());
 L2.addFirst(5);
 System.out.println("Should print 1: " + L2.getLength());

	}

}

/**
 * Output
Should print nothing (an empty list): 
**Testing addFirst**
Should print 3: 3 
Should print 2 3: 2 3 
Should print 1 2 3: 1 2 3 
**Testing addLast**
Should print 1 2 3 4: 1 2 3 4 
Should print 1 2 3 4 5: 1 2 3 4 5 
Should print 1 2 3 4 5 6: 1 2 3 4 5 6 
**Testing getFirst**
Should print 1: 1
Should print 2: 2
Should print 3: 3
**Testing getLast**
Should print 6: 6
Should print 5: 5
Should print 4: 4
**Testing removeFirst**
Should print 2 3 4 5 6: 2 3 4 5 6 
Should print 3 4 5 6: 3 4 5 6 
Should print 4 5 6: 4 5 6 
removeFirst(): Cannot remove from an empty List! 
**Testing removeLast**
Should print 1 2 3 4 5: 1 2 3 4 5 
Should print 1 2 3 4: 1 2 3 4 
removeLast(): Cannot remove from an empty List! 
**Testing isEmpty**
Should print true: true
Should print false: false
Should print true: true
**Testing getLength**
Should print 0: 0
Should print 1: 1
Should print 0: 0
Should print 1: 1
 */
