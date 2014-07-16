package com.spconger.MultipleForms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SecondForm {

	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JButton button;
	
	public SecondForm(){
		createFrame();
	}
	
	private void createFrame(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setBounds(400,500, 200,200);
		frame.add(createPanel());
		frame.setVisible(true);
	}
	
	private JPanel createPanel(){
		panel = new JPanel();
		label = new JLabel("Hi from Second Form");
		button = new JButton("close");
		button.addActionListener(new CloseListener());
		
		panel.add(label);
		panel.add(button);
		return panel;
	}
	
	private class CloseListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			frame.dispose();
			
		}
		
	}
}
