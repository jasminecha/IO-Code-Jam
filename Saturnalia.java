import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Saturnalia {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("A-small-attempt0.in");

		Scanner keyboard = new Scanner(file);

		int numberEntries = keyboard.nextInt();
		ArrayList<String> array = new ArrayList<String>(numberEntries);
		keyboard.nextLine();
		for (int i = 0; i < numberEntries; i++) {
			array.add(keyboard.nextLine());
		}

		for (int i = 1; i < numberEntries + 1; i++) {
			String key = array.get(i - 1);
			System.out.println("Case #" + i + ":");
			String top = "";
			top += "+-";
			for (int j = 0; j < key.length(); j++) {
				top += "-";
			}
			top += "-+";
			System.out.println(top);
			System.out.println("| " + key + " |");
			System.out.println(top);
		}
	}
}
