public class Main
{
	public static void main(String[] args) {
		MyCharacter a = new MyCharacter('a');
		MyCharacter zero = new MyCharacter('0');
		System.out.println(a.equals(zero));
		System.out.println(MyCharacter.isDigit(a));
		System.out.println(MyCharacter.isLetter(a));
		System.out.println(MyCharacter.isDigitOrLetter(a));
		System.out.println(MyCharacter.isDigitOrLetter(zero));
	}
}
