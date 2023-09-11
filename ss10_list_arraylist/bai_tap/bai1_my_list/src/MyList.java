import java.util.Arrays;

public class MyList<E> {
    private int size=0;
    private static final int DEFAULT_CAPACITY=10;
    private Object elements[];

    public MyList() {
        this.elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements,newSize );

    }

        public void add( E e){
        if(size== elements.length){
            ensureCapa();
        }
        elements[size++]=e;
    }
    public void add(int index, E element) {
        ensureCapa();
        for (int i = size - 1; i > index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(("index " + index + " out of bounds."));
        }
    }

    public void clear() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i]))
                return i;
        }
        return -1;
    }

    public E remove(int index) {
        checkIndex(index);
        E e = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        return e;
    }

    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.println("element " + i + "= " + elements[i]);
        }

    }
}
