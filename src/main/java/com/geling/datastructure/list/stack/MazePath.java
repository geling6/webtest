package com.geling.datastructure.list.stack;

/*
 * 迷宫问题
 */
public class MazePath {
	Twinplet[][] maze = new Twinplet[9][9];
	
	//初始化"墙"
	
	//
	public void path(Twinplet begin, Twinplet end){
		SqStack<Twinplet> stack = new SqStack<>();
		Twinplet current = begin;
		do{
			//如果是"墙",当前位置
			if(current.isWall){
				
			}else{
				if(!current.isIn){
					stack.push(current);
					current.isIn = true;
					current = new Twinplet(current.i+1,current.j);					
				}
			}
		}while(begin.i!=end.i && begin.j!=end.j);
	}
	
}

class Twinplet{
	int i;
	int j;
	boolean isWall;
	boolean isIn;
	private Twinplet from;
	private Twinplet[] passed;
	public Twinplet(int i,int j){
		this.i = i;
		this.j = j;
	}
	
	public Twinplet next(){
		int nextI = i+1;
		if(nextI==from.i && j==from.j){
			
		}
		
		return null;
	}
	public String toString(){
		System.out.println();
		return "i = " + i + ", j = " + j;
	}
}