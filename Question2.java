public class Question2 {
    public static class Node {
        int value;
        Node next;
        
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    
    public static void deleteNode(Node n) {
        if (head == nodeToDelete) {
            // If the head node is to be deleted, we just assign head to next node
            return head.next;
        }
        if (n == null || n.next == null) {
        
            return;
        }
        
        Node nextNode = n.next;
        n.value = nextNode.value;
        n.next = nextNode.next;
    }
}
// O(1) complexity as just assigning is taking place.
