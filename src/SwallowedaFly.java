/***
 * Grading Comments:
 *  Good effort.   You kinda missed a bit of the 
 *  point in getting rid of duplication by writing
 *  methods for duplicate code.   Your organization 
 *  is nice.  
 *  Compiles/Runs:  15/15
 *  Desired Output: 5/6 - there's a typo 'shee'll die'.
 *  Consistency:  1/2  Your tab spacing isn't good with 
 *    the closing brackets.   It's important to match them
 *    up to make the code readable.
 *  Efficiency:  0/2  Look into nesting methods, (putting
 *    one inside another)  and also writing a method to
 *    print out anything you duplicate (type more than once).
 *  21/25
 */
public class SwallowedaFly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Verse1();
			Space();
			Verse2();
			Space();
			Verse3();
			Space();
			Verse4();
			Space();
			Verse5();
			Space();
			Verse6();
	}
	public static void ShellDie() {
		System.out.println("I dont't know why she swallowed that fly,");
		System.out.println("Perhaps shee'll die.");
	}
	public static void Verse1() {
		System.out.println("There was an old lady who swallowed a fly");
		ShellDie();
	}
	public static void Verse2() {
		System.out.println("There was an old lady who swallowed a spider,");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		System.out.println("She swallowed the spider to catch the fly,");
		ShellDie();
}
	public static void Verse3() {
		System.out.println("There was an old lady who swallowed a bird,");
		System.out.println("How absurd to swallow a bird.");
		System.out.println("She swallowed the bird to catch the spider,");
		System.out.println("She swallowed the spider to catch the fly,");
		ShellDie();
}
	public static void Verse4() {
		System.out.println("There was an old lady who swallowed a cat,");
		System.out.println("Imagine that to swallow a cat.");
		System.out.println("She swallowed the cat to catch the bird,");
		System.out.println("She swallowed the bird to catch the spider,");
		System.out.println("She swallowed the spider to catch the fly,");
		ShellDie();
}
	public static void Verse5() {
		System.out.println("There was an old lady who swallowed a dog,");
		System.out.println("What a hog to swallow a dog.");
		System.out.println("She swallowed the dog to catch the cat,");
		System.out.println("She swallowed the cat to catch the bird,");
		System.out.println("She swallowed the bird to catch the spider,");
		System.out.println("She swallowed the spider to catch the fly");
		ShellDie();
}
	public static void Verse6() {
	System.out.println("There was an old lady who swallowed a horse,");
	System.out.println("She died, of course.");
}
	public static void Space() {
		System.out.println();
}
}
