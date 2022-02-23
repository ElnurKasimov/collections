package Collections;

import java.util.Arrays;

public class MyStack<T>{
   private int size;
   private T [] values;

    public MyStack() {
        this.size = 0;
        this.values =  (T[]) new Object [30];
    }

    public int getSize() {
        return size;
    }

    public Object[] getValues() {
        return values;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setValues(T[] values) {
        this.values = values;
    }

    public void push(T t) {
        if (size == values.length) {
            int newsize = (int) (size*1.5) ;
            T[] temp = (T[]) new Object [newsize];
            temp =  Arrays.copyOf(values, newsize);
            this.setValues(temp);
        }
        values[size] = (T) t;
        size++;
    }

    public void remove (int index ) {
        for (int i = index; i < size ; i++) {
            values[i] = values[i+1];
        }
        values[size] = null;
        size--;
    }

    public void clear () {
        for (int i = 0; i < size; i++) values[i] = null;
        size=0;
}

    public int size() {
        return size;
    }

    public  T get(int index) { return values[index];}

    public T peek() {
        return values[size-1];
    }
    public T pop() {
        T temp = values[size-1];
        size--;
        return temp;
    }

    public String toString(){
        if (this.getSize() == 0) {return "[null]";}
        else {
        String result = "[";
        for (int i = 0; i < size ; i++) {
            result += values[i];
            if (i != size - 1) {
                result += ", ";
            }
        }
        return result+"]";
        }
    }

}
