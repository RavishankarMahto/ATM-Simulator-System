package LinkedList;

public class basic {
    public static void displayr(Node head) {
        if(head==null) return;
        displayr(head.next);
        System.out.print(head.data+" "); // print all the nodes in reverse order
    }
    public static void display(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }

        public static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }
        public static void main(String[] args) {
            Node a = new Node(5); // head node
            Node b = new Node(3);
            Node c = new Node(9);
            Node d = new Node(8);
            Node e = new Node(16);

//        5 - 3 - 9 - 8 - 16

//        a.next = b;
//        System.out.println(a);      //Node@6acbcfc0
//        System.out.println(a.next); //Node@5f184fc6 both are same
//        System.out.println(b);      //Node@5f184fc6 both are same
//        System.out.println(c);      //Node@3feba861

//            System.out.println(b.data);  // 5 -> 3 - 9 - 8 - 16

            a.next = b;  // 5 -> 3 9 8 16
            b.next = c;  // 5 -> 3 -> 9 8 16
            c.next = d;  // 5 -> 3 -> 9 -> 8 16
            d.next = e;  // 5 -> 3 -> 9 -> 8 -> 16

//            System.out.println(a.data);
//            System.out.println(b.data);
//            System.out.println(c.data);
//            System.out.println(d.data);
//            System.out.println(e.data);

//            System.out.println(a.data);
//            System.out.println(a.next.data);
//            System.out.println(a.next.next.data);
//            System.out.println(a.next.next.next.data);
//            System.out.println(a.next.next.next.next.data);


//            Node temp = a;
//            for(int i = 1; i <= 5; i++) {
//                System.out.println(temp.data);
//                temp = temp.next;
//            }

//            Node temp = a;
//            while(temp != null) {  // printing the list
//                System.out.println(temp.data+" ");
//                temp = temp.next;
//            }

//            display(a);
//            System.out.println(); two times printing the output
            displayr(a); //display recursive function
            System.out.println();
            display(a);  // display function













        }
}
