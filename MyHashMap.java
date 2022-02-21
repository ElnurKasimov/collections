package Collections;

import java.util.Objects;

public class MyHashMap<K, V> {
        private Node first = new Node();
        private Node last = new Node();
        private int size;

    public MyHashMap() {
            first.next = last;
            last.prev = first;
            size=0;
        }

        public void printAll() {
            Node currentElement = first.next;
            System.out.print("[");
            while ((currentElement) != null) {
                System.out.println("Ключ " +currentElement.key.toString() + " -  значение " + currentElement.value.toString()  + "," );
                currentElement = currentElement.next;
            }
            System.out.println("]");
        }

        public void put  (K key, V value) {
            Node node = new Node();
            node.key = key;
            node.value = value;

            Node lastNode = last.prev;
            lastNode.next = node;
            node.prev = lastNode;
            last.prev = node;
            size++;

            // проверка на уканикальность ключа
            Node currentElement = first.next;
            while ( !(currentElement.key).equals(key) ){
                currentElement = currentElement.next;}
            if (currentElement.value != node.value) {
                remove(currentElement.key);
                size--;
            }
        }

    public V get (Object key) {
        Node currentElement = first.next;
        while ( !(currentElement.key).equals(key) ){
            currentElement = currentElement.next;
        }
        return (V) currentElement.value;
    }

    public void remove (Object key) {

        Node deletedElement = first.next;
        while ( !(deletedElement.key).equals(key) ){
            deletedElement = deletedElement.next;
        }

        Node previousOfDeleted = deletedElement.prev;
        Node nextOfDeleted = deletedElement.next;

        previousOfDeleted.next = nextOfDeleted;
        nextOfDeleted.prev = previousOfDeleted;
        size--;
    }



    public void clear() {
        first.next = last;
        last.prev = first;
        size=0;
    }
        public int size() {  return size; }

        public static class Node <K, V> {
            private Node prev;
            private K key;
            private V value;
            private Node next;

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof Node)) return false;
                Node<?, ?> node = (Node<?, ?>) o;
                return key.equals(node.key) && value.equals(node.value);
            }

            @Override
            public int hashCode() {
                return Objects.hash(key, value);
            }
        }
    }