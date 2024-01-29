package Jan27LinkedList;

public class LinkedList {

    private class Node {
        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addLast(int data) {

        Node nn = new Node();
        nn.data = data;
        nn.next = null;

        if (size == 0) { // list is empty
            head = tail = nn;
        } else { // when there is something in the list
            tail.next = nn;
            tail = nn;
        }
        size ++;

    }

    public void addFirst(int data) {

        Node nn = new Node();
        nn.data = data;
        nn.next = null;

        if (size == 0) {
            head = tail = null;
        } else {
            nn.next = head;
            head = nn;
        }
        size ++;

    }

    public void removeFirst() {

        if (size == 0) {
            System.out.println("Can't remove from an empty list.");
        } else {
            Node nextNode = head.next;
            head.next = null;
            head = nextNode;
            size --;
        }

    }

    public void removeLast() {

        if (size == 0) {
            System.out.println("Can't remove from an empty list.");
        } else {
            Node temp = head;
            while(temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size --;
        }

    }
    
    Node getNodeAt(int idx) {

        if (idx < 0 || idx >= size) {
            System.out.println("Index out of bound");
            return null;
        } else if (idx == 0) {
            return head;
        } else if (idx == size - 1) {
            return tail;
        } else {
            Node temp = head;
            while (idx > 0) {
                temp = temp.next;
                idx --;
            }
            return temp;
        }

    }
    
    int getDataAtIdx(int idx) {
        
        if (idx < 0 || idx >= size) {
            System.out.println("Index out of bound");
            return -1;
        } else if (idx == 0) {
            return head.data;
        } else if (idx == size - 1) {
            return tail.data;
        } else {
            Node temp = head;
            while (idx > 0) {
                temp = temp.next;
                idx --;
            }
            return temp.data;
        }

    }

    public void addAt(int idx, int data) {
        
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid Index " + idx);
        } else if (idx == 0) {
            addFirst(data);
        } else if (idx == size - 1) {
            addLast(data);
        } else {
            // Node prev = head;
            // for (int i = 0; i < idx - 1; i++) {
            //     prev = prev.next;
            // }
            // nn.next = prev.next;
            // prev.next = nn;

            Node nn = new Node();
            nn.data = data;

            Node prev = getNodeAt(idx - 1);
            Node nextNode = prev.next;

            prev.next = nn;
            nn.next = nextNode;
        }
        size ++;
    }

    public void removeAt(int idx) {

        if (idx < 0 || idx >= size) {
            System.out.println("Invalid Index " + idx);
        } else if (idx == 0) {
            removeFirst();
        } else if (idx == size - 1) {
            removeLast();
        } else {
            // Node prev = head;
            // for (int i = 0; i < idx - 1; i++) {
            //     prev = prev.next;
            // }
            // prev.next = prev.next.next;

            Node prev = getNodeAt(idx - 1);
            Node current = prev.next;
            Node nextNode = current.next;

            prev.next = nextNode;
            current.next = null;
        }
        size --;
    }

    public int getMidNode1() { // when size is available

        Node mid = getNodeAt(size/2);
        return mid.data;
        
    }

    public int getMidNode2() { // when size isn't available

        Node slow = head;
        Node fast = head; 

        while (fast != null && fast.next != null) { // (odd && even)
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    // get kth node from end
    public void getKthNode() {
        
    }

    // remove kth node from end
    public void removeKthNode() {

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addLast(10);
        l1.addLast(20);
        l1.addLast(30);
        l1.addLast(40);
        l1.addLast(50);
        // l1.display();
        l1.addFirst(60);
        l1.display();
        System.out.println("***********************************************************");
        l1.removeFirst();
        l1.display();
        System.out.println("***********************************************************");
        l1.removeLast();
        l1.display();

        System.out.println("***********************************************************");
        System.out.println("Get Node At: " + l1.getNodeAt(2));
        System.out.println("Get index At: " + l1.getDataAtIdx(2));

        System.out.println("***********************************************************");
        l1.addAt(2, 60);
        l1.display();

        System.out.println("***********************************************************");
        l1.removeAt(3);
        l1.display();

        System.out.println("***********************************************************");
        System.out.println("Even: " + l1.getMidNode1());
        l1.addLast(70);
        l1.display();
        System.out.println("Odd: " + l1.getMidNode1());

        System.out.println("***********************************************************");
        System.out.println("Odd2: " + l1.getMidNode2());
        l1.addLast(80);
        l1.display();
        System.out.println("Even2: " + l1.getMidNode2());
    }

}