
public class Main {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		//-- split --
		String s = "potato apple lemon orange";
		
		String[] vect = s.split(" ");

		//------
		System.out.println("String Original            : -" + original + "-");
		System.out.println("toLowerCase                : -" + s01 + "-");
		System.out.println("toUpperCase                : -" + s02 + "-");
		System.out.println("trim                       : -" + s03 + "-");
		System.out.println("substring(2)               : -" + s04 + "-");
		System.out.println("substring(2, 9)            : -" + s05 + "-");
		System.out.println("replace('a', 'x')          : -" + s06 + "-");
		System.out.println("replace(\"abc\", \"xy\")   : -" + s07 + "-");
		System.out.println("indexOf(\"bc\")            : " + i);
		System.out.println("lastIndexOf(\"bc\")        : " + j);
		System.out.println("-----------------  split -------------------------");
		System.out.println("vect[0] : " + vect[0]);
		System.out.println("vect[1] : " + vect[1]);
		System.out.println("vect[2] : " + vect[2]);
		System.out.println("vect[3] : " + vect[3]);
		
		
		
	}

}
