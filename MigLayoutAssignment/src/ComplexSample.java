
import java.awt.Color;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;



import net.miginfocom.swing.MigLayout;

/**
 * 
 * MigLayout Assignment
 * James Gleeson
 * Maja Grings
 * Jason Keane
 * 12 - December - 2014
 * Refer to Read Me For Instructions
 * 
 */
public class ComplexSample extends AbstractSampleFrame {

	public ComplexSample() {
		super("Donkey Sanctuary : Query DB");
	}

	protected void initComponents() {
		MigLayout layout = new MigLayout("wrap 2","[] [grow] []","[] [grow] [grow] [grow] []");
		setLayout(layout);
		
		
		//put all the panels together
		
		
		add(getClientPanel(),"grow");
		add(getAdditionalInformationPanel(),"grow");
		add(getNotesPanel(),"grow, span 10");
		
		
		add(getButtonsPanel(),"grow, span 3");
		add(getInformationPanel(),"grow, span 10");
		pack();
	}
	
	
	
	private JPanel getInformationPanel() {
		JPanel panel = getPanel("Report Generator");
		panel.setBackground(new Color(204, 153, 255));
		panel.setOpaque(true);
		panel.setLayout(new MigLayout("wrap 3","[] 16 [grow] []"));
		panel.add(new JLabel("Species"),"right");
		panel.add(new JTextField("Horse"),"growx");
		panel.add(new JCheckBox("In shelter",true));
		panel.add(new JLabel("From"),"right");
		panel.add(new JTextField("  01-01-2014   "),"growx");
		panel.add(new JCheckBox("Adopted",false));
		//field1.setEditable(true);
		panel.add(new JLabel("To"),"right");
		panel.add(new JTextField("  01-07-2014   "),"growx");
		panel.add(new JCheckBox("Fostered",false));
		panel.add(new JSeparator(),"growx");
		panel.add(getImageButton("images/edit-redo.png", "Generate Report"),"wrap");
		
			
		return panel;
	}
	
	private JPanel getClientPanel() {
		JPanel panel = getPanel("Enter in Animal Record");
		panel.setBackground(new Color(204, 153, 255));
		panel.setOpaque(true);
		JComboBox<String> ages = new JComboBox<String>();
		ages.addItem("1");
		ages.addItem("2");
		ages.addItem("3");
		ages.addItem("4");
		ages.addItem("5");
		ages.addItem(">5");
		panel.setLayout(new MigLayout("wrap 2","[] 18 []"));
		
		panel.add(new JLabel("Animal Type:"),"right");
		//panel.add(new JLabel("Donkey"));
		panel.add(new JTextField("Donkey"),"growx");
	
		
		panel.add(new JLabel("Animal name:"),"right");
		panel.add(new JTextField("Jack Donk"),"growx");
		
		panel.add(new JLabel("Vaccination Date:"),"right");
		panel.add(new JTextField("January 6th 2014"),"growx");
		
		panel.add(new JLabel("Vet:"),"right");
		panel.add(new JTextField("John Steer"),"growx");
		
		panel.add(new JLabel("Registration #:"),"right");
		panel.add(new JTextField("#4534-AAC-324"),"growx");
		
		panel.add(new JLabel("Age"),"right");
		panel.add(ages,"growx");
		//panel.add(new JTextField("2"),"growx");
		
		panel.add(new JLabel("Micorchip Number:"),"right");
		panel.add(new JTextField("#9860000023456"),"growx");
		
		panel.add(getImageButton("images/list-add.png", "Enter into DB"));
		panel.add(getImageButton("images/edit-redo.png", "Update DB"),"sg 1");
		panel.add(getImageButton("images/list-remove.png", "Delete Entry"),"sg 1");
		panel.add(getImageButton("images/edit-redo.png", "Query DB"),"sg 1");
		
		return panel;
		
	}
	
	private JPanel getAdditionalInformationPanel() {
		JPanel panel = getPanel("Additional information");
		panel.setLayout(new MigLayout("wrap 2","[] 16 [grow][] []"));
		panel.setBackground(new Color(204, 153, 255));
		panel.setOpaque(true);
		JComboBox<String> wormingDose = new JComboBox<String>();
		wormingDose.addItem("1 Packet");
		wormingDose.addItem("2 Packets");
		wormingDose.addItem("3 Packets");
		wormingDose.addItem("4 Packets");
		wormingDose.addItem("5 Packets");
		wormingDose.addItem(">5 Packets");
		
		JComboBox<String> homing = new JComboBox<String>();
		homing.addItem("Yes");
		homing.addItem("No");
		
		panel.add(new JLabel("Worming dose:"),"right");
		panel.add(wormingDose,"growx");
		
		//panel.add(new JButton("test"));
		
		panel.add(new JLabel("Worming Date:"),"right");
		panel.add(new JTextField("01-01-2014"),"growx");
		
		panel.add(new JLabel("Wormed by:"),"right");
		panel.add(new JTextField("Bad Mama"),"growx");

		panel.add(new JLabel("Area found"),"right");
		panel.add(new JTextField("Co Clare"),"growx");

		panel.add(new JLabel("Handed in by "),"right");
		panel.add(new JTextField("Clare Co Co"),"growx");

		panel.add(new JLabel("Whereabouts"),"right");
		panel.add(new JTextField("In foster care"),"growx");

		panel.add(new JLabel("Available for homing"),"right");
		panel.add(homing,"growx");
		
		panel.add(getImageButton("images/edit-redo.png","Edit"),"growx");
		panel.add(new JSeparator(),"growx");
		return panel;
	}
	
	private JPanel getNotesPanel() {
		JPanel panel = getPanel("NOTES");
		panel.setLayout(new MigLayout("wrap 4","[grow] 16 [] 32 [] []","[grow,:100:] [] [] []"));
		panel.setBackground(new Color(204, 153, 255));
		panel.setOpaque(true);
		
		panel.add(getTable(""),
				"grow, span 3");
		panel.add(getImageButton("images/list-add.png", "Add"),"split 3, flowy, sg 1, top");
		panel.add(getImageButton("images/edit-redo.png", "Edit"),"sg 1");
		panel.add(getImageButton("images/list-remove.png", "Delete"),"sg 1, wrap");
		
		return panel;
	}
		
	private JPanel getButtonsPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new MigLayout("","[] [grow, right]"));
		
		panel.add(new JButton("Export"),"sg 1");
		panel.add(getImageButton("images/document-save.png", "Save"),"split 2, sg 1");
		panel.add(getImageButton("images/system-log-out.png", "Cancel"),"sg 1");
		
		return panel;
	}
	
	private JPanel getPanel(String title) {
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createTitledBorder(title));
		return panel;
	}
	
	private JButton getImageButton(String imagePath, String text) {
		java.net.URL imgURL = getClass().getResource(imagePath);
		JButton button = new JButton(text,new ImageIcon(imgURL));
		return button;
	}
	
	private JScrollPane getTable(Object...columns) {
		JTable table = new JTable(new Object[0][0], columns);
		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);
		return scrollPane;
	}
	

}
	
	
	
	
		
	
	
	

	


