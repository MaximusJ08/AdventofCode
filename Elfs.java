import java.util.HashMap;
import java.util.Map;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
//Please note these are done to get the answer as quickly as possible not efficient code 
public class Elfs {

	public static void main(String[] args) {	
	    try {
	        File myObj = new File("input.txt");
	        Scanner myReader = new Scanner(myObj);
	        int elfTotal = 0;
	        int maxTotal1 = 0;
	        int maxTotal2 = 0;
	        int maxTotal3 = 0;
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          
	          if (!data.equals(""))
	          {
		          int number = Integer.parseInt(data);
		          elfTotal = elfTotal + number; 
	          }
	          else {
	        	  if(elfTotal > maxTotal1) {
	        		  maxTotal3 = maxTotal2;
	        		  maxTotal2 = maxTotal1;
	        		  maxTotal1 = elfTotal;
	        	  }
	        	  else if(elfTotal > maxTotal2) {
	        		  maxTotal3 = maxTotal2;
	        		  maxTotal2 = elfTotal;
	        	  }
	        	  
	        	  else if(elfTotal > maxTotal3) {
	        		  maxTotal3 = elfTotal;
	        	  }

	        	  
	        	  elfTotal = 0;
	          }
	          
	        }
	        System.out.println(maxTotal1+maxTotal2+maxTotal3);
	        myReader.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	    
	  
		
        }

}



