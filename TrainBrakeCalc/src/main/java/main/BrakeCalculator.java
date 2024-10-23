package main;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import rolling_stocks.Locomotive;

public class BrakeCalculator implements ListSelectionListener {
	JList<String> selectLoco;
	JLabel label;
	JScrollPane scrollPane;
	Locomotive[] locoList = Locomotive.values();
	String[] locomotives = Locomotive.getLocoModels();
	
	

	BrakeCalculator() {
		JFrame frame = new JFrame("Use a Text Field");

		frame.setLayout(new FlowLayout());
		frame.setSize(200, 160);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		selectLoco = new JList<String>(locomotives);
		selectLoco.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		scrollPane = new JScrollPane(selectLoco);
		scrollPane.setPreferredSize(new Dimension(120, 90));
		
		label = new JLabel("Please choose a name");
		
		selectLoco.addListSelectionListener(this);
		
		frame.add(scrollPane);
		frame.add(label);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new BrakeCalculator();
			}

		});
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		int ind = selectLoco.getSelectedIndex();
		if (ind != -1) {
			label.setText("Current selection: " + locomotives[ind]);
		} else {
			label.setText("Please choose a locomotive");
		}
		
	}
}
