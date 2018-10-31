package Model;

public class HumanAction {
    private Human human;

    private boolean isMoveUp, isMoveDown, isMoveRight, isMoveLeft, isSpeedUp, isSpeedDown;

    public HumanAction(Human human) {
        this.human = human;

    }
    public void setMoveUp(boolean moveUp) {
        isMoveUp = moveUp;
    }
    public void setMoveDown(boolean moveDown) {
        isMoveDown = moveDown;
    }
    public void setMoveRight(boolean moveRight) {
        isMoveRight = moveRight;
    }
    public void setMoveLeft(boolean moveLeft) {
        isMoveLeft = moveLeft;
    }
    public void setSpeedUp(boolean speedUp) {
        isSpeedUp = speedUp;
    }
    public void setSpeedDown(boolean speedDown) {
        isSpeedDown = speedDown;
    }
    public void action(){
        if (isMoveUp) human.goUp();
        if (isMoveDown) human.goDown();
        if (isMoveLeft) human.goLeft();
        if (isMoveRight) human.goRight();
        if (isSpeedUp) human.speedUp();
        if (isSpeedDown) human.speedDown();
    }

}
