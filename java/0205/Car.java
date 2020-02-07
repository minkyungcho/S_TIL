package com.ssafy;

// Car 클래스 객체의 비교!
public class Car {
	
	String carName;
	int wheelNum;
	int velocity;
	public Car(String carName, int wheelNum, int velocity) {
		this.carName = carName;
		this.wheelNum = wheelNum;
		this.velocity = velocity;
	}
	
	public boolean equals(Car c) { // 객체 내용 비교

		// carName은 this.carName이므로 c1의 carName!! c.carName은 c2의 carName!!
		if(carName.equals(c.carName) && wheelNum==c.wheelNum && velocity==c.velocity) { 
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", wheelNum=" + wheelNum + ", velocity=" + velocity + "]";
	}

	static void method(int su) {
		su+=3;
	}
	
	
	public static void main(String[] args) {
//		int su = 0;
//		System.out.println(su);
//		method(su);
//		System.out.println(su);
		Car c1, c2;
		c1 = new Car("소나타", 4, 100);
		c2 = new Car("소나타", 4, 100);
		
		System.out.println(c1.toString());
		
		
		if(c1.equals(c2)) {
			System.out.println("객체 내용 같음");
		}else {
			System.out.println("객체 내용 다름");
		}
//		System.out.println(c1.equals(c2));
		
		// c1과 c2를 비교!
		// 1. 레퍼런스(참조==메모리) 비교
		// 2. 내용 비교  .equals()
		
		// 레퍼런스(주소) 비교? ==> 등가연산자(등호)를 통해 비교!
		if(c1==c2) {
			System.out.println("래퍼런스(메모리) 같음!!");
		}else {
			System.out.println("래퍼런스(메모리) 다름!!");
			
		}
		
		
	}
	
}
