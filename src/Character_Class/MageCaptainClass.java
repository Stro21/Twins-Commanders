/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Character_Class;

import Race.BaseRace;
import Race.HumanRace;
import Stats.BaseIncreaseStats;
import Stats.BaseStats;

/**
 *
 * @author eduardo
 */
public class MageCaptainClass extends BaseClass{

    public MageCaptainClass() {
        setName("Mage Captain");
        setDescription("Is the ranged magical main character");
        BaseStats min = new BaseStats(0, 0, 0, 0, 0);
        setMinumunStats(min);
        BaseRace race = new HumanRace();
        setRace_class(race);
        BaseIncreaseStats stats = new BaseIncreaseStats(4, 2, 5, 2, 7);
        setStats_increase(stats);
        setSex(BaseClass.SexSpecific.UNISEX);
        setCan_lead(true);
        setPrevious_class(null);
        setCan_lead_a_legion(false);
    }
}
