import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class BankingHub extends JFrame {
	
	public static JDesktopPane theDesktop;
	public static ArrayList<Client> clients;
	
	public BankingHub() {
		
		super("Fidgety Bank");
		clients = new ArrayList<Client>();
		setNimbus();
		
		JMenuBar bar = new JMenuBar();
		JMenu add = new JMenu("Add");
		JMenuItem addClient = new JMenuItem("Client");
		addClient.setActionCommand("Add Client");
		addClient.addActionListener(new MenuBarListener());
		JMenu view = new JMenu("View");
		JMenuItem viewClients = new JMenuItem("Clients");
		viewClients.setActionCommand("View Clients");
		viewClients.addActionListener(new MenuBarListener());
		
		add.add(addClient);
		bar.add(add);
		view.add(viewClients);
		bar.add(view);
		setJMenuBar(bar);
		
		JButton button1 = new JButton("Click Me!");
		//button1.setSize(50, 50);
		button1.setBounds(10, 90, 50, 50);
		
		theDesktop = new JDesktopPane();
		theDesktop.add(button1);
		add(theDesktop);
	}
	
	private static void setNimbus() {
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    JOptionPane.showMessageDialog(null, "Nimbus isn't available, please update java and try again");
		}
	}

}
