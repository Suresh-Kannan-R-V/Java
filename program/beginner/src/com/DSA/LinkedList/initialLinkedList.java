package com.DSA.LinkedList;

import com.DSA.LinkedList.LinkedList;
import com.DSA.LinkedList.DoubleLinkedList;
import com.DSA.LinkedList.CircularDoubleLinkedList;
import com.DSA.LinkedList.LinkedList.Node;

public class initialLinkedList {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add("hsgdh");
        l1.add("uqywe");
        l1.add("ueer");
//        l1.add("ueer");
        l1.addFirst("qwsaa");

        l1.add(2, "wqqa");

//        l1.display();
//        System.out.println(l1.min());
//        System.out.println(l1.max());
//        System.out.println(l1.search("iqwe"));
//        l1.sort();
//        l1.display();
//        System.out.println(l1.isSort(LinkedList.Order.DESC));
//        System.out.println(l1.optmizeSearch("iqwe"));
//        l1.display();
//        l1.removeDuplicates();
//        l1.display();
//        l1.display();
//        l1.createCycle(1);
//
//        System.out.println(l1.isCycle());
//        Node secHead = l1.head;
//        for (int i = 0; i < 15; i++) {
//            System.out.print(secHead.value + " -> ");
//            secHead = secHead.next;
//        }
//        System.out.println();
//        l1.removeCycle();

//        l1.display();
//        l1.add(5, "werwer");
//        l1.display();
//        l1.delete();
//        l1.display();


//        for (int i = 1; i <= 10; i++) {
//            l2.add(i);
//        }

//        l2.display();
//        l2.createCycle(5);
//        Node secHead = l2.head;
//        for (int i = 0; i < 15; i++) {
//            System.out.print(secHead.value + " -> ");
//            secHead = secHead.next;
//        }
//        System.out.println();
//        l2.removeCycle();
//        l2.delete(9);
//        l2.display();
        DoubleLinkedList<Integer> dl1 = new DoubleLinkedList<>();
//        dl1.add(1);
//        dl1.add(13);
//        dl1.add(21);
//        dl1.add(15);
//        dl1.insertSort(3);
//        dl1.insertSort(2);
        dl1.insertSort(5);
//        dl1.insertSort(2);
//        dl1.display();
//        dl1.display(true);
//        dl1.display(true);
//        dl1.add(4, 5);
//        dl1.display(true);
//        dl1.deleteFirst();
//        dl1.deleteLast();
//        System.out.println(dl1.delete(2));
//        System.out.println(dl1.size());
//        System.out.println(dl1.size());
//        dl1.display(true);
//        System.out.println(dl1.get(1));
//        System.out.println(dl1.set(1, 14));
//        dl1.display(true);
        CircularDoubleLinkedList<Integer> cdl1 = new CircularDoubleLinkedList<>();
        cdl1.add(1);
        cdl1.add(13);
        cdl1.add(21);
        cdl1.add(15);
        cdl1.addFirst(200);
        cdl1.add(500);
        cdl1.display();
    }

}
