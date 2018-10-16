package com.linkedList;

import java.util.Scanner;

public class LinkList {

    /*
    * Node Creation.
    * */
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    //LinkList
    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }

        static void printLinkedList(SinglyLinkedListNode head) {
            if (head == null && head.next == null) {
                return;
            }
            SinglyLinkedListNode node = head;
            while (node != null) {
                System.out.print( +node.data +" "+node.next );
                node = node.next;
            }

        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            SinglyLinkedList llist = new SinglyLinkedList();
            System.out.print("Enter Number of nodes You Want to enter");
            int llistCount = scanner.nextInt();
            System.out.println("Elements");
            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                llist.insertNode(llistItem);
            }

            printLinkedList(llist.head);

            scanner.close();
        }


    }
    }