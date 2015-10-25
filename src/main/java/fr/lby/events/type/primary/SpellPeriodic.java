package fr.lby.events.type.primary;

/**
 * Spell_PERIODIC Only the effects that are periodic start with this PREFIX.<br/>
 * IE: Successfully casting a DoT only happens once therefore even though the spell is periodic use the SPELL_ prefix.
 * However, the damage is periodic so it will start with SPELL_PERIODIC_.<br/>
 * 90% of the time you will only care about _DAMAGE or _HEAL.
 *
 * @author jlamby
 *
 */
public interface SpellPeriodic extends Spell {

}
