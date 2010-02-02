package org.javaconcept.main;

import org.jdesktop.swingx.JXButton;
import org.jdesktop.swingx.JXFrame;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JXFrame frame = new JXFrame();
		frame.getContentPane().add(new JXButton("Add"));
		frame.setVisible(true);	
		frame.setLocation(300, 200);
		frame.pack();
		
		//JOptionPane.showMessageDialog(null, "JAVA CONCEPT PORTAIL");
	}

}
