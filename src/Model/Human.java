package Model;


import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class Human extends DrawingCanvas {

    Color colorShirt = Color.web("#CC0033");
    Color colorShorts = Color.web("#99FFCC");
    Color colorSkin = Color.web("#FFCC99");
    Color colorSket = Color.web("#3333CC");
    Color colorRoll = Color.web("#F5FFFA");



    Color colorPink = Color.PINK;
    double speed = 1;

    public Human(double x, double y) {
        super(x, y);

    }

    public void draw(){
        drawHuman();
        drawBalloon();
    }




    public void drawHuman(){
        gc = getGraphicsContext2D();


        //head
        gc.strokeOval(65,329,35,35);
        gc.setFill(colorSkin);
        gc.fillOval(65,329,35,35);
        //body
        gc.strokeRect(75,365,15,30);
        gc.setFill(colorShirt);
        gc.fillRect(75,365,15,30);
        gc.strokeRect(75,396,15,5);
        gc.setFill(colorShorts);
        gc.fillRect(75,396,15,5);
        gc.strokeLine(82,401,82,403);
        //legs
        gc.strokeLine(90,401,94,415);
        gc.strokeLine(74,401,67,415);
        gc.strokeOval(92,415,10,10);
        gc.strokeOval(62,415,10,10);
        gc.setFill(colorSkin);
        gc.fillOval(92,415,10,10);
        gc.fillOval(62,415,10,10);
        //arms
        gc.strokeLine(91,366,104,373);
        gc.strokeOval(103,373,10,10);
        gc.strokeLine(74,366,56,373);
        gc.strokeOval(48,373,10,10);
        gc.setFill(colorSkin);
        gc.fillOval(103,373,10,10);
        gc.fillOval(48,373,10,10);
        //sket board
        gc.strokeRect(57,421,58,5);
        gc.setFill(colorSket);
        gc.fillRect(57,421,58,5);
        gc.strokeOval(92,426,10,10);
        gc.strokeOval(62,426,10,10);
        gc.setFill(colorRoll);
        gc.fillOval(92,426,10,10);
        gc.fillOval(62,426,10,10);

        //face
        gc.strokeArc(72,346,20,13,-180,180, ArcType.OPEN);
        //eyes
        gc.strokeArc(72,336,6,10,0,180,ArcType.OPEN);
        gc.strokeArc(85,336,6,10,0,180,ArcType.OPEN);

    }
    public void drawBalloon(){
        gc.strokeLine(98, 384, 130, 355);
        gc.strokeOval(128, 336, 30, 30);
        gc.setFill(colorPink);
        gc.fillOval(128,336,30,30);
    }

    public void goRight(){


        if(getTranslateX()>=275){
            setTranslateX(getTranslateX()+0);
        }else{

            setTranslateX(getTranslateX() + speed);}
    }

    public void goUp(){

        if(getTranslateY()<=-217){

            setTranslateY(getTranslateY() + 0);
        }else{
            setTranslateY(getTranslateY() - speed);}

    }

    public void goDown(){

        if(getTranslateY()>=-196){

            setTranslateY(getTranslateY() + 0);
        }else{

            setTranslateY(getTranslateY() + speed);}
    }

    public void goLeft(){

        if(getTranslateX()<=-205){
            setTranslateX(getTranslateX() + 0);

        }else {
            setTranslateX(getTranslateX() - speed);}

    }

    public void speedUp(){
        if(speed >=5){
            speed =4;
        }
        else{

            speed += 1;}
    }

    public void speedDown(){
        if(speed > 0){
            speed -= 1;
        }else{
            speed = 0;
        }
    }
}
