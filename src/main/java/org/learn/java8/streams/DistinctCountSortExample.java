package org.learn.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

import org.learn.java8.data.Student;
import org.learn.java8.data.StudentData;

public class DistinctCountSortExample {

	public static void main(String[] args) {

		List<String> activities = getDistinctActivities();
		System.out.println(activities);
		long activitiesCount = getActivitiesCount();
		System.out.println("Activities Count is: " + activitiesCount);
		List<String> activitiesSorted = getActivitiesSorted();
		System.out.println("Sorted Activities: "+activitiesSorted);
	}

	public static List<String> getDistinctActivities() {

		return StudentData.getStudentData().stream().map(Student::getActivities).flatMap(List::stream).distinct()
				.collect(Collectors.toList());

	}

	public static long getActivitiesCount() {

		return StudentData.getStudentData().stream().map(Student::getActivities).flatMap(List::stream).distinct()
				.count();
	}
	
	public static List<String> getActivitiesSorted() {

		return StudentData.getStudentData().stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				//.distinct()
				.sorted()
				.collect(Collectors.toList());
	}
	
	
}
