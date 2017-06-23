package com.qait.training.Student;
import java.util.Comparator;

class StudentCompare implements Comparator<Student1> {
/**
 * To compare Student list
 */
	@Override
	public int compare(Student1 e1, Student1 e2) {
		if (e1.getCgpa() == e2.getCgpa()) {
			if (e1.getName() == e2.getName()) {
				if (e1.getId() > e2.getId()) {
					return 1;
				} else {
					return -1;
				}
			} else {
				return e1.getName().compareTo(e2.getName());
			}
		}
       else if (e1.getCgpa() > e2.getCgpa()) {
			return 1;
		} 
       else {
			return -1;
		}
	}
}