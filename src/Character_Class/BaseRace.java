/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Character_Class;

/**
 *
 * @author Eduardo Straub
 */
public class BaseRace {
    private Race race;
    private String race_description;
    private double size;
    
    /**
     * @return the race
     */
    public Race getRace() {
        return race;
    }

    /**
     * @param race the race to set
     */
    public void setRace(Race race) {
        this.race = race;
    }

    /**
     * @return the race_description
     */
    public String getRace_description() {
        return race_description;
    }

    /**
     * @param race_description the race_description to set
     */
    public void setRace_description(String race_description) {
        this.race_description = race_description;
    }

    /**
     * @return the size
     */
    public double getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(double size) {
        this.size = size;
    }
}
