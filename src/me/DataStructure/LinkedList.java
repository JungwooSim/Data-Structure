package me.DataStructure;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    private class Node {
        // 데이터가 저장될 필드
        private Object data;
        // 다음 노드를 가리키는 필드
        private Node next;

        public Node(Object input) {
            this.data = input;
            this.next = null;
        }

        // Node 출력
        public String toString() {
            return String.valueOf(this.data);
        }
    }

    public void addFirst(Object input) {
        // 노드 생성
        Node newNode = new Node(input);

        // 새로운 노드의 다음 노드를 헤드로 지정
        newNode.next = head;

        head = newNode;

        size++;

        if (head.next == null) {
            tail = head;
        }
    }

    public void addLast(Object input) {
        // 노드 생성
        Node newNode = new Node(input);

        if (size == 0) {
            addFirst(input);
        } else {
            tail.next = newNode;

            tail = newNode;

            size++;
        }
    }

    public void add(int k, Object input) {
        if (k == 0) {
            addFirst(input);
        } else {
            Node temp1 = node(k-1);

            Node temp2 = temp1.next;

            Node newNode = new Node(input);

            temp1.next = newNode;

            newNode.next = temp2;

            size++;

            if (newNode.next == null) {
                tail = newNode;
            }
        }
    }

    public String toString() {
        if (head == null) {
           return "[]";
        }

        // 탐색 시작
        Node temp = head;

        String str = "[";

        while (temp.next != null) {
            str += temp.data + ",";
            temp = temp.next;
        }

        str += temp.data;

        return str+"]";
    }

    // 특정 위치의 노드 찾(내부적으로만 사용할 예정)
    Node node(int index) {
        Node x = head;

        for (int i = 0; i<index; i++) {
            x = x.next;
        }

        return x;
    }

    public Object removeFirst() {
        Node temp = head;
        head = temp.next;

        Object returnData = temp.data;

        temp = null;

        size--;

        return returnData;
    }

    public Object remove(int k) {
        if (k == 0) {
            return removeFirst();
        }

        Node temp = node(k-1);

        Node todoDeleted = temp.next;

        temp.next = temp.next.next;

        Object returnData = todoDeleted.data;

        if (todoDeleted == tail) {
            tail = temp;
        }
        todoDeleted = null;
        size--;
        return returnData;
    }

    public int size() {
        return size;
    }

    public Object get(int k) {
        Node temp = node(k);

        return temp.data;
    }

    public int indexOf(Object data) {
        Node temp = head;

        int index = 0;

        while (temp.data != data) {
            temp = temp.next;
            index++;

            if (temp == null) {
                return -1;
            }
        }

        return index;
    }
}
