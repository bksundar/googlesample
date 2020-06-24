
//This is just a test
/**
 * Defines the a singly-linked list class
 * @author Bhargavi Kumar Sundaresan
*/

import java.util.NoSuchElementException;

public class List {
 private class Node {
 private int data;
 private Node next;
 
 public Node(int data) {
 this.data = data;
 this.next = null;
 }
 }
 //Unnecessary test 2
 private int length;
 private Node first;
 private Node last;
 
 /****CONSTRUCTOR****/
 
 /**
 * Instantiates a new List with default values
 * @postcondition A new object of list class is initialized
 */
 public List() {
 length = 0;
 first = null;
 last = null;
 }
 
 /****ACCESSORS****/
 
 /**
 * Returns the value stored in the first node
 * @precondition length != 0 first != null (list exists)
 * @return the integer value stored at node first
 * @throws NoSuchElementException when precondition is violated
 */
 public int getFirst() throws NoSuchElementException{
 if(length == 0) 
 {
 throw new NoSuchElementException("getFirst(): List has no element to access");
 }
 return first.data; 
 }
 
 /**
 * Returns the value stored in the last node
 * @precondition length != 0 first != null(list exists)
 * @return the integer value stored in the node last
 * @throws NoSuchElementException when precondition is violated
 */
 public int getLast() throws NoSuchElementException{
 if(length == 0) 
 {
 throw new NoSuchElementException("getLast(): List has no element to access");
 }
 return last.data; 
 }
 
 /**
 * Returns the current length of the list
 * @return the length of the list from 0 to n
 */
 public int getLength() {
 return length;
 }
 
 /**
 * Returns whether the list is currently empty
 * @return whether the list is empty
 */
 public boolean isEmpty() {
 return length == 0; // return true if empty
 }
 
 /****MUTATORS****/
 
 /**
 * Creates a new first element
 * @param data the data to insert at the 
 * front of the list
 * @postcondition The data is added as the first node to the list.
 */
 public void addFirst(int data) {
 
 if(first == null) {
 first = last = new Node(data);
 }
 else { 
 Node N = new Node(data);
 N.next = first;
 first = N;
 }
 length++;
 }
 
 /**
 * Creates a new last element
 * @param data the data to insert at the 
 * end of the list
 * @postcondition The data is added as the last node to the list.
 */
 public void addLast(int data) {
 if(first == null) {
 first = last = new Node(data);
 }
 else { 
 Node N = new Node(data);
 last.next = N;
 last = N;
 }
 length++;
 }
 
 /**
 * removes the element at the front of the list
 * @precondition length != 0 (List exists. There alteast is one node present in the list.)
 * @postcondition The first node of the list is removed from the list.
 * @throws NoSuchElementException when precondition is violated
 */
 public void removeFirst() throws NoSuchElementException{
 if(length == 0) {
 throw new NoSuchElementException("removeFirst(): Cannot remove from an empty List! \n");
 }
 else if (length == 1) {
 first = last = null;
 }
 else {
 first = first.next;
 }
 length--;
 }
 
 /**
 * removes the element at the end of the list
 * @precondition length != 0 (List exists. There alteast is one node present in the list.)
 * @postcondition The last node of the list is removed from the list.
 * @throws NoSuchElementException when precondition is violated
 */
 public void removeLast() throws NoSuchElementException{
 if(length == 0) {
 throw new NoSuchElementException("removeLast(): Cannot remove from an empty List! \n");
 }
 else if (length == 1) {
 first = last = null;
 }
 else {
 Node temp = first;
 while(temp.next != last) {
 temp = temp.next;
 }
 last = temp;
 last.next = null;
 }
 length--;
 }
 
 /****ADDITIONAL OPERATIONS****/
 
 /**
 * List with each value separated by a blank space
 * At the end of the List a new line
 * @return the List as a String for display
 */
 @Override public String toString() {
 String result = "";
 Node temp = first;
 while(temp != null) {
 result += temp.data + " ";
 temp = temp.next;
 }
 result += "\n";
 return result; 
 }
 
 
 

}
