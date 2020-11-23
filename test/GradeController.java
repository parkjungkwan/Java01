package test;

public class GradeController {
	private GradeService service;
	
	public GradeController() {
		service = new GradeServiceImpl();
	}
	public void postGrade(GradeDto grade) {
		service.addGrade(grade);
	}
	public void putGrade(GradeDto grade) {
		service.updateGrade(grade);
	}
	public void deleteGrade(GradeDto grade) {
		service.deleteGrade(grade);
	}
	public int getSum(GradeDto grade) {
		return service.sum(grade);
	}
	public float getAvg(int sum) {
		return service.avg(sum);
	}
	public GradeDto[] getGradeSort() {
		return service.gradeSort();
	}
	public int getCount() {
		return service.count();
	}
}
