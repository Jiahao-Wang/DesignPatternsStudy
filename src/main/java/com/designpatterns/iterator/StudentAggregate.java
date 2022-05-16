package com.designpatterns.iterator;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 21:20
 */
public interface StudentAggregate {
	void addStudent(Student student);

	void removeStudent(Student student);

	StudentIterator getStudentIterator();
}
