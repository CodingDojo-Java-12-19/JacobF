public class DLL {
    public Node tail;
    public Node head;
    
    public DLL() {
        this.head = null;
        this.tail = null;
    }

    public void push(Node newNode) {
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node lastNode = this.tail;
            lastNode.next = newNode;
            newNode.previous = lastNode;
            this.tail = newNode;
        }
    }

    public Node pop() {
        if(this.tail == null) {
            throw new Error("List is empty");
        } else {
            Node lastNode = this.tail;
            Node newLastNode = lastNode.previous;
            newLastNode.next = null;
            this.tail = newLastNode;
            lastNode.next = null;
            lastNode.previous = null;
            return newLastNode;
        }
    }

    public void printValuesForward() {
        Node runner = this.head;

        while(runner != null) {
            System.out.println(runner.value);
            runner = runner.next;
        }
    }

    public void printValuesBackwards() {
        Node runner = this.tail;
        while(runner != null) {
            System.out.println(runner.value);
            runner = runner.previous;
        }
    }

    public boolean contains(Integer val) {
        Node runner = this.head;

        while(runner != null) {
            if (runner.value == val) {
                return true;
            }
            runner = runner.next;
        }
        return false;
    }

    public int size() {
        int count = 0;
        Node runner = this.head;
        
        while(runner != null) {
            count++;
            runner = runner.next;
        }
        return count;
    }
}