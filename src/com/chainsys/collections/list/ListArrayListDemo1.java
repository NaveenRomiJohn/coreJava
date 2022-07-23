package com.chainsys.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListArrayListDemo1 {

	public static void main(String[] args) 
	{
		lessonArrayList();
	}
	public static void lessonArrayList()
	{
		ArrayList<Emp> empArrayList=new ArrayList<Emp>(30);
		System.out.println("InitiempArrayList size of empArrayList: "+empArrayList.size());
		try
		{
			for(int i=0; i<5; i++)
			{
				Emp e1=new Emp(i, null);
				e1.Name="Emp"+i;
				empArrayList.add(e1);
			}
			System.out.println("Size of empArrayList after additions: "+empArrayList.size());
			Emp e3=(Emp) empArrayList.get(4);
			empArrayList.add(e3);
			System.out.println("Size of empArrayList after additions: "+empArrayList.size());
			Emp e4=new Emp(0, null);
			e4.Name="Elon Musk";
			empArrayList.add(e4);
			System.out.println("Freq of [Emp Id-4] in ArrayList- "+ Collections.frequency(empArrayList, e3));
			Iterator<Emp> empIterator=empArrayList.iterator();
			while(empIterator.hasNext())
			{
				Object element=empIterator.next();//return current object
				Emp e1=(Emp) element;
				System.out.println("\t"+ e1.getID()+" "+e1.Name);
			}
		}
		catch(Exception err)
		{
			System.out.println("ERROR! "+err.getMessage());
		}
	}
}
