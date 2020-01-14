package prob2A;

// This class owns the relationship 
public class GradeReport {
	private String grade;
	private Student student;
	
	public GradeReport(String grade) {
		this.grade=grade;
		this.student=new Student(this);
	}
	
	public Student getStudent() {
		return student;
	}
	
	@Override 
	public String toString() {
		return student+"--"+grade; 
	}
}
