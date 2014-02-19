package GuiCalculatorProjectwithConn;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

//adding comments line to make it different to first line of Test1.java

public class Test1 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JTextArea textArea;

	String[] symbols = {"back","C","sq","/","7","8","9","*","4","5","6","-","1","2","3","+","0",
			"        =        ",". "};
	public Object[] button;
	
	public Test1(){
		
		JFrame calculator = new JFrame("Calculator");	

		calculator.setLayout(new FlowLayout());
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Sans Serif", Font.BOLD, 20));
		textArea.setPreferredSize(new Dimension(200,50));              

		
		calculator.add(textArea);
		Listen listenButton = new Listen();
		

		

		 JButton button[]=new JButton[19];
		 
		 for(int i = 0; i < symbols.length; i++){
			 button[i] = new JButton(symbols[i]);
			 button[i].addActionListener(listenButton);
			 calculator.add(button[i]);
		 }

		 	calculator.setSize(220, 255);
		 	calculator.setLocationRelativeTo(null);
		 	calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			calculator.setVisible(true);
			//setVisible(true);	

	}

	public static void main(String[] args) {
		
		new Test1();
	}
		
	private class Listen implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String symbol = " ";
			symbol = e.getActionCommand();
			symbol = symbol.trim();
			switch (symbol) {
			case "Enter": textArea.append("\n");
			break;
			
			case "Space": textArea.append(" ");
			break;
			
			default: textArea.append(e.getActionCommand());
			break;
			}    	
            	
		}
	}


}

