package day3;

//Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class magic8ball {
public static void main(String[] args) {
	

	
	
	// 1. Make a main method that includes all the steps below….

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
int rand = new Random().nextInt(4);

	// 3. Print out this variable
System.out.println(rand);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog(null, "enter a question");
	// 5. If the random number is 0
if(rand==0){
	JOptionPane.showConfirmDialog(null, "yes");
}
	// -- tell the user "Yes"

	// 6. If the random number is 1
if(rand==1){
	JOptionPane.showConfirmDialog(null, "no");
}
	// -- tell the user "No"

	// 7. If the random number is 2
if(rand==2){
	JOptionPane.showConfirmDialog(null, "Maybe you should ask google");
}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
if(rand==3){
	JOptionPane.showConfirmDialog(null, "You're stupid");
}
	// -- write your own answer
}
}



