package com.sjsu.sanaz;

import java.util.HashMap;

/**
 * Created by sanazk on 10/11/18.
 */
public class LRUCache {
    int maxSizeCapacity;
    HashMap<Integer, LinkedListNode> map = new HashMap<>();
    LinkedListNode head = null;
    LinkedListNode tail = null;

    public LRUCache(int size){
        maxSizeCapacity = size;
    }

    private static class LinkedListNode{
        LinkedListNode next = null;
        LinkedListNode previous = null;
        int key;
        String value;

        public LinkedListNode(int k, String v){
            key = k;
            value = v;
        }

    }

    void removeFromLinkedList(LinkedListNode node){
        if(node == null){
            return;
        }

        if(node == head){
            head = node.next;
        }
        if(node == tail){
            tail = node.previous;
        }
        if(node.previous != null){
            node.previous.next = node.next;
        }
        if(node.next != null){
            node.next.previous = node.previous;
        }
    }

    void insertAtFront(LinkedListNode node){
        if(head == null){
            head = node;
            tail = node;
        }else{
            head.previous = node;
            node.next = head;
            head = node;
        }
    }

    String getValue(int key){
        LinkedListNode item = map.get(key);
        if(item == null){
            return null;
        }
        if(item != head){
            removeFromLinkedList(item);
            insertAtFront(item);
        }
        return item.value;
    }

    boolean removeKey(int key){
        LinkedListNode item = map.get(key);
        removeFromLinkedList(item);
        map.remove(key);
        return true;
    }

    void keyValuePair(int key, String value){
        // Remove if already exists
        removeKey(key);

        if(map.size() >= maxSizeCapacity && tail != null){
            removeKey(tail.key);
        }

        LinkedListNode newNode = new LinkedListNode(key, value);
        insertAtFront(newNode);
        map.put(key, newNode);
    }

}
