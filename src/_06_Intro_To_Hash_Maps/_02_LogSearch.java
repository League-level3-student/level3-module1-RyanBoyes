package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener{
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	
	
	
	HashMap<Integer, String> hash = new HashMap<Integer, String>();
	JFrame frame;
	JPanel panel;
	JButton Add;
	JButton Search;
	JButton View;
	
	_02_LogSearch(){
		frame = new JFrame();
		panel = new JPanel();
		Add = new JButton("Add Entry");
		Search = new JButton("Search By ID");
		View = new JButton("View List");
		
		frame.add(panel);
		panel.add(Add);
		panel.add(Search);
		panel.add(View);
		frame.pack();
		frame.setVisible(true);
		Add.addActionListener(this);
		Search.addActionListener(this);
		View.addActionListener(this);
	}

	
	
	public static void main(String[] args) {
	
	new _02_LogSearch();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==Add) {
			String enteredIDS = JOptionPane.showInputDialog("Please enter an ID Number");
			int enteredID = Integer.parseInt(enteredIDS);
			String enteredName = JOptionPane.showInputDialog("Please enter a name");
			hash.put(enteredID, enteredName);
		}
		
		if(e.getSource()==Search) {
			String enteredSearchS = JOptionPane.showInputDialog("Enter and ID Number");
			int enteredSearch = Integer.parseInt(enteredSearchS);
			System.out.println(hash.get(enteredSearch));
		}
	
	
		if(e.getSource()==View) {
			for(Integer i : hash.keySet()) {
				System.out.println("ID: " + i + " Name: " + hash.get(i));
			}
		}
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

