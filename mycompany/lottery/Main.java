package mycompany.lottery;

import java.awt.EventQueue;

import mycompany.gui.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			@Override
            public void run() {
            	Login log = new Login();
            	log.setVisible(true); 
            }
        });
	}

}
