
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PogodiBroj extends JPanel  {

	JTextField polje ;
	
	public class ButtonHandler implements ActionListener {

		String messege;

		public void actionPerformed(ActionEvent evt) {
			String command = evt.getActionCommand();
			if (command.equals("Higher"))
				doHigher();
			else if (command.equals("Lower"))
				doLower();
			else if (command.equals("True"))
				doTrue();
		}

		private void doTrue() {

			messege = "Pritisno su tacno";
			polje.setText(messege);
			repaint();

		}

		private void doHigher() {
			messege = "Pritisno su vece";
			polje.setText(messege);
			repaint();

		}

		private void doLower() {
			messege = "Pritisno su vece";
			polje.setText(messege);
			repaint();

		}

	}

	public static void main(String[] args) {
		PogodiBroj display = new PogodiBroj();
		JFrame window = new JFrame("Pogodi Broj");
		
		JPanel content = new JPanel();
		ButtonHandler listener = new ButtonHandler();
		
		content.setLayout(new BorderLayout());
		content.add(display, BorderLayout.CENTER);
		
		JButton lower = new JButton();
		lower.addActionListener(listener);
		JButton heigher = new JButton();	
		heigher.addActionListener(listener);
		JButton truT = new JButton();
		truT.addActionListener(listener);
		
		content.add(lower, BorderLayout.SOUTH);
		content.add(truT, BorderLayout.EAST);
		content.add(heigher, BorderLayout.WEST);
		
		window.setContentPane(content);
		window.setSize(300, 300);
		window.setLocation(100, 100);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

}
