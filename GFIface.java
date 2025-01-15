//обобщенный функциональный интерыфейс
//
interface SomeTest<T> {
	boolean test(T n, T m);

}
class GFIface {
	public static void main(String[] args){
	//проверка на целочисленное деление
	SomeTest<Integer> isFactor = (n,d) -> (n%d) == 0;
	if(isFactor.test(10,2))
		System.out.println("2 - делитель 10");
	System.out.println();
	//проверка на деление с вещественными числами
	SomeTest<Double> isFactorD = (n,d) -> (n%d) == 0;
	if(isFactorD.test(210.0,4.0))
		System.out.println("4.0 - делитель 212.0");
	System.out.println();
	//проверка на вхождение подстроки в строку
	SomeTest<String> isIn = (a,b) -> a.indexOf(b) !=-1;
	String str = "Generic Funcrional Interface";
	System.out.println("Проверка строки: " + str );
	if(isIn.test(str, "face"))
		System.out.println("Строка \"face\" найдена");
	else
		System.out.println("Строка \"face\" NE найдена");
	}
}
