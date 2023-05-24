package sec03.exam04;

public class Car {
	//필드
	String company="현차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	Car(){
		
	}
	Car(String model){
		//this.model=model;
		this(model,null,0); //<- //this.model=model; 동일한 표현
	}
	Car(String model, String color){
		//this.model=model;
		//this.color=color;
		this(model,color,0);
	}
	Car(String model, String color, int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
		
	}
}
