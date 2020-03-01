package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	
	Stack<String> words;
	JFrame frame;
	JPanel panel;
	JLabel label;
	char charTyped;
	int wordLength;
	String poppedWord;
	int lives;
	
	
	HangMan(){
		
		words = new Stack<String>();
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel();
		frame.add(panel);
		panel.add(label);
		frame.setVisible(true);
		frame.addKeyListener(this);
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lives = 6;
		
		
		
		
		String NumOfWordsS = JOptionPane.showInputDialog("How many words would you like to play with?");
		int NumOfWords = Integer.parseInt(NumOfWordsS);
		
		for (int i = 0; i < NumOfWords; i++) {
			String dictWord = readRandomLineFromFile("dictionary.txt");
			words.push(dictWord);
			
			
			
		}
	
		poppedWord = words.pop();
		wordLength = poppedWord.length();
		for (int i = 0; i < wordLength; i++) {
			label.setText(label.getText()+"_");
			
			
		}
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
	 new HangMan();
	
	}
	
	
	
	
	
	
	public static String readRandomLineFromFile(String filename) {
	String word = "";

		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			int randomNumber = new Random().nextInt(getTotalWordsInFile(filename));
			br.close();
			br = new BufferedReader(new FileReader(filename));
			for (int i = 0; i < randomNumber; i++) {
				word = br.readLine();
			}

			br.close();

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Could not find file.", "ERROR", 1);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return word;
	}
	
	public static int getTotalWordsInFile(String filename) {
		int totalLines = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			String line = br.readLine();
			
			while (line != null) {
				totalLines++;
				line = br.readLine();
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return totalLines;
		
	}













	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}













	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		boolean correct = false;
		
		charTyped = e.getKeyChar();
		
		
	
			
		
		
		for (int i = 0; i < wordLength; i++) {
			
			
		if (poppedWord.charAt(i)==charTyped) {
			
			correct = true;
			if (i==0) {
				label.setText(charTyped+label.getText().substring(1));
			}
			else if (i==wordLength-1) {
				label.setText(label.getText().substring(0,i)+charTyped);
			}
			else {
				label.setText(label.getText().substring(0,i)+charTyped+label.getText().substring(i+1));
			}
		}	
			
		
		
		
		}
		
		if (!correct&&lives>0) {
			System.out.println("Lives remaining: " + lives--);
		}
		else if(!correct&&lives<=0) {
			label.setText(poppedWord);
			int ConfirmAnswer = JOptionPane.showConfirmDialog(null, "GAME OVER: Would you like to play again?");
			if(ConfirmAnswer==0) {
				
				lives = 6;
				String NumOfWordsS = JOptionPane.showInputDialog("How many words would you like to play with?");
				int NumOfWords = Integer.parseInt(NumOfWordsS);
				
				for (int i = 0; i < NumOfWords; i++) {
					String dictWord = readRandomLineFromFile("dictionary.txt");
					words.push(dictWord);
					
					
					
				}
				
				label.setText("");
				poppedWord = words.pop();
				wordLength = poppedWord.length();
				for (int i = 0; i < wordLength; i++) {
					label.setText(label.getText()+"_");
				}
				
				
			}
			else if(ConfirmAnswer==1) {
				System.exit(0);
			}
		}
		
	if(poppedWord.equals(label.getText())){
		label.setText("");
		poppedWord = words.pop();
		wordLength = poppedWord.length();
		for (int i = 0; i < wordLength; i++) {
			label.setText(label.getText()+"_");
		}
		
	}
		
	
	
	
	
	
	
	
	}













	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}













