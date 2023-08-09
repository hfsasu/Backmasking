import java.util.EmptyStackException;

//if the first argument's type of "array" stack, this program will run
public class ArrayStack implements BKStack {
    int INITIAL_CAPACITY = 100; //initial capacity (will be resized)
    private double[] arr; //array that stores data
    private int top; //top of stack


    //constructor
    public ArrayStack() {
        int DOUBLE_CAPACITY = INITIAL_CAPACITY;
        top = -1; //initial index of top of stack
        arr = new double[DOUBLE_CAPACITY];
    }

    /*
    top keeps track of last added element's index
    if there are elements adds, top will be incremented by 1, therefore it will mean stack is not empty
    if the stack empty, that simply means top = -1
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /*
    add one element to the stack whenever a value is added to stack
     */
    public int count() {
        return top + 1;
    }

    /*
    adds element to top of the stack
    */
    public void push(double element) {
        if (top == arr.length - 1) { //if array is full
            resize(2 * arr.length); //call resize method to double the size
        }
        top++;
        arr[top] = element; //add the element to top of the stack
    }

    /*
     increase the capacity of the stack
     creates a new array of double with new capacity,
     then copies elements of old array into new array using a for loop
     */
    private void resize(int update) {
        double[] doubleSize = new double[update];
        for (int i = 0; i <= top; i++) {
            doubleSize[i] = arr[i];
        }
        arr = doubleSize;
    }

    /*
    return the top element from the stack and remove it
    remove one item at a time from stack to reversed output file
    */
    public double pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }

        double value = arr[top];
        top--;
        return value;
    }

    /*
    just return element at the top of stack (doesn't remove it)
     */
    @Override
    public double peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return arr[top];
    }
}