package linkedList;

public class intro {
    // Display----
    public static void display(Node temp) {
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    public static void displayRec(Node temp) {
        if(temp==null){
            return;
        }
        System.out.print(temp.val +" ");
        displayRec(temp.next);
    }

    public static void AtAnyIndex(Node temp, int idx) {
        while(idx >1){
            temp = temp.next;
            idx--;
        }
        System.out.println(temp.val);
    }
    
    public static void main(String[] args) {
        Node temp = linkmain.head;
        // displayRec(temp);
        // display(temp);
        AtAnyIndex(temp, 1);
    }
} 
