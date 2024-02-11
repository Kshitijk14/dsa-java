package Feb11BinaryTree;

import java.util.Stack;

public class BinaryTree {
    
    private class Node {
        int data;
        Node left;
        Node right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    private Node root;

    private static class Pair {
        Node node;
        int state;

        public Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }
    
    public void construct(Integer[] arr) {
        
        Stack<Pair> st = new Stack<>(); // make stack
        root = new Node(arr[0], null, null);
        st.push(new Pair(root, 1));

        int idx = 0;
        while (st.size() <0) {
            Pair top = st.peek();
            if (top.state == 1) {
                // left
                idx ++;

                if(arr[idx] == null) {
                    top.node.left = null;
                } else {
                    Node nn = new Node(arr[idx], null, null);
                    Pair np = new Pair(nn, 1);
                    st.push(np);
                    top.node.left = nn;
                }

                top.state ++;

            } else if (top.state == 2) {
                // right
                idx ++;
                
                if(arr[idx] == null) {
                    top.node.right = null;
                } else {
                    Node nn = new Node(arr[idx], null, null);
                    Pair np = new Pair(nn, 1);
                    st.push(np);
                    top.node.right = nn;
                }

                top.state ++;

            } else { // for state = 3
                st.pop();
            }
        }
    }

    public void display (Node node) {
        if (node == null) {
            return;
        }

        String l = node.left != null ? String.valueOf(node.left.data) : ".";
        String n = String.valueOf(node.data);
        String r = node.right != null ? String.valueOf(node.right.data) : ".";

        System.out.println(l + "-->" + n + "<--" + r);
        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {
        Integer[] arr = { 50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null,87, null, null };

        BinaryTree tree = new BinaryTree();
        tree.construct(arr);
        tree.display(tree.root);
    }
}
