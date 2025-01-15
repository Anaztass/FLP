interface StringFunc {
	String func(String str);

}
class LambdaArgument {
	//тип 1-го параментра - функциональный интерфейс. Ему нужно передать ссылку на любой эксземпляр
	//интерфейс
	//Втрой параметр задает строку
	static String changeStr(StringFunc sf, String s)  {
		return sf.func(s);

	}
	public static void main(String[] args) {
	String inStr = "Lambda Expression Expand Java";
	String outStr;
	System.out.println("Входная строка: " + inStr);
	//изменяем поряок следования символов в строке
	StringFunc reverse = (str) -> {
		String result = "";
		for(int i = str.length()-1; i>=0; i--)
			result += str.charAt(i);
		return result;
	};
	outStr = changeStr(reverse, inStr);
	System.out.println("Обращеная строка: " + outStr);
	//заменяем пробелы на дефисы 
	outStr = changeStr((str) -> {
		String result = "";
		char ch;
		for(int i=0; i<str.length(); i++){
			ch = str.charAt(i);
			if(Character.isUpperCase(ch))
				result += Character.toLowerCase(ch);
			else
				result += Character.toUpperCase(ch);
		}
		return result;
	}, inStr);
	System.out.println("Строка с инвертированием регистроа: " + outStr);

	}
	
}
