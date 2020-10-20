package Metrik;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MainWindow extends Frame implements WindowListener {

    public MainWindow() {
        setTitle("Programm für SoftTech");
        setSize(500,500);
        addWindowListener(this);    // muss auch aufgerüfen werden, sonst passiert nichts
        add(new DrawObject()); // canvas ist da, zeichenfunktion fehlt aber noch
        setMenuBar((new MainMenuBar()));
    }

    public void openWindow() {
        setVisible(true);
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
