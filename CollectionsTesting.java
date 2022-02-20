package Collections;

public class CollectionsTesting {

    public static void main(String[] args) {

       // --------------------проверка класса MyArrayList -----------------------

        // на Integer  и методов toString() , add() и remove()
        System.out.print("\n--------------------------------проверка класса MyArrayList--------------------------------------\n");
        MyArrayList <Integer> myArrayList1 = new MyArrayList<Integer>();
        System.out.println(myArrayList1.toString()); // проврка на нулевой массив
        for (int i = 0; i < 35; i++) {
            myArrayList1.add(i);
        }
        System.out.println(myArrayList1.toString());
        myArrayList1.remove(0);
        myArrayList1.remove(34);
        System.out.println(myArrayList1.toString());

        //  проверка  на String и методов  get() , size() и remove()

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
        System.out.println("заполненно - " + myArrayList1.size() + " ячеек из " + myArrayList1.getValues().length);

        // -------------------------проверка класса MyLinkedList-----------------------------------------------

        System.out.print("\n------------------------------проверка класса MyLinkedList----------------------------------------\n");
        MyLinkedList <Integer>  myLinkedList = new MyLinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            myLinkedList.add (i);
        }
        System.out.println("Проверяем создание списка и метода add(). " +
                "Содержимое списка после добавления в него 10 элементов:" );
        myLinkedList.printAll();
        System.out.println("Проверяем метод size(). Размер списка - " + myLinkedList.size());
        System.out.println("Проверяем метод get(int index). Содержимое " + "7 элемента коллекции - " + myLinkedList.get(7).toString());
        System.out.println("Проверяем метод remove(int index). Удаляем элемент с индексом 6 и распечатываем все элементы коллекции ");
        myLinkedList.remove(6);
        myLinkedList.printAll();
        System.out.println("Размер списка после удаления 13 элемента - " + myLinkedList.size());
        System.out.println("Проверяем метод clear(). Распечатать список после его очистки не можем, так как будет ссылка на null.");
        myLinkedList.clear();
        System.out.println("Размер списка - " + myLinkedList.size());

        // -------------------------проверка класса MyQueue-----------------------------------------------

        System.out.print("\n--------------------------------проверка класса MyQueue---------------------------------------\n");
        MyQueue <String> myQueue = new MyQueue<String>();
        myQueue.add("первый");
        myQueue.add("второй");
        myQueue.add("третий");
        myQueue.add("четвертый");
        myQueue.add("пятый");
        System.out.println("Проверка на создание, методов add(),  get() и size");
        for (int i=0; i < myQueue.size(); i++) {
            System.out.print(myQueue.get(i).toString() + ", ");
        }
        System.out.print("\n" + myQueue.toString());
        System.out.println(" количество элементов в очереди - " + myQueue.size());
        System.out.println("Проверка метода peek(). Первый элемент в очереди - \"" + myQueue.peek().toString() + "\"");
        System.out.println("Проверка методов pool() и remove(). \n Теперь очередь выгляит так");
        myQueue.poll();
        System.out.print(myQueue.toString());
        System.out.println(" количество элементов в очереди - " + myQueue.size());
        System.out.println("Проверка метода clear(). \n Теперь очередь выгляит так");
        myQueue.clear();
        System.out.print(myQueue.toString());

        // -------------------------проверка класса MyStack-----------------------------------------------

        System.out.print("\n---------------------------------проверка класса MyStack-------------------------------------\n");
        MyStack <String> myStack = new MyStack <String>();
        myStack.push("нижний");
        myStack.push("второй снизу");
        myStack.push("третий снизу");
        myStack.push("четвертый снизу");
        myStack.push("пятый снизу");
        myStack.push( "верхний");
        System.out.println("Проверка на создание, методов push(),  get() и size");
        for (int i=0; i < myStack.size(); i++) {
            System.out.print(myStack.get(i).toString() + ", ");
        }
        System.out.print("\n" + myStack.toString());
        System.out.println(" количество элементов в стопке - " + myStack.size());
        System.out.println("Проверка метода peek(). Верхний элемент в стопке - \"" + myStack.peek().toString() + "\"");
        System.out.println("Проверка метода remove(int index). После удаления 3-го элемента в стопке она выглядит так");
        myStack.remove(3);
        System.out.println(myStack.toString());
        System.out.println("Проверка методов pop(). \n Теперь стопка выгляит так");
        myStack.pop();
        System.out.print(myStack.toString());
        System.out.println(" количество элементов в очереди - " + myStack.size());
        System.out.println("Проверка метода clear(). \n Теперь стопка выгляит так");
        myStack.clear();
        System.out.print(myStack.toString());

        // -------------------------проверка класса MyHashMap-----------------------------------------------

        System.out.print("\n----------------------------------проверка класса MyHashMap------------------------------------\n");
        MyHashMap <String , String>  myHashMap = new MyHashMap<>();
        myHashMap.put("Сан Саныч", "321-48-65");
        myHashMap.put("Валентина Ивановна", "846-67-52");
        myHashMap.put("Жена", "4356-45-78");
        myHashMap.put("Офис", "735-42-67");
        myHashMap.put("Светка", "369-25-74");
        myHashMap.put("Теща", "137-764-52");
        System.out.println("Проверяем создание списка и метода put(). " +
                "Содержимое списка после добавления в него 6 пар элементов:" );
        myHashMap.printAll();
        System.out.println("Проверяем метод size(). Размер словаря - " + myHashMap.size());
        System.out.println("Проверяем метод get(Object key). Для ключа \"Офис\" значение - " + myHashMap.get("Офис").toString());
        System.out.println("Проверяем метод remove(Object key). Удаляем пару значений \'Светка - 369-25-74 \' и распечатываем все элементы коллекции ");
        myHashMap.remove("Светка");
        myHashMap.printAll();
        System.out.println("Размер списка после удаления этой пары - " + myHashMap.size());
        System.out.println("Проверяем метод clear(). Распечатать список после его очистки не можем, так как будет ссылка на null.");
        myHashMap.clear();
        System.out.println("Размер списка - " + myHashMap.size());
        System.out.print("\n----------------------------------------------------------------------\n");



    }
}
