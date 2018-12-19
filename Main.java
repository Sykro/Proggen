package edu.kit.informatik;

public class Main {

    
    public static void main(String[] args) {
        
        List sortedList = new List();
        
            boolean r = true;
            while (r == true) {
                String[] input = Terminal.readLine().split(" ");                
                switch(input[0]) {
                case "add" :
                    int number = Integer.parseInt(input[1]);
                    sortedList.add(number);
                    break;
                case "print" :
                    sortedList.print();
                    break;
                case "size" :
                    sortedList.size();
                    break;
                case "isEmpty" :
                    sortedList.isEmpty();
                    break;
                case "clear" :
                    sortedList.clear();
                    break;
                case "get" :
                    int index = Integer.parseInt(input[1]);
                    sortedList.get(index);
                    break;
                case "indexOf" :
                    int numberI = Integer.parseInt(input[1]);
                    sortedList.indexOf(numberI);
                    break;
                case "lastIndexOf" :
                    int numberL = Integer.parseInt(input[1]);
                    sortedList.lastIndexOf(numberL);
                    break;
                case "remove" :
                    int numberR = Integer.parseInt(input[1]);
                    sortedList.remove(numberR);
                    break;
                case "contains" :
                    int numberC = Integer.parseInt(input[1]);
                    sortedList.contains(numberC);
                    break;
                case "quit" :
                    r = false;
                    break;
                }
            }
                          
        
    }
    
}
