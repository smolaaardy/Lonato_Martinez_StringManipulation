public class StringManipulationTest{
	public static void main (String[] args){
		StringManipulation manipulation = new StringManipulation();
		
		String str = manipulation.trimAndConcat("Merit", "America");
		System.out.println(str);
		

		char letter = 'o';
		Integer f = manipulation.getIndexOrNull("Coding", letter);
		Integer g = manipulation.getIndexOrNull("Hello World", letter);
		Integer h = manipulation.getIndexOrNull("Hi", letter);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);

		String word = "Hello";
		String subString = "llo";
		String notSubString = "world";
		Integer one = manipulation.getIndexOrNull(word, subString);
		Integer two = manipulation.getIndexOrNull(word, notSubString);
		System.out.println(one); 
		System.out.println(two);

		String werd = manipulation.concatSubstring("Hello", 1, 2, "world");
		System.out.println(werd);
	}
}