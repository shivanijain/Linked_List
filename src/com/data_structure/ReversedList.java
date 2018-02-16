package com.data_structure;

/**
 * Created by Shivani on 16-02-2018.
 */
public class ReversedList extends CustomiseList {

    public void reverse(){
        int i = 0;
        int count = this.ListCount - 1;
        while( i < this.ListCount ) {
            Node current = this.head;
            int j=0;
            while( current.next != null && j < count){
                String temp = current.next.data;
                current.next.data = current.data;
                current.data = temp;
                current = current.next;
                j++;
            }
            i++;
            count--;
        }
        traverseList( this.head );
    }
    public static void main(String[] args) {
        ReversedList ls = new ReversedList();
        ls.head = ls.insertNode( ls.head, "1",1);
        ls.head = ls.insertNode( ls.head, "2",2 );
        ls.head = ls.insertNode( ls.head, "3",3 );
        ls.head = ls.insertNode( ls.head, "4",4 );
        ls.head = ls.insertNode( ls.head, "5",5 );
        ls.traverseList(ls.head);
        System.out.println("--------------" + ls.ListCount);
        ls.reverse();
    }
}
