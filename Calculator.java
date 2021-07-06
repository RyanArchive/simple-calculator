// Simple Java Calculator

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame {
	JTextField txtScreen;
	JButton btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero;
	JButton btnClear, btnPlus, btnMinus, btnTimes, btnDivide, btnEquals;
	JLabel lblContainer;
	JPanel pnlPane = new JPanel();

	String color1 = "#E4E7F3";
	String color2 = "#F6F7FB";
	double num, solveNum;
	Boolean addition = false;
	Boolean subtraction = false;
	Boolean multiplication = false;
	Boolean division = false;
	String display = "";

	public Calculator() {
		super("Calculator");
		setSize(316, 425);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.decode(color1));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lblContainer = new JLabel();
		add(lblContainer);
		lblContainer.setLayout(new FlowLayout());
		lblContainer.setSize(800, 600);
		lblContainer.setLayout(null);
	
		txtScreen = new JTextField();
		txtScreen.setBounds(20, 20, 271, 70);
		txtScreen.setHorizontalAlignment(JTextField.RIGHT);
		txtScreen.setFont(new Font("Consolas ", Font.PLAIN, 24));
		lblContainer.add(txtScreen);

		btnOne = new JButton("1");
		btnOne.setBounds(20, 100, 60, 60);
		btnOne.setFont(new Font("Consolas ", Font.PLAIN, 15));
		btnOne.setBackground(Color.decode(color2));
		btnOne.setFocusPainted(false);
		lblContainer.add(btnOne);
		btnOne.addActionListener(new btnOne());

		btnTwo = new JButton("2");
		btnTwo.setBounds(90, 100, 60, 60);
		btnTwo.setFont(new Font("Consolas ", Font.PLAIN, 15));
		btnTwo.setBackground(Color.decode(color2));
		btnTwo.setFocusPainted(false);
		lblContainer.add(btnTwo);
		btnTwo.addActionListener(new btnTwo());

		btnThree = new JButton("3");
		btnThree.setBounds(160, 100, 60, 60);
		btnThree.setFont(new Font("Consolas ", Font.PLAIN, 15));
		btnThree.setBackground(Color.decode(color2));
		btnThree.setFocusPainted(false);
		lblContainer.add(btnThree);
		btnThree.addActionListener(new btnThree());

		btnClear = new JButton("C");
		btnClear.setBounds(230, 100, 60, 60);
		btnClear.setFont(new Font("Consolas ", Font.PLAIN, 15));
		btnClear.setBackground(Color.decode(color2));
		btnClear.setFocusPainted(false);
		lblContainer.add(btnClear);
		btnClear.addActionListener(new btnClear());

		btnFour = new JButton("4");
		btnFour.setBounds(20, 170, 60, 60);
		btnFour.setFont(new Font("Consolas ", Font.PLAIN, 15));
		btnFour.setBackground(Color.decode(color2));
		btnFour.setFocusPainted(false);
		lblContainer.add(btnFour);
		btnFour.addActionListener(new btnFour());

		btnFive = new JButton("5");
		btnFive.setBounds(90, 170, 60, 60);
		btnFive.setFont(new Font("Consolas ", Font.PLAIN, 15));
		btnFive.setBackground(Color.decode(color2));
		btnFive.setFocusPainted(false);
		lblContainer.add(btnFive);
		btnFive.addActionListener(new btnFive());

		btnSix = new JButton("6");
		btnSix.setBounds(160, 170, 60, 60);
		btnSix.setFont(new Font("Consolas ", Font.PLAIN, 15));
		btnSix.setBackground(Color.decode(color2));
		btnSix.setFocusPainted(false);
		lblContainer.add(btnSix);
		btnSix.addActionListener(new btnSix());

		btnPlus = new JButton("+");
		btnPlus.setBounds(230, 170, 60, 60);
		btnPlus.setFont(new Font("Consolas ", Font.PLAIN, 15));
		btnPlus.setBackground(Color.decode(color2));
		btnPlus.setFocusPainted(false);
		lblContainer.add(btnPlus);
		btnPlus.addActionListener(new btnPlus());

		btnSeven = new JButton("7");
		btnSeven.setBounds(20, 240, 60, 60);
		btnSeven.setFont(new Font("Consolas ", Font.PLAIN, 15));
		btnSeven.setBackground(Color.decode(color2));
		btnSeven.setFocusPainted(false);
		lblContainer.add(btnSeven);
		btnSeven.addActionListener(new btnSeven());

		btnEight = new JButton("8");
		btnEight.setBounds(90, 240, 60, 60);
		btnEight.setFont(new Font("Consolas ", Font.PLAIN, 15));
		btnEight.setBackground(Color.decode(color2));
		btnEight.setFocusPainted(false);
		lblContainer.add(btnEight);
		btnEight.addActionListener(new btnEight());

		btnNine = new JButton("9");
		btnNine.setBounds(160, 240, 60, 60);
		btnNine.setFont(new Font("Consolas ", Font.PLAIN, 15));
		btnNine.setBackground(Color.decode(color2));
		btnNine.setFocusPainted(false);
		lblContainer.add(btnNine);
		btnNine.addActionListener(new btnNine());

		btnMinus = new JButton("-");
		btnMinus.setBounds(230, 240, 60, 60);
		btnMinus.setFont(new Font("Consolas ", Font.PLAIN, 15));
		btnMinus.setBackground(Color.decode(color2));
		btnMinus.setFocusPainted(false);
		lblContainer.add(btnMinus);
		btnMinus.addActionListener(new btnMinus());

		btnZero = new JButton("0");
		btnZero.setBounds(20, 310, 60, 60);
		btnZero.setFont(new Font("Consolas ", Font.PLAIN, 15));
		btnZero.setBackground(Color.decode(color2));
		btnZero.setFocusPainted(false);
		lblContainer.add(btnZero);
		btnZero.addActionListener(new btnZero());

		btnTimes = new JButton("X");
		btnTimes.setBounds(90, 310, 60, 60);
		btnTimes.setFont(new Font("Consolas ", Font.PLAIN, 15));
		btnTimes.setBackground(Color.decode(color2));
		btnTimes.setFocusPainted(false);
		lblContainer.add(btnTimes);
		btnTimes.addActionListener(new btnTimes());

		btnDivide = new JButton("/");
		btnDivide.setBounds(160, 310, 60, 60);
		btnDivide.setFont(new Font("Consolas ", Font.PLAIN, 15));
		btnDivide.setBackground(Color.decode(color2));
		btnDivide.setFocusPainted(false);
		lblContainer.add(btnDivide);
		btnDivide.addActionListener(new btnDivide());

		btnEquals = new JButton("=");
		btnEquals.setBounds(230, 310, 60, 60);
		btnEquals.setFont(new Font("Consolas ", Font.PLAIN, 15));
		btnEquals.setBackground(Color.decode(color2));
		btnEquals.setFocusPainted(false);
		lblContainer.add(btnEquals);
		btnEquals.addActionListener(new btnEquals());

		setVisible(true);
	}

	class btnClear implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			txtScreen.setText("");
			addition = false ;
			subtraction = false ;
			multiplication = false ;
			division = false ;
			num = 0;
			solveNum = 0;
		}
	}

	class btnOne implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = txtScreen.getText();
			txtScreen.setText(display + "1");
		}
	}

	class btnTwo implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = txtScreen.getText();
			txtScreen.setText(display + "2");
		}
	}

	class btnThree implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = txtScreen.getText();
			txtScreen.setText(display + "3");
		}
	}

	class btnFour implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = txtScreen.getText();
			txtScreen.setText(display + "4");
		}
	}

	class btnFive implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = txtScreen.getText();
			txtScreen.setText(display + "5");
		}
	}

	class btnSix implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = txtScreen.getText();
			txtScreen.setText(display + "6");
		}
	}

	class btnSeven implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = txtScreen.getText();
			txtScreen.setText(display + "7");
		}
	}

	class btnEight implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = txtScreen.getText();
			txtScreen.setText(display + "8");
		}
	}

	class btnNine implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = txtScreen.getText();
			txtScreen.setText(display + "9");
		}
	}

	class btnZero implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display = txtScreen.getText();
			txtScreen.setText(display + "0");
		}
	}

	class btnPlus implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (addition == false && subtraction == false && multiplication == false && division == false) {
				num = Double.parseDouble(txtScreen.getText());
				txtScreen.setText("");
				addition = true ;
			}
		}
	}

	class btnMinus implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (addition == false && subtraction == false && multiplication == false && division == false) {
				num = Double.parseDouble(txtScreen.getText());
				txtScreen.setText("");
				subtraction = true ;
			}
		}
	}

	class btnTimes implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (addition == false && subtraction == false && multiplication == false && division == false) {
				num = Double.parseDouble(txtScreen.getText());
				txtScreen.setText("");
				multiplication = true ;
			}
		}
	}

	class btnDivide implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (addition == false && subtraction == false && multiplication == false && division == false) {
				num = Double.parseDouble(txtScreen.getText());
				txtScreen.setText("");
				division = true ;
			}
		}
	}

	class btnEquals implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			solveNum = Double.parseDouble(txtScreen.getText());

			if (addition == true)
				solveNum = num + solveNum;
			else if (subtraction == true )
				solveNum = num - solveNum;
			else if (multiplication == true)
				solveNum = num * solveNum;
			else if (division == true)
				solveNum = num / solveNum;

			if (solveNum % 1 != 0)
				txtScreen.setText(Double.toString(solveNum));
			else
				txtScreen.setText(String.format("%, .0f", solveNum));
			addition = false ;
			subtraction = false ;
			multiplication = false ;
			division = false ;
		}
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
	}	
}