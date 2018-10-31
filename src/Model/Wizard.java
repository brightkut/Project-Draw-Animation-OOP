package Model;

import javafx.scene.paint.Color;

public class Wizard extends Human {
    Color colorHat = Color.web("#A020F0");
    Color colorWhite = Color.WHITE;
    Color colorGreen = Color.web("#3CB371");

    public Wizard(double x, double y) {
        super(x, y);
    }


    public void draw(){
        drawHuman();
        drawWizard();
    }

    public void drawWizard() {

        //hat
        gc.strokeRect(62, 325, 40, 4);
        gc.strokeRect(72, 304, 20, 20);
        gc.setFill(colorHat);
        gc.fillRect(62, 325, 40, 4);
        gc.fillRect(72, 304, 20, 20);



//        245 130
        //wand
        gc.strokeLine(98, 394, 130, 340);
        gc.strokeOval(126, 317, 25, 25);
        gc.setFill(colorGreen);
        gc.fillOval(126, 317, 25, 25);
        gc.strokeOval(128, 320, 20, 20);
        gc.setFill(colorWhite);
        gc.fillOval(128, 320, 20, 20);
        gc.strokeOval(130, 322, 15, 15);
        gc.setFill(colorGreen);
        gc.fillOval(130, 322, 15, 15);
        gc.strokeOval(133, 324, 10, 10);
        gc.setFill(colorWhite);
        gc.fillOval(133, 324, 10, 10);
        gc.strokeOval(135, 326, 5, 5);
        gc.setFill(colorGreen);
        gc.fillOval(135, 326, 5, 5);


    }
    public void goRight(){


        if(getTranslateX()>=275){
            setTranslateX(getTranslateX()+0);
        }else{

            setTranslateX(getTranslateX() + speed);
    }
    }

    public void goUp(){

        if(getTranslateY()<=-351){

            setTranslateY(getTranslateY() + 0);
        }else{
            setTranslateY(getTranslateY() - speed);
    }

    }

    public void goDown(){

        if(getTranslateY()>=-338){

            setTranslateY(getTranslateY() + 0);
        }else{

            setTranslateY(getTranslateY() + speed);
    }
    }

    public void goLeft(){

        if(getTranslateX()<=-205){
            setTranslateX(getTranslateX() + 0);

        }else {
            setTranslateX(getTranslateX() - speed);
    }

    }


}







