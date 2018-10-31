package Model;

import javafx.scene.paint.Color;

public class Moon extends DrawingCanvas {

    Color colorHead = Color.YELLOW;
    Color colorSkyNight = Color.BLACK;

    public Moon(double x, double y) {
        super(x, y);
    }

    public void drawMoon(){
        gc = getGraphicsContext2D();
        gc.strokeOval(495,40,70,70);
        gc.setFill(colorHead);
        gc.fillOval(495,40,70,70);
        gc.strokeOval(450,40,70,70);
        gc.setFill(colorSkyNight);
        gc.fillOval(460,40,70,70);

    }
}
