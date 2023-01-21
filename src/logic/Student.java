package logic;

public class Student {
	
	int id;
	String name;
	String surname;
	
	
	public Student() {
		super();
	}
	

	public Student(int id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public void showName() {
		System.out.println("Hello, i know how to say my name");
	}
	
	
	public void isApproved(double score) {
		
		if(score >= 6) {
			System.out.println("APPROVED");
		}else {
			System.out.println("DID NOT PASS");
		}
	}

}
