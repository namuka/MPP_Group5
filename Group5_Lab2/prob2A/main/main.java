package prob2A.main;

import prob2A.GradeReport;
import prob2A.Student;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeReport gradeReport=new GradeReport("A");
		Student s1= gradeReport.getStudent();
		s1.setName("John");
		GradeReport gradeReport2=new GradeReport("C");
		Student s2=gradeReport2.getStudent();
		s2.setName("Mark");
	
		System.out.println("------Report Grade-----");
		System.out.println(gradeReport);
		System.out.println(gradeReport2);
	
		
	}

}
