import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Please note these are done to get the answer as quickly as possible not efficient code 
public class Bag {

	public static void main(String[] args) {
		try {
			File myObj = new File("Bag.txt");
			Scanner myReader = new Scanner(myObj);

			Map<String, Integer> map = new HashMap<>();

			for (int i = 65; i <= 90; i++) {
				map.put(Character.toString((char) i), i - 38);
			}
			for (int i = 97; i <= 122; i++) {
				map.put(Character.toString((char) i), i - 96);
			}

			int rowCount = 0;
			int total = 0;
			String[][] group = new String[3][];
			while (myReader.hasNextLine()) {
				
				String data = myReader.nextLine();
				String[] array = data.split("");
				if (rowCount > 2) {
					rowCount = 0;
					group = new String[3][];
				}
				group[rowCount] = array;
				if (rowCount == 2) {
					String[] a = group[0];
					String[] b = group[1];
					String[] c = group[2];

					outerloop: 
						for (int i = 0; i < a.length; i++) {
							for (int j = 0; j < b.length; j++) {
								for (int z = 0; z < c.length; z++) {
										if (a[i].equals(b[j]) & a[i].equals(c[z])) {
										int comp = map.get(a[i]);
										total = total + comp;
										break outerloop;
										}
							}
						}
					}
				}
				rowCount++;
			}
			myReader.close();

			System.out.println(total);
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

}
