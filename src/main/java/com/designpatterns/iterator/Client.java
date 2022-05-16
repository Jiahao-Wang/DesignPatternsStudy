package com.designpatterns.iterator;

/**
 * @author Jiahao Wang
 * @Description
 * @create 2022-05-15 21:53
 */
public class Client {
	public static void main(String[] args) {
		StudentAggregateImpl aggregate = new StudentAggregateImpl();

		aggregate.addStudent(new Student("a", "aaa"));
		aggregate.addStudent(new Student("b", "bbb"));
		aggregate.addStudent(new Student("c", "ccc"));
		aggregate.addStudent(new Student("d", "ddd"));

		StudentIterator iterator = aggregate.getStudentIterator();

		while (iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.toString());
		}
	}
}
