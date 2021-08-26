package com.ds.trees.demos;
//Practice examples
public class BinaryTreeDemo1 {

    Node root;
    public BinaryTreeDemo1(){
        root=null;
    }
    public BinaryTreeDemo1(int key){
        root=new Node(key);
    }
    public static void main(String[] args) {
    BinaryTreeDemo1 binaryTreeDemo1=new BinaryTreeDemo1();
    /* following is the tree after above statement

              1
            /   \
          null  null     */

        binaryTreeDemo1.root=new Node(1);
           /* 2 and 3 become left and right children of 1
               1
            /     \
          2        3
        /   \     /  \
      null null null null  */
        binaryTreeDemo1.root.left=new Node(2);
        binaryTreeDemo1.root.right=new Node(3);

         /* 4 becomes left child of 2
                    1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          null null
         */
        binaryTreeDemo1.root.left.left=new Node(5);

    }
}

class Node{
    int key;
    Node left,right;
    public  Node(int item){
        key=item;
        left=right=null;
    }
}