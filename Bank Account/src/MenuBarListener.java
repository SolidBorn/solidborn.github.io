import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.ListModel;

public class MenuBarListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e1) {
		
		switch(e1.getActionCommand()) {
		case "Add Client":
			JInternalFrame addClientFrame = new JInternalFrame("Add Client", false, false, false, false);
			addClientFrame.setLayout(new BorderLayout());
			addClientFrame.setSize(300, 200);
			//JInternalFrame frame = new JInternalFrame("title", Resizable, Closeable, Maxamizeable, Minimizable);
			
			JPanel addClientPanel = new JPanel();
			addClientPanel.setLayout(new BoxLayout(addClientPanel, BoxLayout.Y_AXIS));
			JPanel namePanel = new JPanel();
			namePanel.setLayout(new BorderLayout());
			namePanel.add(new JLabel("Name: "), BorderLayout.WEST);
			JTextField nameField = new JTextField();
			namePanel.add(nameField, BorderLayout.CENTER);
			addClientPanel.add(namePanel);
			JPanel agePanel = new JPanel();
			agePanel.setLayout(new BorderLayout());
			agePanel.add(new JLabel("Age: "), BorderLayout.WEST);
			JTextField ageField = new JTextField();
			agePanel.add(ageField, BorderLayout.CENTER);
			addClientPanel.add(agePanel);
			JPanel addressPanel = new JPanel();
			addressPanel.setLayout(new BorderLayout());
			addressPanel.add(new JLabel("Address: "), BorderLayout.WEST);
			JTextField adressField = new JTextField();
			addressPanel.add(adressField, BorderLayout.CENTER);
			addClientPanel.add(addressPanel);
			JPanel numberPanel = new JPanel();
			numberPanel.setLayout(new BorderLayout());
			numberPanel.add(new JLabel("Mobile #: "), BorderLayout.WEST);
			JTextField numberField = new JTextField();
			numberPanel.add(numberField, BorderLayout.CENTER);
			addClientPanel.add(numberPanel);
			JPanel accountTypePanel = new JPanel();
			accountTypePanel.setLayout(new FlowLayout());
			JCheckBox checkingAccount = new JCheckBox("Checkings");
			JCheckBox savingAccount = new JCheckBox("Savings");
			accountTypePanel.add(checkingAccount);
			accountTypePanel.add(savingAccount);
			addClientPanel.add(accountTypePanel);
			JPanel buttonPanel = new JPanel();
			buttonPanel.setLayout(new BorderLayout());
			JButton createButton = new JButton("Create Account");
			JButton cancelButton = new JButton("Cancel");
			buttonPanel.add(createButton, BorderLayout.CENTER);
			buttonPanel.add(cancelButton, BorderLayout.EAST);
			addClientPanel.add(buttonPanel);
			
			cancelButton.addActionListener(e -> {
				addClientFrame.dispose();
			});
			createButton.addActionListener(e -> {
				addClientFrame.dispose();
				Client newClient = new Client();
				newClient.makeClient(nameField.getText(), Integer.parseInt(ageField.getText()), adressField.getText(), numberField.getText(), checkingAccount.isSelected(), savingAccount.isSelected());
				BankingHub.clients.add(newClient);
			});
			
			addClientFrame.add(addClientPanel, BorderLayout.CENTER);
			BankingHub.theDesktop.add(addClientFrame);
			addClientFrame.setVisible(true);
			break;
			
		case "View Clients":
			JInternalFrame viewClientsFrame = new JInternalFrame("All Clients", true, true, true, true);
			viewClientsFrame.setLayout(new BorderLayout());
			viewClientsFrame.setSize(500, 400);
			//JInternalFrame frame = new JInternalFrame("title", Resizable, Closeable, Maxamizeable, Minimizable);
			
			JPanel leftPanel = new JPanel();
			leftPanel.setLayout(new BorderLayout());
			DefaultListModel clients = new DefaultListModel();
			for(Client c : BankingHub.clients)
				clients.addElement(c.getName());
			JList clientList = new JList(clients);
			leftPanel.add(clientList, BorderLayout.CENTER);
			JPanel rightPanel = new JPanel();
			JSplitPane splitPanel = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);
			
			
			viewClientsFrame.add(splitPanel, BorderLayout.CENTER);
			BankingHub.theDesktop.add(viewClientsFrame);
			viewClientsFrame.setVisible(true);
			break;
		default:
			System.err.println("Command not recognized: " + e1.getActionCommand());
			break;
		}
	}

}
