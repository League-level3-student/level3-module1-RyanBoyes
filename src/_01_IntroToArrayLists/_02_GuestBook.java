package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame;
	JPanel panel;
	JButton addButton;
	JButton viewButton;
	ArrayList<String> names;
	
	
	

_02_GuestBook(){
	
frame = new JFrame();
frame.setVisible(true);

panel = new JPanel();
addButton = new JButton("Add Names");
addButton.addActionListener(this);
viewButton = new JButton("View Names");
viewButton.addActionListener(this);
frame.add(panel);
panel.add(addButton);
panel.add(viewButton);
frame.setSize(400, 600);

names = new ArrayList<String>();




}
public static void main(String[] args) {
	new _02_GuestBook();
}




@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}












}
