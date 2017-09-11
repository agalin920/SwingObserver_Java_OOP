package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
	
	public void go(){
		JFrame frame = new JFrame();
		
		JButton button = new JButton("¿Debo hacerlo?");
		
		//Registrando Observadores
		button.addActionListener(new AngelListener());
		button.addActionListener(new DiabloListener());
		button.addActionListener(new NeutralListener());
		
		//Anonymous 
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				System.out.println("Anonymous Class, needs only one method and this is an interface");
			}
		});
				
		frame.getContentPane().add(BorderLayout.CENTER,button);
		frame.setSize(300,100 );
		frame.setVisible(true);
	}

}
