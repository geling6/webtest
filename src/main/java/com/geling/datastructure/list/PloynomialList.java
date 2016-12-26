package com.geling.datastructure.list;

import com.geling.datastructure.ParamErrorException;

/**
 * @author geling
 * @date 2016年12月24日
 * @desc 多项式实现
 */
public class PloynomialList {
	
	Ploynomial head = new Ploynomial();
	//新建
	public void createPloy(){
		
	}
	//销毁
	public void destroyPloyn(){
		head = null;
	}
	//删除节点
	public void delPloy(Ploynomial ploy){
		Ploynomial p = head.next;
		while(p != ploy){
			p = p.next;
		}
		p.next = ploy.next;
	}
	//打印
	public String printPloy(){
		Ploynomial p = head.next;
		String nodeStr = "";
		while(p!=null){
			nodeStr += "+" + p.toString();
			p = p.next;
		}
		return "y = " + nodeStr;
	}
	//相加
	public void addPloyn(PloynomialList pl){
		Ploynomial p = head.next,q = pl.head.next;
		while(p!=null && q!=null){
			switch(p.compare(q)){
				case -1 : {
					p = p.next;
					break;
				}
				case 0 : {
					int newCoef = p.coef + q.coef;
					if(newCoef != 0){
						p.coef = newCoef;
						p = p.next;
					}else{
						delPloy(p);
					}
					q = q.next;
					break;
				}
				case 1 : {
					
					p = p.next;
					break;
				}
			}
		}
	}
	//相减
	public void subtractPoly(PloynomialList pl){
		
	}
	
	public static void main(String[] args) {
		PloynomialList ploy = new PloynomialList();
		Ploynomial node1 = new Ploynomial(7,0);
		Ploynomial node2 = new Ploynomial(3,1);
		Ploynomial node3 = new Ploynomial(9,8);
		Ploynomial node4 = new Ploynomial(5,17);
		Ploynomial node5 = new Ploynomial(8,1);
		Ploynomial node6 = new Ploynomial(22,7);
		Ploynomial node7 = new Ploynomial(-9,8);
		
		ploy.head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		PloynomialList b = new PloynomialList();
		b.head.next = node5;
		node5.next = node6;
		node6.next = node7;
		ploy.addPloyn(b);
		System.out.println(ploy.printPloy());
	}
	
}
class Ploynomial{
	int coef;//系数
	int expn;//指数
	Ploynomial next;
	public Ploynomial(){
	}
	public Ploynomial(int coef,int expn){
		this.coef = coef;
		this.expn = expn;
	}
	public int compare(Ploynomial ploy){
		if(ploy == null)
			throw new ParamErrorException("参数错误");
		if(expn < ploy.expn){
			return -1;
		}else if(expn > ploy.expn){
			return 1;
		}else{
			return 0;
		}
	}
	public String toString(){
		if(expn == 0)return coef + "";
		String coefStr = (coef < 0) ? "(-" + coef + ")" : coef + ""; 
		return coefStr + "X^" + expn ;
	}
}
