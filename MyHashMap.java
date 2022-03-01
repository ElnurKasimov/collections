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
            System.out.println("Ключ: " +currentElement.key.toString() + ",  значение: " + currentElement.value.toString()  + "," );
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

        Node currentElement= first.next;
        while (currentElement != node) {
            if( currentElement.key.equals(key) ) {
                remove(key);
            }
            currentElement= currentElement.next;
        }
    }

    public V get (Object key) {
        Node currentElement = first.next;
        while ((currentElement) != null) {
               if (!(currentElement.key).equals(key)) {
                   currentElement = currentElement.next;
               } else {
                   return (V) currentElement.value;
               }
           }
        throw new MyIllegalArgumentException( "запрос ключа, которого нет ");
    }

    public void remove (Object key) {
        Node deletedElement = first.next;
        while (deletedElement != null) {
            if (!(deletedElement.key.equals(key))) {
                deletedElement = deletedElement.next;
            } else {
                Node previousOfDeleted = deletedElement.prev;
                Node nextOfDeleted = deletedElement.next;

                previousOfDeleted.next = nextOfDeleted;
                nextOfDeleted.prev = previousOfDeleted;
                size--;
                break;
            }
        }
       if (deletedElement == null) throw new  MyIllegalArgumentException( "Удаление  пары, в которой нет такого ключа");
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