package com.base.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends Main{
	
	
	
	
	Client c = new Client();
	
	protected void initButton()
	{
		btnLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent ae) 
			{
				String username = Main.txtUsername.getText();
				String password = Main.pwdPassword.getText();
				
				
				
				System.out.println("Username: "+username);
				System.out.println("Password: "+password);
				frmInfomeshLogin.dispose();
				
				c.initialize();
				
			}
		});
		
		
		
	}
	
	
	
}
