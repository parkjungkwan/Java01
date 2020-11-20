package grade;

public interface GradeService {
	public int sum(GradeDto grade);
	public float avg(int sum);
	public String findTopName();
}
