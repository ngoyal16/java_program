import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Christmas {

	static String path = "items.txt";
	static File f = new File(path);
	static String absolutePath = f.getAbsolutePath();
	static ArrayList<String> records = new ArrayList<>();

	static void welcome() {
		System.out.println("*************************************************************");
		System.out.println("*                          WELCOME                          *");
		System.out.println("*************************************************************");
	}

	static void menu() {
		System.out.println();
		System.out.println("Please choose how you wish to proceed - \n");
		System.out.println("1. Enter Christmas Shopping List Records");
		System.out.println("2. Mark a Christmas Gift as Purchased");
		System.out.println("3. Write the Christmas Shopping List Records to a File");
		System.out.println("4. Read the Christmas Shopping List Records from a File");
		System.out.println("5. Display All Christmas Shopping List Records");
		System.out.println("6. Exit the Application");
		System.out.print("Enter option no. : ");
	}

	static void close() {
		System.out.println("*************************************************************");
		System.out.println("*           “MERRY CHRISTMAS AND HAPPY NEW YEAR!”           *");
		System.out.println("*************************************************************");
	}

	static void newRecord(String rec) {
		String[] r = rec.split(",");
		for (String re : r)
			records.add(re.trim() + " | Not Purchased");
	}

	static void writeRecords() {
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			if (!f.exists())
				f.createNewFile();
			fw = new FileWriter(f);
			pw = new PrintWriter(fw);
			for (String rec : records) {
				pw.print(rec);
				pw.println();
			}
			System.out.println("\nRecords saved to file - files/records.txt\n");
			pw.flush();
			pw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void updatePurchase(String passedItems) {

		if (!records.isEmpty()) {

			String[] items = passedItems.split(",");
			for (String item : items)
				for (int i = 0; i < records.size(); i++) {
					String[] r = records.get(i).split(" \\| ");
					if (r[0].trim().toLowerCase().equals(item.trim().toLowerCase())) {
						records.set(i, r[0] + " | Purchased");
					}
				}
		} else
			System.out.println("No items in records.. Add items first");
	}

	static void readRecords() {
		FileReader fr = null;
		try {
			fr = new FileReader(f);
		} catch (FileNotFoundException e) {
			System.out.println("File Empty");
			return;
		}
		BufferedReader br = new BufferedReader(fr);
		String line = new String();
		int count = 0;
		ArrayList<String> temp = new ArrayList<>();
		try {
			while ((line = br.readLine()) != null) {
				temp.add(line);
				count++;
			}
			records = temp;
			System.out.println("\n" + count + " items in records\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void display() {
		System.out.println();
		if (records.isEmpty()) {
			System.out.println("\n No item in records\n");
		}

		for (String rec : records) {
			System.out.println(rec);
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);

		if (f.exists()) {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line = new String();
			try {
				while ((line = br.readLine()) != null) {
					records.add(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		welcome();
		do {
			menu();

			String choice = sc.nextLine();
			switch (choice) {
			case "1":
				System.out.println("Enter new item or items separated by comma \",\"");
				newRecord(sc.nextLine());
				break;

			case "2":
				System.out.println("\nList the items you have purchased separated by comma \",\"\n");
				updatePurchase(sc.nextLine());
				break;

			case "3":
				writeRecords();
				break;

			case "4":
				if (records.isEmpty()) {
					readRecords();
				} else {
					System.out.print("Reading from file will Discard changes, if any? (y/n) : ");
					String c = sc.nextLine();
					if (c.equals("y") || c.equals("Y")) {
						readRecords();
					}
				}
				break;

			case "5":
				display();
				break;
			case "6":
				close();
				sc.close();
				return;

			default:
				System.out.println("\nPlease Enter a valid choice\n");
			}
		} while (true);
	}
}
