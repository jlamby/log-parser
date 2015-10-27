package fr.lby.events.type.secondary;

/**
 * The opposite of _AURA_APPLIED_DOSE, reducing the amount of doses on a buff/debuff on the unit.
 *
 * @author jlamby
 *
 */
public interface AuraRemovedDose extends AuraRemoved {

    @Override
    public int getAmount();

}
