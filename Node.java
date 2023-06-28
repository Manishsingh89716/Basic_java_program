public class Node{
    Node left, right;
    int data;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

class Inorder{
    Node root;
    Inorder(){
        root = null;
    }

    public void inorder(Node ptr){
        if(ptr == null)
            return;

        inorder(ptr.left);
        System.out.println(ptr.data);
        inorder(ptr.right);
    }
}

class Main{
    public static void main(String[] args){
        Inorder t = new Inorder();
        t.root = new Node(1);
        t.root.left = new Node(2);
        t.root.right = new Node(3);
        t.inorder(t.root);
    }
}
