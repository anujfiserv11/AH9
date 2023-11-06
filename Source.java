import java.util.ArrayList;

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
     ArrayList<Node<T>> nodes = new ArrayList<Node<T>>();
     Node<T> node = head;
     while(node != null)
     {
      nodes.add(node);
      
      node = node.next;
     }
     
     head = nodes.get(nodes.size()-1);
     node = head;
     
     for(int i = nodes.size()-1; i>0;i--)
     {
        node.next = nodes.get(i-1);
        
        node = node.next;
       
        
        
       
     }
     node.next = null;

      return head;
    }
  
  
    
    public static void main(String[] args) {
      //   Node<String> x = new Node<>("x");
      //   Node<String> y = new Node<>("y");
    
      //   x.next = y; // x -> y
    
      //  //reverseList(x); // y -> x
     
      //   // Printing solution
      //   Node<String> head = Source.reverseList(x);
      Node<String> a = new Node<>("a");
Node<String> b = new Node<>("b");
Node<String> c = new Node<>("c");
Node<String> d = new Node<>("d");
Node<String> e = new Node<>("e");
Node<String> f = new Node<>("f");

a.next = b;
b.next = c;
c.next = d;
d.next = e;
e.next = f;
// a -> b -> c -> d -> e -> f

Node<String> head = reverseList(a);
        
        while (head != null) {
           System.out.println(head.val);
            head = head.next;            
        }
    }
  }