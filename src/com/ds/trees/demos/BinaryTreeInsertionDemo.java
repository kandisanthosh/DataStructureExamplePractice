package com.ds.trees.demos;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeInsertionDemo {

   static class TreeNode{
       int key;
       TreeNode  left,right;
       TreeNode(int data){
           this.key=data;
           left=null;
           right=null;
       }
    }
    static TreeNode root;
    static  TreeNode temp = root;

    // inorder traversal of binary tree
    public static void inorder(TreeNode temp){

        if(temp==null)
         return;

        inorder(temp.left);
        System.out.print(temp.key + " ");
        inorder(temp.right);
    }
    // function to insert a element in binary tree
    public static void insertElement(TreeNode temp, int key){

        if(temp==null){
            temp=new TreeNode(key);
            return;
        }
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(temp);

        //Do level order traversal un till we find an empty place.

        while (!q.isEmpty()){
            temp=q.peek();
            q.remove();

            if(temp.left==null){
                temp.left=new TreeNode(key);
                break;
            }else{
                q.add(temp.left);
            }
            if(temp.right==null){
                temp.right=new TreeNode(key);
                break;
            }else{
                q.add(temp.right);
            }
        }
    }
    public static void main(String[] args) {
        root=new TreeNode(10);
        root.left=new TreeNode(11);
        root.left.left=new TreeNode(12);
        root.right=new TreeNode(13);
        root.right.left=new TreeNode(14);
        root.right.right=new TreeNode(15);

        inorder(root);
        int key = 12;
        insertElement(root, key);
        System.out.print("\nInorder traversal after insertion:");
        inorder(root);
    }
}
