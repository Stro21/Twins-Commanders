/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Character_Class;

import Stats.BaseStats;
import Race.*;
import Stats.BaseIncreaseStats;
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
        setSex(SexSpecific.UNISEX);
        setCan_lead(false);
    }
}
