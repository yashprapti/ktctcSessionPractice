package second.week.packagee;

public class MethodWithStringArrayArgument {

	String[] strarr = { "Ram", "Sham", "Sahil", "Rama", "Maya" };
	char charr[] = { 'a', 'p', ':', 'g', 's' };

	public void sampleMethod1(String[] args) {

		String name = args[0] + args[3];
		System.out.println(name);
	}

	public void sampleMethod2(String[] args, char[] charr1) {

		String name = args[0] + charr1[2] + args[3];
		System.out.println(name);
	}

	public static void main(String[] args) {
		MethodWithStringArrayArgument obj = new MethodWithStringArrayArgument();
		obj.sampleMethod2(obj.strarr, obj.charr);

	}

}
