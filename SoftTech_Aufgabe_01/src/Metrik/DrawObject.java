package Metrik;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.awt.Font;

public class DrawObject extends Canvas implements MouseListener {


    private float _x, _y;
    private double _x1, _y1, _x2, _y2;
    private int durchm = 50;
    private int kreis_x_1;
    private int kreis_y_1;
    private int kreis_x_2;
    private int kreis_y_2;

    public DrawObject() {
        _x = _y = 0;

        setSize(500, 500);
        setBackground(Color.blue);
        addMouseListener(this);
    }
    
    public void changeRadius(int i){
        durchm = i;
    }
    
    @Override
    public void paint(Graphics g) {
        if(_x == 0 && _y == 0) return;
        Graphics2D g2d = (Graphics2D) g; // cast
        g2d.setStroke(new BasicStroke(2.5F));
        Ellipse2D ellipse2D = new Ellipse2D.Float(_x-durchm/2, _y-durchm/2, durchm, durchm); // ell. ist da, aber noch kein mittel zum projizieren

        g2d.draw(ellipse2D); // zeichnet ellipse an x und y position mit w weite und h höhe
        
        // zeige Koordinaten der Kreise an
        g.setFont(new Font("Monotype", Font.BOLD, 12));
        g.setColor(Color.white);
        if(MainWindow.getClicks() == 0) {
            
            g.drawString("Kreis " + (MainWindow.getClicks()+1)+ ":"  + "   X: "+ _x +   "   Y: " + _y, 325, 25);
        } else {
            g.drawString("Kreis " + (MainWindow.getClicks()+1)+ ":"  + "   X: "+ _x + "   Y: " + _y, 325, 50);
            g.drawString("Distanz: " + getDistance(), 325, 75);
        }
        

        // zeichne eine linie zwischen den beiden mittelpunkten der kreise
        if(MainWindow.getClicks() == 0) {
            kreis_x_1 = (int) _x;
            kreis_y_1 = (int) _y;
        } else if (MainWindow.getClicks() == 1) {
            kreis_x_2 = (int) _x;
            kreis_y_2 = (int) _y;
            g.setColor(Color.black);
            g.drawLine(kreis_x_1, kreis_y_1, kreis_x_2, kreis_y_2);
        }
        

    }

    private float getDistance() {
		
		return (float)Math.sqrt((Math.pow(_x2-_x1,2))+(Math.pow(_y2-_y1,2)));
	}

	// besser, in eigener Klasse erzeugen und hier erben lassen, um auf unnötige methoden zu verzichten
    @Override
    public void mouseClicked(MouseEvent e) {

        Graphics2D g2d = (Graphics2D) getGraphics(); // cast
        switch(MainWindow.getClicks()) {
        case 0:
            _x1 = _x = e.getX(); // wird implizit gecasted, da x und y int
            _y1 = _y = e.getY();
            paint(getGraphics()); // kreis wird erzeugt, canvas repainted, damit kreis auch angezeigt
    		MainWindow.setClicks(MainWindow.getClicks()+1);            
        	break;
        case 1:
            _x2 = _x = e.getX(); // wird implizit gecasted, da x und y int
            _y2 = _y = e.getY();
            paint(getGraphics()); // kreis wird erzeugt, canvas repainted, damit kreis auch angezeigt
    		MainWindow.setClicks(MainWindow.getClicks()+1);   
        	break;
        case 2:
    		MainWindow.setClicks(0);
    		g2d.clearRect(0, 0, 500, 500);
        	break;
        	
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
