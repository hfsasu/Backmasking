import java.util.EmptyStackException;
import java.util.Iterator;

//if the first argument is "list" stack, this program will run
public class LinkedStack implements BKStack, Iterable<Double> {
    private Node top = null; //top element of the stack
    private int count = 0; //intial number of elements in stack


    /*
    if top is null (as set initially), stack is empty
     */
    @Override
    public boolean isEmpty() {
        return top == null;
    }

    /*
    get number of elements in stack
     */
    @Override
    public int count() {
        return count;
    }

    /*
    adds a new element to top of stack and then top reference is changed to point to new node
    count variable is increased by one
     */
    @Override
    public void push(double element) {
        top = new Node(element, top);
        count++;
    }

    /*
    removes top element from the stack
    updates top reference to point to the previous node

    if stack is empty, throws exception
     */
    @Override
    public double pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        double value = top.element; //get the element of top node
        top = top.previous; //make previous node new top node
        count--; //decrement count of elements
        return value; //return the element of new top node
    }

    /*
    just return element at the top of stack (doesn't remove it)
     */
    @Override
    public double peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.element;
    }

    /*
    iterate over the elements in stack
     */
    @Override
    public Iterator<Double> iterator() {
        return new StackIterator(top);
    }

    /*
    represents one Node
     */
    private static class Node {
        public double element;
        public Node previous;

        public Node(double element, Node previous) { //constructor
            this.element = element;
            this.previous = previous;
        }
    }

    private static class StackIterator implements Iterator<Double> {
        private Node current;

        public StackIterator(Node top) {
            current = top;
        }

        //check if there are more elements to go through
        @Override
        public boolean hasNext() {
            return current != null;
        }

        //get next element in iteration
        @Override
        public Double next() {
            double e = current.element;
            current = current.previous;
            return e;
        }
    }
}
