public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = this.head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }   
    public void remove() {
        Node runner = this.head;
        while(runner.next.next != null) {
            runner = runner.next;
        }
        System.out.println("Removing this node value " + runner.next.value);
        runner.next = null;
    }
    public void printValues() {
        Node runner = this.head;
        System.out.println("Printing Values of SLL");
        while (runner != null) {
            System.out.println(runner.value);
            runner = runner.next;
        }
    }
}