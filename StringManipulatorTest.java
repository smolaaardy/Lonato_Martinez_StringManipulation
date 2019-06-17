public class StringManipulatorTest{
	public static void main (String[] args){
		StringManipulator manipulator = new StringManipulator();
		
		String str = manipulator.trimAndConcat("         Merit         ", "     America      ");
		System.out.println(str);
		

		char letter = 'o';
		Integer f = manipulator.getIndexorNull("Coding", letter);
		Integer g = manipulator.getIndexorNull("Hello World", letter);
		Integer h = manipulator.getIndexorNull("Hi", letter);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);

		String word = "Hello";
		String subString = "llo";
		String notSubString = "world";
		Integer one = manipulator.getIndexorNull(word, subString);
		Integer two = manipulator.getIndexorNull(word, notSubString);
		System.out.println(one); 
		System.out.println(two);

		String werd = manipulator.concatSubstring("Hello", 1, 2, "world");
		System.out.println(werd);
	}
}