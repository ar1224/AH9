class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class ECSource {
  public static <T> boolean isUnivalueList(Node<T> head) {
    // todo
    Node<T> curr = head; 
    if (curr.val != curr.next.val){
      return false;
    }
    return true;
  }

  public static void main(String[] args) {

      Node<Integer> u = new Node<>(2);
      Node<Integer> v = new Node<>(2);
      Node<Integer> w = new Node<>(3);
      Node<Integer> x = new Node<>(3);
      Node<Integer> y = new Node<>(2);
      
      u.next = v;
      v.next = w;
      w.next = x;
      x.next = y;
      
      // 2 -> 2 -> 3 -> 3 -> 2
      
      Source.isUnivalueList(u); // false
    }
}
