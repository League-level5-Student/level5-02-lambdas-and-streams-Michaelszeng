package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener(e -> {
			String s1 = JOptionPane.showInputDialog("give number: ");
			String s2 = JOptionPane.showInputDialog("give more number: ");
			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(s2);
			System.out.println(n1+n2);
		});
		randNumber.addActionListener(e -> {
			Random r = new Random();
			int i = r.nextInt(10);
			System.out.println(i);
		});
		tellAJoke.addActionListener(e -> System.out.println("youre life"));
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
		
		
	}
}
