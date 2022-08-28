import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/n-ary-tree-preorder-traversal/

/**
 * Node
 */
 class Node {
    public int val;
    public List<Node> children;
    public Node(){}
    
    public Node(int _val){
        val = _val;
    }

    public Node(int _val, List<Node> _children){
        val = _val;
        children = _children;
    }
}
public class nAryTraversal {
    public List<Integer> preorder(Node root) {
       List<Integer> res = new ArrayList<>();
       System.out.println(res.get(0));
       return res;
    }

    public static void main(String[] args){
        nAryTraversal nat = new nAryTraversal();
        Node root = new Node(1);
    
    }
}
