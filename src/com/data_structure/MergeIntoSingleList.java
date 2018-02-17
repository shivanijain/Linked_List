package com.data_structure;

import java.util.HashMap;

/**
 * Created by Shivani on 16-02-2018.
 */
public class MergeIntoSingleList extends CustomiseList {

    private void MergePoint( Node firstHead, Node secondNode ){
        HashMap hm = new HashMap();
        Node current = firstHead;
        while( current != null ) {
            hm.put(current.data,current);
            current = current.next;
        }
        current = secondNode;
        while( current != null ) {
            if( true == hm.containsKey( current.data ) ) {
                System.out.println("Merge Exist at" + current.data );
                return;
            }
            current = current.next;
        }
    }

    public void MiddleNode( Node head){
        Node slowptr = head;
        Node fastptr = head.next;
        while( slowptr != null && fastptr !=null && fastptr.next != null ) {
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        System.out.println("=========== Middle point is =============");
        System.out.println( slowptr.data );
    }
    public static void main(String[] args) {
        MergeIntoSingleList ls = new MergeIntoSingleList();
        ls.head = ls.insertNode( ls.head, "1",1);
        ls.head = ls.insertNode( ls.head, "2",2 );
        ls.traverseList(ls.head);
        System.out.println("second list");
        MergeIntoSingleList ls1 = new MergeIntoSingleList();
        ls1.head = ls1.insertNode( ls1.head, "3",1 );
        ls1.head = ls1.insertNode( ls1.head, "4",2 );
        ls1.head = ls1.insertNode( ls1.head, "5",3 );
        ls.traverseList(ls1.head);
        System.out.println("Third List");
        MergeIntoSingleList ls2 = new MergeIntoSingleList();
        ls2.head = ls2.insertNode( ls2.head, "7",1 );
        ls2.head = ls2.insertNode( ls2.head, "8",2 );
        ls.traverseList(ls2.head);
        System.out.println("First List Lined");
        ls.head.next.next = ls2.head;
        ls.traverseList(ls.head);
        System.out.println("Second List Lined");
        ls1.head.next.next.next = ls2.head;
        ls.traverseList(ls1.head);
        ls.MergePoint( ls.head, ls1.head);
        ls.MiddleNode( ls1.head );
    }
}
