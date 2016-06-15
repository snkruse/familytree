
public class FamilyTree {
	public static void main(String[] args){
		System.out.println("Begin Program");
		Person p1 = new Person();
		Person p2 = p1.getPerson();
		Person p3 = new Person(p2);
		
		p2.print(p2);
		p3.print(p3);
	}
}
