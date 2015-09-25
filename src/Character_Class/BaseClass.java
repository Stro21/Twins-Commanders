/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Character_Class;

/**
 *
 * @author eduardo
 */
public class BaseClass extends BaseRace{
    private String name;
    private String description;
    private int hp;
    private int strength;
    private int magic;
    private int physical_defense;
    private int magical_defense;
    
    private SexSpecific sex;
    private boolean can_lead;

    

    /**
     * @return the sex
     */
    public SexSpecific getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(SexSpecific sex) {
        this.sex = sex;
    }

    /**
     * @return the can_lead
     */
    public boolean isCan_lead() {
        return can_lead;
    }

    /**
     * @param can_lead the can_lead to set
     */
    public void setCan_lead(boolean can_lead) {
        this.can_lead = can_lead;
    }
    
    public enum SexSpecific{
        MALE,
        FEMALE,
        UNISEX
    }
    
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
