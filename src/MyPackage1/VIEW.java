package MyPackage1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Rectangle;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class VIEW {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JButton AddButton;
	private JButton SubButtton;
	private JButton ModButton;
	private JButton MulButton;
	private JButton DivButton;
	private JButton SqrButton;
	private int numOperation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VIEW window = new VIEW();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VIEW() {
		initialize();
		this.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaptionBorder);
		frame.setBounds(100, 100, 352, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		textField1.setBounds(new Rectangle(1, 1, 1, 1));
		textField1.setBounds(23, 36, 133, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JLabel lblNumber = new JLabel("First Number");
		lblNumber.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblNumber.setBounds(23, 11, 91, 14);
		frame.getContentPane().add(lblNumber);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(new Rectangle(1, 1, 1, 1));
		textField2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		textField2.setBounds(23, 104, 133, 20);
		frame.getContentPane().add(textField2);
		
		JLabel lblSecondNumber = new JLabel("Second Number");
		lblSecondNumber.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblSecondNumber.setBounds(23, 79, 91, 14);
		frame.getContentPane().add(lblSecondNumber);
		
		JLabel lblResult = new JLabel("Result :");
		lblResult.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblResult.setBounds(23, 163, 91, 14);
		frame.getContentPane().add(lblResult);
		
		textField3 = new JTextField();
		textField3.setBackground(new Color(255, 127, 80));
		textField3.setEditable(false);
		textField3.setColumns(10);
		textField3.setBounds(new Rectangle(1, 1, 1, 1));
		textField3.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		textField3.setBounds(23, 188, 133, 20);
		frame.getContentPane().add(textField3);
		
		 AddButton = new JButton("+");
		 AddButton.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		numOperation=1;
		 	}
		 });
		AddButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		AddButton.setBackground(new Color(255, 127, 80));
		AddButton.setBounds(273, 11, 53, 33);
		frame.getContentPane().add(AddButton);
		
		 SubButtton = new JButton("-");
		 SubButtton.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		numOperation=2;
		 	}
		 });
		SubButtton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		SubButtton.setBackground(new Color(255, 127, 80));
		SubButtton.setBounds(273, 48, 53, 33);
		frame.getContentPane().add(SubButtton);
		
		
		 ModButton = new JButton("%");
		 ModButton.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		numOperation=3;
		 	}
		 });
		ModButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		ModButton.setBackground(new Color(255, 127, 80));
		ModButton.setBounds(273, 86, 53, 33);
		frame.getContentPane().add(ModButton);
		
		 MulButton = new JButton("*");
		 MulButton.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		numOperation=4;
		 	}
		 });
		MulButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		MulButton.setBackground(new Color(255, 127, 80));
		MulButton.setBounds(273, 123, 53, 33);
		frame.getContentPane().add(MulButton);
		
		 DivButton = new JButton("/");
		 DivButton.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		numOperation=5;
		 	}
		 });
		DivButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		DivButton.setBackground(new Color(255, 127, 80));
		DivButton.setBounds(273, 160, 53, 33);
		frame.getContentPane().add(DivButton);
		
		 SqrButton = new JButton("\u221A ");
		 SqrButton.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		numOperation=6;
		 	}
		 });
		SqrButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
		SqrButton.setBackground(new Color(255, 127, 80));
		SqrButton.setBounds(273, 199, 53, 33);
		frame.getContentPane().add(SqrButton);
		
		JLabel lblWhenUse = new JLabel("When use  \u221A  button , it will take the First Number");
		lblWhenUse.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 12));
		lblWhenUse.setBounds(10, 243, 316, 14);
		frame.getContentPane().add(lblWhenUse);
	}
	
	//-----------------------------------------------

	
	public double getFirstNum() {
		return Double.parseDouble(this.textField1.getText());
	}
	
	public void setFirstNum(String t) {
		this.textField1.setText(t);
	}
	
	public double getSecondNum() {
		return Double.parseDouble(this.textField2.getText());
	}
	
	public void setSecondNum(String s) {
		this.textField2.setText(s);
	}
	
	public int getnumOfOperation() {
		return numOperation ;
	}
	
	public double getResultNum() {
		return Double.parseDouble(this.textField3.getText());
	}
	
	public void setResultNum(double result) {
		this.textField3.setText(Double.toString(result));
	}
	
	public void clrResultNum() {
		this.textField3.setText("");;
	}
	
   //-----------------------------------------------
	
	void addListener(ActionListener Listen1) {
		this.AddButton.addActionListener(Listen1);
		
	}
	
	void subListener(ActionListener Listen2) {
		this.SubButtton.addActionListener(Listen2);
		
	}
	
	void modListener(ActionListener Listen3) {
		this.ModButton.addActionListener(Listen3);
		
	}
	
	void mulListener(ActionListener Listen4) {
		this.MulButton.addActionListener(Listen4);
		
	}
	
	void divListener(ActionListener Listen5) {
		this.DivButton.addActionListener(Listen5);
		
	}
	
	void sqrListener(ActionListener Listen6) {
		this.SqrButton.addActionListener(Listen6);
		
	}
	
	void printTheError(String string) {
		JOptionPane.showMessageDialog(null,this ,string,JOptionPane.ERROR_MESSAGE);
		
	}
}

