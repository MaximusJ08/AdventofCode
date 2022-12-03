import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Rock_Paper_Sic {

	public static void main(String[] args) {
	    try {
	        File myObj = new File("Rock.txt");
	        Scanner myReader = new Scanner(myObj);
	        int runningTotal = 0; 
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          String[] arrSplit = data.split(" ");
	          int opp = 0;
	          int me =0;
	          int score =0;
	          if(arrSplit[0].equals("C")) {
	        	 opp = 3; //sic
	          }
	          else if(arrSplit[0].equals("B")){
	        		opp = 2;   //pap
	          }
	          else {
	        	  opp =1; //rock
	          }
	          
	          if(arrSplit[1].equals("Z")) {
	              if(arrSplit[0].equals("C")) {
			        	 me = 1; //sic
			          }
			          else if(arrSplit[0].equals("B")){
			        		me = 3;   //pap
			          }
			          else {
			        	  me =2; //rock
			          }
			          
	          }
	          else if(arrSplit[1].equals("Y")){
	              if(arrSplit[0].equals("C")) {
			        	 me = 3; //sic
			          }
			          else if(arrSplit[0].equals("B")){
			        		me = 2;   //pap
			          }
			          else {
			        	  me =1; //rock
			          }  
	          }
	          else {
	              if(arrSplit[0].equals("C")) {
			        	 me = 2; //sic
			          }
			          else if(arrSplit[0].equals("B")){
			        		me = 1;   //pap
			          }
			          else {
			        	  me =3; //rock
			          }
	          }
	          
	          if(me==3 & opp==2 || me==1 & opp==3 || me==2 & opp==1 ) {
	        	 score = 6; 
	          }
	          else if(me == opp){
	        	  score = 3;   
	          }
	          else {
	        	  score =0;
	          }
	          
	          int total = me+ score;
	          runningTotal = total + runningTotal;
	          
	        }
	        System.out.println(runningTotal);
	        myReader.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	    
	  
		
        }

	}


