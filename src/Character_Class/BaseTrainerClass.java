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
public class BaseTrainerClass extends BaseClass{
    public BaseTrainerClass(){
        setName("Trainer");
        setDescription("Basic trainer unit");
        BaseStats min = new BaseStats(0, 0, 0, 0, 0);
        setMinumunStats(min);
        BaseRace race = new HumanRace();
        setRace_class(race);
        BaseIncreaseStats stats = new BaseIncreaseStats(2, 2, 2, 2, 2);
        setStats_increase(stats);
        setSex(Sex_Specific.Unisex);
        setCan_lead(false);
        setPrevious_class(null);
        setCan_lead_a_legion(false);
    }
}
