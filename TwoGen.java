// обобщенный класс с 2 параметрами типов 
class TwoGen <T, V> {
	T ob1;
	V ob2;
	
	TwoGen (T o1, V o2){
		ob1 = o1;
		ob2 = o2;
	}

	void showTypes() {
		System.out.println("ТИп Т: " + ob1.getClass().getName());
		System.out.println("ТИп Т: " + ob2.getClass().getName());
	}

	T getOb1(){
		return ob1;
	}
	V getOb2(){
	
		return ob2; 
	}
}
class TwoGenDemo {
	public static void main (String[] args) {
		TwoGen <Integer, String> isObj = new TwoGen <> (102, "Строковый параметр V ");
	
		isObj.showTypes();
		int V = isObj.getOb1();
		System.out.println("Значение первого типа "  + V);
		String str = isObj.getOb2();
		System.out.println("Значение второго типа " + str);		
	}
}
