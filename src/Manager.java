import java.util.ArrayList;
import java.util.Arrays;

public class Manager extends Employee {
	public Manager(String name,String family,int age,int id,ArrayList<String> s) {
		setName(name);
		setFamily(family);
		setAge(age);
		setId(id);
		setRelatedWorkers(relatedWorkers);
	}
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public static Manager parse(String info) {
		Manager m = new Manager();
		ArrayList<String> infoPart = new ArrayList<String>(Arrays.asList(info.split(" ")));
		m.setName(infoPart.get(0));
		m.setFamily(infoPart.get(1));
		m.setAge(Integer.parseInt(infoPart.get(2)));
		m.setId(Integer.parseInt(infoPart.get(3)));
		for (int i = 4; i < infoPart.size(); i++) {
			for (int j = 0; j < MainMenu.workerList.size(); j++) {
				if (MainMenu.workerList.get(j).getId() == Integer.parseInt(infoPart.get(i))) {
					m.relatedWorkers.add(MainMenu.workerList.get(j));
				}
			}
		}
		return m;
	}

	public ArrayList<Worker> relatedWorkers = new ArrayList<Worker>();

	public ArrayList<Worker> getRelatedWorkers() {
		return relatedWorkers;
	}

	public void setRelatedWorkers(ArrayList<Worker> relatedWorkers) {
		this.relatedWorkers = relatedWorkers;
	}

	public String toString() {
		return getName() + "\n" + getFamily() + "\n" + getAge() + "\n" + getId() + "\n" + getRelatedWorkers();
	}

}
