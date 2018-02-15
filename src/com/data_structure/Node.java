package com.data_structure;

/**
 * Created by Shivani on 11-02-2018.
 */
public class Node {
    String data;
    Node next = null;
}


abstract class LinkedList {
    abstract Node insertNode( Node head, String data, int Position );
    abstract Node deleteNode( Node head, int Position );
}