package org.learn.java8.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.learn.java8.data.Student;
import org.learn.java8.data.StudentData;

public class MapExample {

	public static void main(String[] args) {
		
		List<String> nameList = MapExample.getNameList();
		System.out.println("List: "+nameList);
		Set<String> nameSet = MapExample.getNameSet();
		System.out.println("Set: "+nameSet);
	}
	
	public static List<String> getNameList() {
		
		
		return StudentData.getStudentData()
				.stream()
				.map(Student::getName)
				.collect(Collectors.toList());
	}
public static Set<String> getNameSet() {
		
		
		return StudentData.getStudentData()
				.stream()
				.map(Student::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toSet());
	}
}
