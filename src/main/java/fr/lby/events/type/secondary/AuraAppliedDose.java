package fr.lby.events.type.secondary;

/**
 * Triggered by stacking Debuffs if the debuff is already applied to a target.<br/>
 * IE: If you cast Mind Flay twice it causes 2 doses of shadow vunerability, the first time it will trigger,
 * SPELL_AURA_APPLIED (arg10 = shadow vulnerability), and SPELL_AURA_APPLIED_DOSE (arg10 = shadow vunerability) the second. <br/>
 * The last argument reflects the new number of doses on the unit.
 *
 * @author jlamby
 *
 */
public interface AuraAppliedDose extends AuraApplied {

    public int getAmount();

}
