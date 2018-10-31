package Controller;

import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;
import Model.*;

import java.io.IOException;
import java.util.ArrayList;

public class ControllerHome {


    private final double setX = -205;
    private final double setY = -204;


    private Background bg;
    private Sun sun;
    private Cloud cloud;
    private Star star;
    private Star star2;
    private Star star3;
    private Star star4;
    private Star star5;
    private Star star6;
    private Star star7;
    private Star star8;
    private Star star9;
    private Star star10;
    private Star star11;
    private Star star12;
    private Star star13;
    private Star star14;
    private Star star15;
    private Star star16;
    private Star star17;
    private Star star18;
    private Star star19;
    private  Star star20;
    private Moon moon;
    private Street street;
    private Wizard wizard;
    private Alien alien;
    private Human human;
    private King king;

    private HumanAction keyAction;
    private WizardAction keyAction2;
    private KingAction keyAction3;
    private AlienAction keyAction4;

    private AnimationTimer timer;



    @FXML
    private Pane pane;

    @FXML
    public void initialize(){
//        drawing = new Drawing(-205,-204);
        bg = new Background(-205,-204);
        sun = new Sun(-205,-204);
        cloud = new Cloud(-205,-204);
        star = new Star(-400,-204);
        star3 = new Star(-415,-215);
        star4 = new Star(-398,-175);
        star5 = new Star(-420,-170);
        star6 = new Star(-385,-170);
        star7 = new Star(-380,-185);
        star8 = new Star(-430,-225);
        star2 = new Star(-400,-235);
        star9 = new Star(-430,-204);
        moon = new Moon(-205,-204);
        street = new Street(-205,-204);
        wizard = new Wizard(-205,-350);
        alien = new Alien(-205,-204);
        human = new Human(-205,-204);
        king = new King(-205,-50);




        //cloud animation

        TranslateTransition translate = new TranslateTransition(
                Duration.millis(3000), cloud);
        translate.setFromX(cloud.getTranslateX());
        translate.setToX(cloud.getTranslateX() + 270);
        translate.setCycleCount(Animation.INDEFINITE);
        translate.setAutoReverse(true);
        translate.play();

        //sun animation

        FadeTransition fade = new FadeTransition(
                Duration.millis(5200),
                sun
        );
        fade.setFromValue(1.0);
        fade.setToValue(0);
        fade.setCycleCount(Animation.INDEFINITE);
        fade.setAutoReverse(true);
        fade.play();



        display();
        keyAction = new HumanAction(human);
        keyAction2 = new WizardAction(wizard);
        keyAction3 = new KingAction(king);
        keyAction4 = new AlienAction(alien);

        timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                keyAction.action();
                keyAction2.action();
                keyAction3.action();
                keyAction4.action();

            }
        };
        timer.start();
        //System.out.println(pane.getParent());
        pane.getParent().setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                    case W:
                        keyAction.setMoveUp(true);
                        break;
                    case D:

                        keyAction.setMoveRight(true);
                        break;
                    case S:

                        keyAction.setMoveDown(true);
                        break;
                    case A:

                        keyAction.setMoveLeft(true);
                        break;
                    case UP:
                        keyAction.setSpeedUp(true);
                        break;
                    case DOWN:
                        keyAction.setSpeedDown(true);
                        break;
                        //key2
                    case T:
                        keyAction2.setMoveUp(true);
                        break;
                    case H:

                        keyAction2.setMoveRight(true);
                        break;
                    case G:

                        keyAction2.setMoveDown(true);
                        break;

                    case F:
                        keyAction2.setMoveLeft(true);
                        break;
                    case RIGHT:
                        keyAction2.setSpeedUp(true);
                        break;
                    case LEFT:
                        keyAction2.setSpeedDown(true);
                        break;
                        //key3
                    case I:
                        keyAction3.setMoveUp(true);
                        break;
                    case L:

                        keyAction3.setMoveRight(true);
                        break;
                    case K:

                        keyAction3.setMoveDown(true);
                        break;

                    case J:
                        keyAction3.setMoveLeft(true);
                        break;
                    case P:
                        keyAction3.setSpeedUp(true);
                        break;
                    case O:
                        keyAction3.setSpeedDown(true);
                        break;
                        //key4
                    case C:
                        keyAction4.setMoveLeft(true);
                        break;
                    case V:
                        keyAction4.setMoveRight(true);
                        break;

                }
            }

            });

        pane.getParent().setOnKeyReleased( (event) -> {
                    switch (event.getCode()) {
                        case W:
                            keyAction.setMoveUp(false);
                            break;
                        case D:
                            keyAction.setMoveRight(false);
                            break;
                        case S:
                            keyAction.setMoveDown(false);
                            break;
                        case A:
                            keyAction.setMoveLeft(false);
                            break;
                        case UP:
                            keyAction.setSpeedUp(false);
                            break;
                        case DOWN:
                            keyAction.setSpeedDown(false);
                            break;
                        //key2
                        case T:
                            keyAction2.setMoveUp(false);
                            break;
                        case H:

                            keyAction2.setMoveRight(false);
                            break;
                        case G:

                            keyAction2.setMoveDown(false);
                            break;

                        case F:

                            keyAction2.setMoveLeft(false);
                            break;
                        case RIGHT:
                            keyAction2.setSpeedUp(false);
                            break;
                        case LEFT:
                            keyAction2.setSpeedDown(false);
                            break;
//                        //key3
                        case I:
                            keyAction3.setMoveUp(false);
                            break;
                        case L:

                            keyAction3.setMoveRight(false);
                            break;
                        case K:

                            keyAction3.setMoveDown(false);
                            break;

                        case J:
                            keyAction3.setMoveLeft(false);
                            break;
                        case P:
                            keyAction3.setSpeedUp(false);
                            break;
                        case O:
                            keyAction3.setSpeedDown(false);
                            break;
                            //key4
                        case C:
                            keyAction4.setMoveLeft(false);
                            break;
                        case V:
                            keyAction4.setMoveRight(false);
                            break;
                    }
                }
        );
        pane.getParent().setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                System.out.println("click x " + event.getX() + "click y " + event.getY());


            }});
    }



    public void display(){
        pane.getChildren().clear();
        bg.drawSky();
        cloud.drawCloud();
        sun.drawSun();
        street.drawStreet();
        ArrayList<Human>list = new ArrayList<>();
        list.add(human);
        list.add(wizard);
        list.add(king);


        for (Human human:list){
            human.draw();
        }
//        wizard.drawHuman();
//        wizard.drawWizard();
//        human.drawHuman();
//        human.drawBalloon();
//        king.drawHuman();
//        king.drawCrown();


        alien.drawAlien();
        pane.getChildren().addAll(bg,cloud,sun,street, wizard, alien,human,king);

    }


    public void morning(ActionEvent event){


        pane.getChildren().clear();
        bg.drawSky();
        cloud.drawCloud();
        sun.drawSun();
        street.drawStreet();

        ArrayList<Human>list = new ArrayList<>();
        list.add(human);
        list.add(wizard);
        list.add(king);


        for (Human human:list){
            human.draw();
        }
//
//        wizard.drawHuman();
//        wizard.drawWizard();
//        human.drawHuman();
//        human.drawBalloon();
//        king.drawHuman();
//        king.drawCrown();



        alien.drawAlien();
        pane.getChildren().addAll(bg,cloud,sun,street, wizard, alien,human,king);

    }

    public void night(ActionEvent event){
        pane.getChildren().clear();
        bg.drawSkyNight();
        star.drawStar();
        star3.drawStar();
        star4.drawStar();
        star5.drawStar();
        star6.drawStar();
        star7.drawStar();
        star8.drawStar();
        star2.drawStar();
        star9.drawStar();
//        star13.drawStar(314,109);
//        star14.drawStar(204,107);
//        star15.drawStar(225,58);
//        star16.drawStar(42,41);
//        star17.drawStar(25,122);
//        star18.drawStar(140,14);
//        star19.drawStar(167,133);
//        star20.drawStar(367,77);
        moon.drawMoon();
        street.drawStreet();
        ArrayList<Human>list = new ArrayList<>();
        list.add(human);
        list.add(wizard);
        list.add(king);
        for (Human human:list){
            human.draw();
        }

//        wizard.drawHuman();
//        wizard.drawWizard();
//        human.drawHuman();
//        human.drawBalloon();
//        king.drawHuman();
//        king.drawCrown();


        alien.drawAlien();
        pane.getChildren().addAll(bg,star,moon,street, wizard, alien,human,king,star3,star4,star5,star6,star7,star8,star2,star9);

        double x = star.getTranslateX();
        double y = star.getTranslateY();
        TranslateTransition translate = new TranslateTransition(
                Duration.millis(700), star);
        translate.setFromX(x);
        translate.setToX(x-370);
        translate.setFromY(y);
        translate.setToY(y+111);
        translate.setCycleCount(Animation.INDEFINITE);
        translate.setAutoReverse(false);


        FadeTransition fade = new FadeTransition(
                Duration.millis(700),
                star
        );
        fade.setFromValue(6);
        fade.setToValue(0);
        fade.setCycleCount(Animation.INDEFINITE);
        fade.setAutoReverse(false);


        ParallelTransition pt = new ParallelTransition();
        pt.getChildren().addAll(translate,fade);
        pt.play();


    }
    @FXML
    public void creator(ActionEvent e) {
        Button b = (Button) e.getSource();
        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../View/sample2.fxml"));
        try {
            stage.setScene(new Scene(loader.load(), 600, 600));
            stage.show();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
    @FXML
    public void manual(ActionEvent e) {
        Button b = (Button) e.getSource();
        Stage stage = (Stage) b.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../View/sample3.fxml"));
        try {
            stage.setScene(new Scene(loader.load(), 600, 600));
            stage.show();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }


}
