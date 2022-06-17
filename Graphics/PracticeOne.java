package Graphics;

import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PracticeOne {

	public static void main(String[] args) {
		
		JFrame frameOne= new JFrame("ajaryya");
		frameOne.setLayout(null);
		frameOne.setVisible(true);
		frameOne.setSize(720,720);
		
		JLabel labelOne= new JLabel("EMP ID");
		labelOne.setBounds(200,200,100,30);
		frameOne.add(labelOne);
		
		JLabel labelTwo = new JLabel("PASSWORD");
		labelTwo.setBounds(200,260,100,30);
		frameOne.add(labelTwo);
		
		JLabel labelThree=new JLabel("AJARYYA TECH PVT LTD");
	    labelThree.setBounds(195,110,500,100);
		frameOne.add(labelThree);
		
		TextField textfieldOne= new TextField();
		textfieldOne.setBounds(360,200,100,30);
		frameOne.add(textfieldOne);
		textfieldOne.setVisible(true);
		
		TextField textfieldTwo= new TextField();
		textfieldTwo.setBounds(360,260,100,30);
		frameOne.add(textfieldTwo);
		textfieldTwo.setVisible(true);
		
		JButton buttonOne= new JButton("LOG IN");
		buttonOne.setBounds(260,350,100,30);
		frameOne.add(buttonOne);
		
		
		

	}

}
