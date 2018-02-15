package com.data_structure;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Shivani on 11-02-2018.
 */
public class CustomiseList extends LinkedList {
    protected Node head;
    public static int[] arr = new int[2];
    Node insertNode( Node head, String data, int pos ) {
        Node tempNode = new Node();
        Node mid = null;
        Node current = head;
        int currentPos = 1;
        tempNode.data = data;
        if( pos == 1 ) {
            head = tempNode;
        } else {
            while( current != null && currentPos < pos ) {
                currentPos++;
                mid = current;
                current = current.next;
            }
            mid.next = tempNode;
            tempNode.next = current;
        }
        return head;
    }

     Node deleteNode( Node head, int pos ){
        Node mid = null;
        Node current = head;
        int currentPos = 1;
        if( pos == 1 ) {
            head = null;
        } else {
          while( current != null && currentPos < pos ) {
               currentPos++;
               mid = current;
               current = current.next;
            }
            mid.next = current.next;
            current = null;
        }
        return head;
     }

     public void traverseList( Node head ){
         Node current = head;
         System.out.println( current.data );
         HashMap hm = new HashMap();
         while( current.next != null ) {
             if( true == hm.containsKey( current.next ) ) {
                 System.out.println("loop exist at node " + current.next.data);
                 System.out.println("loop exist");
                 break;
             } else {
                 hm.put(current,current.data);
                 current = current.next;
                 System.out.println( current.data );
             }
         }
     }

     void createString( int n, int arrayLength ){
         /*int l = 0,m =0;
         while( l < n) {
             System.out.print(0);
             l++;
         }
         while( m < arrayLength - l) {
             System.out.print(1);
             m++;
         }
         createString(n-1, arrayLength);
         System.out.println("test");*/
         int l = 0,m =0;
         if( n <= 0 ){
             return;
         } else{
             while( l < n) {
                 System.out.print(0);
                 l++;
             }
             while( m < arrayLength - l) {
                 System.out.print(1);
                 m++;
             }
             System.out.println("");
             createString(n-1, arrayLength );
             System.out.println("");
             l=0;
             m=0;
             while( l < n) {
                 System.out.print(1);
                 l++;
             }
             while( m < arrayLength - l) {
                 System.out.print(0);
                 m++;
             }
         }
     }

     public void createBit( int n){
         if( n <= 0 ) {
             System.out.println(Arrays.toString(arr));
             return;
         } else {
             arr[n-1] = 0;
             createBit(n-1);
             arr[n-1] = 1;
             createBit(n-1);
         }
     }

     public static void main( String[] args ){
         CustomiseList ls = new CustomiseList();
         ls.head = ls.insertNode( ls.head, "first data",1);
         ls.head = ls.insertNode( ls.head, "second data",2 );
         ls.head = ls.insertNode( ls.head, "third data",3 );
         ls.head = ls.insertNode( ls.head, "forth data",4 );
         ls.head = ls.insertNode( ls.head, "fifth data",5 );
         ls.head.next.next.next.next.next = ls.head.next.next;
         ls.traverseList(ls.head);
        /* ls.head = ls.deleteNode(ls.head, 5 );
         System.out.println("===================================================");
         ls.traverseList(ls.head);*/
         /*ls.createBit(2);*/
     }
}
