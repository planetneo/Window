package com.base.main;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Main{

	//Variables
	protected static JFrame frmInfomeshLogin;
	protected static JTextField txtUsername;
	protected static JPasswordField pwdPassword;
	
	//Objects
	static JButton btnLogin = new JButton("Login");
	static Button btn = new Button();
	
	//Initializes all methods
	private static void initialize() {
		initWindow();
		btn.initButton();
	}
	
	//initializes the window class
	private static void initWindow()
	{
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		//All Placements on window.
		frmInfomeshLogin = new JFrame();
		frmInfomeshLogin.setTitle("Infomesh Login");
		frmInfomeshLogin.getContentPane().setBackground(Color.BLACK);
		frmInfomeshLogin.setResizable(false);
		frmInfomeshLogin.getContentPane().setLayout(null);
		
		JLabel lblInfomesh = new JLabel("Infomesh");
		lblInfomesh.setFont(new Font("Helvetica Neue", Font.BOLD, 31));
		lblInfomesh.setForeground(Color.WHITE);
		lblInfomesh.setBounds(21, 17, 243, 94);
		frmInfomeshLogin.getContentPane().add(lblInfomesh);
		
		JLabel lblAProjectBy = new JLabel("A project by Roget Neo Alabastro");
		lblAProjectBy.setFont(new Font("Helvetica Neue", Font.BOLD, 15));
		lblAProjectBy.setForeground(Color.WHITE);
		lblAProjectBy.setBounds(21, 78, 262, 54);
		frmInfomeshLogin.getContentPane().add(lblAProjectBy);	
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setBounds(40, 231, 62, 16);
		frmInfomeshLogin.getContentPane().add(lblUsername);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		txtUsername.setBounds(6, 250, 134, 28);
		frmInfomeshLogin.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBackground(Color.WHITE);
		lblPassword.setBounds(40, 278, 61, 16);
		frmInfomeshLogin.getContentPane().add(lblPassword);
		
		//Password Text Field
		pwdPassword = new JPasswordField();
		pwdPassword.setBounds(6, 293, 134, 28);
		frmInfomeshLogin.getContentPane().add(pwdPassword);
		
		//Button for login... Action Listener in Button class.
		btnLogin.setBounds(16, 333, 117, 29);
		frmInfomeshLogin.getContentPane().add(btnLogin);
		
		JButton btnNewAccount = new JButton("New Account");
		btnNewAccount.setBounds(166, 333, 117, 29);
		frmInfomeshLogin.getContentPane().add(btnNewAccount);
		frmInfomeshLogin.setBackground(Color.WHITE);
		frmInfomeshLogin.setVisible(true);
		frmInfomeshLogin.setSize(300,400);
		frmInfomeshLogin.setLocationRelativeTo(null);
		frmInfomeshLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	public static void main(String[] args)
	{
		initialize();
	}
}
