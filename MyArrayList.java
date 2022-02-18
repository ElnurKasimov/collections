package Collections;

public class MyArrayList <T>{
   private final int size;
   private final T [] values;

    public MyArrayList() {
        this.size = 0;
        this.values =  (T[]) new Object [50];
    }

    public int getSize() {
        return size;
    }

    public T[] getValues() {
        return values;
    }

    public int size() {
        return size;
    }

    public String toString(){
        if (this.getSize() == 0) {return "[null]";}
        else {
        String result = "[";
        for (int i = 0; i < this.getSize() - 1; i++) {
            result += this.getValues()[i];
            if (i != this.getSize() - 1) {
                result += ", ";
            }
        }
        return result+"]";
        }
    }



}
