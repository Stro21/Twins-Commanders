/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Combat_Action;

/**
 *
 * @author eduar
 */
public class BaseCombatAction {
    private BaseAction front;
    private BaseAction middle;
    private BaseAction bottom;

    /**
     * @return the front
     */
    public BaseAction getFront() {
        return front;
    }

    /**
     * @param front the front to set
     */
    public void setFront(BaseAction front) {
        this.front = front;
    }

    /**
     * @return the middle
     */
    public BaseAction getMiddle() {
        return middle;
    }

    /**
     * @param middle the middle to set
     */
    public void setMiddle(BaseAction middle) {
        this.middle = middle;
    }

    /**
     * @return the bottom
     */
    public BaseAction getBottom() {
        return bottom;
    }

    /**
     * @param bottom the bottom to set
     */
    public void setBottom(BaseAction bottom) {
        this.bottom = bottom;
    }
}
