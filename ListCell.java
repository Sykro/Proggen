package edu.kit.informatik;

public class ListCell {
    int content;
    ListCell next;
        
    ListCell(int number) {
        this.content = number;
        this.next = null;
        
    }
    boolean hasNext() {
        boolean b = false;
        if (this.next != null) {
            b = true;
        }
        
        return b;
            
        }
            
        
    }

