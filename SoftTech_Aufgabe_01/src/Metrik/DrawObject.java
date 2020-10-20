package Metrik;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.awt.Font;
import java.awt.FontMetrics;

public class DrawObject extends Canvas implements MouseListener {

    private float _x, _y;
    private static Font monoFont = new Font("Monospaced", Font.Bold, 20);

    public DrawObject() {
        _x = _y = 0;

        setSize(500, 500);
        setBackground(Color.blue);
        addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        if(_x == 0 && _y == 0) return;
        Graphics2D g2d = (Graphics2D) g; // cast
        g2d.setStroke(new BasicStroke(2.5F));
        Ellipse2D ellipse2D = new Ellipse2D.Float(_x, _y, 50, 50); // ell. ist da, aber noch kein mittel zum projizieren

        g2d.draw(ellipse2D); // zeichnet ellipse an x und y position mit w weite und h höhe

        g.setFont(monoFont);
        FontMetrics fm = g.getFontMetrics();
        w = fm.stringWidth("TEST");
        h = fm.getAscent();
        g.drawString("TEST", 120 - (w/2), 120 + (h / 4));


    }

    // besser, in eigener Klasse erzeugen und hier erben lassen, um auf unnötige methoden zu verzichten
    @Override
    public void mouseClicked(MouseEvent e) {

        Graphics2D g2d = (Graphics2D) getGraphics(); // cast
    	if(MainWindow.getClicks() > 1) {
    		MainWindow.setClicks(0);
    		g2d.clearRect(0, 0, 500, 500);
    	}
    	else {
        _x = e.getX(); // wird implizit gecasted, da x und y int
        _y = e.getY();
        paint(getGraphics()); // kreis wird erzeugt, canvas repainted, damit kreis auch angezeigt
		MainWindow.setClicks(MainWindow.getClicks()+1);
        
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
