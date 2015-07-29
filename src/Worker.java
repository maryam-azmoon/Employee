
public class Worker extends Employee {

	public Worker() {
		// TODO Auto-generated constructor stub
	}

	public Worker(String name, String family, int age, int id) {
		super(name, family, age, id);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return getName() + "\n" + getFamily() + "\n" + getAge() + "\n" + getId();
	}

	public static Worker parse(String info) {
		String[] infoPart = info.split(" ");
		Worker w = new Worker(infoPart[0], infoPart[1], Integer.parseInt(infoPart[2]), Integer.parseInt(infoPart[3]));
		return w;
	}
}