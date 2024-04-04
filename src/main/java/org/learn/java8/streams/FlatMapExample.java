package org.learn.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

import org.learn.java8.data.Student;
import org.learn.java8.data.StudentData;

public class FlatMapExample {

	public static void main(String[] args) {
		
		List<String> names = getNames();
		System.out.println(names);
		
		List<String> namesUnique = getNamesUnique();
		System.out.println("Unique Names: "+namesUnique);
		
	}
	
	public static List<String> getNames() {
		
		List<String> collect = StudentData.getStudentData().stream()
		.map(Student::getActivities)
		.flatMap(List::stream)
		.collect(Collectors.toList());
		
		return collect;
	}
public static List<String> getNamesUnique() {
		
		List<String> collect = StudentData.getStudentData().stream()
		.map(Student::getActivities)
		.flatMap(List::stream)
		.distinct()
		.collect(Collectors.toList());
		
		return collect;
	}
}
