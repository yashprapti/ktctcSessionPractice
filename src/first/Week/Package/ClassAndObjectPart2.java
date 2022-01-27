package first.Week.Package;

public class ClassAndObjectPart2 {

	public static void main(String[] args) {
		ClassAndObject0601 obj = new ClassAndObject0601();
		obj.age=56;
		obj.name="Pandurang";
		obj.weight=72.35f;
		obj.veg=true;
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.weight);
		System.out.println(obj.veg);
		obj.isVegiterian();
		obj.canTalk();

	}

}
