package Model;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Street extends DrawingCanvas{

    Color colorStreet = Color.web("#708090");
    Color colorLine = Color.WHITE;
    Color colorBlue = Color.web("#B0C4DE");
    Color colorGrey = Color.web("#D3D3D3");
    Font font = Font.font(24);


    public Street(double x, double y) {
        super(x, y);
    }


    public void drawStreet(){
        gc = getGraphicsContext2D();
        //street
        gc.strokeRect(5,155,650,150);
        gc.strokeRect(5,305,650,150);
        gc.strokeRect(5,455,650,150);
        gc.setFill(colorStreet);
        gc.fillRect(5,155,650,150);
        gc.setFill(colorBlue);
        gc.fillRect(5,305,650,150);
        gc.setFill(colorGrey);
        gc.fillRect(5,455,650,150);
        //line
        gc.strokeRect(200,220,50,20);
        gc.strokeRect(300,220,50,20);
        gc.strokeRect(400,220,50,20);
        gc.strokeRect(500,220,50,20);
        gc.strokeRect(200,370,50,20);
        gc.strokeRect(300,370,50,20);
        gc.strokeRect(400,370,50,20);
        gc.strokeRect(500,370,50,20);
        gc.strokeRect(200,520,50,20);
        gc.strokeRect(300,520,50,20);
        gc.strokeRect(400,520,50,20);
        gc.strokeRect(500,520,50,20);
        gc.setFill(colorLine);
        gc.fillRect(200,220,50,20);
        gc.fillRect(300,220,50,20);
        gc.fillRect(400,220,50,20);
        gc.fillRect(500,220,50,20);
        gc.fillRect(200,370,50,20);
        gc.fillRect(300,370,50,20);
        gc.fillRect(400,370,50,20);
        gc.fillRect(500,370,50,20);
        gc.fillRect(200,520,50,20);
        gc.fillRect(300,520,50,20);
        gc.fillRect(400,520,50,20);
        gc.fillRect(500,520,50,20);


        gc.setFont(font);
        gc.fillText("Road : Lane1",299,178);
        gc.fillText("Road : Lane2",299,338);
        gc.fillText("Road : Lane3",299,478);


    }


}
