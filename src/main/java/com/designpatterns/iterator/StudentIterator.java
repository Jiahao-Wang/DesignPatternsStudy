package com.designpatterns.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 20:59
 */
public class StudentIterator implements Iterator {

	private List<Student> list;

	private int position = 0;

	public StudentIterator(List<Student> list) {
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		return position < list.size();
	}

	@Override
	public Student next() {
		Student currentStudent = list.get(position);
		position++;
		return currentStudent;
	}
}
