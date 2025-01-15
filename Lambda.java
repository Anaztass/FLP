//Варнианты лямбда-функции 
//() -> 100.2;
//() -> Math.random() * 100;
//(n) -> 1.5/n
//(n) -> (n%2)==0;
//
//Функциональный интерфейс;
interface MyValue {
	//в функциональном интерфейсе может быть определен  только один абстрактный метод 
	double getValue();
}
interface MyParamValue {
	//Определяем метод с одним параметром 
	double getPValue(int n);
}
interface NumericTest {
	boolean test(int n, int m);
}
class Lambda {
	public static void main(String[] args){
		MyValue myVal;
		myVal = () -> 100.2;
		System.out.println("Значение1: " + myVal.getValue());
		myVal = () -> Math.random() * 10.2;
		System.out.println("Значение2: " + myVal.getValue());
		// пример использования функционального интерфейса с одним парамтром 
		MyParamValue myPVal;
		myPVal = (n) -> 1.0/n;
		System.out.println("Значение для интерфейса с параметром : " + myPVal.getPValue(10));
		myPVal = (n) -> 144/n + (n*n);
		System.out.println("Значение для интерфейса с параметром : " + myPVal.getPValue(12));
		
		//пример использования ФИ с двумя параметрами 
		//проверка на деление
		NumericTest isFactor = (n,d) -> (n%d)==0;
		if(isFactor.test(10,2))
			System.out.println("2 является делителем 10");
		if(isFactor.test(10,3))
                        System.out.println("2 не является делителем 10");

		// проверка на то, что первый аргумент меньше второго 
		NumericTest lessThan = (n,m) -> (n<m);
		if(lessThan.test(2,10))
                        System.out.println("2 меньше 10");
                if(!lessThan.test(10,2))
                        System.out.println("10 не меньше 2");
		
		//проверка на равенство абсолютныъ значений 
		NumericTest absEqual = (n, m) -> (n<0 ? -n : n) == (m<0 ? -m : m);
		int x1, x2;
		x1 = 4;
		x2 = -4;
		if(absEqual.test(x1, x2))
			System.out.println("Абсолютные значения" +  x1 + " и " + x2 + " равны ");
		else 
			System.out.println("Абсолютные значения" +  x1 + " и " + x2 + " NE равны");
		x1 = 5;
                x2 = 6;

		if(absEqual.test(x1, x2))
                        System.out.println("Абсолютные значения" +  x1 + " и " + x2 + " равны ");
                else
                        System.out.println("Абсолютные значения" +  x1 + " и " + x2 + " NE равны");
	}
} 

