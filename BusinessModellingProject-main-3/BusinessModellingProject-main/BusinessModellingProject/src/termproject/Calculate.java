package termproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculate {
	
	public static void main(String[] args) {
		mini m = new mini();
	}

}

class mini extends JFrame implements ActionListener{
	JLabel l1;
	JTextField t1;
	
	JLabel l2;
	JTextField t2;
	
	JButton b;
	JLabel l3;
	
	public mini() {
		setLayout(new FlowLayout());
		
		l1 = new JLabel("Total Cost �");
		t1 = new JTextField(20);
		
		l2 = new JLabel("VAT rate%");
		t2 = new JTextField(20);
		
		b = new JButton("CALCULATE");
		
		l3 = new JLabel("RESULT");
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		add(l3);
		
		b.addActionListener(this);
		
		setVisible(true);
		setSize(250, 400);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		double num1 = Double.parseDouble(t1.getText());
		double num2 = Double.parseDouble(t2.getText());
		
		double value = num1 * num2 + num1;
		l3.setText(""+value);
		
	}
	
}
