package hmm;

public class Student {
	private String id;
	private String name;
	private int age;
	public Student(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
		

	}