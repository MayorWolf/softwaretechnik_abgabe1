package Metrik;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MainWindow extends Frame implements WindowListener {
	static int clicks = 0;
	

    public MainWindow() {
        setTitle("Metrik v1.1.1");
        setSize(500,500);
        addWindowListener(this);    // muss auch aufgerüfen werden, sonst passiert nichts
        add(new DrawObject()); // canvas ist da, zeichenfunktion fehlt aber noch
        setMenuBar((new MainMenuBar()));
    }

    public void openWindow() {
        setVisible(true);
    }
    
    public static int getClicks() {
    	return clicks;
    }
    
    public static void setClicks(int i) {
    	clicks = i;
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }


}
