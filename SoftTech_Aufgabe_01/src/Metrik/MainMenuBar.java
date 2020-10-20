package Metrik;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MainMenuBar extends MenuBar {

    private Menu _menu; // _ am Anfang der Variable als Konvention, um direkt bei tippen des _ alle selbst erzeugten variablen sehen zu können

    public MainMenuBar() {
    	MenuItem red = new MenuItem("Farbe: rot");
        red.setActionCommand("red");
        
    	MenuItem yel = new MenuItem("Farbe: gelb");
        yel.setActionCommand("yellow");
        
    	MenuItem blu = new MenuItem("Farbe: blau");
        blu.setActionCommand("blue");
        
    	MenuItem gre = new MenuItem("Farbe: gruen");
		gre.setActionCommand("green");
		
		MenuItem radius = new MenuItem("Radius");
		radius.setActionCommand("radius");

        MenuItemListener menuItemListener = new MenuItemListener();
        red.addActionListener(menuItemListener);
        yel.addActionListener(menuItemListener);
        blu.addActionListener(menuItemListener);
		gre.addActionListener(menuItemListener);
		radius.addActionListener(menuItemListener);
        
        
        
        _menu = new Menu("Hintergrundfarbe");
        _menu.add(red);
        _menu.add(yel);
        _menu.add(blu);
		_menu.add(gre);
		_menu.addSeparator();
		_menu.add(radius);

        add(_menu);
    }
	
	
	
    class MenuItemListener implements ActionListener {

		int radi;

		@Override
		public void actionPerformed(ActionEvent e) {
			DrawObject temp = MainWindow.getDrawObject();
			switch(e.getActionCommand()) {
			case "red":
				temp.setBackground(Color.red);
				break;
			case "yellow":
				temp.setBackground(Color.yellow);
				break;
			case "blue":
				temp.setBackground(Color.blue);
				break;
			case "green":
				temp.setBackground(Color.green);
				break;
			case "radius":
				// öffne das jpanel
				radi = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte Radius eingeben: "));
				temp.changeRadius(radi*2);
				System.out.println("Radius gesetzt auf " + radi);
			}
			
		}  
		
		
		
	 }
	 
}
