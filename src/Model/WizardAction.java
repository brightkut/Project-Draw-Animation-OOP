package Model;

public class WizardAction {
    private Wizard wizard;


    private boolean isMoveUp, isMoveDown, isMoveRight, isMoveLeft, isSpeedUp, isSpeedDown;

    public WizardAction(Wizard wizard) {
        this.wizard = wizard;
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
        if (isMoveUp) wizard.goUp();
        if (isMoveDown) wizard.goDown();
        if (isMoveLeft) wizard.goLeft();
        if (isMoveRight) wizard.goRight();
        if (isSpeedUp) wizard.speedUp();
        if (isSpeedDown) wizard.speedDown();
    }
}
