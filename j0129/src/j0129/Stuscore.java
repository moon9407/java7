package j0129;

public class Stuscore {
	{
		count++;
		no = count;
	}
	Stuscore(){}
	Stuscore(String name,int kor,int eng,int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/3.0;
	}
	
	//Object클래스 메소드임.
	// 오버라이딩해서 각 객체에 맞게 변경함.
	@Override 
	public boolean equals(Object obj) {
		Stuscore s = (Stuscore)obj;
		if(this.name.equals(s.getName())) {
			return true;
		}
		return false;
	}
//	@Override
//	public String toString() {
//		return String.format("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
//				this.no,this.name,this.kor,this.eng,
//				this.math,this.getTotal(),this.avg);
//	}
	
	static int count;
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	public void calTotal(int kor,int eng,int math) {
		this.total = kor+eng+math;
	}
	public void calAvg(int kor,int eng,int math) {
		this.avg = (kor+eng+math)/3.0;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
	
}
