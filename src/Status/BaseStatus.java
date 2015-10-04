/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Status;

/**
 *
 * @author eduar
 */
public class BaseStatus {
    private String name;
    private String description;
    private boolean can_attack;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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

    /**
     * @return the can_attack
     */
    public boolean isCan_attack() {
        return can_attack;
    }

    /**
     * @param can_attack the can_attack to set
     */
    public void setCan_attack(boolean can_attack) {
        this.can_attack = can_attack;
    }
}
