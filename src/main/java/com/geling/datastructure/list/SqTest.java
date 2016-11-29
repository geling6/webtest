package com.geling.datastructure.list;

public class SqTest {

	//合并线性表A，B:A=AUB
	public static void union(SqList<Integer> a,SqList<Integer> b){
		if(a==null || b == null){
			return;
		}
		int aLength = a.length;
		for(int i=1;i<=b.length;i++){
			Integer bb = b.get(i);
			if(a.location(bb) == 0){
				a.insert(++aLength, b.get(i));
			}
		}
	}
	//合并有序表A，B
	public static SqList<Integer> merge(SqList<Integer> a,SqList<Integer> b){
		if(a==null || b==null){
			return null;
		}
		SqList<Integer> c = new SqList<>();
		int i=1,j=1,cLen = c.length;
		while(i<=a.length && j<=b.length){
			if(a.get(i)<=b.get(j)){
				c.insert(++cLen, a.get(i));
				i++;
			}else{
				c.insert(++cLen, b.get(j));
				j++;
			}
		}
		while(i<=a.length){
			c.insert(++cLen, a.get(i));
			i++;
		}
		while(j<=b.length){
			c.insert(++cLen, b.get(j));
			j++;
		}
		return c;
	}
	public static void main(String[] args) {
		SqList<Integer> a = new SqList<>();
		a.insert(1, 3);
		a.insert(2, 5);
		a.insert(3, 8);
		a.insert(4, 11);
		
		SqList<Integer> b = new SqList<>();
		b.insert(1, 2);
		b.insert(2, 6);
		b.insert(3, 8);
		b.insert(4, 9);
		b.insert(5, 11);
		b.insert(6, 15);
		b.insert(7, 20);
		
		a.traverse();
		System.out.println();
		SqList<Integer> c = merge(a,b);
		System.out.println();
		c.traverse();
	}

}
