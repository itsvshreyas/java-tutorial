package com.tegenarisweb.supersorter;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Tests {

	SuperSorter sut;
	Super dao = mock(Super.class);
	@Test
	public void should_accept_list_as_param()
	{
		List<Integer> sorter = new ArrayList<Integer>();
		sut = new SuperSorter(sorter);
	}
	
	@Test
	public void should_return_true_if_password_match()
	{
		when(dao.validatePassword()).thenReturn(true);
		
		boolean test = dao.validatePassword();
		assertThat(test, is(true));
	}
	
	@Test
	public void should_sort_numbers_decreasingly_fail()
	{
		List<Integer> sorter = new ArrayList<Integer>();
		sorter.add(1);
		sorter.add(3);
		sut = new SuperSorter(sorter);
		
		assertThat(sorter.get(0), is(3));
		assertThat(sorter.get(1), is(1));
		

	}
	
	@Test
	public void should_sort_numbers_decreasingly_pass()
	{
		List<Integer> sorter = new ArrayList<Integer>();
		sorter.add(3);
		sorter.add(1);
		sut = new SuperSorter(sorter);
		
		assertThat(sorter.get(0), is(3));
		assertThat(sorter.get(1), is(1));
	}
	
	@Test
	public void should_sort_numbers_decreasingly_fail_2()
	{
		List<Integer> sorter = new ArrayList<Integer>();
		sorter.add(13);
		sorter.add(133);
		sut = new SuperSorter(sorter);
		
		assertThat(sorter.get(0), is(133));
		assertThat(sorter.get(1), is(13));
	}
	
	@Test
	public void should_sort_numbers_decreasingly_pass_2()
	{
		List<Integer> sorter = new ArrayList<Integer>();
		sorter.add(3);
		sorter.add(1);
		sorter.add(45);
		sorter.add(88);
		sorter.add(100);
		sut = new SuperSorter(sorter);

		System.out.println(sorter);
		
		assertThat(sorter.get(0), is(100));
		assertThat(sorter.get(1), is(88));
		assertThat(sorter.get(4), is(1));
		assertThat(sorter.get(2), is(45));
	}
}
