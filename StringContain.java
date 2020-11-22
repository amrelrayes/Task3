import java.util.Scanner;
public class StringContain {  
	
	public static void main(String[] args){
		
		
  Scanner userInput =new Scanner(System.in);
           
  System.out.println("Please Enter the 1st Name :");
   String nameOne =userInput.next();
           
  System.out.println("Please Enter the 2nd Name :");
   String nameTwo =userInput.next();
   
   boolean name= nameOne.contains(nameTwo);
   System.out.println(name);
   
   
	}
}