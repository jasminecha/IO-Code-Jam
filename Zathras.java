import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zathras {
	public static void main(String[] args) throws FileNotFoundException,
			UnsupportedEncodingException {
		File file = new File("A-small-attempt0.in");
		Scanner keyboard = new Scanner(file);

		int number = keyboard.nextInt();
		ArrayList<String> array = new ArrayList<String>(number);
		keyboard.nextLine();
		for (int i = 0; i < number; i++) {
			array.add(keyboard.nextLine());
		}
		PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
		for (int i = 0; i < number; ++i) {
			int tAcr = 0;
			int tBoun = 0;
			String ara = array.get(i);
			int alpha = Integer.parseInt(ara.substring(0, ara.indexOf(" ")));
			ara = ara.substring(ara.indexOf(" ") + 1);
			int beta = Integer.parseInt(ara.substring(0, ara.indexOf(" ")));
			ara = ara.substring(ara.indexOf(" ") + 1);
			int acro = Integer.parseInt(ara.substring(0, ara.indexOf(" ")));
			ara = ara.substring(ara.indexOf(" ") + 1);
			int bounc = Integer.parseInt(ara.substring(0, ara.indexOf(" ")));
			ara = ara.substring(ara.indexOf(" ") + 1);
			long years = Long.parseLong(ara);

			for (int q = 0; q < years; q++) {
				int minimum = Math.min(alpha, beta);
				int numOff = (int) (minimum * .02);
				int a = (acro * numOff) / 100;
				int b = (bounc * numOff) / 100;
				int remaining = numOff - a - b;
				alpha = (int) (alpha + a + remaining / 2 - Math
						.floor(alpha * .01));
				int remainBoun = remaining - remaining / 2;
				beta = (int) (beta + b + remainBoun - Math.floor(beta * .01));
			}
			tAcr = alpha;
			tBoun = beta;

			writer.println("Case #" + (i + 1) + ": " + tAcr + " " + tBoun);
			writer.close();
		}
	}
}
