/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Character_Class;

import Stats.BaseIncreaseStats;
import Stats.BaseStats;
import Race.*;
import Alignment.Alignment;
/**
 *
 * @author eduardo
 */
public class BaseClass extends BaseRace{
    private String name;
    private String description;
    private BaseIncreaseStats stats_increase;
    private BaseStats minumunStats;
    private SexSpecific sex;
    private boolean can_lead;
    private BaseRace race_class;
    private Alignment alignment;
    private BaseClass previous_class;
    private boolean can_lead_a_legion;
    
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

    /**
     * @return the stats_increase
     */
    public BaseIncreaseStats getStats_increase() {
        return stats_increase;
    }

    /**
     * @param stats_increase the stats_increase to set
     */
    public void setStats_increase(BaseIncreaseStats stats_increase) {
        this.stats_increase = stats_increase;
    }

    /**
     * @return the minumunStats
     */
    public BaseStats getMinumunStats() {
        return minumunStats;
    }

    /**
     * @param minumunStats the minumunStats to set
     */
    public void setMinumunStats(BaseStats minumunStats) {
        this.minumunStats = minumunStats;
    }

    /**
     * @return the race_class
     */
    public BaseRace getRace_class() {
        return race_class;
    }

    /**
     * @param race_class the race_class to set
     */
    public void setRace_class(BaseRace race_class) {
        this.race_class = race_class;
    }

    /**
     * @return the alignment
     */
    public Alignment getAlignment() {
        return alignment;
    }

    /**
     * @param alignment the alignment to set
     */
    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    /**
     * @return the previous_class
     */
    public BaseClass getPrevious_class() {
        return previous_class;
    }

    /**
     * @param previous_class the previous_class to set
     */
    public void setPrevious_class(BaseClass previous_class) {
        this.previous_class = previous_class;
    }

    /**
     * @return the can_lead_a_legion
     */
    public boolean isCan_lead_a_legion() {
        return can_lead_a_legion;
    }

    /**
     * @param can_lead_a_legion the can_lead_a_legion to set
     */
    public void setCan_lead_a_legion(boolean can_lead_a_legion) {
        this.can_lead_a_legion = can_lead_a_legion;
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
    @Override
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    @Override
    public void setDescription(String description) {
        this.description = description;
    }
}