import javax.swing.JOptionPane;

public class PrintData {
	
static String [] myData;
	
	public static void main(String[] args){
		
		myData = new String [6];
		String name = JOptionPane.showInputDialog("Please Enter Your Name");
		String mobile = JOptionPane.showInputDialog("Please Enter Your Mobile");
		String email = JOptionPane.showInputDialog("Please Enter Your Email");
		String age = JOptionPane.showInputDialog("Please Enter Your Age");
		String faculty = JOptionPane.showInputDialog("Please Enter Your Faculty");
		String department = JOptionPane.showInputDialog("Please Enter Your Department");
		
		String data[] = {name, mobile, email , age , faculty , department};
		
		JOptionPane.showMessageDialog(null, " Your Data is :" +"\n" +name+"\n " +mobile +"\n "+email +"\n "+age +"\n "+faculty +"\n "+department);
		JOptionPane.showMessageDialog(null, " Your Name is :"  +name );	
		JOptionPane.showMessageDialog(null, " Your Mobile is :"  +mobile );	
		JOptionPane.showMessageDialog(null, " Your Email is :"  +email );	
		JOptionPane.showMessageDialog(null, " Your Age is :"  +age );	
		JOptionPane.showMessageDialog(null, " Your Faculty is :"  +faculty );	
		JOptionPane.showMessageDialog(null, " Your Depertment is :"  +department );	

		
	}

}
