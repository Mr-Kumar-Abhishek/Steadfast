package com.Steadfast;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Steadfast extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Steadfast() {
		SUI();
	}
	
	private void SUI() {
		setTitle("Steadfast Downloader");
		setSize(300, 200); // setting a small size for now
		setLocationRelativeTo(null); //center window
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		//this prevents GUI from hanging in certain situations. 
		EventQueue.invokeLater(new Runnable(){ 
			@Override
			public void run(){
				Steadfast main_ui = new Steadfast();
				main_ui.setVisible(true);
			}
		});
	}

}
