package w2l6.problem2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 
 * @author flormaria
 *
 */
public class Rainbow extends JFrame {
	
	private static final long serialVersionUID = 1L;
	final Color VIOLET = new Color( 128, 0, 128 );
	final Color INDIGO = new Color( 75, 0, 130 );
	   
	JButton b1=new JButton(),b2=new JButton(),b3=new JButton(),
			b4=new JButton(),b5=new JButton(),
			b6=new JButton(),b7=new JButton();
	
	public Rainbow() {
		// TODO Auto-generated constructor stub
		 setTitle("Rainbow Color Frame");
	      setBounds(0,0,760,400);
	      setLayout(new FlowLayout(FlowLayout.LEFT));
	      String color,description;
	      Dimension d = new Dimension();
	      d.height=100;
	      d.width=100;
	      
	      b1.setBackground(Color.RED);
	      b1.setSize(100, 100);
	      b1.setPreferredSize(d);
	      b2.setBackground(Color.ORANGE);
	      b2.setPreferredSize(d);
	      b3.setBackground(Color.YELLOW);
	      b3.setPreferredSize(d);
	      b4.setBackground(Color.GREEN);
	      b4.setPreferredSize(d);
	      b5.setBackground(Color.BLUE);
	      b5.setPreferredSize(d);
	      b6.setBackground(VIOLET);
	      b6.setPreferredSize(d);
	      b7.setBackground(INDIGO);;
	      b7.setPreferredSize(d);
	      
	      
	      b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(b1, rainbowDesc("Red"), "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
			}
		});
	      
	      b2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(b2, rainbowDesc("Orange"), "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
				}
			});
	      
	      b3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(b3, rainbowDesc("Yellow"), "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
				}
			});
	      
	      b4.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(b4, rainbowDesc("Green"), "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
					
				}
			});
	      
	      b5.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(b5, rainbowDesc("Blue"), "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
					
				}
			});
	      
	      b6.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(b6, rainbowDesc("Indigo"), "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
					
				}
			});
	      
	      b7.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(b7, rainbowDesc("Violet"), "Color Meaning", JOptionPane.INFORMATION_MESSAGE);
					
				}
			});
	      
	      add(b1);
	      add(b2);
	      add(b3);
	      add(b4);
	      add(b5);
	      add(b6);
	      add(b7);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	      setVisible(true);
	}
	
	public String rainbowDesc(String color) {
		switch (color) {
		case "Red":
			return "Red: This is the first color of the rainbow from top. "
					+ "Red signifies passion, vitality, enthusiasm and security. "
					+ "It is the light with the longest wavelength.";
			
		case "Orange":
			return "Orange: This light or color is a combination of yellow and red. "
					+ "It is a dynamic color representing creativity, practicality, "
					+ "playfulness as well as equilibrium or control.";
		case "Yellow":
			return "Yellow: This is the color of the sunshine itself. "
					+ "It represents clarity of thought, wisdom, orderliness and energy.";
			
		case "Green":
			return "Green: This is the middle color of the rainbow and denotes fertility, "
					+ "growth, balance, health and wealth.";
			
		case "Blue":
			return "Blue: This the fifth color of the rainbow which makes us think of the Unknown. "
					+ "The sky and the wide oceans are in this color and hence it has been associated with Spirituality and Divinity.";
			
		case "Indigo":
			return "Indigo: It is believed that where Blue is calming, "
					+ "Indigo is sedating. Indigo is mystical as it bridges the Gap between "
					+ "Finite and Infinite. Indigo colored gem stones are often used for spiritual"
					+ " attainment, psychic abilities, self awareness and enhancement of Intuition.";
			
		case "Violet":
			return "Violet: The last color of the rainbow is a mix of red and blue. "
					+ "It is considered the highest element of spirituality. "
					+ "It can ignite one’s imagination and be an inspiration to artists. "
					+ "Dark tones of violet are associated with sorrow. "
					+ "Deeper shades of violet or purple denote high spiritual mastery.";

		default:
			return "No is the rainbow color";
		}
	}
	
	public static void main(String[] args) {
		new Rainbow();
	}

}
