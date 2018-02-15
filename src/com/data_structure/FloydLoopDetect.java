package com.data_structure;

/**
 * Created by Shivani on 15-02-2018.
 */
public class FloydLoopDetect extends CustomiseList {

    private void loopDetect(){
        Node slowptr = this.head;
        Node fastptr = this.head.next;
        boolean loopExist = false;
        while( slowptr != null && fastptr != null && fastptr.next != null ){
            if( slowptr == fastptr ) {
                loopExist = true;
                System.out.println("floyd loop detect");
                break;
            }
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        if( true == loopExist ) {
            slowptr = this.head;
            while( slowptr!= fastptr.next ){
                slowptr = slowptr.next;
                fastptr = fastptr.next;
            }
            System.out.println(loopExist);
            System.out.print( "loop exist at " + slowptr.data );
        }
    }

    public static void main(String[] args) {
        FloydLoopDetect ls = new FloydLoopDetect();
        ls.head = ls.insertNode( ls.head, "first data",1);
        ls.head = ls.insertNode( ls.head, "second data",2 );
        ls.head = ls.insertNode( ls.head, "third data",3 );
        ls.head = ls.insertNode( ls.head, "forth data",4 );
        ls.head = ls.insertNode( ls.head, "fifth data",5 );
        ls.head.next.next.next.next.next = ls.head.next.next.next;
        ls.traverseList(ls.head);
        ls.loopDetect();
    }
}
