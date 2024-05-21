import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App {
    public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame("Calculator UI");

		JPanel topPanel = new JPanel();
		topPanel.setLayout(null);
	
		topPanel.setBounds(10,10,265,85);
		frame.add(topPanel);
		
		JPanel topPanel1 = new JPanel();
		topPanel1.setLayout(new FlowLayout(FlowLayout.RIGHT));
		topPanel1.setBackground(Color.LIGHT_GRAY);
		topPanel1.setBounds(0,10,265,30);
		topPanel.add(topPanel1);
		
		JPanel topPanel2 = new JPanel();
		topPanel2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		topPanel2.setBackground(Color.LIGHT_GRAY);
		topPanel2.setBounds(0,50,265,60);
		topPanel.add(topPanel2);
		
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(null);
		bottomPanel.setBackground(Color.white);
		bottomPanel.setBounds(10,100,265,350);
		frame.add(bottomPanel);
		
		JPanel bottomTop = new JPanel();
		bottomTop.setLayout(new GridLayout(1,2));
	
		bottomTop.setBounds(10,10,245,50);
		bottomPanel.add(bottomTop);
		
		JPanel bottomLeft = new JPanel();
		bottomLeft.setLayout(new GridLayout(4,3));
		
		bottomLeft.setBounds(10,70,180,200);
		bottomPanel.add(bottomLeft);
		
		JPanel bottomRight = new JPanel();
		bottomRight.setLayout(new GridLayout(5,1));
	
		bottomRight.setBounds(200,70,55,200);
		bottomPanel.add(bottomRight);
		
		JLabel numbers = new JLabel();
		numbers.setSize(250,30);
		numbers.setText("11+63-85*2/7");
		
		JLabel result = new JLabel("24");
		result.setSize(250,40);
		topPanel1.add(numbers);
		topPanel2.add(result);
		
		JButton deleteAll = new JButton("CE");
		JButton delete = new JButton("DEL");
		bottomTop.add(deleteAll);
		bottomTop.add(delete);
		
		JButton btn9 = new JButton("9");
		JButton btn8 = new JButton("8");
		JButton btn7 = new JButton("7");
		JButton btn6 = new JButton("6");
		JButton btn5 = new JButton("5");
		JButton btn4 = new JButton("4");
		JButton btn3 = new JButton("3");
		JButton btn2 = new JButton("2");
		JButton btn1 = new JButton("1");
		JButton btn0 = new JButton("0");
		
		bottomLeft.add(btn7);
		bottomLeft.add(btn8);
		bottomLeft.add(btn9);
		bottomLeft.add(btn4);
		bottomLeft.add(btn5);
		bottomLeft.add(btn6);
		bottomLeft.add(btn1);
		bottomLeft.add(btn2);
		bottomLeft.add(btn3);
		bottomLeft.add(btn0);
		
		JButton btnPlus = new JButton("+");
		JButton btnMinus = new JButton("-");
		JButton btnMultiply = new JButton("*");
		JButton btnDivide = new JButton("/");
		JButton btnEquals = new JButton("=");
		
		bottomRight.add(btnDivide);
		bottomRight.add(btnMultiply);
		bottomRight.add(btnMinus);
		bottomRight.add(btnPlus);
		bottomRight.add(btnEquals);
		
		frame.setSize(300,430);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setVisible(true);
    }
}
