package com.base.main;

import javax.swing.JFrame;
import java.awt.Color;

public class Client {

	private JFrame frmInfomeshClient;
	
	/*public Client()
	{
		initialize();
	}
	*/
	//creates window
	protected void initialize() {
		frmInfomeshClient = new JFrame();
		frmInfomeshClient.setTitle("Infomesh Client");
		frmInfomeshClient.setResizable(false);
		frmInfomeshClient.getContentPane().setBackground(Color.BLACK);
		frmInfomeshClient.setVisible(true);
		frmInfomeshClient.setSize(800,800);
		frmInfomeshClient.setLocationRelativeTo(null);
		frmInfomeshClient.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
