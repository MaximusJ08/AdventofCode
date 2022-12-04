import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CleanUp {

	public static void main(String[] args) {
	    try {
	        File myObj = new File("Cleanup.txt");
	        Scanner myReader = new Scanner(myObj);
	        int Overlap = 0;
	        while (myReader.hasNextLine()) {
		          String data = myReader.nextLine();
		          String[] arrSplit = data.split(",");
		          String[] oneSplit = arrSplit[0].split("-");
		          String[] twoSplit = arrSplit[1].split("-");
		          int oneOne = Integer.parseInt(oneSplit[0]);
		          int oneTwo = Integer.parseInt(oneSplit[1]);
		          int twoOne = Integer.parseInt(twoSplit[0]);
		          int twoTwo = Integer.parseInt(twoSplit[1]);
		          
		          if((oneOne<=twoOne & oneTwo>=twoTwo) || (oneOne>=twoOne & oneTwo<=twoTwo) ) {
		        	  Overlap++;
		          }
		          
	        
	        }
	        System.out.print(Overlap);
	        myReader.close();
	        
	      } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	}
	
}
