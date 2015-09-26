/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stats;

/**
 *
 * @author eduardo
 */
public class BaseStats {
    private int hp;
    private int strength;
    private int magic;
    private int physical_defense;
    private int magical_defense;

    public BaseStats(int hp, int strength, int magic, int physical_defense, int magical_defense) {
        this.hp = hp;
        this.strength = strength;
        this.magic = magic;
        this.physical_defense = physical_defense;
        this.magical_defense = magical_defense;
    }
    
    /**
     * @return the hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * @param hp the hp to set
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * @return the strength
     */
    public int getStrength() {
        return strength;
    }

    /**
     * @param strength the strength to set
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * @return the magic
     */
    public int getMagic() {
        return magic;
    }

    /**
     * @param magic the magic to set
     */
    public void setMagic(int magic) {
        this.magic = magic;
    }

    /**
     * @return the physical_defense
     */
    public int getPhysical_defense() {
        return physical_defense;
    }

    /**
     * @param physical_defense the physical_defense to set
     */
    public void setPhysical_defense(int physical_defense) {
        this.physical_defense = physical_defense;
    }

    /**
     * @return the magical_defense
     */
    public int getMagical_defense() {
        return magical_defense;
    }

    /**
     * @param magical_defense the magical_defense to set
     */
    public void setMagical_defense(int magical_defense) {
        this.magical_defense = magical_defense;
    }
}
