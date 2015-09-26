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
public class BaseIncreaseStats {
    private int hp_inc;
    private int str_inc;
    private int mag_inc;
    private int phy_def_inc;
    private int mag_def_inc;

    public BaseIncreaseStats(int hp_inc, int str_inc, int mag_inc, int phy_def_inc, int mag_def_inc) {
        this.hp_inc = hp_inc;
        this.str_inc = str_inc;
        this.mag_inc = mag_inc;
        this.phy_def_inc = phy_def_inc;
        this.mag_def_inc = mag_def_inc;
    }

    /**
     * @return the hp_inc
     */
    public int getHp_inc() {
        return hp_inc;
    }

    /**
     * @param hp_inc the hp_inc to set
     */
    public void setHp_inc(int hp_inc) {
        this.hp_inc = hp_inc;
    }

    /**
     * @return the str_inc
     */
    public int getStr_inc() {
        return str_inc;
    }

    /**
     * @param str_inc the str_inc to set
     */
    public void setStr_inc(int str_inc) {
        this.str_inc = str_inc;
    }

    /**
     * @return the mag_inc
     */
    public int getMag_inc() {
        return mag_inc;
    }

    /**
     * @param mag_inc the mag_inc to set
     */
    public void setMag_inc(int mag_inc) {
        this.mag_inc = mag_inc;
    }

    /**
     * @return the phy_def_inc
     */
    public int getPhy_def_inc() {
        return phy_def_inc;
    }

    /**
     * @param phy_def_inc the phy_def_inc to set
     */
    public void setPhy_def_inc(int phy_def_inc) {
        this.phy_def_inc = phy_def_inc;
    }

    /**
     * @return the mag_def_inc
     */
    public int getMag_def_inc() {
        return mag_def_inc;
    }

    /**
     * @param mag_def_inc the mag_def_inc to set
     */
    public void setMag_def_inc(int mag_def_inc) {
        this.mag_def_inc = mag_def_inc;
    }
}
