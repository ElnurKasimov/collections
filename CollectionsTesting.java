package Collections;

import java.util.Iterator;

public class CollectionsTesting {

    public static void main(String[] args) {

       // проверка на Integer  и методов toString() , add() и remove()

        MyArrayList <Integer> myArrayList1 = new MyArrayList<Integer>();
        System.out.println(myArrayList1.toString()); // проврка на нулевой массив
        for (int i = 0; i < 35; i++) {
            myArrayList1.add(i);
        }
        System.out.println(myArrayList1.toString());
        myArrayList1.remove(0);
        myArrayList1.remove(34);
        System.out.println(myArrayList1.toString());

        //  проверка на String и методов  get() , size() и remove()
        MyArrayList <String> myArrayList2 = new MyArrayList<String>();
        myArrayList2.add("проверка");
        myArrayList2.add("на");
        myArrayList2.add("работоспособность");
        myArrayList2.add("обработки");
        myArrayList2.add("строк");
        for (int i=0; i < myArrayList2.size(); i++) {
            System.out.print(myArrayList2.get(i) + ", ");
        }
        System.out.println("\n" + myArrayList2.toString());
        myArrayList2.clear();
        System.out.println( myArrayList2.toString());

    //  System.out.println("заполненно - " + myArrayList1.size() + " ячеек из " + myArrayList1.getValues().length);
    }
}
