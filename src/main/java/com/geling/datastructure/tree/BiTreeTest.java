package com.geling.datastructure.tree;

import com.geling.datastructure.list.stack.SqStack;


public class BiTreeTest {

	
	public static void traverseTree(BiTNode<String> tree){
		
		if(tree == null){
			return;
		}
		
		SqStack<BiTNode<String>> stack = new SqStack<>();
		stack.push(tree);
		
		while(stack.isNotEmpty()){
			BiTNode<String> p = null;
			while((p=stack.getElem()) != null){
				stack.push(p.lchild);
			}
			
			p = stack.pop();
			
			if(stack.isNotEmpty()){
				p = stack.pop();
				System.out.println(p.data);
				stack.push(p.rchild);
			}
		}
		
		
	}
	
	public static int deepTree(BiTNode<String> tree){
		if(tree == null){
			return 0;
		}
		/*if(tree.lchild ==null && tree.rchild ==null){
			return 1;
		}*/
		int lDeep = deepTree(tree.lchild);
		int rDeep = deepTree(tree.rchild);
		
		return lDeep>=rDeep ? lDeep+1 : rDeep+1;
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
		
		//traverseTree(node1);
		
		
		System.out.println(deepTree(node1));
	}

}
