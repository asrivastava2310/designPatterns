package designpatterns.structural.decorator;

public class StringDecorator {
	public static void main(String[] args) {
		MagicString magicString = new MagicString("Hello");
		System.out.println("No of vowels in "+magicString+" : "+magicString.getNumberOfVowels());
	}
}

class MagicString {
	private String string;

	public MagicString(String string) {
		this.string = string;
	}

	public long getNumberOfVowels() {
		return string.chars().mapToObj(c -> (char) c).filter(c -> "aeiou".contains(c.toString())).count();
	}

	@Override
	public String toString() {
		return string;
	}

}