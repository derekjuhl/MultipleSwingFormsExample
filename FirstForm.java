package com.spconger.MultipleForms;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FirstForm {
	
	private JFrame frame;
	private JPanel mainPanel;
	private JPanel centerPanel;
	private JPanel buttonPanel;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JButton btnNewForm;
	private JButton btnExit;
	
	public FirstForm(){
		createFrame();
	}
	
	private void createFrame(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(300,400,300,200);
		frame.add(createMainPanel());
		frame.setVisible(true);
	}
	
	private JPanel createMainPanel(){
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(createCenterPanel(),BorderLayout.CENTER);
		mainPanel.add(createButtonPanel(), BorderLayout.SOUTH);
		return mainPanel;
	}
	
	private JPanel createCenterPanel(){
		centerPanel=new JPanel();
		centerPanel.setLayout(new GridLayout(2,2,5,5));
		
		label1 = new JLabel("label one");
		label2 = new JLabel("label two");
		label3 = new JLabel("label three");
		label4 = new JLabel("label four");
		
		centerPanel.add(label1);
		centerPanel.add(label2);
		centerPanel.add(label3);
		centerPanel.add(label4);
		
		return centerPanel;
	}
	
	private JPanel createButtonPanel(){
		buttonPanel=new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		btnNewForm =new  JButton("Open form");
		btnNewForm.addActionListener(new OpenFormListener());
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ExitListener());
		
		buttonPanel.add(btnNewForm);
		buttonPanel.add(btnExit);
		
		return buttonPanel;
	}
	
	private class OpenFormListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			SecondForm second = new SecondForm();
			
		}
	}
	
	private class ExitListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
			
		}
		
	}
}
