abstract class Human {
	private int age; // переменная Возраст 
	Human(int a) { 
		age =a;
	} 
	int getAge() {
		return age;
	}

	abstract void showPension();
}

class Policeman extends Human {
	char sex;
	String name;
	Policeman(char s, String n, int a) {
		super(a);
		sex = s;
		name = n;
	}
	void showPension() {
		if (sex == 'm' & getAge()>50)
			System.out.println(name + " на пенсии");
		else if (sex == 'f' & getAge()>45)
			System.out.println(name + " на пенсии");
		else
			System.out.println(name + " не на пенсии");
        }
}
abstract class Military extends Human {
	Military(int a){
		super(a);
	}
	abstract void showPension();
}
class Rank extends Military  {
	String name;
	String rank;
	Rank(String r, String n, int a){
		super(a);
		name = n;
		rank = r;
	}
	void showPension() {
		if (( rank.equals ("генерал") & getAge()>60) | (rank.equals ("полковник") & getAge()>55) | (rank.equals ("майор") & getAge()>50))
			System.out.println(name + " на пенсии");
	       	else
                        System.out.println(name + " не на пенсии");
        }
}
class PolyDemo {
	public static void main(String[] args) {
		Human h;
		Policeman[] p = new Policeman [2];
		Military m;
		Rank[] r = new Rank[2];
		p[0] = new Policeman('m', "Олег ", 46);
		p[1] = new Policeman('f', "Ольга ", 46);
		r[0] = new Rank ("полковник", "Сергей", 51);
		r[1] = new Rank ("майор", "Николай", 51);

		h = p[0];
		System.out.println("Информация об объекте, на который ссылается " + "возвраст: " +  h.getAge ());
		h.showPension();

		 h = p[1];
                System.out.println("Информация об объекте, на который ссылается " + "возвраст: " +  h.getAge ());
                h.showPension();

 
		System.out.println("Информация об объекте, на который ссылается " + "возвраст: " +  h.getAge ());
                h.showPension();

		h = r[0];

		System.out.println("Информация об объекте, на который ссылается " + "возвраст: " +  h.getAge ());
                h.showPension();

		h = r[1];

                System.out.println("Информация об объекте, на который ссылается " + "возвраст: " +  h.getAge ());
                h.showPension();
	}
}
