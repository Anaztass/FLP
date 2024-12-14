// реализация интерфейса в Seties
class By3 implements Series {
	
	// объявляем переменные
	int start;
	int val;
	
	// объявляем констурктор  объекта класса By2
	By3() {
		start = 0;
		val = 0;
	}
	
	// реализация метода интерфейса  getNext - получения следующего значения в последовательности 
	public int getNext() {
		val +=3;
		return val;
	}
	//реализация метода интерфейса  reset() - сброс значения на начало последовательности 
	public void reset() {
		val = start;
	}
	//реализация метода интерфейса установка  setStsrt() - установка нового начало последовательности 
	public void setStart (int x) {
		start = x;
		val = x;
	}
}

