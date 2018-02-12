package com.geling.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.geling.datastructure.list.stack.SqStack;

//二叉树
public class BiTree<T> {
	private BiTNode<T> root = null;//根结点
	//初始化
	public void createBiTree(BiTNode<T> nodes){
		root = nodes;
	}
	//递归前序遍历
	private void preOrderRecurse(BiTNode<T> root){
		//1.访问根结点
		if(root != null){
			System.out.print(root.data + ", ");
		}
		//2.访问左子树
		if(root.lchild != null){
			preOrderRecurse(root.lchild);
		}
		//3.访问右子树
		if(root.rchild != null){
			preOrderRecurse(root.rchild);
		}
	}
	public void preOrderTraverseRecurse(){
		preOrderRecurse(root);
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
	
	
	//递归中序遍历
	private void inOrderRecurse(BiTNode<T> root){
		if(root != null && root.lchild != null){
			inOrderRecurse(root.lchild);
		}
		if(root != null){
			System.out.print(root.data + ", ");
		}
		if(root!=null && root.rchild!=null){
			inOrderRecurse(root.rchild);
		}
	}
	public void inOrderTraverseRecurse(){
		inOrderRecurse(root);
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
	
	//按层遍历.使用一个队列，元素入队，出队时它的左右孩子入队
	public void traverseTree(BiTNode<String> tree){
		
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
		
		tree.preOrderTraverseRecurse();
		System.out.println();
		tree.inOrderTraverseRecurse();
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
