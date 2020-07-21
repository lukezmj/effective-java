import java.util.Arrays;

/**
 * AlertMemoryLeaks
 */
public class AlertMemoryLeaks {

    public static void main(String[] args) {
        Stack s = new Stack();

        for (int i = 0; i < 20; i++) {
            s.push(i);
        }

        for (int i = 0; i < 20; i++) {
            try {
                System.out.println(s.pop());
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

}

/**
 * InnerAlertMemoryLeaks
 */
class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int CAPACITY = 16;

    public Stack() {
        elements = new Object[CAPACITY];
    }
    
    public Object pop() throws Exception{
        if(elements.length == 0) {
            throw new Exception();
        }
        return elements[--size];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    private void ensureCapacity() {
        if(elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size  + 1);
        }
    }
}