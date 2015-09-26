/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Race;

/**
 *
 * @author eduardo
 */
public class BaseRace {
    private Race race;
    private String description;
    private int size;
    private double block_size;
    private double block_extra_size;

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
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the block_size
     */
    public double getBlock_size() {
        return block_size;
    }

    /**
     * @param block_size the block_size to set
     */
    public void setBlock_size(double block_size) {
        this.block_size = block_size;
    }

    /**
     * @return the block_extra_size
     */
    public double getBlock_extra_size() {
        return block_extra_size;
    }

    /**
     * @param block_extra_size the block_extra_size to set
     */
    public void setBlock_extra_size(double block_extra_size) {
        this.block_extra_size = block_extra_size;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
