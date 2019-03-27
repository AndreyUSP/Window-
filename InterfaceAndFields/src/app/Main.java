package app;

import java.awt.Color;

import app.core.Window;
import app.sendBox.Example;


public class Main {

    public static void main(String[] args) {
        Window window = new Window("Window", 640, 640);
        window.addLayer(new Example("Поле 1", Color.PINK));
        window.addLayer(new Example("Поле 2", Color.yellow));


    }

}