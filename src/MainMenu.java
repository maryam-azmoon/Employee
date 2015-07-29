import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {

	public static ArrayList<Worker> workerList = new ArrayList<Worker>();
	public static ArrayList<Manager> mgrList = new ArrayList<Manager>();

	private static Scanner scanner = new Scanner(System.in);
	private static String input = "";

	public void displayMenu() {
		while (true) {

			System.out.println("press 1,2 or 3[other will Exit]" + "\n" + "1-Worker" + "\n" + "2-Manager" + "\n" + "3-Association");
			String menuInput = scanner.nextLine();
//			if (menuInput.equals("Finish")) {
//				continue;
//			}
			switch (menuInput) {
			case "1": 
				while (true) {
					System.out.println("Enter Worker:");
					input = scanner.nextLine();
					if (input.equals("Finish")) {
						break;
					}
					Worker w = Worker.parse(input);
					if (workerList.contains(w)) {
						System.out.println("Duplicated");
					} else {
						workerList.add(w);
					}
				}
				Writer.write(workerList);
				break;
			
			case "2": 
				while (true) {
					System.out.println("Enter Manager:");
					input = scanner.nextLine();
					if (input.equals("Finish")) {
						break;
					}
					Manager m = Manager.parse(input);
					if (mgrList.contains(m)) {
						System.out.println("Duplicated");
					} else {
						mgrList.add(m);
					}
				}
				Writer.write(mgrList);
				break;
			
			case "3": 
				// System.out.println("Enter Association:");
				System.out.println("Not implemented yet.");
				break;
				
			default:
				System.out.println("[Your input is invalid .]");
				break;
			}
		}
	}
}
