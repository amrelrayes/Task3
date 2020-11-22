import java.util.Scanner;
public class StringEqual {  
	
	public static void main(String[] args){
		
		
  Scanner userInput =new Scanner(System.in);
           
  System.out.println("Please Enter the 1st Name :");
   String nameOne =userInput.next();
           
  System.out.println("Please Enter the 2nd Name :");
   String nameTwo =userInput.next();
   
   boolean equal = nameOne.equalsIgnoreCase(nameTwo) ;
   System.out.println(equal);
   
   
	}
}