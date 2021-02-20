package com.example.demo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*class node
{
	int data;
	char symbol;
	node left,right;
	node()
	{
		left = right=null;
	}
}
class Mycompare implements Comparator<node>
{
	public int compare(node x,node y)
	{
		return x.data - y.data;
	}
}*/
public class CreateEncode {
	String str = "";
	String res = "";
	HashMap<Character,Integer>map = new HashMap<>();
	node root = null;
	public CreateEncode(String s) {
		this.str = str;
	}
	void fillmap()
	{
		char arr[] = str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i], 0);
			}
			int val = (Integer)map.get(arr[i]);
			map.put(arr[i], val+1);
			
		}
		
	}
	void insert_inside()
	{
		PriorityQueue<node> q= new PriorityQueue<>(map.size(), new Mycompare());
		for(Map.Entry<Character, Integer>m : map.entrySet())
		{
			char key = (Character)m.getKey();
			int val = (Integer)m.getValue();
			node n = new node();
			n.data = val;
			n.symbol = key;
			n.left = n.right = null;
			q.add(n);
		}
		while(q.size()>1)
		{
			node n1 = q.remove();
			node n2 = q.remove();
			node n  = new node();
			n.data = n1.data+n2.data;
			n.symbol = '-';
			n.left = n1;
			n.right = n2;
			root = n;
			q.add(n);
			
		}
		
		
	}
	

}
