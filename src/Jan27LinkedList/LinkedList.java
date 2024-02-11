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

    public Node getMidNode2() { // when size isn't available

        Node slow = head;
        Node fast = head; 

        while (fast != null && fast.next != null) { // (odd && even)
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // get kth node from end
    public Node getKthNode(int k) {
        
        
        
        return head;
    }

    // remove kth node from end
    public void removeKthNode() {

    }

    // reverse a LinkedList using pointers exchange
    public Node reverse(Node node) {

        if (node == null) {
            return null;
        }
        
        Node prev = null;
        Node curr = node;

        while (curr != null) {
            Node fwd = curr.next;
            curr.next = prev;

            prev = curr;
            curr = fwd;
        }

        return prev;
    }

    // check if the Linked list is palindrome
    public boolean isPalindrome() {
        
        if (head == null || head.next == null) {
            return true;
        }
        
        Node middle = getMidNode2();
        
        Node secondHalf = reverse(middle.next);
        
        Node firstHalf = head;

        while (secondHalf != null) {

            if (firstHalf.data != secondHalf.data) {
                return false;
            }

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        
        return true;
    }

    public boolean isPalindrom2() {
        return true;

        
    }

    // add 2 number in a Linked list
    public Node add2Num(Node l1, Node l2) { 

        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        Node dummyNode = new Node();
        dummyNode.data = -1;
        Node itr = dummyNode;
        Node c1 = l1;
        Node c2 = l2;
        int carry = 0;

        while (c1 != null || c2 != null || carry != 0) { // condition
            // sum ?
            int sum = carry + (c1 != null ? c1.data:0) + (c2 != null ? c2.data:0);
            // res ?
            int res = sum % 10;
            // carry ?
            carry = sum / 10;
            // new node ?
            Node newNode = new Node();
            newNode.data = res;
            itr.next = newNode;
            itr = newNode;
            
            if (c1 != null) {
                c1 = c1.next;
            }
            if (c2 != null) {
                c2 = c2.next;
            }
        }

        return dummyNode.next;
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

        System.out.println("***********************************************************");
        // System.out.println(l1.getKthNode(3));

        System.out.println("***********************************************************");
        l1.head = l1.reverse(l1.head);
        System.out.println("The reversed LL: ");
        l1.display();

        System.out.println("***********************************************************");
        l1.display();
        System.out.println(l1.isPalindrome());
    }

}