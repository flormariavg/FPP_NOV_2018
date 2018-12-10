package w2l6.problem1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author flormaria
 *
 */
public class StringUtility extends JFrame {
	
	private static final long serialVersionUID = 1L;
		//Defining JLabel
		private JLabel lblInput;
		private JLabel lblOutput;
		
		//Defining JTextField
		private JTextField tfInput;
		private JTextField tfOutput;
		
		//Defining JButton
		private JButton btnCountLetters;
		private JButton btnReverseLetters;
		private JButton btnRemoveDuplicates;
		
		public static final int DEFAULT_WIDTH = 500;
		public static final int DEFAULT_HEIGHT = 300;
		
		public StringUtility() {
			// TODO Auto-generated constructor stub
			
			super("String Utility");
			
			//Define your layout
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//change the background color of the frame
			getContentPane().setBackground(Color.CYAN);
			getContentPane().setLayout(null);
			
			//Initialization
			lblInput = new JLabel("Input");
			lblInput.setBounds(200, 25, 150, 30);
			lblOutput = new JLabel("Output");
			lblOutput.setBounds(200, 80, 150, 30);
					
			tfInput = new JTextField(6);
			tfInput.setBounds(200, 50, 150, 30);
			
			tfOutput = new JTextField(6);
			tfOutput.setBounds(200,105, 150, 30);
			
			btnCountLetters    = new JButton("Count Letters");
			btnCountLetters.setBounds(20, 20, 150, 30);
					
			btnReverseLetters = new JButton("Reverse Letters");
			btnReverseLetters.setBounds(20, 70, 150, 30);

			btnRemoveDuplicates = new JButton("Remove Duplicates");
			btnRemoveDuplicates.setBounds(20, 120, 150,30);
			
			btnCountLetters.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					tfOutput.setText(String.valueOf(tfInput.getText().length()));
				}
			});
			
			btnReverseLetters.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
					tfOutput.setText(reverseLetters(tfInput.getText()));
					
				}
			});
			
			btnRemoveDuplicates.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					tfOutput.setText(removeDuplicates(tfInput.getText()));
					
				}
			});
			//add to the frame
			add(lblInput);
			add(lblOutput);
			add(tfInput);
			add(tfOutput);
			add(btnCountLetters);
			add(btnReverseLetters);
			add(btnRemoveDuplicates);
			
			setVisible(true);
			
		}
		
		public String reverseLetters(String s) {
				if(s==null) return "";
				if(s.length()==1)
					return String.valueOf(s.charAt(0));
			return s.charAt(s.length()-1)+reverseLetters(s.substring(0, s.length()-1));
		}
		
		public String removeDuplicates(String s) {
			StringBuilder sb = new StringBuilder();
			
			if(s==null || s.length()==0) return "";
				
			for (int i=0; i<s.length();i++) {
				for (int j=0; j<s.length();j++) {
					if(s.charAt(i)!=s.charAt(j) || i==j)
						sb.append(s.charAt(j));	
				}
				
				s=sb.toString();
				sb= new StringBuilder();
				
			}
			
			return s;
		}
		public static void main(String[] args) {
			new StringUtility();
		}

}
