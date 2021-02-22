package com.example.demo;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
class node
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
}


@Controller
public class HuffmanController {
	private String str;
	private String res;
	private HashMap<Character,Integer>map ;
	private HashMap<Character,String>resmap;
	private node root;

	/*String str = "";
	String res = "";
	HashMap<Character,Integer>map = new HashMap<>();
	HashMap<Character,String>resmap = new HashMap<>();
	node root = null;*/
	public HuffmanController()
	{
		str = "";
		res = "";
		map = new HashMap<>();
		resmap = new HashMap<>();
		root = null;
	}
	@RequestMapping("/hello")
	//public String encode_fun(HttpServletRequest req,Model m)
	public ModelAndView encode_fun(@RequestParam String name,Model m)
	//public String encode_fun(@RequestParam String name,Model m)
	//public String encode_fun(@RequestParam String name)
	{
		//str = hc.getStr();
		str = name;
		//str = req.getParameter("name");
		 //str = hc;
		map.clear();
		resmap.clear();
		/*root = null;*/
		//str = "";
		res="";
		 System.out.println(str+" the string");
		fillmap();
		System.out.println("after fill map");
		insert_inside();
		System.out.println("after inside");
		print(root,"");
		for(int i=0;i<str.length();i++)
		{
			String t = (String)resmap.get(str.charAt(i));
			res = res+t;
		}
		System.out.println(res);
		HuffmanCoding hc1 = new HuffmanCoding();
		hc1.setStr(str);
		HuffmanCoding hc2 = new HuffmanCoding();
		hc2.setStr(res);
		System.out.println(hc1.getStr()+" hc1 "+ str+" str" );
		System.out.println(hc2.getStr()+" hc2 "+ res+" res");
		//Model m = new Model();
		ModelAndView mv = new ModelAndView("Encode");
		mv.addObject( "hc1",hc1);
		mv.addObject("hc2",hc2 );
		mv.addObject("keymap",resmap);
		return mv;
		//mv.addObject( "hc1",str);
		//mv.addObject("hc2",res );
		//ModelAndView = new ModelAndView("Encode.jsp");
		//m.addAttribute("str", str);
		//m.addAttribute("res", res);
		//return "Encode";
		
	}
	void fillmap()
	{
		char arr[] = str.toCharArray();
		/*for(char a: arr)
		{
			System.out.println(a);
		}*/
		for(int i=0;i<arr.length;i++)
		{
			if(!map.containsKey(arr[i]))
			{
				map.put(arr[i], 0);
			}
			int val = (Integer)map.get(arr[i]);
			map.put(arr[i], val+1);
			
		}
		/*for(Map.Entry<Character, Integer>m : map.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}*/
		
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
		/*System.out.println("Priority q");
		Iterator iterator = q.iterator();
		 
        while (iterator.hasNext()) {
        	node n = (node)iterator.next();
        	System.out.println(n.data+"  "+n.symbol);
            //System.out.print(iterator.next() + " ");
        }*/
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
	void print(node r,String s)
	{
		//System.out.println("in print");
		if(r.left == null && r.right == null && Character.isLetter(r.symbol))
		{
			if(!resmap.containsKey(r.symbol))
			{
				resmap.put(r.symbol, "");
			}
			resmap.put(r.symbol, s);
			//System.out.println(s);
			return;
			
		}
		print(r.left,s+"0");
		print(r.right,s+"1");
		
	}

}
