package edu.kit.informatik;

public class List {
    ListCell head;    
    
    /* 
     * adds a number at the correct spot into the sorted list
     */
    public void add(int number) {
        ListCell newCell = new ListCell(number);
        ListCell active = head;
        if (head == null ) {
        head = newCell;
        } else {
            if (number > active.content) { 
                while (number > active.content) {
                    if (active.hasNext() && number > active.next.content) {
                        active = active.next;
                        }
                    else { 
                        break;
                    }
            }
                ListCell cache = active.next;
                active.next = newCell;
                newCell.next = cache;

            }
            else {
                head = newCell;
                newCell.next = active;
                
            }
        }
    }
    /*
     * prints out the current list
     */
    public void print() {
        String pri = "[";
        ListCell active = head;
        while (active != null) {
            pri = pri + active.content;
            if (active.hasNext()) {
                pri = pri + ",";
            }
            active = active.next;
        }
        pri = pri + "]";
        Terminal.printLine(pri);
    }
    /*
     * prints out the size of the list
     */
    public void size() {
        int size = 0;
        ListCell active = head;
        while (active != null) {
            size = size + 1;
            active = active.next;
        }
        Terminal.printLine(size);
    }
    
    public void isEmpty() {
        boolean b = false;
        if (head == null) {
            b = true;
        }
        Terminal.printLine(b);
        }
    
    public void clear() {
        head = null;
    }
    
    public void get(int n) {
        ListCell active = head;
        for (int i = 0; i < n; i++) {
            active = active.next;
        }
        Terminal.printLine(active.content);
        
            
    }
    
    public void indexOf(int n) {
        ListCell active = head;
        int i = 0;
        if (head != null) {
            while (active.content != n) {
                if (active.next == null) {
                    i = -1;
                    break;
                }
                active = active.next;
                i++;
            }
        }
        else {
            i = -1;
        }
        Terminal.printLine(i);
        
    }
    
    public void lastIndexOf(int n) {
        ListCell active = head;
        int i = 0;
        if (head != null) {            
           while (active.content != n) {
                if (active.next == null) {
                    i = -1;
                    break;
                }
                active = active.next;
                i++;            
            }
            while (active.hasNext() && active.next.content == n) {
                active = active.next;
                i++;
            }
        }
        else {
            i = -1;
        }
        Terminal.printLine(i);
    }
    
    public void remove(int n) {
        ListCell active = head;
        boolean b = false;
        if (head != null) {
            if (head.content != n) {
                while (active.content != n) {
                    if (active.next == null) {
                        break;
                    }
                    else if (active.next.content == n) {
                        ListCell delete = active.next;
                        active.next = delete.next;
                        b = true;
                        break;
                    }
                    active = active.next;
                }
            }
            else {
                head = head.next;
                b = true;
            }
        }
        Terminal.printLine(b);
    }
    
    public void contains(int n) {
            ListCell active = head;
            boolean b = true;
            if (head != null) {
                while (active.content != n) {
                    if (active.next == null) {
                        b = false;
                        break;
                    }
                    active = active.next;
                    
                }
            }

            Terminal.printLine(b);
        
    }
}



