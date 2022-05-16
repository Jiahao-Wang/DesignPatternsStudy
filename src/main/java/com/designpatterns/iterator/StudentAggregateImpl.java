package com.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 21:21
 */
public class StudentAggregateImpl implements StudentAggregate {

	private List<Student> list = new ArrayList<>();

	@Override
	public void addStudent(Student student) {
		list.add(student);
	}

	@Override
	public void removeStudent(Student student) {
		list.remove(student);
	}

	public StudentIterator getStudentIterator() {
		return new StudentIterator(list);
	}
}
