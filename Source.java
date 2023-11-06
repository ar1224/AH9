import java.util.ArrayList;
import java.util.List;


class Node<T> {
    T val;
    Node<T> next;
    
    public Node(T val) {
      this.val = val;
      this.next = null;
    }
  }
  
  class Source {
    public static <T> Node<T> reverseList(Node<T> head) {
      // todo
      Node<T> prev = null;    
      Node<T> curr = head;
     
      while(curr != null){
        Node<T> next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
      }
      head = prev;     
      return head;
    }
    
    public static void main(String[] args) {
        Node<String> x = new Node<>("x");
        Node<String> y = new Node<>("y");              
        Node<String> z = new Node<>("z");

        x.next = y;
        y.next = z; // x -> y
    
        // reverseList(x); // y -> x

        // Printing solution
        Node<String> head = Source.reverseList(x);

        while (head != null) {
            System.out.println(head.val);
            head = head.next;            
        }
    }
  }