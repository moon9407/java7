package j0127;

public class C07 {

	public static void main(String[] args) {
		
		Car c = null;
		FireCar f1 = new FireCar();
		FireCar f2 = null;
		
		AmbulCar a1 = null;
		
		f1.water();  //가능
//		f2.water();  //에러
		
		c = f1; // 업캐스팅 : 큰쪽으로 가는경우 자동형변환
		f2 = (FireCar)c; // 다운캐스팅 : 작은쪽으로 가는경우 강제형변환
		f2.water();  //가능, 상속이 있을 때만 가능
		
		a1 = (AmbulCar)c; //에러, 상속관계가 아니므로 형변환 불가
		a1.water(); //에러, 상속관계가 아니므로 형변환 불가
		
		
		
//		Tv t1 = new Tv();
//		Car c3 = (Car)t1; //에러, 상속관계가 아니므로 형변환 불가
		
		int a= 10;
		long aa = a; //자동형변환
		
		long b = 20;
		int bb = (int)b;  //강제형변환
		
//		FireCar f = new FireCar();
//		f.color = "red";
//		System.out.println(f.color);

	}

}
