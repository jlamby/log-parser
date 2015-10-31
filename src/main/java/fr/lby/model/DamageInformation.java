package fr.lby.model;

/**
 * @author jlamby
 *
 */
public class DamageInformation {

    public final int         amount;
    public final int         overkill;
    public final SpellSchool spellSchool;
    public final int         resisted;
    public final int         blocked;
    public final int         absorbed;
    public final boolean     critical;
    public final boolean     glancing;
    public final boolean     crushing;

    public DamageInformation(int amount, int overkill, SpellSchool spellSchool, int resisted, int blocked, int absorbed,
            boolean critical, boolean glancing, boolean crushing) {
        this.amount = amount;
        this.overkill = overkill;
        this.spellSchool = spellSchool;
        this.resisted = resisted;
        this.blocked = blocked;
        this.absorbed = absorbed;
        this.critical = critical;
        this.glancing = glancing;
        this.crushing = crushing;
    }

}
