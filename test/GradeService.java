package test;

public interface GradeService {
	public void addGrade(GradeDto grade);
	public void updateGrade(GradeDto grade);
	public void deleteGrade(GradeDto grade);
	public int sum(GradeDto grade);
	public float avg(int sum);
	public GradeDto[] gradeSort();
	public int count();	
}
