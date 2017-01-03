package com.geling.datastructure.tree;

import com.geling.datastructure.list.stack.SqStack;

//二叉树
public class BiTree<T> {
	private BiTNode<T> root = null;//根结点
	//初始化
	public void createBiTree(BiTNode<T> nodes){
		root = nodes;
	}
	//前序遍历
	public void preOrderTraverse(){
		SqStack<BiTNode<T>> stack = new SqStack<>();
		stack.push(root);
		while(!stack.isEmpty()){
			BiTNode<T> p = null;
			while((p=stack.getElem()) != null){
				System.out.println(p.data);
				stack.push(p.lchild);
			}
			p = stack.pop();
			if(!stack.isEmpty()){
				p = stack.pop();
				stack.push(p.rchild);
			}
		}
		
	}
	//中序遍历
	public void inOrderTraverse(){
		SqStack<BiTNode<T>> stack = new SqStack<>();
		stack.push(root);
		while(!stack.isEmpty()){
			BiTNode<T> p = null;
			while((p=stack.getElem()) != null){
				stack.push(p.lchild);
			}
			p = stack.pop();
			if(!stack.isEmpty()){
				p = stack.pop();
				System.out.println(p.data);
				stack.push(p.rchild);
			}
		}
	}
	public void inOrderTraverse2(){
		SqStack<BiTNode<T>> stack = new SqStack<>();
		BiTNode<T> p = root;
		while(p!=null || !stack.isEmpty()){
			if(p!=null){
				stack.push(p);
				p = p.lchild;
			}else{
				p = stack.pop();
				System.out.println(p.data);
				p = p.rchild;
			}
		}
	}
	//后序遍历
	public void postOrdereTraverse(){
	}
	public static void main(String[]args){
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
		
		BiTree<String> tree = new BiTree<>();
		tree.createBiTree(node1);
		
		tree.inOrderTraverse2();
	}
}
class BiTNode<T>{
	T data;
	BiTNode<T> lchild,rchild;
	public BiTNode(){
		
	}
	public BiTNode(T data){
		this.data = data;
	}
}
