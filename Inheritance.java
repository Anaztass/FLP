// демонстрация наслежования 
class A {
	int a = 5;
	void showA() {
		System.out.println("Значение а: " + a);
	}
	int addA() {
		return a + 1; 
	}
}
//Класс В наследует все открытые переменные и методы класса А 
//и добавляет свои переменные и методы
class B extends A {
	int b = 10;
	int addB() {
		b+=1;
		return b + 1;
	
	}
}
class Inheritance {
	public static void main(String[] args) {
		A objA = new A();
		B objB = new B();
		objA.showA();
		//Вызываем метод родительского класса 
		objB.showA();
		//Вызываем метод своего класса
		objA.addA();
		objB.addA();
		objA.showA(); 
		objB.showA();
		objB.showA();
		objB.addB();
		System.out.println("Значение b : " + objB.b);
		//Родительский класс не имеет доступа к переменным и методам дочернего класса
		//Недопустимая операция: objA.addB():
	}
}

