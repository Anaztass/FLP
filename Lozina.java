// реализация интерфейса в proginter
class Lozina implements proginter {
	// объявляем переменные
        String firstName;
	String lastName;
        // объявляем констурктор  объекта класса Lozina
        Lozina() {
                firstName = "Лозина" ;
        	lastName = "Анастасия";
	}

        // реализация метода интерфейса  getString - получения следующего значения в последовательности
        public String getString(String s) {
                return firstName +  " " +  lastName;
        }
}
class Anastaz {
        public static void main(String[] args) {
                Lozina anastasia = new Lozina();
                proginter s;
                s = anastasia;
                System.out.println("Вывод фамилии и им+ени \"через 2\"");

                for (int l = 0; l < 5; l++)
                        System.out.print(s.getString("Какой-то параметр ") + " ");
                System.out.println();

        }
}
