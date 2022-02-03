package termproject;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

import net.miginfocom.swing.MigLayout;


public class Main extends JFrame {
	JPanel pnlItems;
	JButton addItems;
	JButton viewItems;
	ArrayList<Item> itemsList;
	
	public Main()
	{	
		createGUI();
	}
	
	
	
    public void createGUI() {
    	//First page
    	itemsList = new ArrayList<Item>();
    	pnlItems = new JPanel();
    	addItems = new JButton("Add items"); //create button
    	viewItems = new JButton("View all items"); //display button

    	pnlItems.add(addItems); 
    	pnlItems.add(viewItems); 
		add(pnlItems, BorderLayout.CENTER);
		
		addItems.addActionListener(new ActionListener() { //when create is pressed
			public void actionPerformed(ActionEvent e) {
				CreateItemGUI itemframe = new CreateItemGUI(itemsList);
				itemframe.setTitle("Item Details");
				itemframe.setSize(400, 300);
				itemframe.setVisible(true);
			}
		});
		
		viewItems.addActionListener(new ActionListener() { //when display is pressed
			public void actionPerformed(ActionEvent e) {
				DisplayItemGUI item = new DisplayItemGUI(itemsList);
				item.setTitle("Show Items");
				item.setSize(400, 300);
				item.setVisible(true);
			}
		});
		
		
	}


	public static void main(String[] args) {
		Main mainGUI = new Main();
		mainGUI.setTitle("Main Window");
		mainGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainGUI.setSize(400, 300);
		mainGUI.setVisible(true);

	}

}
