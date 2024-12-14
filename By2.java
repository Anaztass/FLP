// реализация интерфейса в Seties
class By2 implements Series {
	
	// объявляем переменные
	int start;
	int val;
	int prev;

	// объявляем констурктор  объекта класса By2
	By2() {
		prev = -2;
		start = 0;
		val = 0;
	}
	
	// реализация метода интерфейса  getNext - получения следующего значения в последовательности 
	public int getNext() {
		prev = val;
		val +=2;
		return val;
	}
	//реализация метода интерфейса  reset() - сброс значения на начало последовательности 
	public void reset() {
		val = start;
		prev = start - 2;
	}
	//реализация метода интерфейса установка  setStsrt() - установка нового начало последовательности 
	public void setStart (int x) {
		start = x;
		val = x;
		prev = x - 2;
	}

	//добавляем новый метод непосредственно внутрь класса By2
	int getPrevious() {
		return prev;
	}
}
class SetlesDemo {
	public static void main(String[] args) {
		By2 by2 = new By2();
		By3 by3 = new By3();
		Series s; 
		s = by2;
		System.out.println("последовательность \"через 2\"");

		for (int l = 0; l < 5; l++)
			System.out.print(s.getNext() + " ");
		System.out.println();

		System.out.println("Вывод серии предыдущих значений в последовательности \"черех 2\" начиная с текущего значение 10  :");
		for (int l = 0; l < 5; l++) {
                 	s.getNext();
		 	System.out.print(by2.getPrevious() + " ");
		}       
		System.out.println();

		//сбор последовательности к 0
		s.reset();
		System.out.println("последовательность \"через 2\" после сброса в 0: ");

                for (int l = 0; l < 5; l++)
                        System.out.print(s.getNext() + " ");
                System.out.println();

		// новое стартовое значение 51
		by2.setStart(51);
                System.out.println("последовательность \"через 2\" после установки стартового значения 51 ");

                for (int l = 0; l < 5; l++)
                        System.out.print(s.getNext() + " ");
                System.out.println();

		// манипцляции с последовательностью через 3
		s = by3;
		System.out.println("последовательность \"через 3\"");

                for (int l = 0; l < 5; l++)
                        System.out.print(s.getNext() + " ");
                System.out.println();

                //сбор последовательности к 0
                s.reset();
                System.out.println("последовательность \"через 3\" после сброса в 0: ");

                for (int l = 0; l < 5; l++)
                        System.out.print(s.getNext() + " ");
                System.out.println();

                // новое стартовое значение 51
                s.setStart(51);
                System.out.println("последовательность \"через 3\" после установки стартового значения 51 ");

                for (int l = 0; l < 5; l++)
                        System.out.print(s.getNext() + " ");
                System.out.println();
	}
}
