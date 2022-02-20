package Collections;

public class MyLinkedList<T> {
        private Node first = new Node();
        private Node last = new Node();
        private int size;

    public MyLinkedList() {
            first.next = last;
            last.prev = first;
            size=0;
        }

        public void printAll() {
            Node currentElement = first.next;
            System.out.print("[");
            while ((currentElement) != null) {
                System.out.println("Индекс " +currentElement.index + " -  значение " + currentElement.value.toString()  + "," );
                currentElement = currentElement.next;
            }
            System.out.println("]");
        }

        public void add  (T value) {
            Node node = new Node();
            node.value = value;
            node.index = size;

            Node lastNode = last.prev;
            lastNode.next = node;
            node.prev = lastNode;
            last.prev = node;

            size++;
        }

         public T get (int index) {
              Node currentElement = first.next;
                while ((currentElement.index) != index) {
                    currentElement = currentElement.next;
                }
                return (T) currentElement.value;
        }

    public void remove (int index) {

        Node deletedElement = first.next;
        while ((deletedElement.index) != index) {
            deletedElement = deletedElement.next;
        }

        Node previousOfDeleted = deletedElement.prev;
        Node nextOfDeleted = deletedElement.next;

        previousOfDeleted.next = nextOfDeleted;
        nextOfDeleted.prev = previousOfDeleted;
        size--;

        while ((nextOfDeleted) != null) {
            nextOfDeleted.index--;
            nextOfDeleted = nextOfDeleted.next;
        }
    }

    public void clear() {
        first.next = last;
        last.prev = first;
        size=0;
    }
        public int size() {  return size; }

        public static class Node <T> {
            private Node prev;
            private int index;
            private T value;
            private Node next;
        }
    }