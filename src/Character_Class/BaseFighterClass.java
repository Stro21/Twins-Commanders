/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Character_Class;


import Stats.BaseStats;
import Race.*;
import Stats.BaseIncreaseStats;
import Sex.*;

/**
 *
 * @author Eduardo Straub
 */
public class BaseFighterClass extends BaseClass{
    public BaseFighterClass(){
        setName("Fighter");
        setDescription("The basic melee unit");
        BaseStats min = new BaseStats(0, 0, 0, 0, 0);
        setMinumunStats(min);
        BaseIncreaseStats stats = new BaseIncreaseStats(3, 3, 1, 3, 1);
        setStats_increase(stats);
        BaseRace race = new HumanRace();
        setRace_class(race);
        setSex(Sex_Specific.Unisex);
        setCan_lead(false);
        setPrevious_class(null);
        setCan_lead_a_legion(false);
    }
}
