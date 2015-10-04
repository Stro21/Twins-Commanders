/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Characters;

import Character_Class.*;
import Element.Element;
import Race.*;
import Sex.*;
import Stats.*;

/**
 *
 * @author eduar
 */
public class BaseCharacter {
    private String name;
    private int age;
    private int level;
    private BaseClass class_;
    private Race race;
    private Sex sex;
    private Element element;
    private BaseStats stats;
    private boolean is_hero;
    private boolean main_character;

    public void Level_Up(){
        stats.setHp(stats.getHp() + class_.getStats_increase().getHp_inc());
        stats.setMagic(stats.getMagic() + class_.getStats_increase().getMag_inc());
        stats.setMagical_defense(stats.getMagical_defense() + class_.getStats_increase().getMag_def_inc());
        stats.setStrength(stats.getStrength() + class_.getStats_increase().getStr_inc());
        stats.setPhysical_defense(stats.getPhysical_defense() + class_.getStats_increase().getPhy_def_inc());
        level =+ 1;
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
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * @return the class_
     */
    public BaseClass getClass_() {
        return class_;
    }

    /**
     * @param class_ the class_ to set
     */
    public void setClass_(BaseClass class_) {
        this.class_ = class_;
    }

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
     * @return the sex
     */
    public Sex getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(Sex sex) {
        this.sex = sex;
    }

    /**
     * @return the element
     */
    public Element getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(Element element) {
        this.element = element;
    }

    /**
     * @return the stats
     */
    public BaseStats getStats() {
        return stats;
    }

    /**
     * @param stats the stats to set
     */
    public void setStats(BaseStats stats) {
        this.stats = stats;
    }

    /**
     * @return the is_hero
     */
    public boolean isIs_hero() {
        return is_hero;
    }

    /**
     * @param is_hero the is_hero to set
     */
    public void setIs_hero(boolean is_hero) {
        this.is_hero = is_hero;
    }

    /**
     * @return the main_character
     */
    public boolean isMain_character() {
        return main_character;
    }

    /**
     * @param main_character the main_character to set
     */
    public void setMain_character(boolean main_character) {
        this.main_character = main_character;
    }
}
