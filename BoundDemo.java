class NumericFns <T extends Number> {
	T num;
	//Конструктор 
	NumericFns(T n) {
		num = n;
	}

	//метод, возвращающий обратное значение числа
	double reciprocal() {
		return 1/num.doubleValue();
	}

	//Метод, возваращающий дробную часть 
	double fraction() {
		return num.doubleValue() - num.intValue();
	} 
	// МЕТОД, сравнивающий абсолютные значения двух чисел 
	boolean absEqual(NumericFns<?> ob){
		if(Math.abs(num.doubleValue())==Math.abs(ob.num.doubleValue()))
			return true;
		return false;
	}
	/* Пример ограничения для типов при использовании подстановчного знака
	   void test(NumericFns <? extends Number>))
		...
	}
	*/
}

class BoundDemo {
	public static void main(String[] args) {
		NumericFns <Integer> iOb = new NumericFns  <> (5);
		System.out.println("Обратная величина iOb "  +  iOb.reciprocal());
		System.out.println("Дробная часть iOb "  +  iOb.reciprocal());
		System.out.println();
		
		NumericFns <Double> dOb = new NumericFns  <> (5.51);
		System.out.println("Обратная величина dOb "  +  dOb.reciprocal());
		System.out.println("Дробная часть dOb "  +  dOb.fraction());
		System.out.println();
	
		NumericFns <Double> dOb2 = new NumericFns <> (-5.0); 

		System.out.println("Абсолютное значение равны: " +  iOb.absEqual(dOb));



		//Ограничение на числовой тип данных "T exends Number" проверяется компилятором 
		//NumericFns <String> sOb;
	}
	
}
