package _04_popcorn;

import javax.swing.JOptionPane;

public class popcornRunner {
public static void main(String[] args) {
	Microwave micro=new Microwave();
	String flavor=JOptionPane.showInputDialog("what flavor do you want your popcorn to be?");
	Popcorn popcorn=new Popcorn(flavor);
	micro.putInMicrowave(popcorn);
	String time=JOptionPane.showInputDialog("how long do you want to cook your popcorn for?");
	int t=Integer.parseInt(time);
	micro.setTime(t);
	micro.startMicrowave();
	
}
}
