package com.tegenarisweb.helloworld;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

//Verify(mock) - just put mocked ocject, then put dot, and you will have access
//to the elements  that are represented with a mock object.
//verify(session).save(methods from the mock class)

public class Tests 
{
	//System under Test - what's the actual Unit.
	HelloWorld sut;
	@Test
	public void should_accept_list_of_integers_into_constructor()
	{
		List<Integer> aList = new ArrayList<Integer>();
		aList.add(2);
		sut = new HelloWorld(aList);
	}
	
	@Test
	public void should_sort_list_of_two_integers_in_ascending_order ()
	{
		//Arrange
		List<Integer> aList = new ArrayList<Integer>();
		aList.add(4);
		aList.add(1);
		
		//Act
		sut = new HelloWorld(aList);
		
		//Assert
		assertThat(aList.get(0),is(1));
		assertThat(aList.get(1),is(4));
		
	}
	@Test
	public void should_sort_list_of_two_integers_in_ascending_order_2 ()
	{
		//Arrange
		List<Integer> aList = new ArrayList<Integer>();
		aList.add(156);
		aList.add(89);
		
		//Act
		sut = new HelloWorld(aList);
		
		//Assert
		assertThat(aList.get(0),is(89));
		assertThat(aList.get(1),is(156));
		
	}
	@Test
	public void should_sort_list_of_two_integers_in_ascending_order_3 ()
	{
		//Arrange
		List<Integer> aList = new ArrayList<Integer>();
		aList.add(832);
		aList.add(156);
		aList.add(89);
		
		//Act
		sut = new HelloWorld(aList);
		System.out.println(aList);
		//Assert
		assertThat(aList.get(0),is(89));
		assertThat(aList.get(1),is(156));
		assertThat(aList.get(2),is(832));
		
	}
}