import java.util.Scanner;

public class ArraysTask {

	static int [] myArrays;
	
	public static void main(String[] args){
		
		myArrays = new int [5];
		
		   Scanner userInput =new Scanner(System.in);
           
           System.out.println("Please Enter the 1st Digit :");
           int myArrays =userInput.nextInt();
           System.out.println("Please Enter the 2nd Digit :");
           int myArrays1 =userInput.nextInt();
           System.out.println("Please Enter the 3rd Digit :");
           int myArrays2 =userInput.nextInt();
           System.out.println("Please Enter the 4th Digit :");
           int myArrays3 =userInput.nextInt();
           System.out.println("Please Enter the 5th Digit :");
           int myArrays4 =userInput.nextInt();
           
           int Arrays = (myArrays+myArrays1+myArrays2+myArrays3+myArrays4);
           System.out.println("The total of arrays is : "+Arrays);
           
           
	}
}