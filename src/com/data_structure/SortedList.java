package com.data_structure;

/**
 * Created by Shivani on 15-02-2018.
 */
public class SortedList extends CustomiseList {

    void insertSorted( int data ){
        Node current = this.head;
        int pos = 1;
        while( current.next != null ) {
          //  System.out.println( Integer.parseInt( current.data ) + "");
            if( data > Integer.parseInt( current.data ) && data < Integer.parseInt( current.next.data ) ) {
                break;
            }
            current = current.next;
            pos++;
        }
        System.out.println( "Inserted Position" + pos++ );
        this.head = insertNode( this.head, String.valueOf(data), pos);
    }

    public static void main(String[] args) {
        SortedList ls = new SortedList();
        ls.head = ls.insertNode( ls.head, "1",1);
        ls.head = ls.insertNode( ls.head, "2",2 );
        ls.head = ls.insertNode( ls.head, "3",3 );
        ls.head = ls.insertNode( ls.head, "5",4 );
        ls.head = ls.insertNode( ls.head, "10",5 );
        ls.traverseList(ls.head);
        ls.insertSorted(4);
        ls.insertSorted( 11 );
        ls.traverseList(ls.head);
    }
}
