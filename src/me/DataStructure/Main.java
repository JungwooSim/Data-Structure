package me.DataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
//        _array();
//        _queue();
//        _stack();

        // Linked List
        me.DataStructure.LinkedList numbers = new me.DataStructure.LinkedList();
        numbers.addLast(10);
        numbers.addLast(20);
        numbers.addLast(30);
        numbers.addLast(40);

        System.out.println(numbers.toString());

        System.out.println("Remove First : " + numbers.removeFirst());
        System.out.println(numbers.toString());
        System.out.println("Remove : "+numbers.remove(1));
        System.out.println(numbers.toString());
        System.out.println("Size : "+numbers.size());
        System.out.println("Get Index-1 Value : "+numbers.node(1));

        System.out.println("Data Index : "+numbers.indexOf(40));
    }

    public static void _array() {
        // Dimension - 1
        int[] numbers = {1,2,3,4,5};
        System.out.println("numbers : "+numbers);
        System.out.println("numbers Count: "+numbers.length);

        for (int i=0; i<numbers.length; i++) {
            System.out.println("numbers Index "+i+" : "+numbers[i]);
        }

        // Dimension - 2
        int[][] numbers_2_dimension = {{1,2,3},{4,5,6}};
        for (int i=0; i<numbers_2_dimension.length; i++) {
            for (int j=0; j<numbers_2_dimension[i].length; j++) {
                System.out.println("numbers dimension " + i + ", index " + j + " : " + numbers_2_dimension[i][j]);
            }
        }
    }

    public static void _queue() {
        // Interface 활용
        Queue<Integer> numbers = new LinkedList<>();

        // offer : 결과값 리턴
        // add : 예외발생
        numbers.offer(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);

        System.out.println(numbers.poll());
        System.out.println(numbers.poll());
        System.out.println(numbers.poll());
    }

    public static void _stack() {
        Stack<Integer> numbers = new Stack();

        numbers.push(1);
        numbers.push(2);
        numbers.push(3);

        System.out.println(numbers);

        System.out.println("stack pop : "+numbers.pop());
        System.out.println("stack pop : "+numbers.pop());
        System.out.println("stack pop : "+numbers.pop());

        System.out.println("Pop End : " + numbers);
    }
}
