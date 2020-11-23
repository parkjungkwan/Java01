package grade;
public class GradeServiceImpl implements GradeService{
	private GradeDto[] grades;
	private int count;
	public GradeServiceImpl() {
		grades = new GradeDto[3];
	}
	@Override
	public void addGrade(GradeDto grade) {
		int sum = sum(grade);
		float avg = avg(sum);
		grade.setSum(sum);
		grade.setAvg(avg);
		grades[count] = grade;
		count++;
	}
	@Override
	public void updateGrade(GradeDto grade) {
		for(int i=0; i< count; i++) {
			if(grade.getName().equals(grades[i].getName())) {
				grades[i].setKor(grade.getKor());
				grades[i].setEng(grade.getEng());
				grades[i].setMath(grade.getMath());
				break;
			}
		}
		
	}
	@Override
	public void deleteGrade(GradeDto grade) {
		for(int i=0; i< count; i++) {
			if(grade.getName().equals(grades[i].getName())) {
				grades[i] = grades[count - 1];
				grades[count - 1] = null;
				count--;
				break;
			}
		}
	}
	@Override
	public int sum(GradeDto grade) {
		return grade.getKor()+grade.getEng()+grade.getMath();
	}
	@Override
	public float avg(int sum) {
		return (float)sum / 3;
	}
	
	
	
	@Override
	public GradeDto[] gradeSort() {
		int size = grades.length;
		for(int i=0; i< size-1; i++) {
			for(int j= i+1; j< size; j++) {
				if(grades[i].getSum() < grades[j].getSum()) {
					GradeDto t = grades[i];
					grades[i] = grades[j];
					grades[j] = t;
				}
			}
		}
		return grades;
	}
	@Override
	public int count() {
		return count;
	}
	


}
