interface ITest {
	String show();
	int add(int i);
	double sum(double i, double j);

}
abstract class Test1 implements ITest {
	abstract public String show();
	public int add(int i) {
		return i+1;
	}
	public double sum(double i, double j) {
		return i+j;
	}
}
class Test2 extends Test1 {
	String msg;
	Test2(String m) {
		msg = m;
	}
	public String show() {
		return msg;
	}
}
class Test3 implements ITest {
	public String show() {
		return "666";
	}
	public int add (int i) {
		return 666;
	}
	public double sum (double i, double j){
		return 666.0;
	}
}
class IntDemo {
	public static void main(String[] args) {
		Test2 t = new Test2("Проверка работы с интерфейсом ITest");
		System.out.println(t.show() + " " + t.add(10) + " " + t.sum(5.0, 15.0));
		
		ITest i;
		i = t;
		System.out.println(i.show() + " " + i.add(10) + " " + i.sum(5.0, 15.0));
		
		i = new Test3();
		System.out.println(i.show() + " " + i.add(10) + " " + i.sum(5.0, 15.0));
	}
}
