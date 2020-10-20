package Metrik;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        MenuItemListener menuItemListener = new MenuItemListener();
        red.addActionListener(menuItemListener);
        yel.addActionListener(menuItemListener);
        blu.addActionListener(menuItemListener);
        gre.addActionListener(menuItemListener);
        
        
        
        _menu = new Menu("Hintergrundfarbe");
        _menu.add(red);
        _menu.add(yel);
        _menu.add(blu);
        _menu.add(gre);

        add(_menu);
    }
    
    class MenuItemListener implements ActionListener {

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
			
			}
			
		}    
     }
}
