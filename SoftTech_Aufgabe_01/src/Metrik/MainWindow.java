package Metrik;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MainWindow extends Frame implements WindowListener {
	static int clicks = 0;
	private static DrawObject obj;
	

    public MainWindow() {
    	obj = new DrawObject();
        setTitle("Metrik v1.2.2");
        setSize(500,500);
        addWindowListener(this);    // muss auch aufgerüfen werden, sonst passiert nichts
        add(obj);
        setMenuBar((new MainMenuBar()));
    }

    public static DrawObject getDrawObject() {
    	
    	return obj;
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
