package Model;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class DrawingCanvas extends Canvas {
    private double setWidth = 650;
    private double setHeight = 650;
    GraphicsContext gc;


    public DrawingCanvas(double x , double y){
        setTranslateX(x);
        setTranslateY(y);
        setWidth(setWidth);
        setHeight(setHeight);
    }


}
