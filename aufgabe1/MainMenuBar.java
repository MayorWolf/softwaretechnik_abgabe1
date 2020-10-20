package Metrik;

import java.awt.*;

public class MainMenuBar extends MenuBar {

    private Menu _menu; // _ am Anfang der Variable als Konvention, um direkt bei tippen des _ alle selbst erzeugten variablen sehen zu können

    public MainMenuBar() {
        _menu = new Menu("Hintergrundfarbe");
        _menu.add(new MenuItem("Farbe: rot"));
        _menu.add(new MenuItem("Farbe: gelb"));
        _menu.add(new MenuItem("Farbe: blau"));
        _menu.add(new MenuItem("Farbe: grün"));

        add(_menu);
    }
}
