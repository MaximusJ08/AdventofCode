import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Please note these are done to get the answer as quickly as possible not efficient code 
public class ElfTurning {

	public static void main(String[] args) {
		 try {
		        File myObj = new File("Turning.txt");
		        Scanner myReader = new Scanner(myObj);
		        String buf = "";
		        while (myReader.hasNextLine()) {
		          String data = myReader.nextLine();
		          
		          buf= buf.concat(data);
		          
		        }
		        for(int i=0; i<buf.length(); i++) {
		        	String buffer = buf.substring(i,i+14);
		        	if(uniqueCharacters(buffer)) {
		        		System.out.println(i+14);
		        		break;
		        	}
		        	
		        	
		        	//if(buf.charAt(i) != buf.charAt(i+1) & buf.charAt(i) != buf.charAt(i+2) & buf.charAt(i) != buf.charAt(i+3)  & buf.charAt(i+1) != buf.charAt(i+2) & buf.charAt(i+1) != buf.charAt(i+3) & buf.charAt(i+2) != buf.charAt(i+3) ) {
		        		//System.out.println(i+4);
		        		//break;
		        	
		        		
		        }
		        
		 
		 
		 
		        
		        System.out.println(buf);
		        myReader.close();
		      } catch (FileNotFoundException e) {
		        System.out.println("An error occurred.");
		        e.printStackTrace();
		      }
		 
		 
		 

	}
	
    static boolean uniqueCharacters(String str)
    {
        // If at any time we encounter 2 same
        // characters, return false
        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j < str.length(); j++)
                if (str.charAt(i) == str.charAt(j))
                    return false;
 
        // If no duplicate characters encountered,
        // return true
        return true;
    }
 

}
