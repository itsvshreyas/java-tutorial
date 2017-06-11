package com.tegenarisweb.supersorter;

import java.util.List;



public class SuperSorter {

	public SuperSorter(List<Integer> aList)
	{
		boolean swapper = true;
		while (swapper == true)
		{
			swapper = false;
			for (int i  = 0; i < aList.size() -1; i++)	
			{
				if (aList.get(i) < aList.get(i+1))
				{
					Integer element = aList.remove(i);
					aList.add(i+1,element);
					swapper = true;
				}
			}
		}
	}
}
