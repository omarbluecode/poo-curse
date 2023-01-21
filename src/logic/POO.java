package logic;

public class POO {

	public static void main(String[] args) {
		
		Student std1 = new Student();
		Student std2 = new Student(5, "Luisina", "Otero");
		
		System.out.println("The id of student 2 is: " + std2.getId());
		System.out.println("The name of student 2 is: " + std2.getName());
		System.out.println("The surname of student 2 is: " + std2.getSurname());
		
		std1.setId(9);
		std1.setName("Karim");
		std1.setSurname("Benzema");
		
		System.out.println("-------------------------------------------------");
		System.out.println("The id of student 1 is: " + std1.getId());
		System.out.println("The name of student 1 is: " + std1.getName());
		System.out.println("The surname of student 1 is: " + std1.getSurname());
		
		
		
		std2.setId(10);
		System.out.println("-------------------------------------------------");
		System.out.println("The id of student 2 is: " + std2.getId());
		System.out.println("The name of student 2 is: " + std2.getName());
		System.out.println("The surname of student 2 is: " + std2.getSurname());

	}

}
