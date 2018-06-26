import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Bank {
	
	public static void main(String[] args) {
		BankingHub bank = new BankingHub();
		bank.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bank.setSize((int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth() * 0.85), (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight() * 0.85));
		bank.setVisible(true);
		bank.setLocation(10, 10);
	}

}
