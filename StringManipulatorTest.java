public class StringManipulatorTest{
	public static void main (String[] args){
		StringManipulator manipulator = new StringManipulator();
		
		String str = manipulator.trimAndConcat("         Merit         ", "     America      ");
		System.out.println(str);
		

		char letter = 'o';
		Integer f = manipulator.getIndexOrNull("Coding", letter);
		Integer g = manipulator.getIndexOrNull("Hello World", letter);
		Integer h = manipulator.getIndexOrNull("Hi", letter);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);

		String word = "Hello";
		String subString = "llo";
		String notSubString = "world";
		Integer one = manipulator.getIndexOrNull(word, subString);
		Integer two = manipulator.getIndexOrNull(word, notSubString);
		System.out.println(one); 
		System.out.println(two);

		String werd = manipulator.concatSubstring("Hello", 1, 2, "world");
		System.out.println(werd);
	}
}