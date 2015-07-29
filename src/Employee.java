
public abstract class Employee {
	public Employee(String name,String family,int age,int id){
		this.name=name;
		this.family=family;
		this.age=age;
		this.id=id;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	private String name;
	private String family;
	private int age;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return name + "\n" + family + "\n" + age + "\n" + id;
	}



	public boolean equals(Object input) {
		Employee in = (Employee) input;
		return this.getId() == in.getId();
	}
}
