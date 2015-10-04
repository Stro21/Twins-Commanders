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
public class BaseAction {
    private String name;
    private String description;
    private boolean make_damage;
    private boolean ranged;
    private boolean heal;
    private boolean buff;

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
     * @return the make_damage
     */
    public boolean isMake_damage() {
        return make_damage;
    }

    /**
     * @param make_damage the make_damage to set
     */
    public void setMake_damage(boolean make_damage) {
        this.make_damage = make_damage;
    }

    /**
     * @return the ranged
     */
    public boolean isRanged() {
        return ranged;
    }

    /**
     * @param ranged the ranged to set
     */
    public void setRanged(boolean ranged) {
        this.ranged = ranged;
    }

    /**
     * @return the heal
     */
    public boolean isHeal() {
        return heal;
    }

    /**
     * @param heal the heal to set
     */
    public void setHeal(boolean heal) {
        this.heal = heal;
    }

    /**
     * @return the buff
     */
    public boolean isBuff() {
        return buff;
    }

    /**
     * @param buff the buff to set
     */
    public void setBuff(boolean buff) {
        this.buff = buff;
    }
}
