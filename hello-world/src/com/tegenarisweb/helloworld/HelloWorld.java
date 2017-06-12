package com.tegenarisweb.helloworld;

import java.util.List;

public class HelloWorld
{
	public HelloWorld(List<Integer> aList)
	{
		/*if(aList.get(0)> aList.get(1))
		{
			Integer element = aList.remove(0);
			System.out.println(element);
			aList.add(1,element);
		}
		else if (aList.get(1) > aList.get(2))
		{
			Integer element = aList.remove(1);
			System.out.println(element);
			aList.add(2,element);
		}*/
		
		boolean swapped = true;
		while (swapped == true)
		{
			swapped = iterateThroughNotSortedElements(aList);
		}
	}

	private boolean iterateThroughNotSortedElements(List<Integer> aList) {
		boolean swapped;
		swapped = false;
		for (int i=0; i<aList.size()-1;i++)
		{
			if(aList.get(i) > aList.get(i+1))
			//Swap
			{
				swapped = swapElements(aList, i);
			}
		}
		return swapped;
	}

	private boolean swapElements(List<Integer> aList, int i) {
		boolean swapped;
		Integer element = aList.remove(i);
		aList.add(i+1,element);
		swapped = true;
		return swapped;
	}
}
/*
public class HelloWorld {
	public static void main(String[] args){
		
		Map<String, List<String>> makeModel = new HashMap<String,List<String>>();
		
		List<String> honda = new ArrayList();
		honda.add("Civic");
		honda.add("Prelude");
		makeModel.put("Honda", honda);
		
		System.out.println(makeModel.get("Honda"));
		
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Tesat");
		
		for (String test : arrayList)
		{
			System.out.print(test);
		}
		System.out.println();
		char[] charArray = new char[5];
		charArray[0] = 'H';
		charArray[1] = 'E';
		charArray[2] = 'L';
		charArray[3] = 'L';
		charArray[4] = 'O';
		String test = "Test";
		
		for (int i=0;i<charArray.length; i++)
		{
			System.out.print(charArray[i]);		
		}
		
		System.out.println();
		
		//foreach
		
		for (char c : charArray)
		{
			System.out.print(c);	
		}
	}
}*/