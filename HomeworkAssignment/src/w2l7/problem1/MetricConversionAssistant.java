package w2l7.problem1;

import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * 
 * @author flormaria
 *
 */
public class MetricConversionAssistant extends JFrame {

	private static final long serialVersionUID = 1L;

	//Defining JLabel
	private JLabel lblMille, lblPound, lblGallon,lblFahrenheit, lblKilometer, lblKilogram, lblLiters, lblCentigrade;
			
	//Defining JTextField
	private JTextField tfMille, tfPound, tfGallon, tfFahrenheit, tfKilometer, tfKilogram, tfLiters, tfCentigrade;
			
	//Defining JButton
	private JButton btnConvert;
	
	public static final int DEFAULT_WIDTH = 800;
	public static final int DEFAULT_HEIGHT = 350;
	
	public MetricConversionAssistant() {
		// TODO Auto-generated constructor stub
		
		super("Metric Conversion Assistant");
		//Define your layout
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//change the background color of the frame
		getContentPane().setBackground(Color.CYAN);
		getContentPane().setLayout(null);
		
		//Initialization
		lblMille = new JLabel("Mille:");
		lblMille.setBounds(20, 20, 150, 30);
		lblPound = new JLabel("Pound:");
		lblPound.setBounds(20, 70, 150, 30);
		lblGallon = new JLabel("Gallon:");
		lblGallon.setBounds(20, 120, 150, 30);
		lblFahrenheit = new JLabel("Fahrenheit:");
		lblFahrenheit.setBounds(20,170, 150, 30);
		
		lblKilometer = new JLabel("Kilometer:");
		lblKilometer.setBounds(400, 20, 150, 30);
		lblKilogram = new JLabel("Kilogram:");
		lblKilogram.setBounds(400, 70, 150, 30);
		lblLiters = new JLabel("Liters:");
		lblLiters.setBounds(400, 120, 150, 30);
		lblCentigrade = new JLabel("Centigrade:");
		lblCentigrade.setBounds(400,170, 150, 30);
		
		tfMille = new JTextField(6);
		tfMille.setBounds(180, 20, 150, 30);
		tfPound = new JTextField(6);
		tfPound.setBounds(180, 70, 150, 30);
		tfGallon = new JTextField(6);
		tfGallon.setBounds(180, 120, 150, 30);
		tfFahrenheit = new JTextField(6);
		tfFahrenheit.setBounds(180,170, 150, 30);
		
		tfKilometer = new JTextField(6);
		tfKilometer.setBounds(560, 20, 150, 30);
		tfKilogram = new JTextField(6);
		tfKilogram.setBounds(560, 70, 150, 30);
		tfLiters = new JTextField(6);
		tfLiters.setBounds(560, 120, 150, 30);
		tfCentigrade = new JTextField(6);
		tfCentigrade.setBounds(560,170, 150, 30);
		
		btnConvert    = new JButton("Convert");
		btnConvert.setBounds(300, 250, 150, 30);
		
		btnConvert.addActionListener(e -> {
			double km, pounds, liter, cen;
			
			if(tfMille.getText().length()>0)
			try {
				km= round((Double.valueOf(tfMille.getText())/0.62137),2);
				tfKilometer.setText(String.valueOf(km));
				
			} catch (Exception e2) {
				tfMille.setText("");
				JOptionPane.showMessageDialog(btnConvert, "In the field Mille, enter a valid number");
				
			}
			
			if(tfPound.getText().length()>0)
			try {
				pounds= round(Double.valueOf(tfPound.getText())/2.20462,2);
				tfKilogram.setText(String.valueOf(pounds));
				
				
			} catch (Exception e2) {
				tfPound.setText("");
				JOptionPane.showMessageDialog(btnConvert, "In the field Pound, enter a valid number");
				
			}
			if(tfGallon.getText().length()>0)
				try {
					liter= round(Double.valueOf(tfGallon.getText())/0.264172,2);
					tfLiters.setText(String.valueOf(liter));
					
					
				} catch (Exception e2) {
					tfLiters.setText("");
					JOptionPane.showMessageDialog(btnConvert, "In the field Gallon, enter a valid number");
					
			}
			
			if(tfFahrenheit.getText().length()>0)
				try {
					cen=  ( Double.valueOf(tfFahrenheit.getText()) - 32) / 1.8000;
					tfCentigrade.setText(String.valueOf(cen));
					
					
				} catch (Exception e2) {
					tfFahrenheit.setText("");
					JOptionPane.showMessageDialog(btnConvert, "In the field Fahrenheit, enter a valid number");
					
			}
		});
		
		add(lblMille);
		add(lblPound);
		add(lblGallon);
		add(lblFahrenheit);
		add(tfMille);
		add(tfPound);
		add(tfGallon);
		add(tfFahrenheit);
		
		add(lblKilometer);
		add(lblKilogram);
		add(lblLiters);
		add(lblCentigrade);
		add(tfKilometer);
		add(tfKilogram);
		add(tfLiters);
		add(tfCentigrade);
		
		add(btnConvert);
				
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MetricConversionAssistant();
	}
	
	private static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();
	 
	    BigDecimal bd = new BigDecimal(Double.toString(value));
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
}
