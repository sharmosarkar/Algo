
package linkedlist;

/**
 *
 * @author Sharmo
 */
public class LinkedList {

    /**
     * @param args the command line arguments
     */
    
    //public static Node head;
        
    public static void main(String[] args) {
        
        //head = new Node(0,null); 
        /*
        Node h = null;
        System.out.println("Starting !! ");
        LinkedList obj = new LinkedList();
        h =obj.addElement(10,h); 
        h = obj.addElement(20,h);
        h = obj.addElement(30,h);
        h = obj.addElement(40,h);
        h = obj.addElement(50,h);
        // Printing the list created
        obj.printList(h);*/
        AlgoAssgn1 obj = new AlgoAssgn1();
        obj.make2LinkedLists();
    }
    
    public void printList (Node h){
        //System.out.println("inside print element");
        System.out.println("Current Contents of the LinkedList are ::");
        Node tmpNode = h;
        while (tmpNode != null){
            System.out.print("  "+tmpNode.data+"\t");
            tmpNode = tmpNode.next;
        }
        System.out.println("");
        
    }
    
    // Returns head of the list
    public Node addElement (int d, Node h) { 
        //System.out.println("inside add element");
        Node newNode = new Node(d,null);
        if (h == null){
            h = newNode;
            return h;
        }
        else {
            Node tmpNode = h;
            while(tmpNode.next != null){
                tmpNode = tmpNode.next;    
            }
            tmpNode.next = newNode;    
            return h;
        }
    }
    
}
