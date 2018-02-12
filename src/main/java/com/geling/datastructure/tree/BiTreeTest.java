package com.geling.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BiTreeTest {

	
	public static void traverseTree(BiTNode<String> tree){
		
		if(tree == null){
			return;
		}
		
		Queue<BiTNode<String>> queue = new LinkedList<>();
		queue.add(tree);
		while(!queue.isEmpty()){
			BiTNode<String> node = queue.peek();
			if(node.lchild != null){
				queue.add(node.lchild);
			}
			if(node.rchild != null){
				queue.add(node.rchild);
			}
			System.out.println(node.data);
			queue.poll();
		}
		
	}
	
	public static void main(String[] args) {
		BiTNode<String> node1 = new BiTNode<>("-");
		BiTNode<String> node2 = new BiTNode<>("+");
		BiTNode<String> node3 = new BiTNode<>("a");
		BiTNode<String> node4 = new BiTNode<>("*");
		BiTNode<String> node5 = new BiTNode<>("b");
		BiTNode<String> node6 = new BiTNode<>("-");
		BiTNode<String> node7 = new BiTNode<>("c");
		BiTNode<String> node8 = new BiTNode<>("d");
		BiTNode<String> node9 = new BiTNode<>("/");
		BiTNode<String> node10 = new BiTNode<>("e");
		BiTNode<String> node11 = new BiTNode<>("f");
	
		node1.lchild = node2;
		node2.lchild = node3;
		node2.rchild = node4;
		node4.lchild = node5;
		node4.rchild = node6;
		node6.lchild = node7;
		node6.rchild = node8;
		
		node1.rchild = node9;
		node9.lchild = node10;
		node9.rchild = node11;
		
		traverseTree(node1);
		
	}

}
