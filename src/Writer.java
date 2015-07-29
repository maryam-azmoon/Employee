import java.util.ArrayList;

public class Writer {

	public static <T> void write(ArrayList<T> empsList) {
		for (int i = 0; i < empsList.size(); i++) {
			String[] className = (empsList.get(i).getClass().toString()).split(" ");
			String name = className[1];
			System.out.println(name +" " + (i + 1) + ":");
			System.out.println(empsList.get(i));
		}
	}
}
