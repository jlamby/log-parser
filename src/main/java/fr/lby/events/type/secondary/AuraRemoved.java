package fr.lby.events.type.secondary;

/**
 * Triggered When Buffs/Debuffs expire.
 *
 * @author jlamby
 *
 */
public interface AuraRemoved extends Aura {

    public int getAmount();

}
