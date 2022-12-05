import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ElfStacks {

	public static void main(String[] args) throws FileNotFoundException {
		
		Stack<String> stack1 = new Stack<String>();
	    stack1.add("J");
        stack1.add("H");
        stack1.add("P");
        stack1.add("M");
        stack1.add("S");
        stack1.add("F");
        stack1.add("N");
        stack1.add("V");
		
		
		Stack<String> stack2 = new Stack<String>();
        stack2.add("S");
        stack2.add("R");
        stack2.add("L");
        stack2.add("M");
        stack2.add("J");
        stack2.add("D");
        stack2.add("Q");
		
		
		
		
		Stack<String> stack3 = new Stack<String>();
        stack3.add("N");
        stack3.add("Q");
        stack3.add("D");
        stack3.add("H");
        stack3.add("C");
        stack3.add("S");
        stack3.add("W");
        stack3.add("B");
		
		
		
		Stack<String> stack4 = new Stack<String>();
        stack4.add("R");
        stack4.add("S");
        stack4.add("C");
        stack4.add("L");
    
		
		Stack<String> stack5 = new Stack<String>();
        stack5.add("M");
        stack5.add("V");
        stack5.add("T");
        stack5.add("P");
        stack5.add("F");
        stack5.add("B");
		
		Stack<String> stack6 = new Stack<String>();
        stack6.add("T");
        stack6.add("R");
        stack6.add("Q");
        stack6.add("N");
        stack6.add("C");

		
		Stack<String> stack7 = new Stack<String>();
        stack7.add("G");
        stack7.add("V");
        stack7.add("R");

		
		Stack<String> stack8 = new Stack<String>();
        stack8.add("C");
        stack8.add("Z");
        stack8.add("S");
        stack8.add("P");
        stack8.add("D");
        stack8.add("L");
        stack8.add("R");
		
		Stack<String> stack9 = new Stack<String>();
        stack9.add("D");
        stack9.add("S");
        stack9.add("J");
        stack9.add("V");
        stack9.add("G");
        stack9.add("P");
        stack9.add("B");
        stack9.add("F");
		
		
		
		ArrayList<Stack> Stacks = new ArrayList<Stack>();
		Stacks.add(stack1);
		Stacks.add(stack2);
		Stacks.add(stack3);
		Stacks.add(stack4);
		Stacks.add(stack5);
		Stacks.add(stack6);
		Stacks.add(stack7);
		Stacks.add(stack8);
		Stacks.add(stack9);
		
		File myObj = new File("Stacks.txt");
        Scanner myReader = new Scanner(myObj);
        int linecount =0;
        while (myReader.hasNextLine()) {
        	linecount++;  
        	String data = myReader.nextLine();
	         
	          if (linecount>10){
		          String[] d = data.split(" ");
		          int Start = Integer.parseInt(d[3]);
		          int End =  Integer.parseInt(d[5]);
		          int Count =  Integer.parseInt(d[1]);
		          
		          System.out.println(End);
		          ArrayList<String> crates = new ArrayList<String>();
		          
		          for(int i=0; i<Count; i++) {
		        	  Stack Starts = Stacks.get((Start-1));
		        	  
		        	  String x = (String) Starts.pop();
		        	  crates.add(x);
		        	  
		        	  Stacks.set(Start-1,Starts);		  
		          }
		          
		          for(int i=crates.size()-1; i>-1; i--) {

		        	  Stack Ends = Stacks.get(End-1);
		        	  Ends.push(crates.get(i));
		        	  Stacks.set(End-1,Ends);
		          }
		          

	          }
	    
	          
	    }
	          
        
        
        for( Stack s : Stacks) {
      	  System.out.print(s.pop());
        }

        myReader.close();
		
		
		
	}

}
